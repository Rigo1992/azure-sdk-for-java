// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentDetectedLanguage model. */
@Fluent
public class DocumentDetectedLanguage {
    /*
     * If 'language' is set to 'auto' for the document in the request this field will contain a 2 letter ISO 639-1
     * representation of the language detected for this document.
     */
    @JsonProperty(value = "detectedLanguage")
    private DetectedLanguage detectedLanguage;

    /** Creates an instance of DocumentDetectedLanguage class. */
    public DocumentDetectedLanguage() {}

    /**
     * Get the detectedLanguage property: If 'language' is set to 'auto' for the document in the request this field will
     * contain a 2 letter ISO 639-1 representation of the language detected for this document.
     *
     * @return the detectedLanguage value.
     */
    public DetectedLanguage getDetectedLanguage() {
        return this.detectedLanguage;
    }

    /**
     * Set the detectedLanguage property: If 'language' is set to 'auto' for the document in the request this field will
     * contain a 2 letter ISO 639-1 representation of the language detected for this document.
     *
     * @param detectedLanguage the detectedLanguage value to set.
     * @return the DocumentDetectedLanguage object itself.
     */
    public DocumentDetectedLanguage setDetectedLanguage(DetectedLanguage detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
        return this;
    }
}
