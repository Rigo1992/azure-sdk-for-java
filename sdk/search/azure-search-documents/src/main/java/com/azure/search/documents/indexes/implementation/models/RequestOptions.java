// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.UUID;

/** Parameter group. */
@Fluent
public final class RequestOptions implements JsonSerializable<RequestOptions> {
    /*
     * The tracking ID sent with the request to help with debugging.
     */
    private UUID xMsClientRequestId;

    /**
     * Get the xMsClientRequestId property: The tracking ID sent with the request to help with debugging.
     *
     * @return the xMsClientRequestId value.
     */
    public UUID getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The tracking ID sent with the request to help with debugging.
     *
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the RequestOptions object itself.
     */
    public RequestOptions setXMsClientRequestId(UUID xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField(
                "x-ms-client-request-id",
                this.xMsClientRequestId == null ? null : this.xMsClientRequestId.toString(),
                false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of RequestOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RequestOptions if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     */
    public static RequestOptions fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    UUID xMsClientRequestId = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("x-ms-client-request-id".equals(fieldName)) {
                            xMsClientRequestId =
                                    JsonUtils.getNullableProperty(
                                            reader, r -> UUID.fromString(reader.getStringValue()));
                        } else {
                            reader.skipChildren();
                        }
                    }
                    RequestOptions deserializedValue = new RequestOptions();
                    deserializedValue.xMsClientRequestId = xMsClientRequestId;

                    return deserializedValue;
                });
    }
}
