// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes multiple sets of label selectors, of which one will be selected and attached according to a weighting. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("weighted-allocation-queue-selector")
@Fluent
public final class WeightedAllocationQueueSelectorAttachmentInternal extends QueueSelectorAttachmentInternal {
    /*
     * A collection of percentage based weighted allocations.
     */
    @JsonProperty(value = "allocations", required = true)
    private List<QueueWeightedAllocationInternal> allocations;

    /**
     * Get the allocations property: A collection of percentage based weighted allocations.
     *
     * @return the allocations value.
     */
    public List<QueueWeightedAllocationInternal> getAllocations() {
        return this.allocations;
    }

    /**
     * Set the allocations property: A collection of percentage based weighted allocations.
     *
     * @param allocations the allocations value to set.
     * @return the WeightedAllocationQueueSelectorAttachmentInternal object itself.
     */
    public WeightedAllocationQueueSelectorAttachmentInternal setAllocations(
            List<QueueWeightedAllocationInternal> allocations) {
        this.allocations = allocations;
        return this;
    }
}
