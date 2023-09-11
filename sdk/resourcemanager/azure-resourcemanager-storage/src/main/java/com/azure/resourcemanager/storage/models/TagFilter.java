// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Blob index tag based filtering for blob objects. */
@Fluent
public final class TagFilter {
    /*
     * This is the filter tag name, it can have 1 - 128 characters
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * This is the comparison operator which is used for object comparison and filtering. Only == (equality operator)
     * is currently supported
     */
    @JsonProperty(value = "op", required = true)
    private String op;

    /*
     * This is the filter tag value field used for tag based filtering, it can have 0 - 256 characters
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /** Creates an instance of TagFilter class. */
    public TagFilter() {
    }

    /**
     * Get the name property: This is the filter tag name, it can have 1 - 128 characters.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: This is the filter tag name, it can have 1 - 128 characters.
     *
     * @param name the name value to set.
     * @return the TagFilter object itself.
     */
    public TagFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the op property: This is the comparison operator which is used for object comparison and filtering. Only ==
     * (equality operator) is currently supported.
     *
     * @return the op value.
     */
    public String op() {
        return this.op;
    }

    /**
     * Set the op property: This is the comparison operator which is used for object comparison and filtering. Only ==
     * (equality operator) is currently supported.
     *
     * @param op the op value to set.
     * @return the TagFilter object itself.
     */
    public TagFilter withOp(String op) {
        this.op = op;
        return this;
    }

    /**
     * Get the value property: This is the filter tag value field used for tag based filtering, it can have 0 - 256
     * characters.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: This is the filter tag value field used for tag based filtering, it can have 0 - 256
     * characters.
     *
     * @param value the value value to set.
     * @return the TagFilter object itself.
     */
    public TagFilter withValue(String value) {
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
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model TagFilter"));
        }
        if (op() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property op in model TagFilter"));
        }
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model TagFilter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TagFilter.class);
}
