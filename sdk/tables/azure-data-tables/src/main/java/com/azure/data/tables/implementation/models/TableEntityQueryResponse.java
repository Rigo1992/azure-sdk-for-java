// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The properties for the table entity query response.
 */
@Fluent
public final class TableEntityQueryResponse implements JsonSerializable<TableEntityQueryResponse> {
    /*
     * The metadata response of the table.
     */
    private String odataMetadata;

    /*
     * List of table entities.
     */
    private List<Map<String, Object>> value;

    /**
     * Creates an instance of TableEntityQueryResponse class.
     */
    public TableEntityQueryResponse() {
    }

    /**
     * Get the odataMetadata property: The metadata response of the table.
     * 
     * @return the odataMetadata value.
     */
    public String getOdataMetadata() {
        return this.odataMetadata;
    }

    /**
     * Set the odataMetadata property: The metadata response of the table.
     * 
     * @param odataMetadata the odataMetadata value to set.
     * @return the TableEntityQueryResponse object itself.
     */
    public TableEntityQueryResponse setOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
        return this;
    }

    /**
     * Get the value property: List of table entities.
     * 
     * @return the value value.
     */
    public List<Map<String, Object>> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of table entities.
     * 
     * @param value the value value to set.
     * @return the TableEntityQueryResponse object itself.
     */
    public TableEntityQueryResponse setValue(List<Map<String, Object>> value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("odata.metadata", this.odataMetadata);
        jsonWriter.writeArrayField("value", this.value,
            (writer, element) -> writer.writeMap(element, (writer1, element1) -> writer1.writeUntyped(element1)));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TableEntityQueryResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TableEntityQueryResponse if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TableEntityQueryResponse.
     */
    public static TableEntityQueryResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TableEntityQueryResponse deserializedTableEntityQueryResponse = new TableEntityQueryResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("odata.metadata".equals(fieldName)) {
                    deserializedTableEntityQueryResponse.odataMetadata = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<Map<String, Object>> value
                        = reader.readArray(reader1 -> reader1.readMap(reader2 -> reader2.readUntyped()));
                    deserializedTableEntityQueryResponse.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTableEntityQueryResponse;
        });
    }
}
