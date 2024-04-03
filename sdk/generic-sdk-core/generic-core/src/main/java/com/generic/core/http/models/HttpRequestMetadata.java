// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.http.models;

import com.generic.core.util.ClientLogger;
import com.generic.core.util.Context;

/**
 * Contains metadata associated with a given {@link HttpRequest}.
 * <p>
 * {@link HttpRequest} metadata is anything that is not part of the request body, such as the request's URL, headers,
 * and HTTP method.
 */
public final class HttpRequestMetadata {
    private Context context = Context.EMPTY;
    private int retryCount;
    private ClientLogger requestLogger;
    private boolean eagerlyConvertHeaders;
    private ResponseBodyMode responseBodyMode;

    /**
     * Creates an instance of {@link HttpRequestMetadata}.
     */
    public HttpRequestMetadata() {
    }

    /**
     * Gets the {@link Context} associated with the request.
     *
     * @return The {@link Context} associated with the request.
     */
    public Context getContext() {
        return context;
    }

    /**
     * Sets the {@link Context} associated with the request.
     *
     * @param context The {@link Context} associated with the request.
     *
     * @return The updated {@link HttpRequestMetadata} object.
     */
    public HttpRequestMetadata setContext(Context context) {
        this.context = context;
        return this;
    }

    /**
     * Gets the number of times the request has been retried.
     *
     * @return The number of times the request has been retried.
     */
    public int getRetryCount() {
        return retryCount;
    }

    /**
     * Sets the number of times the request has been retried.
     *
     * @param retryCount The number of times the request has been retried.
     *
     * @return The updated {@link HttpRequestMetadata} object.
     */
    public HttpRequestMetadata setRetryCount(int retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * Gets the {@link ClientLogger} used to log during the request and response.
     *
     * @return The {@link ClientLogger} used to log during the request and response.
     */
    public ClientLogger getRequestLogger() {
        return requestLogger;
    }

    /**
     * Sets the {@link ClientLogger} used to log during the request and response.
     *
     * @param requestLogger The {@link ClientLogger} used to log during the request and response.
     *
     * @return The updated {@link HttpRequestMetadata} object.
     */
    public HttpRequestMetadata setRequestLogger(ClientLogger requestLogger) {
        this.requestLogger = requestLogger;
        return this;
    }

    /**
     * Whether the response headers should be eagerly converted.
     *
     * @return Whether the response headers should be eagerly converted.
     */
    public boolean isEagerlyConvertHeaders() {
        return eagerlyConvertHeaders;
    }

    /**
     * Sets whether the response headers should be eagerly converted.
     *
     * @param eagerlyConvertHeaders Whether the response headers should be eagerly converted.
     *
     * @return The updated {@link HttpRequestMetadata} object.
     */
    public HttpRequestMetadata setEagerlyConvertHeaders(boolean eagerlyConvertHeaders) {
        this.eagerlyConvertHeaders = eagerlyConvertHeaders;
        return this;
    }

    /**
     * Gets the configuration indicating how the body of the resulting HTTP response should be handled.
     *
     * <p>For more information about the options for handling an HTTP response body, see {@link ResponseBodyMode}.</p>
     *
     * @return The configuration indicating how the body of the resulting HTTP response should be handled.
     */
    public ResponseBodyMode getResponseBodyMode() {
        return responseBodyMode;
    }

    /**
     * Sets the configuration indicating how the body of the resulting HTTP response should be handled.
     *
     * <p>For more information about the options for handling an HTTP response body, see {@link ResponseBodyMode}.</p>
     *
     * @param responseBodyMode The configuration indicating how the body of the resulting HTTP response should be
     * handled.
     *
     * @return The updated {@link HttpRequestMetadata} object.
     */
    public HttpRequestMetadata setResponseBodyMode(ResponseBodyMode responseBodyMode) {
        this.responseBodyMode = responseBodyMode;

        return this;
    }

    /**
     * Creates a copy of the request metadata.
     *
     * @return A new {@link HttpRequestMetadata} instance with the same values as the current instance.
     */
    public HttpRequestMetadata copy() {
        HttpRequestMetadata copy = new HttpRequestMetadata();
        copy.context = context;
        copy.retryCount = retryCount;
        copy.requestLogger = requestLogger;
        copy.eagerlyConvertHeaders = eagerlyConvertHeaders;
        copy.responseBodyMode = responseBodyMode;

        return copy;
    }
}
