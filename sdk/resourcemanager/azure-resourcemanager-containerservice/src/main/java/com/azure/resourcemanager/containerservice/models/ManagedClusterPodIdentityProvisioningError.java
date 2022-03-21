// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An error response from the pod identity provisioning. */
@Fluent
public final class ManagedClusterPodIdentityProvisioningError {
    /*
     * Details about the error.
     */
    @JsonProperty(value = "error")
    private ManagedClusterPodIdentityProvisioningErrorBody error;

    /**
     * Get the error property: Details about the error.
     *
     * @return the error value.
     */
    public ManagedClusterPodIdentityProvisioningErrorBody error() {
        return this.error;
    }

    /**
     * Set the error property: Details about the error.
     *
     * @param error the error value to set.
     * @return the ManagedClusterPodIdentityProvisioningError object itself.
     */
    public ManagedClusterPodIdentityProvisioningError withError(ManagedClusterPodIdentityProvisioningErrorBody error) {
        this.error = error;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
    }
}
