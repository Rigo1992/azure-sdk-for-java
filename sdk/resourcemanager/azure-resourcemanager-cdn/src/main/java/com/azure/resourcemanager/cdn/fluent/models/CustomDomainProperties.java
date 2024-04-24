// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.models.CustomDomainHttpsParameters;
import com.azure.resourcemanager.cdn.models.CustomDomainResourceState;
import com.azure.resourcemanager.cdn.models.CustomHttpsProvisioningState;
import com.azure.resourcemanager.cdn.models.CustomHttpsProvisioningSubstate;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSON object that contains the properties of the custom domain to create.
 */
@Fluent
public final class CustomDomainProperties {
    /*
     * The host name of the custom domain. Must be a domain name.
     */
    @JsonProperty(value = "hostName", required = true)
    private String hostname;

    /*
     * Resource status of the custom domain.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private CustomDomainResourceState resourceState;

    /*
     * Provisioning status of the custom domain.
     */
    @JsonProperty(value = "customHttpsProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CustomHttpsProvisioningState customHttpsProvisioningState;

    /*
     * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step.
     */
    @JsonProperty(value = "customHttpsProvisioningSubstate", access = JsonProperty.Access.WRITE_ONLY)
    private CustomHttpsProvisioningSubstate customHttpsProvisioningSubstate;

    /*
     * Certificate parameters for securing custom HTTPS
     */
    @JsonProperty(value = "customHttpsParameters")
    private CustomDomainHttpsParameters customHttpsParameters;

    /*
     * Special validation or data may be required when delivering CDN to some regions due to local compliance reasons.
     * E.g. ICP license number of a custom domain is required to deliver content in China.
     */
    @JsonProperty(value = "validationData")
    private String validationData;

    /*
     * Provisioning status of Custom Https of the custom domain.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CustomHttpsProvisioningState provisioningState;

    /**
     * Creates an instance of CustomDomainProperties class.
     */
    public CustomDomainProperties() {
    }

    /**
     * Get the hostname property: The host name of the custom domain. Must be a domain name.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the custom domain. Must be a domain name.
     * 
     * @param hostname the hostname value to set.
     * @return the CustomDomainProperties object itself.
     */
    public CustomDomainProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the resourceState property: Resource status of the custom domain.
     * 
     * @return the resourceState value.
     */
    public CustomDomainResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the customHttpsProvisioningState property: Provisioning status of the custom domain.
     * 
     * @return the customHttpsProvisioningState value.
     */
    public CustomHttpsProvisioningState customHttpsProvisioningState() {
        return this.customHttpsProvisioningState;
    }

    /**
     * Get the customHttpsProvisioningSubstate property: Provisioning substate shows the progress of custom HTTPS
     * enabling/disabling process step by step.
     * 
     * @return the customHttpsProvisioningSubstate value.
     */
    public CustomHttpsProvisioningSubstate customHttpsProvisioningSubstate() {
        return this.customHttpsProvisioningSubstate;
    }

    /**
     * Get the customHttpsParameters property: Certificate parameters for securing custom HTTPS.
     * 
     * @return the customHttpsParameters value.
     */
    public CustomDomainHttpsParameters customHttpsParameters() {
        return this.customHttpsParameters;
    }

    /**
     * Set the customHttpsParameters property: Certificate parameters for securing custom HTTPS.
     * 
     * @param customHttpsParameters the customHttpsParameters value to set.
     * @return the CustomDomainProperties object itself.
     */
    public CustomDomainProperties withCustomHttpsParameters(CustomDomainHttpsParameters customHttpsParameters) {
        this.customHttpsParameters = customHttpsParameters;
        return this;
    }

    /**
     * Get the validationData property: Special validation or data may be required when delivering CDN to some regions
     * due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in
     * China.
     * 
     * @return the validationData value.
     */
    public String validationData() {
        return this.validationData;
    }

    /**
     * Set the validationData property: Special validation or data may be required when delivering CDN to some regions
     * due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in
     * China.
     * 
     * @param validationData the validationData value to set.
     * @return the CustomDomainProperties object itself.
     */
    public CustomDomainProperties withValidationData(String validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status of Custom Https of the custom domain.
     * 
     * @return the provisioningState value.
     */
    public CustomHttpsProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostname() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property hostname in model CustomDomainProperties"));
        }
        if (customHttpsParameters() != null) {
            customHttpsParameters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomDomainProperties.class);
}
