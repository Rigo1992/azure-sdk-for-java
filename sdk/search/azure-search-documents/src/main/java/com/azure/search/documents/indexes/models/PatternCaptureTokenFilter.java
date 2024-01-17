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

/**
 * Uses Java regexes to emit multiple tokens - one for each capture group in one or more patterns. This token filter is
 * implemented using Apache Lucene.
 */
@Fluent
public final class PatternCaptureTokenFilter extends TokenFilter {
    /*
     * A list of patterns to match against each token.
     */
    private final List<String> patterns;

    /*
     * A value indicating whether to return the original token even if one of the patterns matches. Default is true.
     */
    private Boolean preserveOriginal;

    /**
     * Creates an instance of PatternCaptureTokenFilter class.
     * 
     * @param name the name value to set.
     * @param patterns the patterns value to set.
     */
    public PatternCaptureTokenFilter(String name, List<String> patterns) {
        super(name);
        this.patterns = patterns;
    }

    /**
     * Get the patterns property: A list of patterns to match against each token.
     * 
     * @return the patterns value.
     */
    public List<String> getPatterns() {
        return this.patterns;
    }

    /**
     * Get the preserveOriginal property: A value indicating whether to return the original token even if one of the
     * patterns matches. Default is true.
     * 
     * @return the preserveOriginal value.
     */
    public Boolean isPreserveOriginal() {
        return this.preserveOriginal;
    }

    /**
     * Set the preserveOriginal property: A value indicating whether to return the original token even if one of the
     * patterns matches. Default is true.
     * 
     * @param preserveOriginal the preserveOriginal value to set.
     * @return the PatternCaptureTokenFilter object itself.
     */
    public PatternCaptureTokenFilter setPreserveOriginal(Boolean preserveOriginal) {
        this.preserveOriginal = preserveOriginal;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Azure.Search.PatternCaptureTokenFilter");
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeArrayField("patterns", this.patterns, (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("preserveOriginal", this.preserveOriginal);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PatternCaptureTokenFilter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PatternCaptureTokenFilter if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the PatternCaptureTokenFilter.
     */
    public static PatternCaptureTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            boolean patternsFound = false;
            List<String> patterns = null;
            Boolean preserveOriginal = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    String odataType = reader.getString();
                    if (!"#Microsoft.Azure.Search.PatternCaptureTokenFilter".equals(odataType)) {
                        throw new IllegalStateException(
                            "'@odata.type' was expected to be non-null and equal to '#Microsoft.Azure.Search.PatternCaptureTokenFilter'. The found '@odata.type' was '"
                                + odataType + "'.");
                    }
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("patterns".equals(fieldName)) {
                    patterns = reader.readArray(reader1 -> reader1.getString());
                    patternsFound = true;
                } else if ("preserveOriginal".equals(fieldName)) {
                    preserveOriginal = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound && patternsFound) {
                PatternCaptureTokenFilter deserializedPatternCaptureTokenFilter
                    = new PatternCaptureTokenFilter(name, patterns);
                deserializedPatternCaptureTokenFilter.preserveOriginal = preserveOriginal;

                return deserializedPatternCaptureTokenFilter;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!nameFound) {
                missingProperties.add("name");
            }
            if (!patternsFound) {
                missingProperties.add("patterns");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
