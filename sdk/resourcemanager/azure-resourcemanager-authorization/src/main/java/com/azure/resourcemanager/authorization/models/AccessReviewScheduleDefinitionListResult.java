// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.fluent.models.AccessReviewScheduleDefinitionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Access Review Schedule Definitions. */
@Fluent
public final class AccessReviewScheduleDefinitionListResult {
    /*
     * Access Review Schedule Definition list.
     */
    @JsonProperty(value = "value")
    private List<AccessReviewScheduleDefinitionInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of AccessReviewScheduleDefinitionListResult class. */
    public AccessReviewScheduleDefinitionListResult() {
    }

    /**
     * Get the value property: Access Review Schedule Definition list.
     *
     * @return the value value.
     */
    public List<AccessReviewScheduleDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Access Review Schedule Definition list.
     *
     * @param value the value value to set.
     * @return the AccessReviewScheduleDefinitionListResult object itself.
     */
    public AccessReviewScheduleDefinitionListResult withValue(List<AccessReviewScheduleDefinitionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the AccessReviewScheduleDefinitionListResult object itself.
     */
    public AccessReviewScheduleDefinitionListResult withNextLink(String nextLink) {
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
