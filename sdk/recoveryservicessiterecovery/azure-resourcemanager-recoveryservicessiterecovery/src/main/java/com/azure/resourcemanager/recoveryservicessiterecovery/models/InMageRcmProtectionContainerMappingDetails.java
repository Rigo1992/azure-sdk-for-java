// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InMageRcm provider specific container mapping details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcm")
@Immutable
public final class InMageRcmProtectionContainerMappingDetails
    extends ProtectionContainerMappingProviderSpecificDetails {
    /*
     * A value indicating whether the flag for enable agent auto upgrade.
     */
    @JsonProperty(value = "enableAgentAutoUpgrade", access = JsonProperty.Access.WRITE_ONLY)
    private String enableAgentAutoUpgrade;

    /**
     * Creates an instance of InMageRcmProtectionContainerMappingDetails class.
     */
    public InMageRcmProtectionContainerMappingDetails() {
    }

    /**
     * Get the enableAgentAutoUpgrade property: A value indicating whether the flag for enable agent auto upgrade.
     * 
     * @return the enableAgentAutoUpgrade value.
     */
    public String enableAgentAutoUpgrade() {
        return this.enableAgentAutoUpgrade;
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
