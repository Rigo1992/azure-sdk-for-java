// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request parameters for tiering cost info for vault.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "objectType",
    defaultImpl = FetchTieringCostSavingsInfoForVaultRequest.class,
    visible = true)
@JsonTypeName("FetchTieringCostSavingsInfoForVaultRequest")
@Fluent
public final class FetchTieringCostSavingsInfoForVaultRequest extends FetchTieringCostInfoRequest {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     */
    @JsonTypeId
    @JsonProperty(value = "objectType", required = true)
    private String objectType = "FetchTieringCostSavingsInfoForVaultRequest";

    /**
     * Creates an instance of FetchTieringCostSavingsInfoForVaultRequest class.
     */
    public FetchTieringCostSavingsInfoForVaultRequest() {
    }

    /**
     * Get the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FetchTieringCostSavingsInfoForVaultRequest withSourceTierType(RecoveryPointTierType sourceTierType) {
        super.withSourceTierType(sourceTierType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FetchTieringCostSavingsInfoForVaultRequest withTargetTierType(RecoveryPointTierType targetTierType) {
        super.withTargetTierType(targetTierType);
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
