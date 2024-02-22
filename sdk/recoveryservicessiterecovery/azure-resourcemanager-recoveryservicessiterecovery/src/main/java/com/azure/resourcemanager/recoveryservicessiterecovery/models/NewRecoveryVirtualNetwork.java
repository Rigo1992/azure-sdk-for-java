// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Recovery virtual network input to create new virtual network from given source network.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("New")
@Fluent
public final class NewRecoveryVirtualNetwork extends RecoveryVirtualNetworkCustomDetails {
    /*
     * The name of the resource group to be used to create the recovery virtual network. If absent, target network
     * would be created in the same resource group as target VM.
     */
    @JsonProperty(value = "recoveryVirtualNetworkResourceGroupName")
    private String recoveryVirtualNetworkResourceGroupName;

    /*
     * The recovery virtual network name.
     */
    @JsonProperty(value = "recoveryVirtualNetworkName")
    private String recoveryVirtualNetworkName;

    /**
     * Creates an instance of NewRecoveryVirtualNetwork class.
     */
    public NewRecoveryVirtualNetwork() {
    }

    /**
     * Get the recoveryVirtualNetworkResourceGroupName property: The name of the resource group to be used to create
     * the recovery virtual network. If absent, target network would be created in the same resource group as target
     * VM.
     * 
     * @return the recoveryVirtualNetworkResourceGroupName value.
     */
    public String recoveryVirtualNetworkResourceGroupName() {
        return this.recoveryVirtualNetworkResourceGroupName;
    }

    /**
     * Set the recoveryVirtualNetworkResourceGroupName property: The name of the resource group to be used to create
     * the recovery virtual network. If absent, target network would be created in the same resource group as target
     * VM.
     * 
     * @param recoveryVirtualNetworkResourceGroupName the recoveryVirtualNetworkResourceGroupName value to set.
     * @return the NewRecoveryVirtualNetwork object itself.
     */
    public NewRecoveryVirtualNetwork
        withRecoveryVirtualNetworkResourceGroupName(String recoveryVirtualNetworkResourceGroupName) {
        this.recoveryVirtualNetworkResourceGroupName = recoveryVirtualNetworkResourceGroupName;
        return this;
    }

    /**
     * Get the recoveryVirtualNetworkName property: The recovery virtual network name.
     * 
     * @return the recoveryVirtualNetworkName value.
     */
    public String recoveryVirtualNetworkName() {
        return this.recoveryVirtualNetworkName;
    }

    /**
     * Set the recoveryVirtualNetworkName property: The recovery virtual network name.
     * 
     * @param recoveryVirtualNetworkName the recoveryVirtualNetworkName value to set.
     * @return the NewRecoveryVirtualNetwork object itself.
     */
    public NewRecoveryVirtualNetwork withRecoveryVirtualNetworkName(String recoveryVirtualNetworkName) {
        this.recoveryVirtualNetworkName = recoveryVirtualNetworkName;
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
