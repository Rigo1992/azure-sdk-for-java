// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Protectable item for Azure Fileshare workloads.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableItemType")
@JsonTypeName("AzureFileShare")
@Fluent
public final class AzureFileShareProtectableItem extends WorkloadProtectableItem {
    /*
     * Full Fabric ID of container to which this protectable item belongs. For example, ARM ID.
     */
    @JsonProperty(value = "parentContainerFabricId")
    private String parentContainerFabricId;

    /*
     * Friendly name of container to which this protectable item belongs.
     */
    @JsonProperty(value = "parentContainerFriendlyName")
    private String parentContainerFriendlyName;

    /*
     * File Share type XSync or XSMB.
     */
    @JsonProperty(value = "azureFileShareType")
    private AzureFileShareType azureFileShareType;

    /**
     * Creates an instance of AzureFileShareProtectableItem class.
     */
    public AzureFileShareProtectableItem() {
    }

    /**
     * Get the parentContainerFabricId property: Full Fabric ID of container to which this protectable item belongs.
     * For example, ARM ID.
     * 
     * @return the parentContainerFabricId value.
     */
    public String parentContainerFabricId() {
        return this.parentContainerFabricId;
    }

    /**
     * Set the parentContainerFabricId property: Full Fabric ID of container to which this protectable item belongs.
     * For example, ARM ID.
     * 
     * @param parentContainerFabricId the parentContainerFabricId value to set.
     * @return the AzureFileShareProtectableItem object itself.
     */
    public AzureFileShareProtectableItem withParentContainerFabricId(String parentContainerFabricId) {
        this.parentContainerFabricId = parentContainerFabricId;
        return this;
    }

    /**
     * Get the parentContainerFriendlyName property: Friendly name of container to which this protectable item belongs.
     * 
     * @return the parentContainerFriendlyName value.
     */
    public String parentContainerFriendlyName() {
        return this.parentContainerFriendlyName;
    }

    /**
     * Set the parentContainerFriendlyName property: Friendly name of container to which this protectable item belongs.
     * 
     * @param parentContainerFriendlyName the parentContainerFriendlyName value to set.
     * @return the AzureFileShareProtectableItem object itself.
     */
    public AzureFileShareProtectableItem withParentContainerFriendlyName(String parentContainerFriendlyName) {
        this.parentContainerFriendlyName = parentContainerFriendlyName;
        return this;
    }

    /**
     * Get the azureFileShareType property: File Share type XSync or XSMB.
     * 
     * @return the azureFileShareType value.
     */
    public AzureFileShareType azureFileShareType() {
        return this.azureFileShareType;
    }

    /**
     * Set the azureFileShareType property: File Share type XSync or XSMB.
     * 
     * @param azureFileShareType the azureFileShareType value to set.
     * @return the AzureFileShareProtectableItem object itself.
     */
    public AzureFileShareProtectableItem withAzureFileShareType(AzureFileShareType azureFileShareType) {
        this.azureFileShareType = azureFileShareType;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFileShareProtectableItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFileShareProtectableItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFileShareProtectableItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFileShareProtectableItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
