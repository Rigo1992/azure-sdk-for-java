// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

/** Base type for data change detection policies. */
@Immutable
public abstract class DataChangeDetectionPolicy implements JsonSerializable<DataChangeDetectionPolicy> {
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of DataChangeDetectionPolicy from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataChangeDetectionPolicy if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     */
    public static DataChangeDetectionPolicy fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    String discriminatorValue = null;
                    JsonReader readerToUse = null;

                    // Read the first field name and determine if it's the discriminator field.
                    reader.nextToken();
                    if ("@odata.type".equals(reader.getFieldName())) {
                        reader.nextToken();
                        discriminatorValue = reader.getStringValue();
                        readerToUse = reader;
                    } else {
                        // If it isn't the discriminator field buffer the JSON to make it replayable and find the
                        // discriminator field value.
                        JsonReader replayReader = reader.bufferObject();
                        replayReader.nextToken(); // Prepare for reading
                        while (replayReader.nextToken() != JsonToken.END_OBJECT) {
                            String fieldName = replayReader.getFieldName();
                            replayReader.nextToken();
                            if ("@odata.type".equals(fieldName)) {
                                discriminatorValue = replayReader.getStringValue();
                                break;
                            } else {
                                replayReader.skipChildren();
                            }
                        }

                        if (discriminatorValue != null) {
                            readerToUse = replayReader.reset();
                        }
                    }
                    // Use the discriminator value to determine which subtype should be deserialized.
                    if ("#Microsoft.Azure.Search.HighWaterMarkChangeDetectionPolicy".equals(discriminatorValue)) {
                        return HighWaterMarkChangeDetectionPolicy.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.SqlIntegratedChangeTrackingPolicy".equals(discriminatorValue)) {
                        return SqlIntegratedChangeTrackingPolicy.fromJson(readerToUse);
                    } else {
                        throw new IllegalStateException(
                                "Discriminator field '@odata.type' didn't match one of the expected values '#Microsoft.Azure.Search.HighWaterMarkChangeDetectionPolicy', or '#Microsoft.Azure.Search.SqlIntegratedChangeTrackingPolicy'. It was: '"
                                        + discriminatorValue
                                        + "'.");
                    }
                });
    }
}
