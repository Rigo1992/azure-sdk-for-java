// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The input definition information for a retrieval tool as used to configure an assistant.
 */
@Immutable
public final class RetrievalToolDefinition extends ToolDefinition {

    /**
     * Creates an instance of RetrievalToolDefinition class.
     */
    @Generated
    public RetrievalToolDefinition() {
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RetrievalToolDefinition from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RetrievalToolDefinition if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RetrievalToolDefinition.
     */
    @Generated
    public static RetrievalToolDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RetrievalToolDefinition deserializedRetrievalToolDefinition = new RetrievalToolDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedRetrievalToolDefinition.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRetrievalToolDefinition;
        });
    }

    /*
     * The object type.
     */
    @Generated
    private String type = "retrieval";

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }
}
