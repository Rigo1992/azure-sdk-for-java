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

/** Output field mapping for a skill. */
@Fluent
public final class OutputFieldMappingEntry implements JsonSerializable<OutputFieldMappingEntry> {
    /*
     * The name of the output defined by the skill.
     */
    private final String name;

    /*
     * The target name of the output. It is optional and default to name.
     */
    private String targetName;

    /**
     * Creates an instance of OutputFieldMappingEntry class.
     *
     * @param name the name value to set.
     */
    public OutputFieldMappingEntry(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the output defined by the skill.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the targetName property: The target name of the output. It is optional and default to name.
     *
     * @return the targetName value.
     */
    public String getTargetName() {
        return this.targetName;
    }

    /**
     * Set the targetName property: The target name of the output. It is optional and default to name.
     *
     * @param targetName the targetName value to set.
     * @return the OutputFieldMappingEntry object itself.
     */
    public OutputFieldMappingEntry setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name, false);
        jsonWriter.writeStringField("targetName", this.targetName, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of OutputFieldMappingEntry from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutputFieldMappingEntry if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static OutputFieldMappingEntry fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    String targetName = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                            nameFound = true;
                        } else if ("targetName".equals(fieldName)) {
                            targetName = reader.getStringValue();
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    OutputFieldMappingEntry deserializedValue = new OutputFieldMappingEntry(name);
                    deserializedValue.targetName = targetName;

                    return deserializedValue;
                });
    }
}
