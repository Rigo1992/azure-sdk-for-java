// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/**
 * A rule condition based on a certain number of locations failing.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Microsoft.Azure.Management.Insights.Models.LocationThresholdRuleCondition")
@Fluent
public final class LocationThresholdRuleCondition extends RuleCondition {
    /*
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold.
     * If specified then it must be between 5 minutes and 1 day.
     */
    @JsonProperty(value = "windowSize")
    private Duration windowSize;

    /*
     * the number of locations that must fail to activate the alert.
     */
    @JsonProperty(value = "failedLocationCount", required = true)
    private int failedLocationCount;

    /**
     * Creates an instance of LocationThresholdRuleCondition class.
     */
    public LocationThresholdRuleCondition() {
    }

    /**
     * Get the windowSize property: the period of time (in ISO 8601 duration format) that is used to monitor alert
     * activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     * @return the windowSize value.
     */
    public Duration windowSize() {
        return this.windowSize;
    }

    /**
     * Set the windowSize property: the period of time (in ISO 8601 duration format) that is used to monitor alert
     * activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     * @param windowSize the windowSize value to set.
     * @return the LocationThresholdRuleCondition object itself.
     */
    public LocationThresholdRuleCondition withWindowSize(Duration windowSize) {
        this.windowSize = windowSize;
        return this;
    }

    /**
     * Get the failedLocationCount property: the number of locations that must fail to activate the alert.
     * 
     * @return the failedLocationCount value.
     */
    public int failedLocationCount() {
        return this.failedLocationCount;
    }

    /**
     * Set the failedLocationCount property: the number of locations that must fail to activate the alert.
     * 
     * @param failedLocationCount the failedLocationCount value to set.
     * @return the LocationThresholdRuleCondition object itself.
     */
    public LocationThresholdRuleCondition withFailedLocationCount(int failedLocationCount) {
        this.failedLocationCount = failedLocationCount;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationThresholdRuleCondition withDataSource(RuleDataSource dataSource) {
        super.withDataSource(dataSource);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
