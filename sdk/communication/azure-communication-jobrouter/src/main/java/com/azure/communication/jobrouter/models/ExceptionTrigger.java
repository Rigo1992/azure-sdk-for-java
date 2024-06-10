// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Abstract base class for defining a trigger for exception rules.
 */
@Immutable
public class ExceptionTrigger implements JsonSerializable<ExceptionTrigger> {

    /*
     * The type discriminator describing a sub-type of ExceptionTrigger.
     */
    @Generated
    private ExceptionTriggerKind kind = ExceptionTriggerKind.fromString("ExceptionTrigger");

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setExceptionTriggerAccessor(new JsonMergePatchHelper.ExceptionTriggerAccessor() {

            @Override
            public ExceptionTrigger prepareModelForJsonMergePatch(ExceptionTrigger model,
                boolean jsonMergePatchEnabled) {
                model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                return model;
            }

            @Override
            public boolean isJsonMergePatch(ExceptionTrigger model) {
                return model.jsonMergePatch;
            }
        });
    }

    /**
     * Creates an instance of ExceptionTrigger class.
     */
    @Generated
    public ExceptionTrigger() {
    }

    /**
     * Get the kind property: The type discriminator describing a sub-type of ExceptionTrigger.
     *
     * @return the kind value.
     */
    @Generated
    public ExceptionTriggerKind getKind() {
        return this.kind;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExceptionTrigger from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExceptionTrigger if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExceptionTrigger.
     */
    @Generated
    public static ExceptionTrigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                // Prepare for reading
                readerToUse.nextToken();
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("queueLength".equals(discriminatorValue)) {
                    return QueueLengthExceptionTrigger.fromJson(readerToUse.reset());
                } else if ("waitTime".equals(discriminatorValue)) {
                    return WaitTimeExceptionTrigger.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static ExceptionTrigger fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExceptionTrigger deserializedExceptionTrigger = new ExceptionTrigger();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedExceptionTrigger.kind = ExceptionTriggerKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedExceptionTrigger;
        });
    }
}
