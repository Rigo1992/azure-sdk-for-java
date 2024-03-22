// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.support.fluent.models.ProblemClassificationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Collection of ProblemClassification resources.
 */
@Fluent
public final class ProblemClassificationsListResult {
    /*
     * List of ProblemClassification resources.
     */
    @JsonProperty(value = "value")
    private List<ProblemClassificationInner> value;

    /**
     * Creates an instance of ProblemClassificationsListResult class.
     */
    public ProblemClassificationsListResult() {
    }

    /**
     * Get the value property: List of ProblemClassification resources.
     * 
     * @return the value value.
     */
    public List<ProblemClassificationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of ProblemClassification resources.
     * 
     * @param value the value value to set.
     * @return the ProblemClassificationsListResult object itself.
     */
    public ProblemClassificationsListResult withValue(List<ProblemClassificationInner> value) {
        this.value = value;
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
