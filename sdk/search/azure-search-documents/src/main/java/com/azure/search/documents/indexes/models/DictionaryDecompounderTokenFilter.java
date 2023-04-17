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

/** Decomposes compound words found in many Germanic languages. This token filter is implemented using Apache Lucene. */
@Fluent
public final class DictionaryDecompounderTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    private static final String ODATA_TYPE = "#Microsoft.Azure.Search.DictionaryDecompounderTokenFilter";

    /*
     * The list of words to match against.
     */
    private final List<String> wordList;

    /*
     * The minimum word size. Only words longer than this get processed. Default is 5. Maximum is 300.
     */
    private Integer minWordSize;

    /*
     * The minimum subword size. Only subwords longer than this are outputted. Default is 2. Maximum is 300.
     */
    private Integer minSubwordSize;

    /*
     * The maximum subword size. Only subwords shorter than this are outputted. Default is 15. Maximum is 300.
     */
    private Integer maxSubwordSize;

    /*
     * A value indicating whether to add only the longest matching subword to the output. Default is false.
     */
    private Boolean onlyLongestMatched;

    /**
     * Creates an instance of DictionaryDecompounderTokenFilter class.
     *
     * @param name the name value to set.
     * @param wordList the wordList value to set.
     */
    public DictionaryDecompounderTokenFilter(String name, List<String> wordList) {
        super(name);
        this.wordList = wordList;
    }

    /**
     * Get the wordList property: The list of words to match against.
     *
     * @return the wordList value.
     */
    public List<String> getWordList() {
        return this.wordList;
    }

    /**
     * Get the minWordSize property: The minimum word size. Only words longer than this get processed. Default is 5.
     * Maximum is 300.
     *
     * @return the minWordSize value.
     */
    public Integer getMinWordSize() {
        return this.minWordSize;
    }

    /**
     * Set the minWordSize property: The minimum word size. Only words longer than this get processed. Default is 5.
     * Maximum is 300.
     *
     * @param minWordSize the minWordSize value to set.
     * @return the DictionaryDecompounderTokenFilter object itself.
     */
    public DictionaryDecompounderTokenFilter setMinWordSize(Integer minWordSize) {
        this.minWordSize = minWordSize;
        return this;
    }

    /**
     * Get the minSubwordSize property: The minimum subword size. Only subwords longer than this are outputted. Default
     * is 2. Maximum is 300.
     *
     * @return the minSubwordSize value.
     */
    public Integer getMinSubwordSize() {
        return this.minSubwordSize;
    }

    /**
     * Set the minSubwordSize property: The minimum subword size. Only subwords longer than this are outputted. Default
     * is 2. Maximum is 300.
     *
     * @param minSubwordSize the minSubwordSize value to set.
     * @return the DictionaryDecompounderTokenFilter object itself.
     */
    public DictionaryDecompounderTokenFilter setMinSubwordSize(Integer minSubwordSize) {
        this.minSubwordSize = minSubwordSize;
        return this;
    }

    /**
     * Get the maxSubwordSize property: The maximum subword size. Only subwords shorter than this are outputted. Default
     * is 15. Maximum is 300.
     *
     * @return the maxSubwordSize value.
     */
    public Integer getMaxSubwordSize() {
        return this.maxSubwordSize;
    }

    /**
     * Set the maxSubwordSize property: The maximum subword size. Only subwords shorter than this are outputted. Default
     * is 15. Maximum is 300.
     *
     * @param maxSubwordSize the maxSubwordSize value to set.
     * @return the DictionaryDecompounderTokenFilter object itself.
     */
    public DictionaryDecompounderTokenFilter setMaxSubwordSize(Integer maxSubwordSize) {
        this.maxSubwordSize = maxSubwordSize;
        return this;
    }

    /**
     * Get the onlyLongestMatched property: A value indicating whether to add only the longest matching subword to the
     * output. Default is false.
     *
     * @return the onlyLongestMatched value.
     */
    public Boolean isOnlyLongestMatched() {
        return this.onlyLongestMatched;
    }

    /**
     * Set the onlyLongestMatched property: A value indicating whether to add only the longest matching subword to the
     * output. Default is false.
     *
     * @param onlyLongestMatched the onlyLongestMatched value to set.
     * @return the DictionaryDecompounderTokenFilter object itself.
     */
    public DictionaryDecompounderTokenFilter setOnlyLongestMatched(Boolean onlyLongestMatched) {
        this.onlyLongestMatched = onlyLongestMatched;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeArrayField("wordList", this.wordList, (writer, element) -> writer.writeString(element));
        jsonWriter.writeNumberField("minWordSize", this.minWordSize);
        jsonWriter.writeNumberField("minSubwordSize", this.minSubwordSize);
        jsonWriter.writeNumberField("maxSubwordSize", this.maxSubwordSize);
        jsonWriter.writeBooleanField("onlyLongestMatch", this.onlyLongestMatched);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DictionaryDecompounderTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DictionaryDecompounderTokenFilter if the JsonReader was pointing to an instance of it, or
     *     null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the DictionaryDecompounderTokenFilter.
     */
    public static DictionaryDecompounderTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    boolean wordListFound = false;
                    List<String> wordList = null;
                    Integer minWordSize = null;
                    Integer minSubwordSize = null;
                    Integer maxSubwordSize = null;
                    Boolean onlyLongestMatched = null;
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
                        } else if ("wordList".equals(fieldName)) {
                            wordList = reader.readArray(reader1 -> reader1.getString());
                            wordListFound = true;
                        } else if ("minWordSize".equals(fieldName)) {
                            minWordSize = reader.getNullable(JsonReader::getInt);
                        } else if ("minSubwordSize".equals(fieldName)) {
                            minSubwordSize = reader.getNullable(JsonReader::getInt);
                        } else if ("maxSubwordSize".equals(fieldName)) {
                            maxSubwordSize = reader.getNullable(JsonReader::getInt);
                        } else if ("onlyLongestMatch".equals(fieldName)) {
                            onlyLongestMatched = reader.getNullable(JsonReader::getBoolean);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound && wordListFound) {
                        DictionaryDecompounderTokenFilter deserializedDictionaryDecompounderTokenFilter =
                                new DictionaryDecompounderTokenFilter(name, wordList);
                        deserializedDictionaryDecompounderTokenFilter.minWordSize = minWordSize;
                        deserializedDictionaryDecompounderTokenFilter.minSubwordSize = minSubwordSize;
                        deserializedDictionaryDecompounderTokenFilter.maxSubwordSize = maxSubwordSize;
                        deserializedDictionaryDecompounderTokenFilter.onlyLongestMatched = onlyLongestMatched;

                        return deserializedDictionaryDecompounderTokenFilter;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!wordListFound) {
                        missingProperties.add("wordList");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
