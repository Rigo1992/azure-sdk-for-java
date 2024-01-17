// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.batch.fluent.models.ApplicationPackageInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The result of performing list application packages.
 */
@Fluent
public final class ListApplicationPackagesResult {
    /*
     * The list of application packages.
     */
    @JsonProperty(value = "value")
    private List<ApplicationPackageInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ListApplicationPackagesResult class.
     */
    public ListApplicationPackagesResult() {
    }

    /**
     * Get the value property: The list of application packages.
     * 
     * @return the value value.
     */
    public List<ApplicationPackageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of application packages.
     * 
     * @param value the value value to set.
     * @return the ListApplicationPackagesResult object itself.
     */
    public ListApplicationPackagesResult withValue(List<ApplicationPackageInner> value) {
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
     * Set the nextLink property: The URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListApplicationPackagesResult object itself.
     */
    public ListApplicationPackagesResult withNextLink(String nextLink) {
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
