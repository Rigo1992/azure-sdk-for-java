// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies how Tasks should be distributed across Compute Nodes. */
@Immutable
public final class TaskSchedulingPolicy {

    /*
     * If not specified, the default is spread.
     */
    @Generated
    @JsonProperty(value = "nodeFillType")
    private ComputeNodeFillType nodeFillType;

    /**
     * Creates an instance of TaskSchedulingPolicy class.
     *
     * @param nodeFillType the nodeFillType value to set.
     */
    @Generated
    @JsonCreator
    public TaskSchedulingPolicy(@JsonProperty(value = "nodeFillType") ComputeNodeFillType nodeFillType) {
        this.nodeFillType = nodeFillType;
    }

    /**
     * Get the nodeFillType property: If not specified, the default is spread.
     *
     * @return the nodeFillType value.
     */
    @Generated
    public ComputeNodeFillType getNodeFillType() {
        return this.nodeFillType;
    }
}
