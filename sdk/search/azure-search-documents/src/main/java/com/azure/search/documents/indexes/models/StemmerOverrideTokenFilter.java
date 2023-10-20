// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides the ability to override other stemming filters with custom dictionary-based stemming. Any dictionary-stemmed
 * terms will be marked as keywords so that they will not be stemmed with stemmers down the chain. Must be placed before
 * any stemming filters. This token filter is implemented using Apache Lucene.
 */
@Immutable
public final class StemmerOverrideTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    /*
     * A list of stemming rules in the following format: "word => stem", for example: "ran => run".
     */
    private final List<String> rules;

    /**
     * Creates an instance of StemmerOverrideTokenFilter class.
     *
     * @param name the name value to set.
     * @param rules the rules value to set.
     */
    public StemmerOverrideTokenFilter(String name, List<String> rules) {
        super(name);
        this.rules = rules;
    }

    /**
     * Get the rules property: A list of stemming rules in the following format: "word =&gt; stem", for example: "ran
     * =&gt; run".
     *
     * @return the rules value.
     */
    public List<String> getRules() {
        return this.rules;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Azure.Search.StemmerOverrideTokenFilter");
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StemmerOverrideTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of StemmerOverrideTokenFilter if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the StemmerOverrideTokenFilter.
     */
    public static StemmerOverrideTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    boolean rulesFound = false;
                    List<String> rules = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!"#Microsoft.Azure.Search.StemmerOverrideTokenFilter".equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.StemmerOverrideTokenFilter'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("rules".equals(fieldName)) {
                            rules = reader.readArray(reader1 -> reader1.getString());
                            rulesFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound && rulesFound) {
                        StemmerOverrideTokenFilter deserializedStemmerOverrideTokenFilter =
                                new StemmerOverrideTokenFilter(name, rules);

                        return deserializedStemmerOverrideTokenFilter;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!rulesFound) {
                        missingProperties.add("rules");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
