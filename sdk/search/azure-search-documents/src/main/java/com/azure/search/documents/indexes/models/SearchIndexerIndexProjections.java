// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Definition of additional projections to secondary search indexes.
 */
@Fluent
public final class SearchIndexerIndexProjections implements JsonSerializable<SearchIndexerIndexProjections> {
    /*
     * A list of projections to be performed to secondary search indexes.
     */
    private final List<SearchIndexerIndexProjectionSelector> selectors;

    /*
     * A dictionary of index projection-specific configuration properties. Each name is the name of a specific
     * property. Each value must be of a primitive type.
     */
    private SearchIndexerIndexProjectionsParameters parameters;

    /**
     * Creates an instance of SearchIndexerIndexProjections class.
     * 
     * @param selectors the selectors value to set.
     */
    public SearchIndexerIndexProjections(List<SearchIndexerIndexProjectionSelector> selectors) {
        this.selectors = selectors;
    }

    /**
     * Get the selectors property: A list of projections to be performed to secondary search indexes.
     * 
     * @return the selectors value.
     */
    public List<SearchIndexerIndexProjectionSelector> getSelectors() {
        return this.selectors;
    }

    /**
     * Get the parameters property: A dictionary of index projection-specific configuration properties. Each name is
     * the name of a specific property. Each value must be of a primitive type.
     * 
     * @return the parameters value.
     */
    public SearchIndexerIndexProjectionsParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: A dictionary of index projection-specific configuration properties. Each name is
     * the name of a specific property. Each value must be of a primitive type.
     * 
     * @param parameters the parameters value to set.
     * @return the SearchIndexerIndexProjections object itself.
     */
    public SearchIndexerIndexProjections setParameters(SearchIndexerIndexProjectionsParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("selectors", this.selectors, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchIndexerIndexProjections from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerIndexProjections if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchIndexerIndexProjections.
     */
    public static SearchIndexerIndexProjections fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean selectorsFound = false;
            List<SearchIndexerIndexProjectionSelector> selectors = null;
            SearchIndexerIndexProjectionsParameters parameters = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("selectors".equals(fieldName)) {
                    selectors = reader.readArray(reader1 -> SearchIndexerIndexProjectionSelector.fromJson(reader1));
                    selectorsFound = true;
                } else if ("parameters".equals(fieldName)) {
                    parameters = SearchIndexerIndexProjectionsParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (selectorsFound) {
                SearchIndexerIndexProjections deserializedSearchIndexerIndexProjections
                    = new SearchIndexerIndexProjections(selectors);
                deserializedSearchIndexerIndexProjections.parameters = parameters;

                return deserializedSearchIndexerIndexProjections;
            }
            throw new IllegalStateException("Missing required property: selectors");
        });
    }
}
