// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

/** Clears the identity property of a datasource. */
@Immutable
public final class SearchIndexerDataNoneIdentity extends SearchIndexerDataIdentity {
    /*
     * Identifies the concrete type of the identity.
     */
    private String odataType = "#Microsoft.Azure.Search.SearchIndexerDataNoneIdentity";

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", odataType);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of SearchIndexerDataNoneIdentity from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerDataNoneIdentity if the JsonReader was pointing to an instance of it, or null
     *     if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     */
    public static SearchIndexerDataNoneIdentity fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    String odataType = "#Microsoft.Azure.Search.SearchIndexerDataNoneIdentity";
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            odataType = reader.getStringValue();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    if (!"#Microsoft.Azure.Search.SearchIndexerDataNoneIdentity".equals(odataType)) {
                        throw new IllegalStateException(
                                "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.SearchIndexerDataNoneIdentity'. The found '@odata.type' was '"
                                        + odataType
                                        + "'.");
                    }

                    SearchIndexerDataNoneIdentity deserializedValue = new SearchIndexerDataNoneIdentity();
                    deserializedValue.odataType = odataType;

                    return deserializedValue;
                });
    }
}
