// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Construct bigrams for frequently occurring terms while indexing. Single terms are still indexed too, with bigrams
 * overlaid. This token filter is implemented using Apache Lucene.
 */
@Fluent
public final class CommonGramTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    private String odataType = "#Microsoft.Azure.Search.CommonGramTokenFilter";

    /*
     * The set of common words.
     */
    private final List<String> commonWords;

    /*
     * A value indicating whether common words matching will be case insensitive. Default is false.
     */
    private Boolean caseIgnored;

    /*
     * A value that indicates whether the token filter is in query mode. When in query mode, the token filter generates
     * bigrams and then removes common words and single terms followed by a common word. Default is false.
     */
    private Boolean queryModeUsed;

    /**
     * Creates an instance of CommonGramTokenFilter class.
     *
     * @param name the name value to set.
     * @param commonWords the commonWords value to set.
     */
    public CommonGramTokenFilter(String name, List<String> commonWords) {
        super(name);
        this.commonWords = commonWords;
    }

    /**
     * Get the commonWords property: The set of common words.
     *
     * @return the commonWords value.
     */
    public List<String> getCommonWords() {
        return this.commonWords;
    }

    /**
     * Get the caseIgnored property: A value indicating whether common words matching will be case insensitive. Default
     * is false.
     *
     * @return the caseIgnored value.
     */
    public Boolean isCaseIgnored() {
        return this.caseIgnored;
    }

    /**
     * Set the caseIgnored property: A value indicating whether common words matching will be case insensitive. Default
     * is false.
     *
     * @param caseIgnored the caseIgnored value to set.
     * @return the CommonGramTokenFilter object itself.
     */
    public CommonGramTokenFilter setCaseIgnored(Boolean caseIgnored) {
        this.caseIgnored = caseIgnored;
        return this;
    }

    /**
     * Get the queryModeUsed property: A value that indicates whether the token filter is in query mode. When in query
     * mode, the token filter generates bigrams and then removes common words and single terms followed by a common
     * word. Default is false.
     *
     * @return the queryModeUsed value.
     */
    public Boolean isQueryModeUsed() {
        return this.queryModeUsed;
    }

    /**
     * Set the queryModeUsed property: A value that indicates whether the token filter is in query mode. When in query
     * mode, the token filter generates bigrams and then removes common words and single terms followed by a common
     * word. Default is false.
     *
     * @param queryModeUsed the queryModeUsed value to set.
     * @return the CommonGramTokenFilter object itself.
     */
    public CommonGramTokenFilter setQueryModeUsed(Boolean queryModeUsed) {
        this.queryModeUsed = queryModeUsed;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", odataType);
        jsonWriter.writeStringField("name", getName(), false);
        jsonWriter.writeArrayField(
                "commonWords", this.commonWords, false, (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("ignoreCase", this.caseIgnored, false);
        jsonWriter.writeBooleanField("queryMode", this.queryModeUsed, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of CommonGramTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CommonGramTokenFilter if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     */
    public static CommonGramTokenFilter fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    String odataType = "#Microsoft.Azure.Search.CommonGramTokenFilter";
                    boolean nameFound = false;
                    String name = null;
                    boolean commonWordsFound = false;
                    List<String> commonWords = null;
                    Boolean caseIgnored = null;
                    Boolean queryModeUsed = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            odataType = reader.getStringValue();
                        } else if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                            nameFound = true;
                        } else if ("commonWords".equals(fieldName)) {
                            commonWords = reader.readArray(reader1 -> reader1.getStringValue());
                            commonWordsFound = true;
                        } else if ("ignoreCase".equals(fieldName)) {
                            caseIgnored = reader.getBooleanNullableValue();
                        } else if ("queryMode".equals(fieldName)) {
                            queryModeUsed = reader.getBooleanNullableValue();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    if (!"#Microsoft.Azure.Search.CommonGramTokenFilter".equals(odataType)) {
                        throw new IllegalStateException(
                                "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.CommonGramTokenFilter'. The found '@odata.type' was '"
                                        + odataType
                                        + "'.");
                    }

                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!commonWordsFound) {
                        missingProperties.add("commonWords");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    CommonGramTokenFilter deserializedValue = new CommonGramTokenFilter(name, commonWords);
                    deserializedValue.odataType = odataType;
                    deserializedValue.caseIgnored = caseIgnored;
                    deserializedValue.queryModeUsed = queryModeUsed;

                    return deserializedValue;
                });
    }
}
