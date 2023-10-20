// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Converts alphabetic, numeric, and symbolic Unicode characters which are not in the first 127 ASCII characters (the
 * "Basic Latin" Unicode block) into their ASCII equivalents, if such equivalents exist. This token filter is
 * implemented using Apache Lucene.
 */
@Fluent
public final class AsciiFoldingTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    /*
     * A value indicating whether the original token will be kept. Default is false.
     */
    private Boolean preserveOriginal;

    /**
     * Creates an instance of AsciiFoldingTokenFilter class.
     *
     * @param name the name value to set.
     */
    public AsciiFoldingTokenFilter(String name) {
        super(name);
    }

    /**
     * Get the preserveOriginal property: A value indicating whether the original token will be kept. Default is false.
     *
     * @return the preserveOriginal value.
     */
    public Boolean isPreserveOriginal() {
        return this.preserveOriginal;
    }

    /**
     * Set the preserveOriginal property: A value indicating whether the original token will be kept. Default is false.
     *
     * @param preserveOriginal the preserveOriginal value to set.
     * @return the AsciiFoldingTokenFilter object itself.
     */
    public AsciiFoldingTokenFilter setPreserveOriginal(Boolean preserveOriginal) {
        this.preserveOriginal = preserveOriginal;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Azure.Search.AsciiFoldingTokenFilter");
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeBooleanField("preserveOriginal", this.preserveOriginal);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AsciiFoldingTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AsciiFoldingTokenFilter if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the AsciiFoldingTokenFilter.
     */
    public static AsciiFoldingTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    Boolean preserveOriginal = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!"#Microsoft.Azure.Search.AsciiFoldingTokenFilter".equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.AsciiFoldingTokenFilter'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("preserveOriginal".equals(fieldName)) {
                            preserveOriginal = reader.getNullable(JsonReader::getBoolean);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        AsciiFoldingTokenFilter deserializedAsciiFoldingTokenFilter = new AsciiFoldingTokenFilter(name);
                        deserializedAsciiFoldingTokenFilter.preserveOriginal = preserveOriginal;

                        return deserializedAsciiFoldingTokenFilter;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
