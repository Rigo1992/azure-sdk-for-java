// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation supported by the Service Fabric resource provider.
 */
@Fluent
public final class AvailableOperationDisplay {
    /*
     * The name of the provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * The resource on which the operation is performed
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * The operation that can be performed.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Operation description
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of AvailableOperationDisplay class.
     */
    public AvailableOperationDisplay() {
    }

    /**
     * Get the provider property: The name of the provider.
     * 
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The name of the provider.
     * 
     * @param provider the provider value to set.
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: The resource on which the operation is performed.
     * 
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource on which the operation is performed.
     * 
     * @param resource the resource value to set.
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: The operation that can be performed.
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The operation that can be performed.
     * 
     * @param operation the operation value to set.
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: Operation description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Operation description.
     * 
     * @param description the description value to set.
     * @return the AvailableOperationDisplay object itself.
     */
    public AvailableOperationDisplay withDescription(String description) {
        this.description = description;
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
