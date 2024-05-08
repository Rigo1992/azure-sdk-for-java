// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The results of the vector query will filter based on the '@search.score' value. Note this is the @search.score
 * returned as part of the search response. The threshold direction will be chosen for higher @search.score.
 */
@Immutable
public final class SearchScoreThreshold extends VectorThreshold {

    /*
     * The threshold will filter based on the '@search.score' value. Note this is the @search.score returned as part of
     * the search response. The threshold direction will be chosen for higher @search.score.
     */
    private final double value;

    /**
     * Creates an instance of SearchScoreThreshold class.
     *
     * @param value the value value to set.
     */
    public SearchScoreThreshold(double value) {
        this.value = value;
    }

    /**
     * /**
     * Get the value property: The threshold will filter based on the '@search.score' value. Note this is the
     *
     * `@search.score` returned as part of the search response. The threshold direction will be chosen for higher
     * `@search.score`.
     *
     * @return the value.
     * /
     */
    public double getValue() {
        return this.value;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind",
            VectorThresholdKind.SEARCH_SCORE == null ? null : VectorThresholdKind.SEARCH_SCORE.toString());
        jsonWriter.writeDoubleField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchScoreThreshold from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchScoreThreshold if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the SearchScoreThreshold.
     */
    public static SearchScoreThreshold fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean valueFound = false;
            double value = 0.0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    String kind = reader.getString();
                    if (!"searchScore".equals(kind)) {
                        throw new IllegalStateException(
                            "'kind' was expected to be non-null and equal to 'searchScore'. The found 'kind' was '"
                                + kind + "'.");
                    }
                } else if ("value".equals(fieldName)) {
                    value = reader.getDouble();
                    valueFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (valueFound) {
                return new SearchScoreThreshold(value);
            }
            throw new IllegalStateException("Missing required property: value");
        });
    }
}
