// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.VirtualEndpointResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of virtual endpoints. */
@Fluent
public final class VirtualEndpointsListResult {
    /*
     * The list of virtual endpoints
     */
    @JsonProperty(value = "value")
    private List<VirtualEndpointResourceInner> value;

    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of VirtualEndpointsListResult class. */
    public VirtualEndpointsListResult() {
    }

    /**
     * Get the value property: The list of virtual endpoints.
     *
     * @return the value value.
     */
    public List<VirtualEndpointResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of virtual endpoints.
     *
     * @param value the value value to set.
     * @return the VirtualEndpointsListResult object itself.
     */
    public VirtualEndpointsListResult withValue(List<VirtualEndpointResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualEndpointsListResult object itself.
     */
    public VirtualEndpointsListResult withNextLink(String nextLink) {
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
