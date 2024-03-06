// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the ephemeral Disk Settings for the operating system disk used by the virtual machine.
 */
@Fluent
public final class DiffDiskSettings {
    /*
     * Specifies the ephemeral disk placement for operating system disk for all VMs in the pool.
     * 
     * This property can be used by user in the request to choose which location the operating system should be in.
     * e.g., cache disk space for Ephemeral OS disk provisioning. For more information on Ephemeral OS disk size
     * requirements, please refer to Ephemeral OS disk size requirements for Windows VMs at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements and Linux
     * VMs at https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements.
     */
    @JsonProperty(value = "placement")
    private DiffDiskPlacement placement;

    /**
     * Creates an instance of DiffDiskSettings class.
     */
    public DiffDiskSettings() {
    }

    /**
     * Get the placement property: Specifies the ephemeral disk placement for operating system disk for all VMs in the
     * pool.
     * 
     * This property can be used by user in the request to choose which location the operating system should be in.
     * e.g., cache disk space for Ephemeral OS disk provisioning. For more information on Ephemeral OS disk size
     * requirements, please refer to Ephemeral OS disk size requirements for Windows VMs at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements and Linux
     * VMs at https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements.
     * 
     * @return the placement value.
     */
    public DiffDiskPlacement placement() {
        return this.placement;
    }

    /**
     * Set the placement property: Specifies the ephemeral disk placement for operating system disk for all VMs in the
     * pool.
     * 
     * This property can be used by user in the request to choose which location the operating system should be in.
     * e.g., cache disk space for Ephemeral OS disk provisioning. For more information on Ephemeral OS disk size
     * requirements, please refer to Ephemeral OS disk size requirements for Windows VMs at
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements and Linux
     * VMs at https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements.
     * 
     * @param placement the placement value to set.
     * @return the DiffDiskSettings object itself.
     */
    public DiffDiskSettings withPlacement(DiffDiskPlacement placement) {
        this.placement = placement;
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
