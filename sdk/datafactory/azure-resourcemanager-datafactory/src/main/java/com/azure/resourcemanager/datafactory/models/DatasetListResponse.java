// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.DatasetResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of dataset resources.
 */
@Fluent
public final class DatasetListResponse {
    /*
     * List of datasets.
     */
    @JsonProperty(value = "value", required = true)
    private List<DatasetResourceInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of DatasetListResponse class.
     */
    public DatasetListResponse() {
    }

    /**
     * Get the value property: List of datasets.
     * 
     * @return the value value.
     */
    public List<DatasetResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of datasets.
     * 
     * @param value the value value to set.
     * @return the DatasetListResponse object itself.
     */
    public DatasetListResponse withValue(List<DatasetResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @param nextLink the nextLink value to set.
     * @return the DatasetListResponse object itself.
     */
    public DatasetListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model DatasetListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatasetListResponse.class);
}
