// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource specific properties for the Storage Mover resource. */
@Fluent
public final class StorageMoverUpdateProperties {
    /*
     * A description for the Storage Mover.
     */
    @JsonProperty(value = "description")
    private String description;

    /** Creates an instance of StorageMoverUpdateProperties class. */
    public StorageMoverUpdateProperties() {
    }

    /**
     * Get the description property: A description for the Storage Mover.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for the Storage Mover.
     *
     * @param description the description value to set.
     * @return the StorageMoverUpdateProperties object itself.
     */
    public StorageMoverUpdateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
