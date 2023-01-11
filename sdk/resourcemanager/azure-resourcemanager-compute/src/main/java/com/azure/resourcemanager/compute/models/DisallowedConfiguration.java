// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the disallowed configuration for a virtual machine image. */
@Fluent
public final class DisallowedConfiguration {
    /*
     * VM disk types which are disallowed.
     */
    @JsonProperty(value = "vmDiskType")
    private VmDiskTypes vmDiskType;

    /** Creates an instance of DisallowedConfiguration class. */
    public DisallowedConfiguration() {
    }

    /**
     * Get the vmDiskType property: VM disk types which are disallowed.
     *
     * @return the vmDiskType value.
     */
    public VmDiskTypes vmDiskType() {
        return this.vmDiskType;
    }

    /**
     * Set the vmDiskType property: VM disk types which are disallowed.
     *
     * @param vmDiskType the vmDiskType value to set.
     * @return the DisallowedConfiguration object itself.
     */
    public DisallowedConfiguration withVmDiskType(VmDiskTypes vmDiskType) {
        this.vmDiskType = vmDiskType;
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
