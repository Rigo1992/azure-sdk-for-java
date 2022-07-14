// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.indexes.models.SearchIndexer;
import java.util.ArrayList;
import java.util.List;

/** Response from a List Indexers request. If successful, it includes the full definitions of all indexers. */
@Immutable
public final class ListIndexersResult implements JsonSerializable<ListIndexersResult> {
    /*
     * The indexers in the Search service.
     */
    private final List<SearchIndexer> indexers;

    /**
     * Creates an instance of ListIndexersResult class.
     *
     * @param indexers the indexers value to set.
     */
    public ListIndexersResult(List<SearchIndexer> indexers) {
        this.indexers = indexers;
    }

    /**
     * Get the indexers property: The indexers in the Search service.
     *
     * @return the indexers value.
     */
    public List<SearchIndexer> getIndexers() {
        return this.indexers;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.indexers, false, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of ListIndexersResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListIndexersResult if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static ListIndexersResult fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    boolean indexersFound = false;
                    List<SearchIndexer> indexers = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("value".equals(fieldName)) {
                            indexers = reader.readArray(reader1 -> SearchIndexer.fromJson(reader1));
                            indexersFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!indexersFound) {
                        missingProperties.add("value");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    ListIndexersResult deserializedValue = new ListIndexersResult(indexers);

                    return deserializedValue;
                });
    }
}
