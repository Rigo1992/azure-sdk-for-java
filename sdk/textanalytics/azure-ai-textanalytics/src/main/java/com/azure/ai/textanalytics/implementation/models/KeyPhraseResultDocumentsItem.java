// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The KeyPhraseResultDocumentsItem model. */
@Fluent
public final class KeyPhraseResultDocumentsItem extends KeyPhrasesDocumentResult {
    /*
     * If 'language' is set to 'auto' for the document in the request this field will contain a 2 letter ISO 639-1
     * representation of the language detected for this document.
     */
    @JsonProperty(value = "detectedLanguage")
    private DetectedLanguage detectedLanguage;

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
     * @return the KeyPhraseResultDocumentsItem object itself.
     */
    public KeyPhraseResultDocumentsItem setDetectedLanguage(DetectedLanguage detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyPhraseResultDocumentsItem setKeyPhrases(List<String> keyPhrases) {
        super.setKeyPhrases(keyPhrases);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyPhraseResultDocumentsItem setId(String id) {
        super.setId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyPhraseResultDocumentsItem setWarnings(List<DocumentWarning> warnings) {
        super.setWarnings(warnings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyPhraseResultDocumentsItem setStatistics(DocumentStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }
}
