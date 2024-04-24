// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.fluent.models.EndpointInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list endpoints. It contains a list of endpoint objects and a URL link to get the next set
 * of results.
 */
@Fluent
public final class EndpointListResult {
    /*
     * List of CDN endpoints within a profile
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<EndpointInner> value;

    /*
     * URL to get the next set of endpoint objects if there is any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of EndpointListResult class.
     */
    public EndpointListResult() {
    }

    /**
     * Get the value property: List of CDN endpoints within a profile.
     * 
     * @return the value value.
     */
    public List<EndpointInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of endpoint objects if there is any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of endpoint objects if there is any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the EndpointListResult object itself.
     */
    public EndpointListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
