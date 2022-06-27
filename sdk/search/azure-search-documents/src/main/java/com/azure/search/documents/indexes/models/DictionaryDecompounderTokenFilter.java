// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/** Decomposes compound words found in many Germanic languages. This token filter is implemented using Apache Lucene. */
@Fluent
public final class DictionaryDecompounderTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    private String odataType = "#Microsoft.Azure.Search.DictionaryDecompounderTokenFilter";

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
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", odataType);
        jsonWriter.writeStringField("name", getName(), false);
        JsonUtils.writeArray(
                jsonWriter, "wordList", this.wordList, (writer, element) -> writer.writeString(element, false));
        jsonWriter.writeIntegerField("minWordSize", this.minWordSize, false);
        jsonWriter.writeIntegerField("minSubwordSize", this.minSubwordSize, false);
        jsonWriter.writeIntegerField("maxSubwordSize", this.maxSubwordSize, false);
        jsonWriter.writeBooleanField("onlyLongestMatch", this.onlyLongestMatched, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of DictionaryDecompounderTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DictionaryDecompounderTokenFilter if the JsonReader was pointing to an instance of it, or
     *     null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     */
    public static DictionaryDecompounderTokenFilter fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    String odataType = "#Microsoft.Azure.Search.DictionaryDecompounderTokenFilter";
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
                            odataType = reader.getStringValue();
                        } else if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                            nameFound = true;
                        } else if ("wordList".equals(fieldName)) {
                            wordList = JsonUtils.readArray(reader, reader1 -> reader1.getStringValue());
                            wordListFound = true;
                        } else if ("minWordSize".equals(fieldName)) {
                            minWordSize = JsonUtils.getNullableProperty(reader, r -> reader.getIntValue());
                        } else if ("minSubwordSize".equals(fieldName)) {
                            minSubwordSize = JsonUtils.getNullableProperty(reader, r -> reader.getIntValue());
                        } else if ("maxSubwordSize".equals(fieldName)) {
                            maxSubwordSize = JsonUtils.getNullableProperty(reader, r -> reader.getIntValue());
                        } else if ("onlyLongestMatch".equals(fieldName)) {
                            onlyLongestMatched = JsonUtils.getNullableProperty(reader, r -> reader.getBooleanValue());
                        } else {
                            reader.skipChildren();
                        }
                    }

                    if (!"#Microsoft.Azure.Search.DictionaryDecompounderTokenFilter".equals(odataType)) {
                        throw new IllegalStateException(
                                "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.DictionaryDecompounderTokenFilter'. The found '@odata.type' was '"
                                        + odataType
                                        + "'.");
                    }

                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!wordListFound) {
                        missingProperties.add("wordList");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    DictionaryDecompounderTokenFilter deserializedValue =
                            new DictionaryDecompounderTokenFilter(name, wordList);
                    deserializedValue.odataType = odataType;
                    deserializedValue.minWordSize = minWordSize;
                    deserializedValue.minSubwordSize = minSubwordSize;
                    deserializedValue.maxSubwordSize = maxSubwordSize;
                    deserializedValue.onlyLongestMatched = onlyLongestMatched;

                    return deserializedValue;
                });
    }
}
