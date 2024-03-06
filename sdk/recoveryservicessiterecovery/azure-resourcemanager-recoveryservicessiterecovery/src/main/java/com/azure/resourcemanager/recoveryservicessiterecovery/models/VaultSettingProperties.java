// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Vault setting properties.
 */
@Fluent
public final class VaultSettingProperties {
    /*
     * The migration solution ARM Id.
     */
    @JsonProperty(value = "migrationSolutionId")
    private String migrationSolutionId;

    /*
     * VMware to Azure provider type.
     */
    @JsonProperty(value = "vmwareToAzureProviderType")
    private String vmwareToAzureProviderType;

    /**
     * Creates an instance of VaultSettingProperties class.
     */
    public VaultSettingProperties() {
    }

    /**
     * Get the migrationSolutionId property: The migration solution ARM Id.
     * 
     * @return the migrationSolutionId value.
     */
    public String migrationSolutionId() {
        return this.migrationSolutionId;
    }

    /**
     * Set the migrationSolutionId property: The migration solution ARM Id.
     * 
     * @param migrationSolutionId the migrationSolutionId value to set.
     * @return the VaultSettingProperties object itself.
     */
    public VaultSettingProperties withMigrationSolutionId(String migrationSolutionId) {
        this.migrationSolutionId = migrationSolutionId;
        return this;
    }

    /**
     * Get the vmwareToAzureProviderType property: VMware to Azure provider type.
     * 
     * @return the vmwareToAzureProviderType value.
     */
    public String vmwareToAzureProviderType() {
        return this.vmwareToAzureProviderType;
    }

    /**
     * Set the vmwareToAzureProviderType property: VMware to Azure provider type.
     * 
     * @param vmwareToAzureProviderType the vmwareToAzureProviderType value to set.
     * @return the VaultSettingProperties object itself.
     */
    public VaultSettingProperties withVmwareToAzureProviderType(String vmwareToAzureProviderType) {
        this.vmwareToAzureProviderType = vmwareToAzureProviderType;
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
