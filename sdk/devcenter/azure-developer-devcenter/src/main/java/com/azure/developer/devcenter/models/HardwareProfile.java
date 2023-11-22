// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hardware specifications for the Dev Box.
 */
@Immutable
public final class HardwareProfile {
    /*
     * The name of the SKU
     */
    @Generated
    @JsonProperty(value = "skuName", access = JsonProperty.Access.WRITE_ONLY)
    private String skuName;

    /*
     * The number of vCPUs available for the Dev Box.
     */
    @Generated
    @JsonProperty(value = "vCPUs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer vCPUs;

    /*
     * The amount of memory available for the Dev Box.
     */
    @Generated
    @JsonProperty(value = "memoryGB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer memoryGB;

    /**
     * Creates an instance of HardwareProfile class.
     */
    @Generated
    private HardwareProfile() {
    }

    /**
     * Get the skuName property: The name of the SKU.
     * 
     * @return the skuName value.
     */
    @Generated
    public String getSkuName() {
        return this.skuName;
    }

    /**
     * Get the vCPUs property: The number of vCPUs available for the Dev Box.
     * 
     * @return the vCPUs value.
     */
    @Generated
    public Integer getVCPUs() {
        return this.vCPUs;
    }

    /**
     * Get the memoryGB property: The amount of memory available for the Dev Box.
     * 
     * @return the memoryGB value.
     */
    @Generated
    public Integer getMemoryGB() {
        return this.memoryGB;
    }
}
