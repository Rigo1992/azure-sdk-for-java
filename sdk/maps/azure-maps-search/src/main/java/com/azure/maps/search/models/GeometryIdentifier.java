// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the geometric shape of the result. Only present if type == Geography. */
@Fluent
public final class GeometryIdentifier {
    /*
     * Pass this as geometryId to the [Get Search
     * Polygon](https://docs.microsoft.com/rest/api/maps/search/getsearchpolygon) API to fetch geometry information for
     * this result.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /** Creates an instance of GeometryIdentifier class. */
    public GeometryIdentifier() {}

    /**
     * Get the id property: Pass this as geometryId to the [Get Search
     * Polygon](https://docs.microsoft.com/rest/api/maps/search/getsearchpolygon) API to fetch geometry information for
     * this result.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Pass this as geometryId to the [Get Search Polygon]
     * (https://docs.microsoft.com/rest/api/maps/search/getsearchpolygon) API to fetch geometry information for this
     * result.
     *
     * @param id The geometryId
     * @return the updated GeometryIdentifier object
     */
    public GeometryIdentifier setId(String id) {
        this.id = id;
        return this;
    }
}
