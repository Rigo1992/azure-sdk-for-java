// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines all possible authentication profiles for the OpenShift cluster.
 */
@Fluent
public final class OpenShiftManagedClusterAuthProfile {
    /*
     * Type of authentication profile to use.
     */
    @JsonProperty(value = "identityProviders")
    private List<OpenShiftManagedClusterIdentityProvider> identityProviders;

    /**
     * Creates an instance of OpenShiftManagedClusterAuthProfile class.
     */
    public OpenShiftManagedClusterAuthProfile() {
    }

    /**
     * Get the identityProviders property: Type of authentication profile to use.
     *
     * @return the identityProviders value.
     */
    public List<OpenShiftManagedClusterIdentityProvider> identityProviders() {
        return this.identityProviders;
    }

    /**
     * Set the identityProviders property: Type of authentication profile to use.
     *
     * @param identityProviders the identityProviders value to set.
     * @return the OpenShiftManagedClusterAuthProfile object itself.
     */
    public OpenShiftManagedClusterAuthProfile
        withIdentityProviders(List<OpenShiftManagedClusterIdentityProvider> identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identityProviders() != null) {
            identityProviders().forEach(e -> e.validate());
        }
    }
}
