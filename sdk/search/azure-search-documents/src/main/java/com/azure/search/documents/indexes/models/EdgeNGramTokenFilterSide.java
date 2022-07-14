// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

/** Defines values for EdgeNGramTokenFilterSide. */
public enum EdgeNGramTokenFilterSide {
    /** Enum value front. */
    FRONT("front"),

    /** Enum value back. */
    BACK("back");

    /** The actual serialized value for a EdgeNGramTokenFilterSide instance. */
    private final String value;

    EdgeNGramTokenFilterSide(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EdgeNGramTokenFilterSide instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EdgeNGramTokenFilterSide object, or null if unable to parse.
     */
    public static EdgeNGramTokenFilterSide fromString(String value) {
        if (value == null) {
            return null;
        }
        EdgeNGramTokenFilterSide[] items = EdgeNGramTokenFilterSide.values();
        for (EdgeNGramTokenFilterSide item : items) {
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
