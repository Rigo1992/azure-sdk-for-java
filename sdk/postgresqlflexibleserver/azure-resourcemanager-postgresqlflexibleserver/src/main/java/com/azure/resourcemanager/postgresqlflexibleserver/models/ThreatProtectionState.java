// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the state of the Threat Protection, whether it is enabled or disabled or a state has not been applied yet
 * on the specific server.
 */
public enum ThreatProtectionState {
    /**
     * Enum value Enabled.
     */
    ENABLED("Enabled"),

    /**
     * Enum value Disabled.
     */
    DISABLED("Disabled");

    /**
     * The actual serialized value for a ThreatProtectionState instance.
     */
    private final String value;

    ThreatProtectionState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ThreatProtectionState instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ThreatProtectionState object, or null if unable to parse.
     */
    @JsonCreator
    public static ThreatProtectionState fromString(String value) {
        if (value == null) {
            return null;
        }
        ThreatProtectionState[] items = ThreatProtectionState.values();
        for (ThreatProtectionState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
