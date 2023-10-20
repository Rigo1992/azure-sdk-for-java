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

/** Definition of additional projections to azure blob, table, or files, of enriched data. */
@Immutable
public final class SearchIndexerKnowledgeStore implements JsonSerializable<SearchIndexerKnowledgeStore> {
    /*
     * The connection string to the storage account projections will be stored in.
     */
    private final String storageConnectionString;

    /*
     * A list of additional projections to perform during indexing.
     */
    private final List<SearchIndexerKnowledgeStoreProjection> projections;

    /**
     * Creates an instance of SearchIndexerKnowledgeStore class.
     *
     * @param storageConnectionString the storageConnectionString value to set.
     * @param projections the projections value to set.
     */
    public SearchIndexerKnowledgeStore(
            String storageConnectionString, List<SearchIndexerKnowledgeStoreProjection> projections) {
        this.storageConnectionString = storageConnectionString;
        this.projections = projections;
    }

    /**
     * Get the storageConnectionString property: The connection string to the storage account projections will be stored
     * in.
     *
     * @return the storageConnectionString value.
     */
    public String getStorageConnectionString() {
        return this.storageConnectionString;
    }

    /**
     * Get the projections property: A list of additional projections to perform during indexing.
     *
     * @return the projections value.
     */
    public List<SearchIndexerKnowledgeStoreProjection> getProjections() {
        return this.projections;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("storageConnectionString", this.storageConnectionString);
        jsonWriter.writeArrayField("projections", this.projections, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchIndexerKnowledgeStore from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerKnowledgeStore if the JsonReader was pointing to an instance of it, or null
     *     if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchIndexerKnowledgeStore.
     */
    public static SearchIndexerKnowledgeStore fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean storageConnectionStringFound = false;
                    String storageConnectionString = null;
                    boolean projectionsFound = false;
                    List<SearchIndexerKnowledgeStoreProjection> projections = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("storageConnectionString".equals(fieldName)) {
                            storageConnectionString = reader.getString();
                            storageConnectionStringFound = true;
                        } else if ("projections".equals(fieldName)) {
                            projections =
                                    reader.readArray(
                                            reader1 -> SearchIndexerKnowledgeStoreProjection.fromJson(reader1));
                            projectionsFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (storageConnectionStringFound && projectionsFound) {
                        SearchIndexerKnowledgeStore deserializedSearchIndexerKnowledgeStore =
                                new SearchIndexerKnowledgeStore(storageConnectionString, projections);

                        return deserializedSearchIndexerKnowledgeStore;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!storageConnectionStringFound) {
                        missingProperties.add("storageConnectionString");
                    }
                    if (!projectionsFound) {
                        missingProperties.add("projections");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
