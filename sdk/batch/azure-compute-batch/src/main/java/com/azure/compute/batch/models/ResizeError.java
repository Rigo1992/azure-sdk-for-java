// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An error that occurred when resizing a Pool.
 */
@Immutable
public final class ResizeError implements JsonSerializable<ResizeError> {

    /*
     * An identifier for the Pool resize error. Codes are invariant and are intended to be consumed programmatically.
     */
    @Generated
    private String code;

    /*
     * A message describing the Pool resize error, intended to be suitable for display in a user interface.
     */
    @Generated
    private String message;

    /*
     * A list of additional error details related to the Pool resize error.
     */
    @Generated
    private List<NameValuePair> values;

    /**
     * Creates an instance of ResizeError class.
     */
    @Generated
    private ResizeError() {
    }

    /**
     * Get the code property: An identifier for the Pool resize error. Codes are invariant and are intended to be
     * consumed programmatically.
     *
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A message describing the Pool resize error, intended to be suitable for display in a
     * user interface.
     *
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the values property: A list of additional error details related to the Pool resize error.
     *
     * @return the values value.
     */
    @Generated
    public List<NameValuePair> getValues() {
        return this.values;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResizeError from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResizeError if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResizeError.
     */
    @Generated
    public static ResizeError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResizeError deserializedResizeError = new ResizeError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("code".equals(fieldName)) {
                    deserializedResizeError.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedResizeError.message = reader.getString();
                } else if ("values".equals(fieldName)) {
                    List<NameValuePair> values = reader.readArray(reader1 -> NameValuePair.fromJson(reader1));
                    deserializedResizeError.values = values;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedResizeError;
        });
    }
}
