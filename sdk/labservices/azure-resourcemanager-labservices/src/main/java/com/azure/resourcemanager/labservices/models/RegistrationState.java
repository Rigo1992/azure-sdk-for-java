// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for RegistrationState. */
public enum RegistrationState {
    /** Enum value Registered. */
    REGISTERED("Registered"),

    /** Enum value NotRegistered. */
    NOT_REGISTERED("NotRegistered");

    /** The actual serialized value for a RegistrationState instance. */
    private final String value;

    RegistrationState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RegistrationState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RegistrationState object, or null if unable to parse.
     */
    @JsonCreator
    public static RegistrationState fromString(String value) {
        RegistrationState[] items = RegistrationState.values();
        for (RegistrationState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
