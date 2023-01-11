// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Automatic tuning desired state. */
public enum AutomaticTuningMode {
    /** Enum value Inherit. */
    INHERIT("Inherit"),

    /** Enum value Custom. */
    CUSTOM("Custom"),

    /** Enum value Auto. */
    AUTO("Auto"),

    /** Enum value Unspecified. */
    UNSPECIFIED("Unspecified");

    /** The actual serialized value for a AutomaticTuningMode instance. */
    private final String value;

    AutomaticTuningMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutomaticTuningMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AutomaticTuningMode object, or null if unable to parse.
     */
    @JsonCreator
    public static AutomaticTuningMode fromString(String value) {
        if (value == null) {
            return null;
        }
        AutomaticTuningMode[] items = AutomaticTuningMode.values();
        for (AutomaticTuningMode item : items) {
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
