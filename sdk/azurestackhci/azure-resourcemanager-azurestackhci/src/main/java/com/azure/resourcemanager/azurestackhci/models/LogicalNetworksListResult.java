// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurestackhci.fluent.models.LogicalNetworksInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LogicalNetworksListResult model. */
@Fluent
public final class LogicalNetworksListResult {
    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<LogicalNetworksInner> value;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of LogicalNetworksListResult class. */
    public LogicalNetworksListResult() {
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<LogicalNetworksInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the LogicalNetworksListResult object itself.
     */
    public LogicalNetworksListResult withValue(List<LogicalNetworksInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     *
     * @param nextLink the nextLink value to set.
     * @return the LogicalNetworksListResult object itself.
     */
    public LogicalNetworksListResult withNextLink(String nextLink) {
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
