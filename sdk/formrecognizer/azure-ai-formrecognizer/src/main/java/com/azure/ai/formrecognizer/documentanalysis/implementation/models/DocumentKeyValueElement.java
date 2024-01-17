// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing the field key or value in a key-value pair.
 */
@Fluent
public final class DocumentKeyValueElement implements JsonSerializable<DocumentKeyValueElement> {
    /*
     * Concatenated content of the key-value element in reading order.
     */
    private final String content;

    /*
     * Bounding regions covering the key-value element.
     */
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the key-value element in the reading order concatenated content.
     */
    private final List<DocumentSpan> spans;

    /**
     * Creates an instance of DocumentKeyValueElement class.
     * 
     * @param content the content value to set.
     * @param spans the spans value to set.
     */
    public DocumentKeyValueElement(String content, List<DocumentSpan> spans) {
        this.content = content;
        this.spans = spans;
    }

    /**
     * Get the content property: Concatenated content of the key-value element in reading order.
     * 
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the key-value element.
     * 
     * @return the boundingRegions value.
     */
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Set the boundingRegions property: Bounding regions covering the key-value element.
     * 
     * @param boundingRegions the boundingRegions value to set.
     * @return the DocumentKeyValueElement object itself.
     */
    public DocumentKeyValueElement setBoundingRegions(List<BoundingRegion> boundingRegions) {
        this.boundingRegions = boundingRegions;
        return this;
    }

    /**
     * Get the spans property: Location of the key-value element in the reading order concatenated content.
     * 
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeArrayField("spans", this.spans, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("boundingRegions", this.boundingRegions,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DocumentKeyValueElement from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DocumentKeyValueElement if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DocumentKeyValueElement.
     */
    public static DocumentKeyValueElement fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean contentFound = false;
            String content = null;
            boolean spansFound = false;
            List<DocumentSpan> spans = null;
            List<BoundingRegion> boundingRegions = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("content".equals(fieldName)) {
                    content = reader.getString();
                    contentFound = true;
                } else if ("spans".equals(fieldName)) {
                    spans = reader.readArray(reader1 -> DocumentSpan.fromJson(reader1));
                    spansFound = true;
                } else if ("boundingRegions".equals(fieldName)) {
                    boundingRegions = reader.readArray(reader1 -> BoundingRegion.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            if (contentFound && spansFound) {
                DocumentKeyValueElement deserializedDocumentKeyValueElement
                    = new DocumentKeyValueElement(content, spans);
                deserializedDocumentKeyValueElement.boundingRegions = boundingRegions;

                return deserializedDocumentKeyValueElement;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!contentFound) {
                missingProperties.add("content");
            }
            if (!spansFound) {
                missingProperties.add("spans");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
