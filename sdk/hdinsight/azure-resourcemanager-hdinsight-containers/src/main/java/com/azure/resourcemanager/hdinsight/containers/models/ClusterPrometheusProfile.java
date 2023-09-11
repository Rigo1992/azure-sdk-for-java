// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cluster Prometheus profile. */
@Fluent
public final class ClusterPrometheusProfile {
    /*
     * Enable Prometheus for cluster or not.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /** Creates an instance of ClusterPrometheusProfile class. */
    public ClusterPrometheusProfile() {
    }

    /**
     * Get the enabled property: Enable Prometheus for cluster or not.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Enable Prometheus for cluster or not.
     *
     * @param enabled the enabled value to set.
     * @return the ClusterPrometheusProfile object itself.
     */
    public ClusterPrometheusProfile withEnabled(boolean enabled) {
        this.enabled = enabled;
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
