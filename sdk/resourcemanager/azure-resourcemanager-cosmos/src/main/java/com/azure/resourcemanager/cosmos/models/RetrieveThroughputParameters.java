// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.fluent.models.RetrieveThroughputProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Cosmos DB retrieve throughput parameters object.
 */
@Fluent
public final class RetrieveThroughputParameters extends ArmResourceProperties {
    /*
     * Properties to retrieve throughput parameters object
     */
    @JsonProperty(value = "properties", required = true)
    private RetrieveThroughputProperties innerProperties = new RetrieveThroughputProperties();

    /**
     * Creates an instance of RetrieveThroughputParameters class.
     */
    public RetrieveThroughputParameters() {
    }

    /**
     * Get the innerProperties property: Properties to retrieve throughput parameters object.
     * 
     * @return the innerProperties value.
     */
    private RetrieveThroughputProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetrieveThroughputParameters withIdentity(ManagedServiceIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetrieveThroughputParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RetrieveThroughputParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The standard JSON format of a resource throughput.
     * 
     * @return the resource value.
     */
    public RetrieveThroughputPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The standard JSON format of a resource throughput.
     * 
     * @param resource the resource value to set.
     * @return the RetrieveThroughputParameters object itself.
     */
    public RetrieveThroughputParameters withResource(RetrieveThroughputPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RetrieveThroughputProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model RetrieveThroughputParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RetrieveThroughputParameters.class);
}
