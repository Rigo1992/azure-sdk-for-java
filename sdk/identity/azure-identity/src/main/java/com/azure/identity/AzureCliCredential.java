// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.annotation.Immutable;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.util.logging.ClientLogger;
import com.azure.identity.implementation.IdentityClient;
import com.azure.identity.implementation.IdentityClientBuilder;
import com.azure.identity.implementation.IdentityClientOptions;
import com.azure.identity.implementation.util.LoggingUtil;
import reactor.core.publisher.Mono;

/**
 * A credential provider that provides token credentials based on Azure CLI
 * command.
 */
@Immutable
public class AzureCliCredential implements TokenCredential {
    private static final ClientLogger LOGGER = new ClientLogger(AzureCliCredential.class);

    private final IdentityClient identityClient;

    /**
     * Creates an AzureCliSecretCredential with default identity client options.
     * @param tenantId the tenant id of the application
     * @param identityClientOptions the options to configure the identity client
     */
    AzureCliCredential(String tenantId, IdentityClientOptions identityClientOptions) {
        identityClient = new IdentityClientBuilder()
            .tenantId(tenantId)
            .identityClientOptions(identityClientOptions).build();
    }

    @Override
    public Mono<AccessToken> getToken(TokenRequestContext request) {
        return identityClient.authenticateWithAzureCli(request)
            .doOnNext(token -> LoggingUtil.logTokenSuccess(LOGGER, request))
            .doOnError(error -> LoggingUtil.logTokenError(LOGGER, identityClient.getIdentityClientOptions(), request,
                error));
    }
}
