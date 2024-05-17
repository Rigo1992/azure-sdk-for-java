// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ARC autoprovisioning configuration.
 */
@Fluent
public class ArcAutoProvisioning {
    /*
     * Is arc auto provisioning enabled
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Configuration for servers Arc auto provisioning for a given environment
     */
    @JsonProperty(value = "configuration")
    private ArcAutoProvisioningConfiguration configuration;

    /**
     * Creates an instance of ArcAutoProvisioning class.
     */
    public ArcAutoProvisioning() {
    }

    /**
     * Get the enabled property: Is arc auto provisioning enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is arc auto provisioning enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the ArcAutoProvisioning object itself.
     */
    public ArcAutoProvisioning withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the configuration property: Configuration for servers Arc auto provisioning for a given environment.
     * 
     * @return the configuration value.
     */
    public ArcAutoProvisioningConfiguration configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Configuration for servers Arc auto provisioning for a given environment.
     * 
     * @param configuration the configuration value to set.
     * @return the ArcAutoProvisioning object itself.
     */
    public ArcAutoProvisioning withConfiguration(ArcAutoProvisioningConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configuration() != null) {
            configuration().validate();
        }
    }
}
