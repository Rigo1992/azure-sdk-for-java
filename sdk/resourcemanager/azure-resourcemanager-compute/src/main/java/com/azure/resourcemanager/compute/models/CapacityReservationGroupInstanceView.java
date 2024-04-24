// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The CapacityReservationGroupInstanceView model.
 */
@Immutable
public final class CapacityReservationGroupInstanceView {
    /*
     * List of instance view of the capacity reservations under the capacity reservation group.
     */
    @JsonProperty(value = "capacityReservations", access = JsonProperty.Access.WRITE_ONLY)
    private List<CapacityReservationInstanceViewWithName> capacityReservations;

    /*
     * List of the subscriptions that the capacity reservation group is shared with. **Note:** Minimum api-version:
     * 2024-03-01. Please refer to https://aka.ms/computereservationsharing for more details.
     */
    @JsonProperty(value = "sharedSubscriptionIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> sharedSubscriptionIds;

    /**
     * Creates an instance of CapacityReservationGroupInstanceView class.
     */
    public CapacityReservationGroupInstanceView() {
    }

    /**
     * Get the capacityReservations property: List of instance view of the capacity reservations under the capacity
     * reservation group.
     * 
     * @return the capacityReservations value.
     */
    public List<CapacityReservationInstanceViewWithName> capacityReservations() {
        return this.capacityReservations;
    }

    /**
     * Get the sharedSubscriptionIds property: List of the subscriptions that the capacity reservation group is shared
     * with. **Note:** Minimum api-version: 2024-03-01. Please refer to https://aka.ms/computereservationsharing for
     * more details.
     * 
     * @return the sharedSubscriptionIds value.
     */
    public List<SubResourceReadOnly> sharedSubscriptionIds() {
        return this.sharedSubscriptionIds;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capacityReservations() != null) {
            capacityReservations().forEach(e -> e.validate());
        }
        if (sharedSubscriptionIds() != null) {
            sharedSubscriptionIds().forEach(e -> e.validate());
        }
    }
}
