// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/** The result of Autocomplete query. */
@Immutable
public final class AutocompleteResult implements JsonSerializable<AutocompleteResult> {
    /*
     * A value indicating the percentage of the index that was considered by the autocomplete request, or null if
     * minimumCoverage was not specified in the request.
     */
    private Double coverage;

    /*
     * The list of returned Autocompleted items.
     */
    private final List<AutocompleteItem> results;

    /**
     * Creates an instance of AutocompleteResult class.
     *
     * @param results the results value to set.
     */
    public AutocompleteResult(List<AutocompleteItem> results) {
        this.results = results;
    }

    /**
     * Get the coverage property: A value indicating the percentage of the index that was considered by the autocomplete
     * request, or null if minimumCoverage was not specified in the request.
     *
     * @return the coverage value.
     */
    public Double getCoverage() {
        return this.coverage;
    }

    /**
     * Get the results property: The list of returned Autocompleted items.
     *
     * @return the results value.
     */
    public List<AutocompleteItem> getResults() {
        return this.results;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.results, false, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeDoubleField("@search.coverage", this.coverage, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of AutocompleteResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutocompleteResult if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static AutocompleteResult fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    boolean resultsFound = false;
                    List<AutocompleteItem> results = null;
                    Double coverage = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("value".equals(fieldName)) {
                            results = reader.readArray(reader1 -> AutocompleteItem.fromJson(reader1));
                            resultsFound = true;
                        } else if ("@search.coverage".equals(fieldName)) {
                            coverage = reader.getDoubleNullableValue();
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!resultsFound) {
                        missingProperties.add("value");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    AutocompleteResult deserializedValue = new AutocompleteResult(results);
                    deserializedValue.coverage = coverage;

                    return deserializedValue;
                });
    }
}
