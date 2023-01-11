// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GeoJsonMultiLineStringData model. */
@Fluent
public class GeoJsonMultiLineStringData {
    /*
     * Coordinates for the `GeoJson MultiLineString` geometry.
     */
    @JsonProperty(value = "coordinates", required = true)
    private List<List<List<Double>>> coordinates;

    /** Creates an instance of GeoJsonMultiLineStringData class. */
    public GeoJsonMultiLineStringData() {}

    /**
     * Get the coordinates property: Coordinates for the `GeoJson MultiLineString` geometry.
     *
     * @return the coordinates value.
     */
    public List<List<List<Double>>> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Coordinates for the `GeoJson MultiLineString` geometry.
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonMultiLineStringData object itself.
     */
    public GeoJsonMultiLineStringData setCoordinates(List<List<List<Double>>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }
}
