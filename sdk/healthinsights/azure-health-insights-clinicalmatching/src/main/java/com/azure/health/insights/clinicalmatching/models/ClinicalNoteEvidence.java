// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.clinicalmatching.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A piece of evidence from a clinical note (text document). */
@Immutable
public final class ClinicalNoteEvidence {
    /*
     * The identifier of the document containing the evidence.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The actual text span which is evidence for the inference.
     */
    @JsonProperty(value = "text")
    private String text;

    /*
     * The start index of the evidence text span in the document (0 based).
     */
    @JsonProperty(value = "offset", required = true)
    private int offset;

    /*
     * The length of the evidence text span.
     */
    @JsonProperty(value = "length", required = true)
    private int length;

    /**
     * Creates an instance of ClinicalNoteEvidence class.
     *
     * @param id the id value to set.
     * @param offset the offset value to set.
     * @param length the length value to set.
     */
    @JsonCreator
    private ClinicalNoteEvidence(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "offset", required = true) int offset,
            @JsonProperty(value = "length", required = true) int length) {
        this.id = id;
        this.offset = offset;
        this.length = length;
    }

    /**
     * Get the id property: The identifier of the document containing the evidence.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the text property: The actual text span which is evidence for the inference.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the offset property: The start index of the evidence text span in the document (0 based).
     *
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Get the length property: The length of the evidence text span.
     *
     * @return the length value.
     */
    public int getLength() {
        return this.length;
    }
}
