// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Shopify Service linked service properties.
 */
@Fluent
public final class ShopifyLinkedServiceTypeProperties {
    /*
     * The endpoint of the Shopify server. (i.e. mystore.myshopify.com)
     */
    @JsonProperty(value = "host", required = true)
    private Object host;

    /*
     * The API access token that can be used to access Shopify’s data. The token won't expire if it is offline mode.
     */
    @JsonProperty(value = "accessToken")
    private SecretBase accessToken;

    /*
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     */
    @JsonProperty(value = "useEncryptedEndpoints")
    private Object useEncryptedEndpoints;

    /*
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when
     * connecting over SSL. The default value is true.
     */
    @JsonProperty(value = "useHostVerification")
    private Object useHostVerification;

    /*
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     */
    @JsonProperty(value = "usePeerVerification")
    private Object usePeerVerification;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of ShopifyLinkedServiceTypeProperties class.
     */
    public ShopifyLinkedServiceTypeProperties() {
    }

    /**
     * Get the host property: The endpoint of the Shopify server. (i.e. mystore.myshopify.com).
     * 
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The endpoint of the Shopify server. (i.e. mystore.myshopify.com).
     * 
     * @param host the host value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the accessToken property: The API access token that can be used to access Shopify’s data. The token won't
     * expire if it is offline mode.
     * 
     * @return the accessToken value.
     */
    public SecretBase accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: The API access token that can be used to access Shopify’s data. The token won't
     * expire if it is offline mode.
     * 
     * @param accessToken the accessToken value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withAccessToken(SecretBase accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @return the useEncryptedEndpoints value.
     */
    public Object useEncryptedEndpoints() {
        return this.useEncryptedEndpoints;
    }

    /**
     * Set the useEncryptedEndpoints property: Specifies whether the data source endpoints are encrypted using HTTPS.
     * The default value is true.
     * 
     * @param useEncryptedEndpoints the useEncryptedEndpoints value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withUseEncryptedEndpoints(Object useEncryptedEndpoints) {
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        return this;
    }

    /**
     * Get the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @return the useHostVerification value.
     */
    public Object useHostVerification() {
        return this.useHostVerification;
    }

    /**
     * Set the useHostVerification property: Specifies whether to require the host name in the server's certificate to
     * match the host name of the server when connecting over SSL. The default value is true.
     * 
     * @param useHostVerification the useHostVerification value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withUseHostVerification(Object useHostVerification) {
        this.useHostVerification = useHostVerification;
        return this;
    }

    /**
     * Get the usePeerVerification property: Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     * 
     * @return the usePeerVerification value.
     */
    public Object usePeerVerification() {
        return this.usePeerVerification;
    }

    /**
     * Set the usePeerVerification property: Specifies whether to verify the identity of the server when connecting
     * over SSL. The default value is true.
     * 
     * @param usePeerVerification the usePeerVerification value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withUsePeerVerification(Object usePeerVerification) {
        this.usePeerVerification = usePeerVerification;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the ShopifyLinkedServiceTypeProperties object itself.
     */
    public ShopifyLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property host in model ShopifyLinkedServiceTypeProperties"));
        }
        if (accessToken() != null) {
            accessToken().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ShopifyLinkedServiceTypeProperties.class);
}
