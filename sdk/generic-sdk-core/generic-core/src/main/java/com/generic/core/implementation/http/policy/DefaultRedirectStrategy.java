// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.implementation.http.policy;

import com.generic.core.models.HeaderName;
import com.generic.core.http.models.HttpMethod;
import com.generic.core.http.models.HttpRequest;
import com.generic.core.http.models.HttpResponse;
import com.generic.core.http.policy.RedirectStrategy;
import com.generic.core.implementation.util.CoreUtils;
import com.generic.core.implementation.util.LoggingKeys;
import com.generic.core.util.ClientLogger;

import java.net.HttpURLConnection;
import java.util.EnumSet;
import java.util.Set;

/**
 * A default implementation of {@link RedirectStrategy} that uses the provided maximum retry attempts, header name to
 * look up redirect url value for, http methods and a known set of redirect status response codes (301, 302, 307, 308)
 * to determine if request should be redirected.
 */
public final class DefaultRedirectStrategy implements RedirectStrategy {
    private static final ClientLogger LOGGER = new ClientLogger(DefaultRedirectStrategy.class);

    private static final int DEFAULT_MAX_REDIRECT_ATTEMPTS = 3;
    private static final int PERMANENT_REDIRECT_STATUS_CODE = 308;
    private static final int TEMPORARY_REDIRECT_STATUS_CODE = 307;
    private static final Set<HttpMethod> DEFAULT_REDIRECT_ALLOWED_METHODS = EnumSet.of(HttpMethod.GET, HttpMethod.HEAD);

    private static final String REDIRECT_URLS_KEY = "redirectUrls";

    private final int maxAttempts;
    private final HeaderName locationHeader;
    private final Set<HttpMethod> allowedRedirectHttpMethods;

    /**
     * Creates an instance of {@link DefaultRedirectStrategy}.
     *
     * @param maxAttempts The max number of redirect attempts that can be made.
     * @param locationHeader The header name containing the redirect URL.
     * @param allowedMethods The set of {@link HttpMethod} that are allowed to be redirected.
     *
     * @throws IllegalArgumentException if {@code maxAttempts} is less than 0.
     */
    public DefaultRedirectStrategy(int maxAttempts, String locationHeader, Set<HttpMethod> allowedMethods) {
        this(maxAttempts, validateLocationHeader(locationHeader), validateAllowedMethods(allowedMethods));
    }

    private DefaultRedirectStrategy(int maxAttempts, HeaderName locationHeader, Set<HttpMethod> allowedMethods) {
        if (maxAttempts < 0) {
            throw LOGGER.logThrowableAsError(new IllegalArgumentException("Max attempts cannot be less than 0."));
        }

        this.maxAttempts = maxAttempts;
        this.locationHeader = locationHeader;
        this.allowedRedirectHttpMethods = allowedMethods;
    }

    private static HeaderName validateLocationHeader(String locationHeader) {
        if (CoreUtils.isNullOrEmpty(locationHeader)) {
            LOGGER.log(ClientLogger.LogLevel.ERROR, () ->
                String.format("'locationHeader' provided as null will be defaulted to {%s}", HeaderName.LOCATION));

            return HeaderName.LOCATION;
        } else {
            return HeaderName.fromString(locationHeader);
        }
    }

    private static Set<HttpMethod> validateAllowedMethods(Set<HttpMethod> allowedMethods) {
        if (CoreUtils.isNullOrEmpty(allowedMethods)) {
            LOGGER.log(ClientLogger.LogLevel.ERROR, () ->
                String.format("'allowedMethods' provided as null will be defaulted to {%s}",
                    DEFAULT_REDIRECT_ALLOWED_METHODS));

            return DEFAULT_REDIRECT_ALLOWED_METHODS;
        } else {
            return EnumSet.copyOf(allowedMethods);
        }
    }


    @Override
    public boolean shouldAttemptRedirect(HttpRequest httpRequest, HttpResponse<?> httpResponse, int tryCount,
                                         Set<String> attemptedRedirectUrls) {
        if (isValidRedirectStatusCode(httpResponse.getStatusCode())
            && isValidRedirectCount(tryCount)
            && isAllowedRedirectMethod(httpResponse.getRequest().getHttpMethod())) {

            String redirectUrl = httpResponse.getHeaders().getValue(locationHeader);

            if (redirectUrl != null && !alreadyAttemptedRedirectUrl(redirectUrl, attemptedRedirectUrls)) {
                LOGGER.atVerbose()
                    .addKeyValue(LoggingKeys.TRY_COUNT_KEY, tryCount)
                    .addKeyValue(REDIRECT_URLS_KEY, attemptedRedirectUrls::toString)
                    .log("Redirecting.");

                attemptedRedirectUrls.add(redirectUrl);

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public HttpRequest createRedirectRequest(HttpResponse<?> httpResponse) {
        return httpResponse.getRequest().setUrl(httpResponse.getHeaders().getValue(locationHeader));
    }

    @Override
    public int getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * Check if the redirect url provided in the response headers is already attempted.
     *
     * @param redirectUrl the redirect url provided in the response header.
     * @param attemptedRedirectUrls the set containing a list of attempted redirect locations.
     *
     * @return {@code true} if the redirectUrl provided in the response header is already being attempted for redirect,
     * {@code false} otherwise.
     */
    private boolean alreadyAttemptedRedirectUrl(String redirectUrl,
                                                Set<String> attemptedRedirectUrls) {
        if (attemptedRedirectUrls.contains(redirectUrl)) {
            LOGGER.atError()
                .addKeyValue(LoggingKeys.REDIRECT_URL_KEY, redirectUrl)
                .log("Request was redirected more than once to the same URL.");

            return true;
        }

        return false;
    }

    /**
     * Check if the attempt count of the redirect is less than the {@code maxAttempts}
     *
     * @param tryCount the try count for the HTTP request associated to the HTTP response.
     *
     * @return {@code true} if the {@code tryCount} is greater than the {@code maxAttempts}, {@code false} otherwise.
     */
    private boolean isValidRedirectCount(int tryCount) {
        if (tryCount >= getMaxAttempts()) {
            LOGGER.atError()
                .addKeyValue("maxAttempts", getMaxAttempts())
                .log("Redirect attempts have been exhausted.");

            return false;
        }

        return true;
    }

    /**
     * Check if the request http method is a valid redirect method.
     *
     * @param httpMethod the http method of the request.
     *
     * @return {@code true} if the request {@code httpMethod} is a valid http redirect method, {@code false} otherwise.
     */
    private boolean isAllowedRedirectMethod(HttpMethod httpMethod) {
        if (allowedRedirectHttpMethods.contains(httpMethod)) {
            return true;
        } else {
            LOGGER.atError()
                .addKeyValue(LoggingKeys.HTTP_METHOD_KEY, httpMethod)
                .log("Request was redirected from an invalid redirect allowed method.");

            return false;
        }
    }

    /**
     * Checks if the incoming request status code is a valid redirect status code.
     *
     * @param statusCode the status code of the incoming request.
     *
     * @return {@code true} if the request {@code statusCode} is a valid http redirect method, {@code false} otherwise.
     */
    private boolean isValidRedirectStatusCode(int statusCode) {
        return statusCode == HttpURLConnection.HTTP_MOVED_TEMP
            || statusCode == HttpURLConnection.HTTP_MOVED_PERM
            || statusCode == PERMANENT_REDIRECT_STATUS_CODE
            || statusCode == TEMPORARY_REDIRECT_STATUS_CODE;
    }
}
