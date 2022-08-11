// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for list SIM IDs API service call. */
@Fluent
public final class SimIdListResultInner {
    /*
     * A list of SIM IDs.
     */
    @JsonProperty(value = "value")
    private List<SubResource> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of SIM IDs.
     *
     * @return the value value.
     */
    public List<SubResource> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of SIM IDs.
     *
     * @param value the value value to set.
     * @return the SimIdListResultInner object itself.
     */
    public SimIdListResultInner withValue(List<SubResource> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
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
    }
}
