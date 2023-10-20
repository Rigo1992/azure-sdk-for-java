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
 * A character filter that replaces characters in the input string. It uses a regular expression to identify character
 * sequences to preserve and a replacement pattern to identify characters to replace. For example, given the input text
 * "aa bb aa bb", pattern "(aa)\s+(bb)", and replacement "$1#$2", the result would be "aa#bb aa#bb". This character
 * filter is implemented using Apache Lucene.
 */
@Immutable
public final class PatternReplaceCharFilter extends CharFilter {
    /*
     * Identifies the concrete type of the char filter.
     */
    /*
     * A regular expression pattern.
     */
    private final String pattern;

    /*
     * The replacement text.
     */
    private final String replacement;

    /**
     * Creates an instance of PatternReplaceCharFilter class.
     *
     * @param name the name value to set.
     * @param pattern the pattern value to set.
     * @param replacement the replacement value to set.
     */
    public PatternReplaceCharFilter(String name, String pattern, String replacement) {
        super(name);
        this.pattern = pattern;
        this.replacement = replacement;
    }

    /**
     * Get the pattern property: A regular expression pattern.
     *
     * @return the pattern value.
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * Get the replacement property: The replacement text.
     *
     * @return the replacement value.
     */
    public String getReplacement() {
        return this.replacement;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Azure.Search.PatternReplaceCharFilter");
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("pattern", this.pattern);
        jsonWriter.writeStringField("replacement", this.replacement);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PatternReplaceCharFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PatternReplaceCharFilter if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the PatternReplaceCharFilter.
     */
    public static PatternReplaceCharFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    boolean patternFound = false;
                    String pattern = null;
                    boolean replacementFound = false;
                    String replacement = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!"#Microsoft.Azure.Search.PatternReplaceCharFilter".equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.PatternReplaceCharFilter'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("pattern".equals(fieldName)) {
                            pattern = reader.getString();
                            patternFound = true;
                        } else if ("replacement".equals(fieldName)) {
                            replacement = reader.getString();
                            replacementFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound && patternFound && replacementFound) {
                        PatternReplaceCharFilter deserializedPatternReplaceCharFilter =
                                new PatternReplaceCharFilter(name, pattern, replacement);

                        return deserializedPatternReplaceCharFilter;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!patternFound) {
                        missingProperties.add("pattern");
                    }
                    if (!replacementFound) {
                        missingProperties.add("replacement");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
