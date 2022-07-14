// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

/** Defines values for IndexerStatus. */
public enum IndexerStatus {
    /** Enum value unknown. */
    UNKNOWN("unknown"),

    /** Enum value error. */
    ERROR("error"),

    /** Enum value running. */
    RUNNING("running");

    /** The actual serialized value for a IndexerStatus instance. */
    private final String value;

    IndexerStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IndexerStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IndexerStatus object, or null if unable to parse.
     */
    public static IndexerStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        IndexerStatus[] items = IndexerStatus.values();
        for (IndexerStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
