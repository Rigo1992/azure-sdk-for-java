// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

/**
 * Defines a data deletion detection policy that implements a soft-deletion strategy. It determines whether an item
 * should be deleted based on the value of a designated 'soft delete' column.
 */
@Fluent
public final class SoftDeleteColumnDeletionDetectionPolicy extends DataDeletionDetectionPolicy {
    /*
     * Identifies the concrete type of the data deletion detection policy.
     */
    private String odataType = "#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy";

    /*
     * The name of the column to use for soft-deletion detection.
     */
    private String softDeleteColumnName;

    /*
     * The marker value that identifies an item as deleted.
     */
    private String softDeleteMarkerValue;

    /**
     * Get the softDeleteColumnName property: The name of the column to use for soft-deletion detection.
     *
     * @return the softDeleteColumnName value.
     */
    public String getSoftDeleteColumnName() {
        return this.softDeleteColumnName;
    }

    /**
     * Set the softDeleteColumnName property: The name of the column to use for soft-deletion detection.
     *
     * @param softDeleteColumnName the softDeleteColumnName value to set.
     * @return the SoftDeleteColumnDeletionDetectionPolicy object itself.
     */
    public SoftDeleteColumnDeletionDetectionPolicy setSoftDeleteColumnName(String softDeleteColumnName) {
        this.softDeleteColumnName = softDeleteColumnName;
        return this;
    }

    /**
     * Get the softDeleteMarkerValue property: The marker value that identifies an item as deleted.
     *
     * @return the softDeleteMarkerValue value.
     */
    public String getSoftDeleteMarkerValue() {
        return this.softDeleteMarkerValue;
    }

    /**
     * Set the softDeleteMarkerValue property: The marker value that identifies an item as deleted.
     *
     * @param softDeleteMarkerValue the softDeleteMarkerValue value to set.
     * @return the SoftDeleteColumnDeletionDetectionPolicy object itself.
     */
    public SoftDeleteColumnDeletionDetectionPolicy setSoftDeleteMarkerValue(String softDeleteMarkerValue) {
        this.softDeleteMarkerValue = softDeleteMarkerValue;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", odataType);
        jsonWriter.writeStringField("softDeleteColumnName", this.softDeleteColumnName, false);
        jsonWriter.writeStringField("softDeleteMarkerValue", this.softDeleteMarkerValue, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of SoftDeleteColumnDeletionDetectionPolicy from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SoftDeleteColumnDeletionDetectionPolicy if the JsonReader was pointing to an instance of
     *     it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     */
    public static SoftDeleteColumnDeletionDetectionPolicy fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    String odataType = "#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy";
                    String softDeleteColumnName = null;
                    String softDeleteMarkerValue = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            odataType = reader.getStringValue();
                        } else if ("softDeleteColumnName".equals(fieldName)) {
                            softDeleteColumnName = reader.getStringValue();
                        } else if ("softDeleteMarkerValue".equals(fieldName)) {
                            softDeleteMarkerValue = reader.getStringValue();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    if (!"#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy".equals(odataType)) {
                        throw new IllegalStateException(
                                "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy'. The found '@odata.type' was '"
                                        + odataType
                                        + "'.");
                    }

                    SoftDeleteColumnDeletionDetectionPolicy deserializedValue =
                            new SoftDeleteColumnDeletionDetectionPolicy();
                    deserializedValue.odataType = odataType;
                    deserializedValue.softDeleteColumnName = softDeleteColumnName;
                    deserializedValue.softDeleteMarkerValue = softDeleteMarkerValue;

                    return deserializedValue;
                });
    }
}
