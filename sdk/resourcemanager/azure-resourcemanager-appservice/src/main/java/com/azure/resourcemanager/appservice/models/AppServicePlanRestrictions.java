// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** App Service plans this offer is restricted to. */
public enum AppServicePlanRestrictions {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Free. */
    FREE("Free"),

    /** Enum value Shared. */
    SHARED("Shared"),

    /** Enum value Basic. */
    BASIC("Basic"),

    /** Enum value Standard. */
    STANDARD("Standard"),

    /** Enum value Premium. */
    PREMIUM("Premium");

    /** The actual serialized value for a AppServicePlanRestrictions instance. */
    private final String value;

    AppServicePlanRestrictions(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AppServicePlanRestrictions instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AppServicePlanRestrictions object, or null if unable to parse.
     */
    @JsonCreator
    public static AppServicePlanRestrictions fromString(String value) {
        if (value == null) {
            return null;
        }
        AppServicePlanRestrictions[] items = AppServicePlanRestrictions.values();
        for (AppServicePlanRestrictions item : items) {
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
