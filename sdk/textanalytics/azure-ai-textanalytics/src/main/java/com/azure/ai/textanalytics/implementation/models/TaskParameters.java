// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Base parameters object for a text analysis task. */
@Fluent
public class TaskParameters implements JsonSerializable<TaskParameters> {
    /*
     * The loggingOptOut property.
     */
    private Boolean loggingOptOut;

    /** Creates an instance of TaskParameters class. */
    public TaskParameters() {}

    /**
     * Get the loggingOptOut property: The loggingOptOut property.
     *
     * @return the loggingOptOut value.
     */
    public Boolean isLoggingOptOut() {
        return this.loggingOptOut;
    }

    /**
     * Set the loggingOptOut property: The loggingOptOut property.
     *
     * @param loggingOptOut the loggingOptOut value to set.
     * @return the TaskParameters object itself.
     */
    public TaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        this.loggingOptOut = loggingOptOut;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("loggingOptOut", this.loggingOptOut);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TaskParameters from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TaskParameters if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the TaskParameters.
     */
    public static TaskParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    TaskParameters deserializedTaskParameters = new TaskParameters();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("loggingOptOut".equals(fieldName)) {
                            deserializedTaskParameters.loggingOptOut = reader.getNullable(JsonReader::getBoolean);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedTaskParameters;
                });
    }
}
