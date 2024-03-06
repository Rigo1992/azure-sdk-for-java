// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.ai.formrecognizer.models.TextStyleName;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An object representing the style of the text line.
 */
@Fluent
public final class Style implements JsonSerializable<Style> {
    /*
     * The text line style name, including handwriting and other.
     */
    private TextStyleName name;

    /*
     * The confidence of text line style.
     */
    private float confidence;

    /**
     * Creates an instance of Style class.
     */
    public Style() {
    }

    /**
     * Get the name property: The text line style name, including handwriting and other.
     * 
     * @return the name value.
     */
    public TextStyleName getName() {
        return this.name;
    }

    /**
     * Set the name property: The text line style name, including handwriting and other.
     * 
     * @param name the name value to set.
     * @return the Style object itself.
     */
    public Style setName(TextStyleName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the confidence property: The confidence of text line style.
     * 
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: The confidence of text line style.
     * 
     * @param confidence the confidence value to set.
     * @return the Style object itself.
     */
    public Style setConfidence(float confidence) {
        this.confidence = confidence;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name == null ? null : this.name.toString());
        jsonWriter.writeFloatField("confidence", this.confidence);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Style from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Style if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Style.
     */
    public static Style fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Style deserializedStyle = new Style();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedStyle.name = TextStyleName.fromString(reader.getString());
                } else if ("confidence".equals(fieldName)) {
                    deserializedStyle.confidence = reader.getFloat();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStyle;
        });
    }
}
