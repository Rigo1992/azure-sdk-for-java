// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An environment variable to be set on a Task process. */
@Fluent
public final class EnvironmentSetting {
    /*
     * The name of the environment variable.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The value of the environment variable.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of EnvironmentSetting class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public EnvironmentSetting(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the environment variable.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the value property: The value of the environment variable.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value of the environment variable.
     *
     * @param value the value value to set.
     * @return the EnvironmentSetting object itself.
     */
    public EnvironmentSetting setValue(String value) {
        this.value = value;
        return this;
    }
}
