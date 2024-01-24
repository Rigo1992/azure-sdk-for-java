// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Resource to retrieve throughput information for Cosmos DB resource.
 */
@Fluent
public final class RetrieveThroughputPropertiesResource {
    /*
     * Array of PhysicalPartitionId objects.
     */
    @JsonProperty(value = "physicalPartitionIds", required = true)
    private List<PhysicalPartitionId> physicalPartitionIds;

    /**
     * Creates an instance of RetrieveThroughputPropertiesResource class.
     */
    public RetrieveThroughputPropertiesResource() {
    }

    /**
     * Get the physicalPartitionIds property: Array of PhysicalPartitionId objects.
     * 
     * @return the physicalPartitionIds value.
     */
    public List<PhysicalPartitionId> physicalPartitionIds() {
        return this.physicalPartitionIds;
    }

    /**
     * Set the physicalPartitionIds property: Array of PhysicalPartitionId objects.
     * 
     * @param physicalPartitionIds the physicalPartitionIds value to set.
     * @return the RetrieveThroughputPropertiesResource object itself.
     */
    public RetrieveThroughputPropertiesResource
        withPhysicalPartitionIds(List<PhysicalPartitionId> physicalPartitionIds) {
        this.physicalPartitionIds = physicalPartitionIds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (physicalPartitionIds() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property physicalPartitionIds in model RetrieveThroughputPropertiesResource"));
        } else {
            physicalPartitionIds().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RetrieveThroughputPropertiesResource.class);
}
