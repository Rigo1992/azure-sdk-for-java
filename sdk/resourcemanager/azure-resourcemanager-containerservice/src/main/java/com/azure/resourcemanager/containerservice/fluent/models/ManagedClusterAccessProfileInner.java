// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Managed cluster Access Profile. */
@Fluent
public final class ManagedClusterAccessProfileInner extends Resource {
    /*
     * AccessProfile of a managed cluster.
     */
    @JsonProperty(value = "properties")
    private AccessProfile innerProperties;

    /**
     * Get the innerProperties property: AccessProfile of a managed cluster.
     *
     * @return the innerProperties value.
     */
    private AccessProfile innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAccessProfileInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagedClusterAccessProfileInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the kubeConfig property: Base64-encoded Kubernetes configuration file.
     *
     * @return the kubeConfig value.
     */
    public byte[] kubeConfig() {
        return this.innerProperties() == null ? new byte[0] : this.innerProperties().kubeConfig();
    }

    /**
     * Set the kubeConfig property: Base64-encoded Kubernetes configuration file.
     *
     * @param kubeConfig the kubeConfig value to set.
     * @return the ManagedClusterAccessProfileInner object itself.
     */
    public ManagedClusterAccessProfileInner withKubeConfig(byte[] kubeConfig) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AccessProfile();
        }
        this.innerProperties().withKubeConfig(kubeConfig);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
