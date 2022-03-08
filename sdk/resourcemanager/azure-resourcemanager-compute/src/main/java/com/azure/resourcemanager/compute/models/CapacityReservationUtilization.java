// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the capacity reservation utilization in terms of resources allocated. */
@Immutable
public final class CapacityReservationUtilization {
    /*
     * A list of all virtual machines resource ids allocated against the
     * capacity reservation.
     */
    @JsonProperty(value = "virtualMachinesAllocated", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> virtualMachinesAllocated;

    /**
     * Get the virtualMachinesAllocated property: A list of all virtual machines resource ids allocated against the
     * capacity reservation.
     *
     * @return the virtualMachinesAllocated value.
     */
    public List<SubResourceReadOnly> virtualMachinesAllocated() {
        return this.virtualMachinesAllocated;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualMachinesAllocated() != null) {
            virtualMachinesAllocated().forEach(e -> e.validate());
        }
    }
}
