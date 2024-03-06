// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides parameter values to a distance scoring function.
 */
@Immutable
public final class DistanceScoringParameters implements JsonSerializable<DistanceScoringParameters> {
    /*
     * The name of the parameter passed in search queries to specify the reference location.
     */
    private final String referencePointParameter;

    /*
     * The distance in kilometers from the reference location where the boosting range ends.
     */
    private final double boostingDistance;

    /**
     * Creates an instance of DistanceScoringParameters class.
     * 
     * @param referencePointParameter the referencePointParameter value to set.
     * @param boostingDistance the boostingDistance value to set.
     */
    public DistanceScoringParameters(String referencePointParameter, double boostingDistance) {
        this.referencePointParameter = referencePointParameter;
        this.boostingDistance = boostingDistance;
    }

    /**
     * Get the referencePointParameter property: The name of the parameter passed in search queries to specify the
     * reference location.
     * 
     * @return the referencePointParameter value.
     */
    public String getReferencePointParameter() {
        return this.referencePointParameter;
    }

    /**
     * Get the boostingDistance property: The distance in kilometers from the reference location where the boosting
     * range ends.
     * 
     * @return the boostingDistance value.
     */
    public double getBoostingDistance() {
        return this.boostingDistance;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("referencePointParameter", this.referencePointParameter);
        jsonWriter.writeDoubleField("boostingDistance", this.boostingDistance);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DistanceScoringParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DistanceScoringParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DistanceScoringParameters.
     */
    public static DistanceScoringParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean referencePointParameterFound = false;
            String referencePointParameter = null;
            boolean boostingDistanceFound = false;
            double boostingDistance = 0.0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("referencePointParameter".equals(fieldName)) {
                    referencePointParameter = reader.getString();
                    referencePointParameterFound = true;
                } else if ("boostingDistance".equals(fieldName)) {
                    boostingDistance = reader.getDouble();
                    boostingDistanceFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (referencePointParameterFound && boostingDistanceFound) {
                return new DistanceScoringParameters(referencePointParameter, boostingDistance);
            }
            List<String> missingProperties = new ArrayList<>();
            if (!referencePointParameterFound) {
                missingProperties.add("referencePointParameter");
            }
            if (!boostingDistanceFound) {
                missingProperties.add("boostingDistance");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
