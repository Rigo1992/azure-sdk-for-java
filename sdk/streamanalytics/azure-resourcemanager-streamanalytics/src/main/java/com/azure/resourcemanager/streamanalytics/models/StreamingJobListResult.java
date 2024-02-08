// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.streamanalytics.fluent.models.StreamingJobInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Object containing a list of streaming jobs.
 */
@Immutable
public final class StreamingJobListResult {
    /*
     * A list of streaming jobs. Populated by a 'List' operation.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<StreamingJobInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of StreamingJobListResult class.
     */
    public StreamingJobListResult() {
    }

    /**
     * Get the value property: A list of streaming jobs. Populated by a 'List' operation.
     * 
     * @return the value value.
     */
    public List<StreamingJobInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
