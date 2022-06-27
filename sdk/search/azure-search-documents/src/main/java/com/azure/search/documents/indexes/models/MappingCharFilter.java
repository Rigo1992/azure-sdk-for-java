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
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * A character filter that applies mappings defined with the mappings option. Matching is greedy (longest pattern
 * matching at a given point wins). Replacement is allowed to be the empty string. This character filter is implemented
 * using Apache Lucene.
 */
@Fluent
public final class MappingCharFilter extends CharFilter {
    /*
     * Identifies the concrete type of the char filter.
     */
    private String odataType = "#Microsoft.Azure.Search.MappingCharFilter";

    /*
     * A list of mappings of the following format: "a=>b" (all occurrences of the character "a" will be replaced with
     * character "b").
     */
    private final List<String> mappings;

    /**
     * Creates an instance of MappingCharFilter class.
     *
     * @param name the name value to set.
     * @param mappings the mappings value to set.
     */
    public MappingCharFilter(String name, List<String> mappings) {
        super(name);
        this.mappings = mappings;
    }

    /**
     * Get the mappings property: A list of mappings of the following format: "a=&gt;b" (all occurrences of the
     * character "a" will be replaced with character "b").
     *
     * @return the mappings value.
     */
    public List<String> getMappings() {
        return this.mappings;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", odataType);
        jsonWriter.writeStringField("name", getName(), false);
        JsonUtils.writeArray(
                jsonWriter, "mappings", this.mappings, (writer, element) -> writer.writeString(element, false));
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of MappingCharFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MappingCharFilter if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     */
    public static MappingCharFilter fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    String odataType = "#Microsoft.Azure.Search.MappingCharFilter";
                    boolean nameFound = false;
                    String name = null;
                    boolean mappingsFound = false;
                    List<String> mappings = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            odataType = reader.getStringValue();
                        } else if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                            nameFound = true;
                        } else if ("mappings".equals(fieldName)) {
                            mappings = JsonUtils.readArray(reader, reader1 -> reader1.getStringValue());
                            mappingsFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }

                    if (!"#Microsoft.Azure.Search.MappingCharFilter".equals(odataType)) {
                        throw new IllegalStateException(
                                "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.MappingCharFilter'. The found '@odata.type' was '"
                                        + odataType
                                        + "'.");
                    }

                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!mappingsFound) {
                        missingProperties.add("mappings");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    MappingCharFilter deserializedValue = new MappingCharFilter(name, mappings);
                    deserializedValue.odataType = odataType;

                    return deserializedValue;
                });
    }
}
