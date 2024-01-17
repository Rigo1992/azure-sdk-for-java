// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list pipeline runs.
 */
@Fluent
public final class PipelineRunsQueryResponseInner {
    /*
     * List of pipeline runs.
     */
    @JsonProperty(value = "value", required = true)
    private List<PipelineRunInner> value;

    /*
     * The continuation token for getting the next page of results, if any remaining results exist, null otherwise.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /**
     * Creates an instance of PipelineRunsQueryResponseInner class.
     */
    public PipelineRunsQueryResponseInner() {
    }

    /**
     * Get the value property: List of pipeline runs.
     * 
     * @return the value value.
     */
    public List<PipelineRunInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of pipeline runs.
     * 
     * @param value the value value to set.
     * @return the PipelineRunsQueryResponseInner object itself.
     */
    public PipelineRunsQueryResponseInner withValue(List<PipelineRunInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the continuationToken property: The continuation token for getting the next page of results, if any
     * remaining results exist, null otherwise.
     * 
     * @return the continuationToken value.
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken property: The continuation token for getting the next page of results, if any
     * remaining results exist, null otherwise.
     * 
     * @param continuationToken the continuationToken value to set.
     * @return the PipelineRunsQueryResponseInner object itself.
     */
    public PipelineRunsQueryResponseInner withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property value in model PipelineRunsQueryResponseInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PipelineRunsQueryResponseInner.class);
}
