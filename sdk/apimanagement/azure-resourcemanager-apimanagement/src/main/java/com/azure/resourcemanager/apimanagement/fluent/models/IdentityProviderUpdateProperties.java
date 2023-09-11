// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.IdentityProviderBaseParameters;
import com.azure.resourcemanager.apimanagement.models.IdentityProviderType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters supplied to the Update Identity Provider operation. */
@Fluent
public final class IdentityProviderUpdateProperties extends IdentityProviderBaseParameters {
    /*
     * Client Id of the Application in the external Identity Provider. It is App ID for Facebook login, Client ID for
     * Google login, App ID for Microsoft.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * Client secret of the Application in external Identity Provider, used to authenticate login request. For example,
     * it is App Secret for Facebook login, API Key for Google login, Public Key for Microsoft.
     */
    @JsonProperty(value = "clientSecret")
    private String clientSecret;

    /** Creates an instance of IdentityProviderUpdateProperties class. */
    public IdentityProviderUpdateProperties() {
    }

    /**
     * Get the clientId property: Client Id of the Application in the external Identity Provider. It is App ID for
     * Facebook login, Client ID for Google login, App ID for Microsoft.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client Id of the Application in the external Identity Provider. It is App ID for
     * Facebook login, Client ID for Google login, App ID for Microsoft.
     *
     * @param clientId the clientId value to set.
     * @return the IdentityProviderUpdateProperties object itself.
     */
    public IdentityProviderUpdateProperties withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: Client secret of the Application in external Identity Provider, used to
     * authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public
     * Key for Microsoft.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: Client secret of the Application in external Identity Provider, used to
     * authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public
     * Key for Microsoft.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the IdentityProviderUpdateProperties object itself.
     */
    public IdentityProviderUpdateProperties withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderUpdateProperties withType(IdentityProviderType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderUpdateProperties withSigninTenant(String signinTenant) {
        super.withSigninTenant(signinTenant);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderUpdateProperties withAllowedTenants(List<String> allowedTenants) {
        super.withAllowedTenants(allowedTenants);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderUpdateProperties withAuthority(String authority) {
        super.withAuthority(authority);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderUpdateProperties withSignupPolicyName(String signupPolicyName) {
        super.withSignupPolicyName(signupPolicyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderUpdateProperties withSigninPolicyName(String signinPolicyName) {
        super.withSigninPolicyName(signinPolicyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderUpdateProperties withProfileEditingPolicyName(String profileEditingPolicyName) {
        super.withProfileEditingPolicyName(profileEditingPolicyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderUpdateProperties withPasswordResetPolicyName(String passwordResetPolicyName) {
        super.withPasswordResetPolicyName(passwordResetPolicyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IdentityProviderUpdateProperties withClientLibrary(String clientLibrary) {
        super.withClientLibrary(clientLibrary);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
