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
import java.util.Objects;

/** Create tokens for phonetic matches. This token filter is implemented using Apache Lucene. */
@Fluent
public final class PhoneticTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    /*
     * The phonetic encoder to use. Default is "metaphone".
     */
    private PhoneticEncoder encoder;

    /*
     * A value indicating whether encoded tokens should replace original tokens. If false, encoded tokens are added as
     * synonyms. Default is true.
     */
    private Boolean originalTokensReplaced;

    /**
     * Creates an instance of PhoneticTokenFilter class.
     *
     * @param name the name value to set.
     */
    public PhoneticTokenFilter(String name) {
        super(name);
    }

    /**
     * Get the encoder property: The phonetic encoder to use. Default is "metaphone".
     *
     * @return the encoder value.
     */
    public PhoneticEncoder getEncoder() {
        return this.encoder;
    }

    /**
     * Set the encoder property: The phonetic encoder to use. Default is "metaphone".
     *
     * @param encoder the encoder value to set.
     * @return the PhoneticTokenFilter object itself.
     */
    public PhoneticTokenFilter setEncoder(PhoneticEncoder encoder) {
        this.encoder = encoder;
        return this;
    }

    /**
     * Get the originalTokensReplaced property: A value indicating whether encoded tokens should replace original
     * tokens. If false, encoded tokens are added as synonyms. Default is true.
     *
     * @return the originalTokensReplaced value.
     */
    public Boolean areOriginalTokensReplaced() {
        return this.originalTokensReplaced;
    }

    /**
     * Set the originalTokensReplaced property: A value indicating whether encoded tokens should replace original
     * tokens. If false, encoded tokens are added as synonyms. Default is true.
     *
     * @param originalTokensReplaced the originalTokensReplaced value to set.
     * @return the PhoneticTokenFilter object itself.
     */
    public PhoneticTokenFilter setOriginalTokensReplaced(Boolean originalTokensReplaced) {
        this.originalTokensReplaced = originalTokensReplaced;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Azure.Search.PhoneticTokenFilter");
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("encoder", Objects.toString(this.encoder, null));
        jsonWriter.writeBooleanField("replace", this.originalTokensReplaced);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PhoneticTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PhoneticTokenFilter if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the PhoneticTokenFilter.
     */
    public static PhoneticTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    PhoneticEncoder encoder = null;
                    Boolean originalTokensReplaced = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!"#Microsoft.Azure.Search.PhoneticTokenFilter".equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.PhoneticTokenFilter'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("encoder".equals(fieldName)) {
                            encoder = PhoneticEncoder.fromString(reader.getString());
                        } else if ("replace".equals(fieldName)) {
                            originalTokensReplaced = reader.getNullable(JsonReader::getBoolean);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        PhoneticTokenFilter deserializedPhoneticTokenFilter = new PhoneticTokenFilter(name);
                        deserializedPhoneticTokenFilter.encoder = encoder;
                        deserializedPhoneticTokenFilter.originalTokensReplaced = originalTokensReplaced;

                        return deserializedPhoneticTokenFilter;
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
