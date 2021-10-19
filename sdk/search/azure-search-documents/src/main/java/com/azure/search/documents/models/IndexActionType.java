// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for IndexActionType. */
public enum IndexActionType {
    /** Enum value upload. */
    UPLOAD("upload"),

    /** Enum value merge. */
    MERGE("merge"),

    /** Enum value mergeOrUpload. */
    MERGE_OR_UPLOAD("mergeOrUpload"),

    /** Enum value delete. */
    DELETE("delete");

    /** The actual serialized value for a IndexActionType instance. */
    private final String value;

    IndexActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IndexActionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IndexActionType object, or null if unable to parse.
     */
    @JsonCreator
    public static IndexActionType fromString(String value) {
        IndexActionType[] items = IndexActionType.values();
        for (IndexActionType item : items) {
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
