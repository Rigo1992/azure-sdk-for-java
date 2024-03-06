// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for DocumentAnalysisFeature.
 */
public final class DocumentAnalysisFeature extends ExpandableStringEnum<DocumentAnalysisFeature> {
    /**
     * Perform OCR at a higher resolution to handle documents with fine print.
     */
    public static final DocumentAnalysisFeature OCR_HIGH_RESOLUTION = fromString("ocrHighResolution");

    /**
     * Enable the detection of the text content language.
     */
    public static final DocumentAnalysisFeature LANGUAGES = fromString("languages");

    /**
     * Enable the detection of barcodes in the document.
     */
    public static final DocumentAnalysisFeature BARCODES = fromString("barcodes");

    /**
     * Enable the detection of mathematical expressions in the document.
     */
    public static final DocumentAnalysisFeature FORMULAS = fromString("formulas");

    /**
     * Enable the detection of general key value pairs (form fields) in the document.
     */
    public static final DocumentAnalysisFeature KEY_VALUE_PAIRS = fromString("keyValuePairs");

    /**
     * Enable the recognition of various font styles.
     */
    public static final DocumentAnalysisFeature STYLE_FONT = fromString("styleFont");

    /**
     * Creates a new instance of DocumentAnalysisFeature value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DocumentAnalysisFeature() {
    }

    /**
     * Creates or finds a DocumentAnalysisFeature from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DocumentAnalysisFeature.
     */
    public static DocumentAnalysisFeature fromString(String name) {
        return fromString(name, DocumentAnalysisFeature.class);
    }

    /**
     * Gets known DocumentAnalysisFeature values.
     * 
     * @return known DocumentAnalysisFeature values.
     */
    public static Collection<DocumentAnalysisFeature> values() {
        return values(DocumentAnalysisFeature.class);
    }
}
