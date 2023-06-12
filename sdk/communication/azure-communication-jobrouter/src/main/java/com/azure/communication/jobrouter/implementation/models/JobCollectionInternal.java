// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A paged collection of jobs. */
@Immutable
public final class JobCollectionInternal {
    /*
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private List<RouterJobItemInternal> value;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of JobCollectionInternal class.
     *
     * @param value the value value to set.
     */
    @JsonCreator
    public JobCollectionInternal(@JsonProperty(value = "value", required = true) List<RouterJobItemInternal> value) {
        this.value = value;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<RouterJobItemInternal> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: The nextLink property.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
