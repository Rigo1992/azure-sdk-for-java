// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The network access type for operating on the resources in the Batch account. */
public enum PublicNetworkAccessType {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a PublicNetworkAccessType instance. */
    private final String value;

    PublicNetworkAccessType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PublicNetworkAccessType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PublicNetworkAccessType object, or null if unable to parse.
     */
    @JsonCreator
    public static PublicNetworkAccessType fromString(String value) {
        if (value == null) {
            return null;
        }
        PublicNetworkAccessType[] items = PublicNetworkAccessType.values();
        for (PublicNetworkAccessType item : items) {
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
