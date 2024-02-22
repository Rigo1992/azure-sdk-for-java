// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies how tasks should be distributed across compute nodes.
 */
@Fluent
public final class TaskSchedulingPolicy {
    /*
     * How tasks should be distributed across compute nodes.
     */
    @JsonProperty(value = "nodeFillType", required = true)
    private ComputeNodeFillType nodeFillType;

    /**
     * Creates an instance of TaskSchedulingPolicy class.
     */
    public TaskSchedulingPolicy() {
    }

    /**
     * Get the nodeFillType property: How tasks should be distributed across compute nodes.
     * 
     * @return the nodeFillType value.
     */
    public ComputeNodeFillType nodeFillType() {
        return this.nodeFillType;
    }

    /**
     * Set the nodeFillType property: How tasks should be distributed across compute nodes.
     * 
     * @param nodeFillType the nodeFillType value to set.
     * @return the TaskSchedulingPolicy object itself.
     */
    public TaskSchedulingPolicy withNodeFillType(ComputeNodeFillType nodeFillType) {
        this.nodeFillType = nodeFillType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nodeFillType() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property nodeFillType in model TaskSchedulingPolicy"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TaskSchedulingPolicy.class);
}
