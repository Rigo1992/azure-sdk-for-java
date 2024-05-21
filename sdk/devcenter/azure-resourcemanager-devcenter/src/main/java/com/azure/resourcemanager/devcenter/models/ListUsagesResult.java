// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.devcenter.fluent.models.UsageInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of Core Usages.
 */
@Immutable
public final class ListUsagesResult {
    /*
     * The array page of Usages.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<UsageInner> value;

    /*
     * The link to get the next page of Usage result.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ListUsagesResult class.
     */
    public ListUsagesResult() {
    }

    /**
     * Get the value property: The array page of Usages.
     * 
     * @return the value value.
     */
    public List<UsageInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to get the next page of Usage result.
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
