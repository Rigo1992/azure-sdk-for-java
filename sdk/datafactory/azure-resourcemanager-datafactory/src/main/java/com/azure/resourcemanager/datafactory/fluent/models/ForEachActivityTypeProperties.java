// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * ForEach activity properties.
 */
@Fluent
public final class ForEachActivityTypeProperties {
    /*
     * Should the loop be executed in sequence or in parallel (max 50)
     */
    @JsonProperty(value = "isSequential")
    private Boolean isSequential;

    /*
     * Batch count to be used for controlling the number of parallel execution (when isSequential is set to false).
     */
    @JsonProperty(value = "batchCount")
    private Integer batchCount;

    /*
     * Collection to iterate.
     */
    @JsonProperty(value = "items", required = true)
    private Expression items;

    /*
     * List of activities to execute .
     */
    @JsonProperty(value = "activities", required = true)
    private List<Activity> activities;

    /**
     * Creates an instance of ForEachActivityTypeProperties class.
     */
    public ForEachActivityTypeProperties() {
    }

    /**
     * Get the isSequential property: Should the loop be executed in sequence or in parallel (max 50).
     * 
     * @return the isSequential value.
     */
    public Boolean isSequential() {
        return this.isSequential;
    }

    /**
     * Set the isSequential property: Should the loop be executed in sequence or in parallel (max 50).
     * 
     * @param isSequential the isSequential value to set.
     * @return the ForEachActivityTypeProperties object itself.
     */
    public ForEachActivityTypeProperties withIsSequential(Boolean isSequential) {
        this.isSequential = isSequential;
        return this;
    }

    /**
     * Get the batchCount property: Batch count to be used for controlling the number of parallel execution (when
     * isSequential is set to false).
     * 
     * @return the batchCount value.
     */
    public Integer batchCount() {
        return this.batchCount;
    }

    /**
     * Set the batchCount property: Batch count to be used for controlling the number of parallel execution (when
     * isSequential is set to false).
     * 
     * @param batchCount the batchCount value to set.
     * @return the ForEachActivityTypeProperties object itself.
     */
    public ForEachActivityTypeProperties withBatchCount(Integer batchCount) {
        this.batchCount = batchCount;
        return this;
    }

    /**
     * Get the items property: Collection to iterate.
     * 
     * @return the items value.
     */
    public Expression items() {
        return this.items;
    }

    /**
     * Set the items property: Collection to iterate.
     * 
     * @param items the items value to set.
     * @return the ForEachActivityTypeProperties object itself.
     */
    public ForEachActivityTypeProperties withItems(Expression items) {
        this.items = items;
        return this;
    }

    /**
     * Get the activities property: List of activities to execute .
     * 
     * @return the activities value.
     */
    public List<Activity> activities() {
        return this.activities;
    }

    /**
     * Set the activities property: List of activities to execute .
     * 
     * @param activities the activities value to set.
     * @return the ForEachActivityTypeProperties object itself.
     */
    public ForEachActivityTypeProperties withActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (items() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property items in model ForEachActivityTypeProperties"));
        } else {
            items().validate();
        }
        if (activities() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property activities in model ForEachActivityTypeProperties"));
        } else {
            activities().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ForEachActivityTypeProperties.class);
}
