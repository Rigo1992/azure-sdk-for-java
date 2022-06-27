// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.DefaultJsonReader;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

/** Abstract base type for data identities. */
@Immutable
public abstract class SearchIndexerDataIdentity implements JsonSerializable<SearchIndexerDataIdentity> {
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of SearchIndexerDataIdentity from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerDataIdentity if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     */
    public static SearchIndexerDataIdentity fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
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
                        String json = JsonUtils.bufferJsonObject(reader);
                        JsonReader replayReader = DefaultJsonReader.fromString(json);
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
                            readerToUse = DefaultJsonReader.fromString(json);
                        }
                    }
                    // Use the discriminator value to determine which subtype should be deserialized.
                    if ("#Microsoft.Azure.Search.SearchIndexerDataNoneIdentity".equals(discriminatorValue)) {
                        return SearchIndexerDataNoneIdentity.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.SearchIndexerDataUserAssignedIdentity"
                            .equals(discriminatorValue)) {
                        return SearchIndexerDataUserAssignedIdentity.fromJson(readerToUse);
                    } else {
                        throw new IllegalStateException(
                                "Discriminator field '@odata.type' didn't match one of the expected values '#Microsoft.Azure.Search.SearchIndexerDataNoneIdentity', or '#Microsoft.Azure.Search.SearchIndexerDataUserAssignedIdentity'. It was: '"
                                        + discriminatorValue
                                        + "'.");
                    }
                });
    }
}
