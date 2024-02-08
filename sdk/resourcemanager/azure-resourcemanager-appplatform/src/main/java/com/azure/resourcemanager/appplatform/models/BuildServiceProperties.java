// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Build service resource properties payload.
 */
@Fluent
public final class BuildServiceProperties {
    /*
     * The resource id of the container registry used in this build service.
     */
    @JsonProperty(value = "containerRegistry")
    private String containerRegistry;

    /*
     * The installed KPack version in this build service.
     */
    @JsonProperty(value = "kPackVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String kPackVersion;

    /*
     * Provisioning state of the KPack build service
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private BuildServiceProvisioningState provisioningState;

    /*
     * The runtime resource configuration of this build service.
     */
    @JsonProperty(value = "resourceRequests")
    private BuildServicePropertiesResourceRequests resourceRequests;

    /**
     * Creates an instance of BuildServiceProperties class.
     */
    public BuildServiceProperties() {
    }

    /**
     * Get the containerRegistry property: The resource id of the container registry used in this build service.
     * 
     * @return the containerRegistry value.
     */
    public String containerRegistry() {
        return this.containerRegistry;
    }

    /**
     * Set the containerRegistry property: The resource id of the container registry used in this build service.
     * 
     * @param containerRegistry the containerRegistry value to set.
     * @return the BuildServiceProperties object itself.
     */
    public BuildServiceProperties withContainerRegistry(String containerRegistry) {
        this.containerRegistry = containerRegistry;
        return this;
    }

    /**
     * Get the kPackVersion property: The installed KPack version in this build service.
     * 
     * @return the kPackVersion value.
     */
    public String kPackVersion() {
        return this.kPackVersion;
    }

    /**
     * Get the provisioningState property: Provisioning state of the KPack build service.
     * 
     * @return the provisioningState value.
     */
    public BuildServiceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceRequests property: The runtime resource configuration of this build service.
     * 
     * @return the resourceRequests value.
     */
    public BuildServicePropertiesResourceRequests resourceRequests() {
        return this.resourceRequests;
    }

    /**
     * Set the resourceRequests property: The runtime resource configuration of this build service.
     * 
     * @param resourceRequests the resourceRequests value to set.
     * @return the BuildServiceProperties object itself.
     */
    public BuildServiceProperties withResourceRequests(BuildServicePropertiesResourceRequests resourceRequests) {
        this.resourceRequests = resourceRequests;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceRequests() != null) {
            resourceRequests().validate();
        }
    }
}
