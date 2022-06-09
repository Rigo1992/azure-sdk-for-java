// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the parameter value of an specific pipeline topology parameter. See pipeline topology parameters for more
 * information.
 */
@Fluent
public final class ParameterDefinition {
    /*
     * Name of the parameter declared in the pipeline topology.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Parameter value to be applied on this specific pipeline.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: Name of the parameter declared in the pipeline topology.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the parameter declared in the pipeline topology.
     *
     * @param name the name value to set.
     * @return the ParameterDefinition object itself.
     */
    public ParameterDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Parameter value to be applied on this specific pipeline.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Parameter value to be applied on this specific pipeline.
     *
     * @param value the value value to set.
     * @return the ParameterDefinition object itself.
     */
    public ParameterDefinition withValue(String value) {
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
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ParameterDefinition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ParameterDefinition.class);
}
