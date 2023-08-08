// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The SslCertAssetResource model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("sslCert")
@Immutable
public final class SslCertAssetResource extends AssetResource {
    /*
     * asset
     */
    @Generated
    @JsonProperty(value = "asset")
    private SslCertAsset asset;

    /**
     * Creates an instance of SslCertAssetResource class.
     *
     * @param asset the asset value to set.
     */
    @Generated
    @JsonCreator
    private SslCertAssetResource(@JsonProperty(value = "asset") SslCertAsset asset) {
        this.asset = asset;
    }

    /**
     * Get the asset property: asset.
     *
     * @return the asset value.
     */
    @Generated
    public SslCertAsset getAsset() {
        return this.asset;
    }
}
