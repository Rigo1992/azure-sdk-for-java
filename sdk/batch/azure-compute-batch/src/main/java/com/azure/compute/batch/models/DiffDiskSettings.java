// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the ephemeral Disk Settings for the operating system disk used by the compute node (VM). */
@Fluent
public final class DiffDiskSettings {
    /*
     * This property can be used by user in the request to choose the location e.g.,
     * cache disk space for Ephemeral OS disk provisioning. For more information on
     * Ephemeral OS disk size requirements, please refer to Ephemeral OS disk size
     * requirements for Windows VMs at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements
     * and Linux VMs at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements.
     */
    @JsonProperty(value = "placement")
    private DiffDiskPlacement placement;

    /** Creates an instance of DiffDiskSettings class. */
    public DiffDiskSettings() {}

    /**
     * Get the placement property: This property can be used by user in the request to choose the location e.g., cache
     * disk space for Ephemeral OS disk provisioning. For more information on Ephemeral OS disk size requirements,
     * please refer to Ephemeral OS disk size requirements for Windows VMs at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements and Linux
     * VMs at https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements.
     *
     * @return the placement value.
     */
    public DiffDiskPlacement getPlacement() {
        return this.placement;
    }

    /**
     * Set the placement property: This property can be used by user in the request to choose the location e.g., cache
     * disk space for Ephemeral OS disk provisioning. For more information on Ephemeral OS disk size requirements,
     * please refer to Ephemeral OS disk size requirements for Windows VMs at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements and Linux
     * VMs at https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements.
     *
     * @param placement the placement value to set.
     * @return the DiffDiskSettings object itself.
     */
    public DiffDiskSettings setPlacement(DiffDiskPlacement placement) {
        this.placement = placement;
        return this;
    }
}
