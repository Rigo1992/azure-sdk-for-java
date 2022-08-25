// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SpatialSpec model. */
@Fluent
public final class SpatialSpec {
    /*
     * The path for which the indexing behavior applies to. Index paths typically start with root and end with wildcard
     * (/path/*)
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * List of path's spatial type
     */
    @JsonProperty(value = "types")
    private List<SpatialType> types;

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
     * @return the SpatialSpec object itself.
     */
    public SpatialSpec withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the types property: List of path's spatial type.
     *
     * @return the types value.
     */
    public List<SpatialType> types() {
        return this.types;
    }

    /**
     * Set the types property: List of path's spatial type.
     *
     * @param types the types value to set.
     * @return the SpatialSpec object itself.
     */
    public SpatialSpec withTypes(List<SpatialType> types) {
        this.types = types;
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
