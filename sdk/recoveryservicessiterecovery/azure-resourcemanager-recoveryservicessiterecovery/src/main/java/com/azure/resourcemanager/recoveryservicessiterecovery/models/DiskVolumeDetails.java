// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Volume details.
 */
@Fluent
public final class DiskVolumeDetails {
    /*
     * The volume label.
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * The volume name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Creates an instance of DiskVolumeDetails class.
     */
    public DiskVolumeDetails() {
    }

    /**
     * Get the label property: The volume label.
     * 
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: The volume label.
     * 
     * @param label the label value to set.
     * @return the DiskVolumeDetails object itself.
     */
    public DiskVolumeDetails withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the name property: The volume name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The volume name.
     * 
     * @param name the name value to set.
     * @return the DiskVolumeDetails object itself.
     */
    public DiskVolumeDetails withName(String name) {
        this.name = name;
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
