// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The storage of a physical partition.
 */
@Immutable
public final class PhysicalPartitionStorageInfo {
    /*
     * The unique identifier of the partition.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The storage in KB for the physical partition.
     */
    @JsonProperty(value = "storageInKB", access = JsonProperty.Access.WRITE_ONLY)
    private Double storageInKB;

    /**
     * Creates an instance of PhysicalPartitionStorageInfo class.
     */
    public PhysicalPartitionStorageInfo() {
    }

    /**
     * Get the id property: The unique identifier of the partition.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the storageInKB property: The storage in KB for the physical partition.
     * 
     * @return the storageInKB value.
     */
    public Double storageInKB() {
        return this.storageInKB;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
