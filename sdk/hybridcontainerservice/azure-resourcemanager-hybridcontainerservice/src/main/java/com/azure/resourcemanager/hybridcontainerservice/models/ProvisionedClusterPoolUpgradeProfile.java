// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The list of available kubernetes versions for upgrade.
 */
@Fluent
public final class ProvisionedClusterPoolUpgradeProfile {
    /*
     * The Kubernetes version (major.minor.patch).
     */
    @JsonProperty(value = "kubernetesVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String kubernetesVersion;

    /*
     * The particular KubernetesVersion Image OS Type (Linux, Windows)
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private OsType osType;

    /*
     * List of available kubernetes versions for upgrade.
     */
    @JsonProperty(value = "upgrades")
    private List<ProvisionedClusterPoolUpgradeProfileProperties> upgrades;

    /**
     * Creates an instance of ProvisionedClusterPoolUpgradeProfile class.
     */
    public ProvisionedClusterPoolUpgradeProfile() {
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     * 
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Get the osType property: The particular KubernetesVersion Image OS Type (Linux, Windows).
     * 
     * @return the osType value.
     */
    public OsType osType() {
        return this.osType;
    }

    /**
     * Get the upgrades property: List of available kubernetes versions for upgrade.
     * 
     * @return the upgrades value.
     */
    public List<ProvisionedClusterPoolUpgradeProfileProperties> upgrades() {
        return this.upgrades;
    }

    /**
     * Set the upgrades property: List of available kubernetes versions for upgrade.
     * 
     * @param upgrades the upgrades value to set.
     * @return the ProvisionedClusterPoolUpgradeProfile object itself.
     */
    public ProvisionedClusterPoolUpgradeProfile
        withUpgrades(List<ProvisionedClusterPoolUpgradeProfileProperties> upgrades) {
        this.upgrades = upgrades;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (upgrades() != null) {
            upgrades().forEach(e -> e.validate());
        }
    }
}
