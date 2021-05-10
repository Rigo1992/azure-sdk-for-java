// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** User property. */
@Fluent
public final class UserProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserProperty.class);

    /*
     * User property name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * User property value. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /**
     * Get the name property: User property name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: User property name.
     *
     * @param name the name value to set.
     * @return the UserProperty object itself.
     */
    public UserProperty withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: User property value. Type: string (or Expression with resultType string).
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: User property value. Type: string (or Expression with resultType string).
     *
     * @param value the value value to set.
     * @return the UserProperty object itself.
     */
    public UserProperty withValue(Object value) {
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
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model UserProperty"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model UserProperty"));
        }
    }
}
