// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an allowed environment type.
 */
@Immutable
public final class AllowedEnvironmentTypeInner extends ProxyResource {
    /*
     * Properties of an allowed environment type.
     */
    @JsonProperty(value = "properties")
    private AllowedEnvironmentTypeProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of AllowedEnvironmentTypeInner class.
     */
    public AllowedEnvironmentTypeInner() {
    }

    /**
     * Get the innerProperties property: Properties of an allowed environment type.
     * 
     * @return the innerProperties value.
     */
    private AllowedEnvironmentTypeProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the displayName property: The display name of the allowed environment type.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
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
