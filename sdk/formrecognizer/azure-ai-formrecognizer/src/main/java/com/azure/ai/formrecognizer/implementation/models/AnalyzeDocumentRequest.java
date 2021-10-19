// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Document analysis parameters. */
@Fluent
public final class AnalyzeDocumentRequest {
    /*
     * Document URL to analyze
     */
    @JsonProperty(value = "urlSource")
    private String urlSource;

    /*
     * Base64 encoding of the document to analyze
     */
    @JsonProperty(value = "base64Source")
    private byte[] base64Source;

    /**
     * Get the urlSource property: Document URL to analyze.
     *
     * @return the urlSource value.
     */
    public String getUrlSource() {
        return this.urlSource;
    }

    /**
     * Set the urlSource property: Document URL to analyze.
     *
     * @param urlSource the urlSource value to set.
     * @return the AnalyzeDocumentRequest object itself.
     */
    public AnalyzeDocumentRequest setUrlSource(String urlSource) {
        this.urlSource = urlSource;
        return this;
    }

    /**
     * Get the base64Source property: Base64 encoding of the document to analyze.
     *
     * @return the base64Source value.
     */
    public byte[] getBase64Source() {
        return CoreUtils.clone(this.base64Source);
    }

    /**
     * Set the base64Source property: Base64 encoding of the document to analyze.
     *
     * @param base64Source the base64Source value to set.
     * @return the AnalyzeDocumentRequest object itself.
     */
    public AnalyzeDocumentRequest setBase64Source(byte[] base64Source) {
        this.base64Source = CoreUtils.clone(base64Source);
        return this;
    }
}
