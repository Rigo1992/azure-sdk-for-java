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

/**
 * How the Batch service should respond if a Task exits with a particular exit
 * code.
 */
@Immutable
public final class ExitCodeMapping implements JsonSerializable<ExitCodeMapping> {

    /*
     * A process exit code.
     */
    @Generated
    private final int code;

    /*
     * How the Batch service should respond if the Task exits with this exit code.
     */
    @Generated
    private final ExitOptions exitOptions;

    /**
     * Creates an instance of ExitCodeMapping class.
     *
     * @param code the code value to set.
     * @param exitOptions the exitOptions value to set.
     */
    @Generated
    public ExitCodeMapping(int code, ExitOptions exitOptions) {
        this.code = code;
        this.exitOptions = exitOptions;
    }

    /**
     * Get the code property: A process exit code.
     *
     * @return the code value.
     */
    @Generated
    public int getCode() {
        return this.code;
    }

    /**
     * Get the exitOptions property: How the Batch service should respond if the Task exits with this exit code.
     *
     * @return the exitOptions value.
     */
    @Generated
    public ExitOptions getExitOptions() {
        return this.exitOptions;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("code", this.code);
        jsonWriter.writeJsonField("exitOptions", this.exitOptions);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExitCodeMapping from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExitCodeMapping if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExitCodeMapping.
     */
    @Generated
    public static ExitCodeMapping fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int code = 0;
            ExitOptions exitOptions = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("code".equals(fieldName)) {
                    code = reader.getInt();
                } else if ("exitOptions".equals(fieldName)) {
                    exitOptions = ExitOptions.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new ExitCodeMapping(code, exitOptions);
        });
    }
}
