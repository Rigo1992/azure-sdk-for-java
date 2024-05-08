// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.http.pipeline;

import io.clientcore.core.credential.KeyCredential;
import io.clientcore.core.http.models.HttpHeaderName;
import io.clientcore.core.http.models.HttpHeaders;
import io.clientcore.core.http.models.HttpRequest;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.util.ClientLogger;

import java.util.Objects;

/**
 * Pipeline policy that uses an {@link KeyCredential} to set the authorization key for a request.
 *
 * <p>Requests sent with this pipeline policy are required to use {@code HTTPS}. If the request isn't using {@code HTTPS}
 * an exception will be thrown to prevent leaking the key.</p>
 */
public class KeyCredentialPolicy extends HttpPipelinePolicy {
    private static final ClientLogger LOGGER = new ClientLogger(KeyCredentialPolicy.class);
    private final HttpHeaderName name;
    private final KeyCredential credential;
    private final String prefix;

    /**
     * Creates a policy that uses the passed {@link KeyCredential} to set the specified header name.
     *
     * @param name The name of the key header that will be set to {@link KeyCredential#getKey()}.
     * @param credential The {@link KeyCredential} containing the authorization key to use.
     *
     * @throws NullPointerException If {@code name} or {@code credential} is {@code null}.
     * @throws IllegalArgumentException If {@code name} is empty.
     */
    public KeyCredentialPolicy(String name, KeyCredential credential) {
        this(validateName(name), Objects.requireNonNull(credential, "'credential' cannot be null."), null);
    }

    /**
     * Creates a policy that uses the passed {@link KeyCredential} to set the specified header name.
     *
     * <p>The {@code prefix} will be applied before the {@link KeyCredential#getKey()} when setting the header. A space
     * will be inserted between {@code prefix} and credential.</p>
     *
     * @param name The name of the key header that will be set to {@link KeyCredential#getKey()}.
     * @param credential The {@link KeyCredential} containing the authorization key to use.
     * @param prefix The prefix to apply before the credential, for example "SharedAccessKey credential".
     *
     * @throws NullPointerException If {@code name} or {@code credential} is {@code null}.
     * @throws IllegalArgumentException If {@code name} is empty.
     */
    public KeyCredentialPolicy(String name, KeyCredential credential, String prefix) {
        this(validateName(name), Objects.requireNonNull(credential, "'credential' cannot be null."), prefix);
    }

    private static HttpHeaderName validateName(String name) {
        Objects.requireNonNull(name, "'name' cannot be null.");

        if (name.isEmpty()) {
            throw LOGGER.logThrowableAsError(new IllegalArgumentException("'name' cannot be empty."));
        }

        return HttpHeaderName.fromString(name);
    }

    KeyCredentialPolicy(HttpHeaderName name, KeyCredential credential, String prefix) {
        this.name = name;
        this.credential = credential;
        this.prefix = prefix != null ? prefix.trim() : null;
    }

    @Override
    public Response<?> process(HttpRequest httpRequest, HttpPipeline httpPipeline) {
        setCredential(httpRequest.getHeaders());

        return super.process(httpRequest, httpPipeline);
    }

    void setCredential(HttpHeaders headers) {
        String credential = this.credential.getKey();

        headers.set(name, (prefix == null) ? credential : prefix + " " + credential);
    }

    /**
     * Creates a new instance that's a copy of this policy.
     *
     * @return A new instance that's a copy of this policy.
     */
    @Override
    public HttpPipelinePolicy clone() {
        return new KeyCredentialPolicy(this.name, this.credential, this.prefix);
    }
}
