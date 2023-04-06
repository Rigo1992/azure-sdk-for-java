// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List document models response object. */
@Fluent
public final class GetDocumentModelsResponse {
    /*
     * List of document models.
     */
    @JsonProperty(value = "value", required = true)
    private List<DocumentModelSummary> value;

    /*
     * Link to the next page of document models.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of GetDocumentModelsResponse class.
     *
     * @param value the value value to set.
     */
    @JsonCreator
    public GetDocumentModelsResponse(@JsonProperty(value = "value", required = true) List<DocumentModelSummary> value) {
        this.value = value;
    }

    /**
     * Get the value property: List of document models.
     *
     * @return the value value.
     */
    public List<DocumentModelSummary> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to the next page of document models.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next page of document models.
     *
     * @param nextLink the nextLink value to set.
     * @return the GetDocumentModelsResponse object itself.
     */
    public GetDocumentModelsResponse setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
