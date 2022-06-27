// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JsonUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.indexes.models.EdgeNGramTokenFilterSide;
import com.azure.search.documents.indexes.models.TokenFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * Generates n-grams of the given size(s) starting from the front or the back of an input token. This token filter is
 * implemented using Apache Lucene.
 */
@Fluent
public final class EdgeNGramTokenFilterV2 extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    private String odataType = "#Microsoft.Azure.Search.EdgeNGramTokenFilterV2";

    /*
     * The minimum n-gram length. Default is 1. Maximum is 300. Must be less than the value of maxGram.
     */
    private Integer minGram;

    /*
     * The maximum n-gram length. Default is 2. Maximum is 300.
     */
    private Integer maxGram;

    /*
     * Specifies which side of the input the n-gram should be generated from. Default is "front".
     */
    private EdgeNGramTokenFilterSide side;

    /**
     * Creates an instance of EdgeNGramTokenFilterV2 class.
     *
     * @param name the name value to set.
     */
    public EdgeNGramTokenFilterV2(String name) {
        super(name);
    }

    /**
     * Get the minGram property: The minimum n-gram length. Default is 1. Maximum is 300. Must be less than the value of
     * maxGram.
     *
     * @return the minGram value.
     */
    public Integer getMinGram() {
        return this.minGram;
    }

    /**
     * Set the minGram property: The minimum n-gram length. Default is 1. Maximum is 300. Must be less than the value of
     * maxGram.
     *
     * @param minGram the minGram value to set.
     * @return the EdgeNGramTokenFilterV2 object itself.
     */
    public EdgeNGramTokenFilterV2 setMinGram(Integer minGram) {
        this.minGram = minGram;
        return this;
    }

    /**
     * Get the maxGram property: The maximum n-gram length. Default is 2. Maximum is 300.
     *
     * @return the maxGram value.
     */
    public Integer getMaxGram() {
        return this.maxGram;
    }

    /**
     * Set the maxGram property: The maximum n-gram length. Default is 2. Maximum is 300.
     *
     * @param maxGram the maxGram value to set.
     * @return the EdgeNGramTokenFilterV2 object itself.
     */
    public EdgeNGramTokenFilterV2 setMaxGram(Integer maxGram) {
        this.maxGram = maxGram;
        return this;
    }

    /**
     * Get the side property: Specifies which side of the input the n-gram should be generated from. Default is "front".
     *
     * @return the side value.
     */
    public EdgeNGramTokenFilterSide getSide() {
        return this.side;
    }

    /**
     * Set the side property: Specifies which side of the input the n-gram should be generated from. Default is "front".
     *
     * @param side the side value to set.
     * @return the EdgeNGramTokenFilterV2 object itself.
     */
    public EdgeNGramTokenFilterV2 setSide(EdgeNGramTokenFilterSide side) {
        this.side = side;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", odataType);
        jsonWriter.writeStringField("name", getName(), false);
        jsonWriter.writeIntegerField("minGram", this.minGram, false);
        jsonWriter.writeIntegerField("maxGram", this.maxGram, false);
        jsonWriter.writeStringField("side", this.side == null ? null : this.side.toString(), false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of EdgeNGramTokenFilterV2 from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of EdgeNGramTokenFilterV2 if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     */
    public static EdgeNGramTokenFilterV2 fromJson(JsonReader jsonReader) {
        return JsonUtils.readObject(
                jsonReader,
                reader -> {
                    String odataType = "#Microsoft.Azure.Search.EdgeNGramTokenFilterV2";
                    boolean nameFound = false;
                    String name = null;
                    Integer minGram = null;
                    Integer maxGram = null;
                    EdgeNGramTokenFilterSide side = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            odataType = reader.getStringValue();
                        } else if ("name".equals(fieldName)) {
                            name = reader.getStringValue();
                            nameFound = true;
                        } else if ("minGram".equals(fieldName)) {
                            minGram = JsonUtils.getNullableProperty(reader, r -> reader.getIntValue());
                        } else if ("maxGram".equals(fieldName)) {
                            maxGram = JsonUtils.getNullableProperty(reader, r -> reader.getIntValue());
                        } else if ("side".equals(fieldName)) {
                            side = EdgeNGramTokenFilterSide.fromString(reader.getStringValue());
                        } else {
                            reader.skipChildren();
                        }
                    }

                    if (!"#Microsoft.Azure.Search.EdgeNGramTokenFilterV2".equals(odataType)) {
                        throw new IllegalStateException(
                                "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.EdgeNGramTokenFilterV2'. The found '@odata.type' was '"
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
                    EdgeNGramTokenFilterV2 deserializedValue = new EdgeNGramTokenFilterV2(name);
                    deserializedValue.odataType = odataType;
                    deserializedValue.minGram = minGram;
                    deserializedValue.maxGram = maxGram;
                    deserializedValue.side = side;

                    return deserializedValue;
                });
    }
}
