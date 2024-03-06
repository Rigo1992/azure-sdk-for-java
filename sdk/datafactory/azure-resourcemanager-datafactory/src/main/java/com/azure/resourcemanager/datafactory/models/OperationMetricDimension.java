// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the metric dimension.
 */
@Fluent
public final class OperationMetricDimension {
    /*
     * The name of the dimension for the metric.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The display name of the metric dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Whether the dimension should be exported to Azure Monitor.
     */
    @JsonProperty(value = "toBeExportedForShoebox")
    private Boolean toBeExportedForShoebox;

    /**
     * Creates an instance of OperationMetricDimension class.
     */
    public OperationMetricDimension() {
    }

    /**
     * Get the name property: The name of the dimension for the metric.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the dimension for the metric.
     * 
     * @param name the name value to set.
     * @return the OperationMetricDimension object itself.
     */
    public OperationMetricDimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The display name of the metric dimension.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the metric dimension.
     * 
     * @param displayName the displayName value to set.
     * @return the OperationMetricDimension object itself.
     */
    public OperationMetricDimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the toBeExportedForShoebox property: Whether the dimension should be exported to Azure Monitor.
     * 
     * @return the toBeExportedForShoebox value.
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set the toBeExportedForShoebox property: Whether the dimension should be exported to Azure Monitor.
     * 
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set.
     * @return the OperationMetricDimension object itself.
     */
    public OperationMetricDimension withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
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
