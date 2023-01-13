// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Create order limit validation status. */
public enum ValidationStatus {
    /** Enum value Valid. */
    VALID("Valid"),

    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value Skipped. */
    SKIPPED("Skipped");

    /** The actual serialized value for a ValidationStatus instance. */
    private final String value;

    ValidationStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ValidationStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ValidationStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static ValidationStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        ValidationStatus[] items = ValidationStatus.values();
        for (ValidationStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
