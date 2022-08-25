// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The status of virtual machine patch operations. */
@Fluent
public final class VirtualMachinePatchStatus {
    /*
     * The available patch summary of the latest assessment operation for the virtual machine.
     */
    @JsonProperty(value = "availablePatchSummary")
    private AvailablePatchSummary availablePatchSummary;

    /*
     * The installation summary of the latest installation operation for the virtual machine.
     */
    @JsonProperty(value = "lastPatchInstallationSummary")
    private LastPatchInstallationSummary lastPatchInstallationSummary;

    /*
     * The enablement status of the specified patchMode
     */
    @JsonProperty(value = "configurationStatuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<InstanceViewStatus> configurationStatuses;

    /**
     * Get the availablePatchSummary property: The available patch summary of the latest assessment operation for the
     * virtual machine.
     *
     * @return the availablePatchSummary value.
     */
    public AvailablePatchSummary availablePatchSummary() {
        return this.availablePatchSummary;
    }

    /**
     * Set the availablePatchSummary property: The available patch summary of the latest assessment operation for the
     * virtual machine.
     *
     * @param availablePatchSummary the availablePatchSummary value to set.
     * @return the VirtualMachinePatchStatus object itself.
     */
    public VirtualMachinePatchStatus withAvailablePatchSummary(AvailablePatchSummary availablePatchSummary) {
        this.availablePatchSummary = availablePatchSummary;
        return this;
    }

    /**
     * Get the lastPatchInstallationSummary property: The installation summary of the latest installation operation for
     * the virtual machine.
     *
     * @return the lastPatchInstallationSummary value.
     */
    public LastPatchInstallationSummary lastPatchInstallationSummary() {
        return this.lastPatchInstallationSummary;
    }

    /**
     * Set the lastPatchInstallationSummary property: The installation summary of the latest installation operation for
     * the virtual machine.
     *
     * @param lastPatchInstallationSummary the lastPatchInstallationSummary value to set.
     * @return the VirtualMachinePatchStatus object itself.
     */
    public VirtualMachinePatchStatus withLastPatchInstallationSummary(
        LastPatchInstallationSummary lastPatchInstallationSummary) {
        this.lastPatchInstallationSummary = lastPatchInstallationSummary;
        return this;
    }

    /**
     * Get the configurationStatuses property: The enablement status of the specified patchMode.
     *
     * @return the configurationStatuses value.
     */
    public List<InstanceViewStatus> configurationStatuses() {
        return this.configurationStatuses;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availablePatchSummary() != null) {
            availablePatchSummary().validate();
        }
        if (lastPatchInstallationSummary() != null) {
            lastPatchInstallationSummary().validate();
        }
        if (configurationStatuses() != null) {
            configurationStatuses().forEach(e -> e.validate());
        }
    }
}
