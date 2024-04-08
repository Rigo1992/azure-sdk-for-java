// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import com.azure.core.util.BinaryData;

/**
 * The image can be either base64 encoded bytes or a blob URL. You can choose only one of these options. If both are
 * provided, the request will be refused. The maximum image size is 2048 x 2048 pixels and should not exceed 4 MB, while
 * the minimum image size is 50 x 50 pixels.
 */
@Fluent
public final class ContentSafetyImageData implements JsonSerializable<ContentSafetyImageData> {

    /*
     * The Base64 encoding of the image.
     */
    @Generated
    private byte[] content;

    /*
     * The blob url of the image.
     */
    @Generated
    private String blobUrl;

    /**
     * Creates an instance of ContentSafetyImageData class.
     */
    @Generated
    public ContentSafetyImageData() {
    }

    /**
     * Get the content property: The Base64 encoding of the image.
     *
     * @return the content value.
     */
    public BinaryData getContent() {
        return this.content == null ? null : BinaryData.fromBytes(this.content);
    }

    /**
     * Set the content property: The Base64 encoding of the image.
     *
     * @param content the content value to set.
     * @return the ContentSafetyImageData object itself.
     */
    public ContentSafetyImageData setContent(BinaryData content) {
        this.content = content == null ? null : content.toBytes();
        return this;
    }

    /**
     * Get the blobUrl property: The blob url of the image.
     *
     * @return the blobUrl value.
     */
    @Generated
    public String getBlobUrl() {
        return this.blobUrl;
    }

    /**
     * Set the blobUrl property: The blob url of the image.
     *
     * @param blobUrl the blobUrl value to set.
     * @return the ContentSafetyImageData object itself.
     */
    @Generated
    public ContentSafetyImageData setBlobUrl(String blobUrl) {
        this.blobUrl = blobUrl;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBinaryField("content", this.content);
        jsonWriter.writeStringField("blobUrl", this.blobUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContentSafetyImageData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContentSafetyImageData if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContentSafetyImageData.
     */
    @Generated
    public static ContentSafetyImageData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContentSafetyImageData deserializedContentSafetyImageData = new ContentSafetyImageData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("content".equals(fieldName)) {
                    deserializedContentSafetyImageData.content = reader.getBinary();
                } else if ("blobUrl".equals(fieldName)) {
                    deserializedContentSafetyImageData.blobUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedContentSafetyImageData;
        });
    }
}
