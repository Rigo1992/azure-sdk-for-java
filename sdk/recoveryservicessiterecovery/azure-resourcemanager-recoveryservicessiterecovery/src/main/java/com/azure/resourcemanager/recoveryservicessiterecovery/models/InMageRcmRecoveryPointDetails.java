// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InMageRcm provider specific recovery point details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcm")
@Immutable
public final class InMageRcmRecoveryPointDetails extends ProviderSpecificRecoveryPointDetails {
    /*
     * A value indicating whether the recovery point is multi VM consistent.
     */
    @JsonProperty(value = "isMultiVmSyncPoint", access = JsonProperty.Access.WRITE_ONLY)
    private String isMultiVmSyncPoint;

    /**
     * Creates an instance of InMageRcmRecoveryPointDetails class.
     */
    public InMageRcmRecoveryPointDetails() {
    }

    /**
     * Get the isMultiVmSyncPoint property: A value indicating whether the recovery point is multi VM consistent.
     * 
     * @return the isMultiVmSyncPoint value.
     */
    public String isMultiVmSyncPoint() {
        return this.isMultiVmSyncPoint;
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
