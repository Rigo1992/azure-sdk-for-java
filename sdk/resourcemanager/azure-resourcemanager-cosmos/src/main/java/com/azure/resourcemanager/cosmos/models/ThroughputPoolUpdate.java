// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.fluent.models.ThroughputPoolProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a throughput pool resource for updates.
 */
@Fluent
public final class ThroughputPoolUpdate {
    /*
     * Properties of the throughput pool.
     */
    @JsonProperty(value = "properties")
    private ThroughputPoolProperties innerProperties;

    /**
     * Creates an instance of ThroughputPoolUpdate class.
     */
    public ThroughputPoolUpdate() {
    }

    /**
     * Get the innerProperties property: Properties of the throughput pool.
     * 
     * @return the innerProperties value.
     */
    private ThroughputPoolProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: A provisioning state of the ThroughputPool.
     * 
     * @return the provisioningState value.
     */
    public Status provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: A provisioning state of the ThroughputPool.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ThroughputPoolUpdate object itself.
     */
    public ThroughputPoolUpdate withProvisioningState(Status provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ThroughputPoolProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the maxThroughput property: Value for throughput to be shared among CosmosDB resources in the pool.
     * 
     * @return the maxThroughput value.
     */
    public Integer maxThroughput() {
        return this.innerProperties() == null ? null : this.innerProperties().maxThroughput();
    }

    /**
     * Set the maxThroughput property: Value for throughput to be shared among CosmosDB resources in the pool.
     * 
     * @param maxThroughput the maxThroughput value to set.
     * @return the ThroughputPoolUpdate object itself.
     */
    public ThroughputPoolUpdate withMaxThroughput(Integer maxThroughput) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ThroughputPoolProperties();
        }
        this.innerProperties().withMaxThroughput(maxThroughput);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
