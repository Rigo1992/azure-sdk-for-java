// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Response containing the status of operations for all documents in the indexing request. */
@Immutable
public final class IndexDocumentsResult implements JsonSerializable<IndexDocumentsResult> {
    /*
     * The list of status information for each document in the indexing request.
     */
    private final List<IndexingResult> results;

    /**
     * Creates an instance of IndexDocumentsResult class.
     *
     * @param results the results value to set.
     */
    public IndexDocumentsResult(List<IndexingResult> results) {
        this.results = results;
    }

    /**
     * Get the results property: The list of status information for each document in the indexing request.
     *
     * @return the results value.
     */
    public List<IndexingResult> getResults() {
        return this.results;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.results, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IndexDocumentsResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of IndexDocumentsResult if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IndexDocumentsResult.
     */
    public static IndexDocumentsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean resultsFound = false;
                    List<IndexingResult> results = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("value".equals(fieldName)) {
                            results = reader.readArray(reader1 -> IndexingResult.fromJson(reader1));
                            resultsFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (resultsFound) {
                        IndexDocumentsResult deserializedIndexDocumentsResult = new IndexDocumentsResult(results);

                        return deserializedIndexDocumentsResult;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!resultsFound) {
                        missingProperties.add("value");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
