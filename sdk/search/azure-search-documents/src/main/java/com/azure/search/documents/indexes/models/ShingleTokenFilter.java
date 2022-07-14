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

/** Creates combinations of tokens as a single token. This token filter is implemented using Apache Lucene. */
@Fluent
public final class ShingleTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    private String odataType = "#Microsoft.Azure.Search.ShingleTokenFilter";

    /*
     * The maximum shingle size. Default and minimum value is 2.
     */
    private Integer maxShingleSize;

    /*
     * The minimum shingle size. Default and minimum value is 2. Must be less than the value of maxShingleSize.
     */
    private Integer minShingleSize;

    /*
     * A value indicating whether the output stream will contain the input tokens (unigrams) as well as shingles.
     * Default is true.
     */
    private Boolean outputUnigrams;

    /*
     * A value indicating whether to output unigrams for those times when no shingles are available. This property
     * takes precedence when outputUnigrams is set to false. Default is false.
     */
    private Boolean outputUnigramsIfNoShingles;

    /*
     * The string to use when joining adjacent tokens to form a shingle. Default is a single space (" ").
     */
    private String tokenSeparator;

    /*
     * The string to insert for each position at which there is no token. Default is an underscore ("_").
     */
    private String filterToken;

    /**
     * Creates an instance of ShingleTokenFilter class.
     *
     * @param name the name value to set.
     */
    public ShingleTokenFilter(String name) {
        super(name);
    }

    /**
     * Get the maxShingleSize property: The maximum shingle size. Default and minimum value is 2.
     *
     * @return the maxShingleSize value.
     */
    public Integer getMaxShingleSize() {
        return this.maxShingleSize;
    }

    /**
     * Set the maxShingleSize property: The maximum shingle size. Default and minimum value is 2.
     *
     * @param maxShingleSize the maxShingleSize value to set.
     * @return the ShingleTokenFilter object itself.
     */
    public ShingleTokenFilter setMaxShingleSize(Integer maxShingleSize) {
        this.maxShingleSize = maxShingleSize;
        return this;
    }

    /**
     * Get the minShingleSize property: The minimum shingle size. Default and minimum value is 2. Must be less than the
     * value of maxShingleSize.
     *
     * @return the minShingleSize value.
     */
    public Integer getMinShingleSize() {
        return this.minShingleSize;
    }

    /**
     * Set the minShingleSize property: The minimum shingle size. Default and minimum value is 2. Must be less than the
     * value of maxShingleSize.
     *
     * @param minShingleSize the minShingleSize value to set.
     * @return the ShingleTokenFilter object itself.
     */
    public ShingleTokenFilter setMinShingleSize(Integer minShingleSize) {
        this.minShingleSize = minShingleSize;
        return this;
    }

    /**
     * Get the outputUnigrams property: A value indicating whether the output stream will contain the input tokens
     * (unigrams) as well as shingles. Default is true.
     *
     * @return the outputUnigrams value.
     */
    public Boolean areOutputUnigrams() {
        return this.outputUnigrams;
    }

    /**
     * Set the outputUnigrams property: A value indicating whether the output stream will contain the input tokens
     * (unigrams) as well as shingles. Default is true.
     *
     * @param outputUnigrams the outputUnigrams value to set.
     * @return the ShingleTokenFilter object itself.
     */
    public ShingleTokenFilter setOutputUnigrams(Boolean outputUnigrams) {
        this.outputUnigrams = outputUnigrams;
        return this;
    }

    /**
     * Get the outputUnigramsIfNoShingles property: A value indicating whether to output unigrams for those times when
     * no shingles are available. This property takes precedence when outputUnigrams is set to false. Default is false.
     *
     * @return the outputUnigramsIfNoShingles value.
     */
    public Boolean areOutputUnigramsIfNoShingles() {
        return this.outputUnigramsIfNoShingles;
    }

    /**
     * Set the outputUnigramsIfNoShingles property: A value indicating whether to output unigrams for those times when
     * no shingles are available. This property takes precedence when outputUnigrams is set to false. Default is false.
     *
     * @param outputUnigramsIfNoShingles the outputUnigramsIfNoShingles value to set.
     * @return the ShingleTokenFilter object itself.
     */
    public ShingleTokenFilter setOutputUnigramsIfNoShingles(Boolean outputUnigramsIfNoShingles) {
        this.outputUnigramsIfNoShingles = outputUnigramsIfNoShingles;
        return this;
    }

    /**
     * Get the tokenSeparator property: The string to use when joining adjacent tokens to form a shingle. Default is a
     * single space (" ").
     *
     * @return the tokenSeparator value.
     */
    public String getTokenSeparator() {
        return this.tokenSeparator;
    }

    /**
     * Set the tokenSeparator property: The string to use when joining adjacent tokens to form a shingle. Default is a
     * single space (" ").
     *
     * @param tokenSeparator the tokenSeparator value to set.
     * @return the ShingleTokenFilter object itself.
     */
    public ShingleTokenFilter setTokenSeparator(String tokenSeparator) {
        this.tokenSeparator = tokenSeparator;
        return this;
    }

    /**
     * Get the filterToken property: The string to insert for each position at which there is no token. Default is an
     * underscore ("_").
     *
     * @return the filterToken value.
     */
    public String getFilterToken() {
        return this.filterToken;
    }

    /**
     * Set the filterToken property: The string to insert for each position at which there is no token. Default is an
     * underscore ("_").
     *
     * @param filterToken the filterToken value to set.
     * @return the ShingleTokenFilter object itself.
     */
    public ShingleTokenFilter setFilterToken(String filterToken) {
        this.filterToken = filterToken;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", odataType);
        jsonWriter.writeStringField("name", getName(), false);
        jsonWriter.writeIntegerField("maxShingleSize", this.maxShingleSize, false);
        jsonWriter.writeIntegerField("minShingleSize", this.minShingleSize, false);
        jsonWriter.writeBooleanField("outputUnigrams", this.outputUnigrams, false);
        jsonWriter.writeBooleanField("outputUnigramsIfNoShingles", this.outputUnigramsIfNoShingles, false);
        jsonWriter.writeStringField("tokenSeparator", this.tokenSeparator, false);
        jsonWriter.writeStringField("filterToken", this.filterToken, false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of ShingleTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ShingleTokenFilter if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     */
    public static ShingleTokenFilter fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    String odataType = "#Microsoft.Azure.Search.ShingleTokenFilter";
                    boolean nameFound = false;
                    String name = null;
                    Integer maxShingleSize = null;
                    Integer minShingleSize = null;
                    Boolean outputUnigrams = null;
                    Boolean outputUnigramsIfNoShingles = null;
                    String tokenSeparator = null;
                    String filterToken = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            odataType = reader.getStringValue();
                        } else if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                            nameFound = true;
                        } else if ("maxShingleSize".equals(fieldName)) {
                            maxShingleSize = reader.getIntegerNullableValue();
                        } else if ("minShingleSize".equals(fieldName)) {
                            minShingleSize = reader.getIntegerNullableValue();
                        } else if ("outputUnigrams".equals(fieldName)) {
                            outputUnigrams = reader.getBooleanNullableValue();
                        } else if ("outputUnigramsIfNoShingles".equals(fieldName)) {
                            outputUnigramsIfNoShingles = reader.getBooleanNullableValue();
                        } else if ("tokenSeparator".equals(fieldName)) {
                            tokenSeparator = reader.getStringValue();
                        } else if ("filterToken".equals(fieldName)) {
                            filterToken = reader.getStringValue();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    if (!"#Microsoft.Azure.Search.ShingleTokenFilter".equals(odataType)) {
                        throw new IllegalStateException(
                                "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.ShingleTokenFilter'. The found '@odata.type' was '"
                                        + odataType
                                        + "'.");
                    }

                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    if (!CoreUtils.isNullOrEmpty(missingProperties)) {
                        throw new IllegalStateException(
                                "Missing required property/properties: " + String.join(", ", missingProperties));
                    }
                    ShingleTokenFilter deserializedValue = new ShingleTokenFilter(name);
                    deserializedValue.odataType = odataType;
                    deserializedValue.maxShingleSize = maxShingleSize;
                    deserializedValue.minShingleSize = minShingleSize;
                    deserializedValue.outputUnigrams = outputUnigrams;
                    deserializedValue.outputUnigramsIfNoShingles = outputUnigramsIfNoShingles;
                    deserializedValue.tokenSeparator = tokenSeparator;
                    deserializedValue.filterToken = filterToken;

                    return deserializedValue;
                });
    }
}
