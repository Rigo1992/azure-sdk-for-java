// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the service artifact reference id used to set same image version for all virtual machines in the scale set
 * when using 'latest' image version. Minimum api-version: 2022-11-01.
 */
@Fluent
public final class ServiceArtifactReference {
    /*
     * The service artifact reference id in the form of
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName
     * }/serviceArtifacts/{serviceArtifactName}/vmArtifactsProfiles/{vmArtifactsProfilesName}
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of ServiceArtifactReference class.
     */
    public ServiceArtifactReference() {
    }

    /**
     * Get the id property: The service artifact reference id in the form of
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName}/serviceArtifacts/{serviceArtifactName}/vmArtifactsProfiles/{vmArtifactsProfilesName}.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The service artifact reference id in the form of
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Compute/galleries/{galleryName}/serviceArtifacts/{serviceArtifactName}/vmArtifactsProfiles/{vmArtifactsProfilesName}.
     * 
     * @param id the id value to set.
     * @return the ServiceArtifactReference object itself.
     */
    public ServiceArtifactReference withId(String id) {
        this.id = id;
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
