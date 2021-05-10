/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Analyze batch operation result.
 */
public class AnalyzeResults {
    /**
     * Version of schema used for this result.
     */
    @JsonProperty(value = "version", required = true)
    private String version;

    /**
     * Version of the OCR model used for text extraction.
     */
    @JsonProperty(value = "modelVersion", required = true)
    private String modelVersion;

    /**
     * Text extracted from the input.
     */
    @JsonProperty(value = "readResults", required = true)
    private List<ReadResult> readResults;

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the AnalyzeResults object itself.
     */
    public AnalyzeResults withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the modelVersion value.
     *
     * @return the modelVersion value
     */
    public String modelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion value.
     *
     * @param modelVersion the modelVersion value to set
     * @return the AnalyzeResults object itself.
     */
    public AnalyzeResults withModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

    /**
     * Get the readResults value.
     *
     * @return the readResults value
     */
    public List<ReadResult> readResults() {
        return this.readResults;
    }

    /**
     * Set the readResults value.
     *
     * @param readResults the readResults value to set
     * @return the AnalyzeResults object itself.
     */
    public AnalyzeResults withReadResults(List<ReadResult> readResults) {
        this.readResults = readResults;
        return this;
    }

}
