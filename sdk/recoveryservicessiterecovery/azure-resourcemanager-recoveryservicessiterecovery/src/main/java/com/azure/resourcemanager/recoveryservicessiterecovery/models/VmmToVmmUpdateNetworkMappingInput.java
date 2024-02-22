// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Update network mappings input properties/behavior specific to vmm to vmm.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VmmToVmm")
@Immutable
public final class VmmToVmmUpdateNetworkMappingInput extends FabricSpecificUpdateNetworkMappingInput {
    /**
     * Creates an instance of VmmToVmmUpdateNetworkMappingInput class.
     */
    public VmmToVmmUpdateNetworkMappingInput() {
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
