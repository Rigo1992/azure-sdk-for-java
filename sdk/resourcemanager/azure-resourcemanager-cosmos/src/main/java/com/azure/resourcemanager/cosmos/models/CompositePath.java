// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CompositePath model.
 */
@Fluent
public final class CompositePath {
    /*
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard (/path/*)
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * Sort order for composite paths.
     */
    @JsonProperty(value = "order")
    private CompositePathSortOrder order;

    /**
     * Creates an instance of CompositePath class.
     */
    public CompositePath() {
    }

    /**
     * Get the path property: The path for which the indexing behavior applies to. Index paths typically start with root
     * and end with wildcard (/path/*).
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path for which the indexing behavior applies to. Index paths typically start with root
     * and end with wildcard (/path/*).
     * 
     * @param path the path value to set.
     * @return the CompositePath object itself.
     */
    public CompositePath withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the order property: Sort order for composite paths.
     * 
     * @return the order value.
     */
    public CompositePathSortOrder order() {
        return this.order;
    }

    /**
     * Set the order property: Sort order for composite paths.
     * 
     * @param order the order value to set.
     * @return the CompositePath object itself.
     */
    public CompositePath withOrder(CompositePathSortOrder order) {
        this.order = order;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
