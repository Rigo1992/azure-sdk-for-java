// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** State of the last run. */
public enum RunState {
    /** Enum value Running. */
    RUNNING("Running"),

    /** Enum value Canceling. */
    CANCELING("Canceling"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value PartiallySucceeded. */
    PARTIALLY_SUCCEEDED("PartiallySucceeded"),

    /** Enum value Failed. */
    FAILED("Failed"),

    /** Enum value Canceled. */
    CANCELED("Canceled");

    /** The actual serialized value for a RunState instance. */
    private final String value;

    RunState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RunState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RunState object, or null if unable to parse.
     */
    @JsonCreator
    public static RunState fromString(String value) {
        if (value == null) {
            return null;
        }
        RunState[] items = RunState.values();
        for (RunState item : items) {
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
