// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** A list of unstructured historical data for v1 compatibility. */
@Fluent
public final class History implements JsonSerializable<History> {
    /*
     * The raw v1 compatibility information
     */
    private String v1Compatibility;

    /** Creates an instance of History class. */
    public History() {}

    /**
     * Get the v1Compatibility property: The raw v1 compatibility information.
     *
     * @return the v1Compatibility value.
     */
    public String getV1Compatibility() {
        return this.v1Compatibility;
    }

    /**
     * Set the v1Compatibility property: The raw v1 compatibility information.
     *
     * @param v1Compatibility the v1Compatibility value to set.
     * @return the History object itself.
     */
    public History setV1Compatibility(String v1Compatibility) {
        this.v1Compatibility = v1Compatibility;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("v1Compatibility", this.v1Compatibility);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of History from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of History if the JsonReader was pointing to an instance of it, or null if it was pointing to
     *     JSON null.
     * @throws IOException If an error occurs while reading the History.
     */
    public static History fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    History deserializedHistory = new History();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("v1Compatibility".equals(fieldName)) {
                            deserializedHistory.v1Compatibility = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedHistory;
                });
    }
}
