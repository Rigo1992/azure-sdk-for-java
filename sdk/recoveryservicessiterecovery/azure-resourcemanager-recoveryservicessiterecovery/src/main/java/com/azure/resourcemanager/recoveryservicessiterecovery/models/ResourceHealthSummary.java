// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Base class to define the health summary of the resources contained under an Arm resource.
 */
@Fluent
public final class ResourceHealthSummary {
    /*
     * The count of total resources under the container.
     */
    @JsonProperty(value = "resourceCount")
    private Integer resourceCount;

    /*
     * The list of summary of health errors across the resources under the container.
     */
    @JsonProperty(value = "issues")
    private List<HealthErrorSummary> issues;

    /*
     * The categorized resource counts.
     */
    @JsonProperty(value = "categorizedResourceCounts")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Integer> categorizedResourceCounts;

    /**
     * Creates an instance of ResourceHealthSummary class.
     */
    public ResourceHealthSummary() {
    }

    /**
     * Get the resourceCount property: The count of total resources under the container.
     * 
     * @return the resourceCount value.
     */
    public Integer resourceCount() {
        return this.resourceCount;
    }

    /**
     * Set the resourceCount property: The count of total resources under the container.
     * 
     * @param resourceCount the resourceCount value to set.
     * @return the ResourceHealthSummary object itself.
     */
    public ResourceHealthSummary withResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }

    /**
     * Get the issues property: The list of summary of health errors across the resources under the container.
     * 
     * @return the issues value.
     */
    public List<HealthErrorSummary> issues() {
        return this.issues;
    }

    /**
     * Set the issues property: The list of summary of health errors across the resources under the container.
     * 
     * @param issues the issues value to set.
     * @return the ResourceHealthSummary object itself.
     */
    public ResourceHealthSummary withIssues(List<HealthErrorSummary> issues) {
        this.issues = issues;
        return this;
    }

    /**
     * Get the categorizedResourceCounts property: The categorized resource counts.
     * 
     * @return the categorizedResourceCounts value.
     */
    public Map<String, Integer> categorizedResourceCounts() {
        return this.categorizedResourceCounts;
    }

    /**
     * Set the categorizedResourceCounts property: The categorized resource counts.
     * 
     * @param categorizedResourceCounts the categorizedResourceCounts value to set.
     * @return the ResourceHealthSummary object itself.
     */
    public ResourceHealthSummary withCategorizedResourceCounts(Map<String, Integer> categorizedResourceCounts) {
        this.categorizedResourceCounts = categorizedResourceCounts;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (issues() != null) {
            issues().forEach(e -> e.validate());
        }
    }
}
