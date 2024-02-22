// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Onprem disk details data.
 */
@Fluent
public final class DiskDetails {
    /*
     * The hard disk max size in MB.
     */
    @JsonProperty(value = "maxSizeMB")
    private Long maxSizeMB;

    /*
     * The type of the volume.
     */
    @JsonProperty(value = "vhdType")
    private String vhdType;

    /*
     * The VHD Id.
     */
    @JsonProperty(value = "vhdId")
    private String vhdId;

    /*
     * The VHD name.
     */
    @JsonProperty(value = "vhdName")
    private String vhdName;

    /**
     * Creates an instance of DiskDetails class.
     */
    public DiskDetails() {
    }

    /**
     * Get the maxSizeMB property: The hard disk max size in MB.
     * 
     * @return the maxSizeMB value.
     */
    public Long maxSizeMB() {
        return this.maxSizeMB;
    }

    /**
     * Set the maxSizeMB property: The hard disk max size in MB.
     * 
     * @param maxSizeMB the maxSizeMB value to set.
     * @return the DiskDetails object itself.
     */
    public DiskDetails withMaxSizeMB(Long maxSizeMB) {
        this.maxSizeMB = maxSizeMB;
        return this;
    }

    /**
     * Get the vhdType property: The type of the volume.
     * 
     * @return the vhdType value.
     */
    public String vhdType() {
        return this.vhdType;
    }

    /**
     * Set the vhdType property: The type of the volume.
     * 
     * @param vhdType the vhdType value to set.
     * @return the DiskDetails object itself.
     */
    public DiskDetails withVhdType(String vhdType) {
        this.vhdType = vhdType;
        return this;
    }

    /**
     * Get the vhdId property: The VHD Id.
     * 
     * @return the vhdId value.
     */
    public String vhdId() {
        return this.vhdId;
    }

    /**
     * Set the vhdId property: The VHD Id.
     * 
     * @param vhdId the vhdId value to set.
     * @return the DiskDetails object itself.
     */
    public DiskDetails withVhdId(String vhdId) {
        this.vhdId = vhdId;
        return this;
    }

    /**
     * Get the vhdName property: The VHD name.
     * 
     * @return the vhdName value.
     */
    public String vhdName() {
        return this.vhdName;
    }

    /**
     * Set the vhdName property: The VHD name.
     * 
     * @param vhdName the vhdName value to set.
     * @return the DiskDetails object itself.
     */
    public DiskDetails withVhdName(String vhdName) {
        this.vhdName = vhdName;
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
