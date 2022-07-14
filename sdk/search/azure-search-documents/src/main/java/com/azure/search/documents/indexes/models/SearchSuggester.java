// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/** Defines how the Suggest API should apply to a group of fields in the index. */
@Fluent
public final class SearchSuggester implements JsonSerializable<SearchSuggester> {
    /*
     * The name of the suggester.
     */
    private final String name;

    /*
     * A value indicating the capabilities of the suggester.
     */
    private String searchMode;

    /*
     * The list of field names to which the suggester applies. Each field must be searchable.
     */
    private final List<String> sourceFields;

    /**
     * Creates an instance of SearchSuggester class.
     *
     * @param name the name value to set.
     * @param sourceFields the sourceFields value to set.
     */
    public SearchSuggester(String name, List<String> sourceFields) {
        this.searchMode = "analyzingInfixMatching";
        this.name = name;
        this.sourceFields = sourceFields;
    }

    /**
     * Get the name property: The name of the suggester.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the searchMode property: A value indicating the capabilities of the suggester.
     *
     * @return the searchMode value.
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * Get the sourceFields property: The list of field names to which the suggester applies. Each field must be
     * searchable.
     *
     * @return the sourceFields value.
     */
    public List<String> getSourceFields() {
        return this.sourceFields;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name, false);
        jsonWriter.writeArrayField(
                "sourceFields", this.sourceFields, false, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("searchMode", this.searchMode, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of SearchSuggester from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchSuggester if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static SearchSuggester fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    boolean sourceFieldsFound = false;
                    List<String> sourceFields = null;
                    String searchMode = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                            nameFound = true;
                        } else if ("sourceFields".equals(fieldName)) {
                            sourceFields = reader.readArray(reader1 -> reader1.getStringValue());
                            sourceFieldsFound = true;
                        } else if ("searchMode".equals(fieldName)) {
                            searchMode = reader.getStringValue();
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!sourceFieldsFound) {
                        missingProperties.add("sourceFields");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    SearchSuggester deserializedValue = new SearchSuggester(name, sourceFields);
                    deserializedValue.searchMode = searchMode;

                    return deserializedValue;
                });
    }
}
