// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/** Defines a specific configuration to be used in the context of semantic capabilities. */
@Fluent
public final class SemanticConfiguration implements JsonSerializable<SemanticConfiguration> {
    /*
     * The name of the semantic configuration.
     */
    private final String name;

    /*
     * Describes the title, content, and keyword fields to be used for semantic ranking, captions, highlights, and
     * answers. At least one of the three sub properties (titleField, prioritizedKeywordsFields and
     * prioritizedContentFields) need to be set.
     */
    private final PrioritizedFields prioritizedFields;

    /**
     * Creates an instance of SemanticConfiguration class.
     *
     * @param name the name value to set.
     * @param prioritizedFields the prioritizedFields value to set.
     */
    public SemanticConfiguration(String name, PrioritizedFields prioritizedFields) {
        this.name = name;
        this.prioritizedFields = prioritizedFields;
    }

    /**
     * Get the name property: The name of the semantic configuration.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the prioritizedFields property: Describes the title, content, and keyword fields to be used for semantic
     * ranking, captions, highlights, and answers. At least one of the three sub properties (titleField,
     * prioritizedKeywordsFields and prioritizedContentFields) need to be set.
     *
     * @return the prioritizedFields value.
     */
    public PrioritizedFields getPrioritizedFields() {
        return this.prioritizedFields;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name, false);
        jsonWriter.writeJsonField("prioritizedFields", this.prioritizedFields, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of SemanticConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SemanticConfiguration if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static SemanticConfiguration fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    boolean prioritizedFieldsFound = false;
                    PrioritizedFields prioritizedFields = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                            nameFound = true;
                        } else if ("prioritizedFields".equals(fieldName)) {
                            prioritizedFields = PrioritizedFields.fromJson(reader);
                            prioritizedFieldsFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!prioritizedFieldsFound) {
                        missingProperties.add("prioritizedFields");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    SemanticConfiguration deserializedValue = new SemanticConfiguration(name, prioritizedFields);

                    return deserializedValue;
                });
    }
}
