// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object representing a figure in the document. */
@Immutable
public final class DocumentFigure {
    /*
     * Bounding regions covering the figure.
     */
    @Generated
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the figure in the reading order concatenated content.
     */
    @Generated
    @JsonProperty(value = "spans")
    private List<DocumentSpan> spans;

    /*
     * Child elements of the figure, excluding any caption or footnotes.
     */
    @Generated
    @JsonProperty(value = "elements")
    private List<String> elements;

    /*
     * Caption associated with the figure.
     */
    @Generated
    @JsonProperty(value = "caption")
    private DocumentCaption caption;

    /*
     * List of footnotes associated with the figure.
     */
    @Generated
    @JsonProperty(value = "footnotes")
    private List<DocumentFootnote> footnotes;

    /**
     * Creates an instance of DocumentFigure class.
     *
     * @param spans the spans value to set.
     */
    @Generated
    @JsonCreator
    private DocumentFigure(@JsonProperty(value = "spans") List<DocumentSpan> spans) {
        this.spans = spans;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the figure.
     *
     * @return the boundingRegions value.
     */
    @Generated
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Get the spans property: Location of the figure in the reading order concatenated content.
     *
     * @return the spans value.
     */
    @Generated
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Get the elements property: Child elements of the figure, excluding any caption or footnotes.
     *
     * @return the elements value.
     */
    @Generated
    public List<String> getElements() {
        return this.elements;
    }

    /**
     * Get the caption property: Caption associated with the figure.
     *
     * @return the caption value.
     */
    @Generated
    public DocumentCaption getCaption() {
        return this.caption;
    }

    /**
     * Get the footnotes property: List of footnotes associated with the figure.
     *
     * @return the footnotes value.
     */
    @Generated
    public List<DocumentFootnote> getFootnotes() {
        return this.footnotes;
    }
}
