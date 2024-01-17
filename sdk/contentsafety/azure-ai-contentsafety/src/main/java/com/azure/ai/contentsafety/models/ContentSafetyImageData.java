// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.BinaryData;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The image can be either base64 encoded bytes or a blob URL. You can choose only one of these options. If both are
 * provided, the request will be refused. The maximum image size is 2048 x 2048 pixels and should not exceed 4 MB,
 * while the minimum image size is 50 x 50 pixels.
 */
@Fluent
public final class ContentSafetyImageData {

    /*
     * The Base64 encoding of the image.
     */
    @Generated
    @JsonProperty(value = "content")
    private byte[] content;

    /*
     * The blob url of the image.
     */
    @Generated
    @JsonProperty(value = "blobUrl")
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
}
