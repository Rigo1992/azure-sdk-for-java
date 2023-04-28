// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The metric dimension name and value.
 */
@Fluent
public final class MetricSingleDimension {
    /*
     * Name of the dimension.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Value of the dimension.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Creates an instance of MetricSingleDimension class.
     */
    public MetricSingleDimension() {
    }

    /**
     * Get the name property: Name of the dimension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the dimension.
     *
     * @param name the name value to set.
     * @return the MetricSingleDimension object itself.
     */
    public MetricSingleDimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Value of the dimension.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the dimension.
     *
     * @param value the value value to set.
     * @return the MetricSingleDimension object itself.
     */
    public MetricSingleDimension withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("Missing required property name in model MetricSingleDimension"));
        }
        if (value() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("Missing required property value in model MetricSingleDimension"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricSingleDimension.class);
}
