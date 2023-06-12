// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A rule providing a binding to an external web server. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("webhook-rule")
@Fluent
public final class WebhookRule extends RouterRuleInternal {
    /*
     * Uri for Authorization Server.
     */
    @JsonProperty(value = "authorizationServerUri")
    private String authorizationServerUri;

    /*
     * OAuth2.0 Credentials used to Contoso's Authorization server.
     * Reference: https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/
     */
    @JsonProperty(value = "clientCredential")
    private Oauth2ClientCredentialInternal clientCredential;

    /*
     * Uri for Contoso's Web Server.
     */
    @JsonProperty(value = "webhookUri")
    private String webhookUri;

    /** Creates an instance of WebhookRule class. */
    public WebhookRule() {}

    /**
     * Get the authorizationServerUri property: Uri for Authorization Server.
     *
     * @return the authorizationServerUri value.
     */
    public String getAuthorizationServerUri() {
        return this.authorizationServerUri;
    }

    /**
     * Set the authorizationServerUri property: Uri for Authorization Server.
     *
     * @param authorizationServerUri the authorizationServerUri value to set.
     * @return the WebhookRule object itself.
     */
    public WebhookRule setAuthorizationServerUri(String authorizationServerUri) {
        this.authorizationServerUri = authorizationServerUri;
        return this;
    }

    /**
     * Get the clientCredential property: OAuth2.0 Credentials used to Contoso's Authorization server. Reference:
     * https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/.
     *
     * @return the clientCredential value.
     */
    public Oauth2ClientCredentialInternal getClientCredential() {
        return this.clientCredential;
    }

    /**
     * Set the clientCredential property: OAuth2.0 Credentials used to Contoso's Authorization server. Reference:
     * https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/.
     *
     * @param clientCredential the clientCredential value to set.
     * @return the WebhookRule object itself.
     */
    public WebhookRule setClientCredential(Oauth2ClientCredentialInternal clientCredential) {
        this.clientCredential = clientCredential;
        return this;
    }

    /**
     * Get the webhookUri property: Uri for Contoso's Web Server.
     *
     * @return the webhookUri value.
     */
    public String getWebhookUri() {
        return this.webhookUri;
    }

    /**
     * Set the webhookUri property: Uri for Contoso's Web Server.
     *
     * @param webhookUri the webhookUri value to set.
     * @return the WebhookRule object itself.
     */
    public WebhookRule setWebhookUri(String webhookUri) {
        this.webhookUri = webhookUri;
        return this;
    }
}
