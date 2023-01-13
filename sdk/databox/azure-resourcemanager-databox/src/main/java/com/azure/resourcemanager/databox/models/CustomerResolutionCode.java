// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for CustomerResolutionCode. */
public enum CustomerResolutionCode {
    /** Enum value None. */
    NONE("None"),

    /** Enum value MoveToCleanUpDevice. */
    MOVE_TO_CLEAN_UP_DEVICE("MoveToCleanUpDevice"),

    /** Enum value Resume. */
    RESUME("Resume");

    /** The actual serialized value for a CustomerResolutionCode instance. */
    private final String value;

    CustomerResolutionCode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CustomerResolutionCode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CustomerResolutionCode object, or null if unable to parse.
     */
    @JsonCreator
    public static CustomerResolutionCode fromString(String value) {
        if (value == null) {
            return null;
        }
        CustomerResolutionCode[] items = CustomerResolutionCode.values();
        for (CustomerResolutionCode item : items) {
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
