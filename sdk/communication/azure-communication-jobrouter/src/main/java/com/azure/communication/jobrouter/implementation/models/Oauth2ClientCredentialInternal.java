// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OAuth2.0 Credentials used to Contoso's Authorization server. Reference:
 * https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/.
 */
@Fluent
public final class Oauth2ClientCredentialInternal {
    /*
     * ClientId for Contoso Authorization server.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * Client secret for Contoso Authorization server.
     */
    @JsonProperty(value = "clientSecret")
    private String clientSecret;

    /**
     * Get the clientId property: ClientId for Contoso Authorization server.
     *
     * @return the clientId value.
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: ClientId for Contoso Authorization server.
     *
     * @param clientId the clientId value to set.
     * @return the Oauth2ClientCredentialInternal object itself.
     */
    public Oauth2ClientCredentialInternal setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: Client secret for Contoso Authorization server.
     *
     * @return the clientSecret value.
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: Client secret for Contoso Authorization server.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the Oauth2ClientCredentialInternal object itself.
     */
    public Oauth2ClientCredentialInternal setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
}
