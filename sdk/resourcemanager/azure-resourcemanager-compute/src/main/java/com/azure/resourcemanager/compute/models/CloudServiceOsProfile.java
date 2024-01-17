// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes the OS profile for the cloud service.
 */
@Fluent
public final class CloudServiceOsProfile {
    /*
     * Specifies set of certificates that should be installed onto the role instances.
     */
    @JsonProperty(value = "secrets")
    private List<CloudServiceVaultSecretGroup> secrets;

    /**
     * Creates an instance of CloudServiceOsProfile class.
     */
    public CloudServiceOsProfile() {
    }

    /**
     * Get the secrets property: Specifies set of certificates that should be installed onto the role instances.
     * 
     * @return the secrets value.
     */
    public List<CloudServiceVaultSecretGroup> secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: Specifies set of certificates that should be installed onto the role instances.
     * 
     * @param secrets the secrets value to set.
     * @return the CloudServiceOsProfile object itself.
     */
    public CloudServiceOsProfile withSecrets(List<CloudServiceVaultSecretGroup> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secrets() != null) {
            secrets().forEach(e -> e.validate());
        }
    }
}
