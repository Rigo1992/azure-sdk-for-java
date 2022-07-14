// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/** Describes an error condition for the Azure Cognitive Search API. */
@Immutable
public final class SearchError implements JsonSerializable<SearchError> {
    /*
     * One of a server-defined set of error codes.
     */
    private String code;

    /*
     * A human-readable representation of the error.
     */
    private final String message;

    /*
     * An array of details about specific errors that led to this reported error.
     */
    private List<SearchError> details;

    /**
     * Creates an instance of SearchError class.
     *
     * @param message the message value to set.
     */
    public SearchError(String message) {
        this.message = message;
    }

    /**
     * Get the code property: One of a server-defined set of error codes.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable representation of the error.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the details property: An array of details about specific errors that led to this reported error.
     *
     * @return the details value.
     */
    public List<SearchError> getDetails() {
        return this.details;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("message", this.message, false);
        jsonWriter.writeStringField("code", this.code, false);
        jsonWriter.writeArrayField("details", this.details, false, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of SearchError from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchError if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     */
    public static SearchError fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    boolean messageFound = false;
                    String message = null;
                    String code = null;
                    List<SearchError> details = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("message".equals(fieldName)) {
                            message = reader.getStringValue();
                            messageFound = true;
                        } else if ("code".equals(fieldName)) {
                            code = reader.getStringValue();
                        } else if ("details".equals(fieldName)) {
                            details = reader.readArray(reader1 -> SearchError.fromJson(reader1));
                        } else {
                            reader.skipChildren();
                        }
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!messageFound) {
                        missingProperties.add("message");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    SearchError deserializedValue = new SearchError(message);
                    deserializedValue.code = code;
                    deserializedValue.details = details;

                    return deserializedValue;
                });
    }
}
