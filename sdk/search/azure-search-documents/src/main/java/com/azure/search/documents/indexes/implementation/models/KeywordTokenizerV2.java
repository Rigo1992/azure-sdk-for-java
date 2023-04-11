// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.indexes.models.LexicalTokenizer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Emits the entire input as a single token. This tokenizer is implemented using Apache Lucene. */
@Fluent
public final class KeywordTokenizerV2 extends LexicalTokenizer {
    /*
     * Identifies the concrete type of the tokenizer.
     */
    private static final String ODATA_TYPE = "#Microsoft.Azure.Search.KeywordTokenizerV2";

    /*
     * The maximum token length. Default is 256. Tokens longer than the maximum length are split. The maximum token
     * length that can be used is 300 characters.
     */
    private Integer maxTokenLength;

    /**
     * Creates an instance of KeywordTokenizerV2 class.
     *
     * @param name the name value to set.
     */
    public KeywordTokenizerV2(String name) {
        super(name);
    }

    /**
     * Get the maxTokenLength property: The maximum token length. Default is 256. Tokens longer than the maximum length
     * are split. The maximum token length that can be used is 300 characters.
     *
     * @return the maxTokenLength value.
     */
    public Integer getMaxTokenLength() {
        return this.maxTokenLength;
    }

    /**
     * Set the maxTokenLength property: The maximum token length. Default is 256. Tokens longer than the maximum length
     * are split. The maximum token length that can be used is 300 characters.
     *
     * @param maxTokenLength the maxTokenLength value to set.
     * @return the KeywordTokenizerV2 object itself.
     */
    public KeywordTokenizerV2 setMaxTokenLength(Integer maxTokenLength) {
        this.maxTokenLength = maxTokenLength;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeNumberField("maxTokenLength", this.maxTokenLength);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KeywordTokenizerV2 from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeywordTokenizerV2 if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the KeywordTokenizerV2.
     */
    public static KeywordTokenizerV2 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    Integer maxTokenLength = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("maxTokenLength".equals(fieldName)) {
                            maxTokenLength = reader.getNullable(JsonReader::getInt);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        KeywordTokenizerV2 deserializedKeywordTokenizerV2 = new KeywordTokenizerV2(name);
                        deserializedKeywordTokenizerV2.maxTokenLength = maxTokenLength;

                        return deserializedKeywordTokenizerV2;
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
