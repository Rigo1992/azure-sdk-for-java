// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The type of the alias. */
public enum AliasType {
    /** Enum value NotSpecified. */
    NOT_SPECIFIED("NotSpecified"),

    /** Enum value PlainText. */
    PLAIN_TEXT("PlainText"),

    /** Enum value Mask. */
    MASK("Mask");

    /** The actual serialized value for a AliasType instance. */
    private final String value;

    AliasType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AliasType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AliasType object, or null if unable to parse.
     */
    @JsonCreator
    public static AliasType fromString(String value) {
        if (value == null) {
            return null;
        }
        AliasType[] items = AliasType.values();
        for (AliasType item : items) {
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
