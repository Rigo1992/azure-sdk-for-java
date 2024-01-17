// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for AdminKeyKind. */
public enum AdminKeyKind {
    /** Enum value primary. */
    PRIMARY("primary"),

    /** Enum value secondary. */
    SECONDARY("secondary");

    /** The actual serialized value for a AdminKeyKind instance. */
    private final String value;

    AdminKeyKind(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AdminKeyKind instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AdminKeyKind object, or null if unable to parse.
     */
    @JsonCreator
    public static AdminKeyKind fromString(String value) {
        if (value == null) {
            return null;
        }
        AdminKeyKind[] items = AdminKeyKind.values();
        for (AdminKeyKind item : items) {
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
