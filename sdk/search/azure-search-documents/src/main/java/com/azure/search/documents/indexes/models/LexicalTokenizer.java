// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.DefaultJsonReader;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.indexes.implementation.models.KeywordTokenizerV1;
import com.azure.search.documents.indexes.implementation.models.KeywordTokenizerV2;
import com.azure.search.documents.indexes.implementation.models.LuceneStandardTokenizerV1;
import com.azure.search.documents.indexes.implementation.models.LuceneStandardTokenizerV2;

/** Base type for tokenizers. */
@Fluent
public abstract class LexicalTokenizer implements JsonSerializable<LexicalTokenizer> {
    /*
     * The name of the tokenizer. It must only contain letters, digits, spaces, dashes or underscores, can only start
     * and end with alphanumeric characters, and is limited to 128 characters.
     */
    private final String name;

    /**
     * Creates an instance of LexicalTokenizer class.
     *
     * @param name the name value to set.
     */
    public LexicalTokenizer(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the tokenizer. It must only contain letters, digits, spaces, dashes or
     * underscores, can only start and end with alphanumeric characters, and is limited to 128 characters.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of LexicalTokenizer from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of LexicalTokenizer if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     */
    public static LexicalTokenizer fromJson(JsonReader jsonReader) {
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
                    if ("#Microsoft.Azure.Search.ClassicTokenizer".equals(discriminatorValue)) {
                        return ClassicTokenizer.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.EdgeNGramTokenizer".equals(discriminatorValue)) {
                        return EdgeNGramTokenizer.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.KeywordTokenizerV2".equals(discriminatorValue)) {
                        KeywordTokenizerV2 codegen = KeywordTokenizerV2.fromJson(readerToUse);
                        return (codegen == null) ? null : new KeywordTokenizer(codegen);
                    } else if ("#Microsoft.Azure.Search.MicrosoftLanguageTokenizer".equals(discriminatorValue)) {
                        return MicrosoftLanguageTokenizer.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.MicrosoftLanguageStemmingTokenizer"
                            .equals(discriminatorValue)) {
                        return MicrosoftLanguageStemmingTokenizer.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.NGramTokenizer".equals(discriminatorValue)) {
                        return NGramTokenizer.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.PatternTokenizer".equals(discriminatorValue)) {
                        return PatternTokenizer.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.StandardTokenizerV2".equals(discriminatorValue)) {
                        LuceneStandardTokenizerV2 codegen = LuceneStandardTokenizerV2.fromJson(readerToUse);
                        return (codegen == null) ? null : new LuceneStandardTokenizer(codegen);
                    } else if ("#Microsoft.Azure.Search.UaxUrlEmailTokenizer".equals(discriminatorValue)) {
                        return UaxUrlEmailTokenizer.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.PathHierarchyTokenizerV2".equals(discriminatorValue)) {
                        return PathHierarchyTokenizer.fromJson(readerToUse);
                    } else if ("#Microsoft.Azure.Search.StandardTokenizer".equals(discriminatorValue)) {
                        LuceneStandardTokenizerV1 codegen = LuceneStandardTokenizerV1.fromJson(readerToUse);
                        return (codegen == null) ? null : new LuceneStandardTokenizer(codegen);
                    } else if ("#Microsoft.Azure.Search.KeywordTokenizer".equals(discriminatorValue)) {
                        KeywordTokenizerV1 codegen = KeywordTokenizerV1.fromJson(readerToUse);
                        return (codegen == null) ? null : new KeywordTokenizer(codegen);
                    } else {
                        throw new IllegalStateException(
                                "Discriminator field '@odata.type' didn't match one of the expected values '#Microsoft.Azure.Search.ClassicTokenizer', '#Microsoft.Azure.Search.EdgeNGramTokenizer', '#Microsoft.Azure.Search.KeywordTokenizerV2', '#Microsoft.Azure.Search.MicrosoftLanguageTokenizer', '#Microsoft.Azure.Search.MicrosoftLanguageStemmingTokenizer', '#Microsoft.Azure.Search.NGramTokenizer', '#Microsoft.Azure.Search.PatternTokenizer', '#Microsoft.Azure.Search.StandardTokenizerV2', '#Microsoft.Azure.Search.UaxUrlEmailTokenizer', '#Microsoft.Azure.Search.PathHierarchyTokenizerV2', '#Microsoft.Azure.Search.StandardTokenizer', or '#Microsoft.Azure.Search.KeywordTokenizer'. It was: '"
                                        + discriminatorValue
                                        + "'.");
                    }
                });
    }
}
