// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the endpoints used for the custom Open ID Connect provider. */
@Fluent
public final class OpenIdConnectConfig {
    /*
     * The endpoint to be used to make an authorization request.
     */
    @JsonProperty(value = "authorizationEndpoint")
    private String authorizationEndpoint;

    /*
     * The endpoint to be used to request a token.
     */
    @JsonProperty(value = "tokenEndpoint")
    private String tokenEndpoint;

    /*
     * The endpoint that issues the token.
     */
    @JsonProperty(value = "issuer")
    private String issuer;

    /*
     * The endpoint that provides the keys necessary to validate the token.
     */
    @JsonProperty(value = "certificationUri")
    private String certificationUri;

    /*
     * The endpoint that contains all the configuration endpoints for the provider.
     */
    @JsonProperty(value = "wellKnownOpenIdConfiguration")
    private String wellKnownOpenIdConfiguration;

    /** Creates an instance of OpenIdConnectConfig class. */
    public OpenIdConnectConfig() {
    }

    /**
     * Get the authorizationEndpoint property: The endpoint to be used to make an authorization request.
     *
     * @return the authorizationEndpoint value.
     */
    public String authorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * Set the authorizationEndpoint property: The endpoint to be used to make an authorization request.
     *
     * @param authorizationEndpoint the authorizationEndpoint value to set.
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }

    /**
     * Get the tokenEndpoint property: The endpoint to be used to request a token.
     *
     * @return the tokenEndpoint value.
     */
    public String tokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * Set the tokenEndpoint property: The endpoint to be used to request a token.
     *
     * @param tokenEndpoint the tokenEndpoint value to set.
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }

    /**
     * Get the issuer property: The endpoint that issues the token.
     *
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Set the issuer property: The endpoint that issues the token.
     *
     * @param issuer the issuer value to set.
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Get the certificationUri property: The endpoint that provides the keys necessary to validate the token.
     *
     * @return the certificationUri value.
     */
    public String certificationUri() {
        return this.certificationUri;
    }

    /**
     * Set the certificationUri property: The endpoint that provides the keys necessary to validate the token.
     *
     * @param certificationUri the certificationUri value to set.
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withCertificationUri(String certificationUri) {
        this.certificationUri = certificationUri;
        return this;
    }

    /**
     * Get the wellKnownOpenIdConfiguration property: The endpoint that contains all the configuration endpoints for the
     * provider.
     *
     * @return the wellKnownOpenIdConfiguration value.
     */
    public String wellKnownOpenIdConfiguration() {
        return this.wellKnownOpenIdConfiguration;
    }

    /**
     * Set the wellKnownOpenIdConfiguration property: The endpoint that contains all the configuration endpoints for the
     * provider.
     *
     * @param wellKnownOpenIdConfiguration the wellKnownOpenIdConfiguration value to set.
     * @return the OpenIdConnectConfig object itself.
     */
    public OpenIdConnectConfig withWellKnownOpenIdConfiguration(String wellKnownOpenIdConfiguration) {
        this.wellKnownOpenIdConfiguration = wellKnownOpenIdConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
