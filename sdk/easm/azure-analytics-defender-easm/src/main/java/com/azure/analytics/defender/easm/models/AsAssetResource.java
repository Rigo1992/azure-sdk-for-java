// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The AsAssetResource model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("as")
@Immutable
public final class AsAssetResource extends AssetResource {

    /*
     * asset
     */
    @Generated
    @JsonProperty(value = "asset")
    private AsAsset asset;

    /**
     * Creates an instance of AsAssetResource class.
     *
     * @param asset the asset value to set.
     */
    @Generated
    @JsonCreator
    private AsAssetResource(@JsonProperty(value = "asset") AsAsset asset) {
        this.asset = asset;
    }

    /**
     * Get the asset property: asset.
     *
     * @return the asset value.
     */
    @Generated
    public AsAsset getAsset() {
        return this.asset;
    }
}
