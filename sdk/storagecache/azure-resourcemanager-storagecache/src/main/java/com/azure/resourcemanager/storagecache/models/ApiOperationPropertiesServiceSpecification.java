// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Specification of the all the metrics provided for a resource type.
 */
@Fluent
public final class ApiOperationPropertiesServiceSpecification {
    /*
     * Details about operations related to metrics.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecification> metricSpecifications;

    /*
     * Details about operations related to logs.
     */
    @JsonProperty(value = "logSpecifications")
    private List<LogSpecification> logSpecifications;

    /**
     * Creates an instance of ApiOperationPropertiesServiceSpecification class.
     */
    public ApiOperationPropertiesServiceSpecification() {
    }

    /**
     * Get the metricSpecifications property: Details about operations related to metrics.
     * 
     * @return the metricSpecifications value.
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: Details about operations related to metrics.
     * 
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the ApiOperationPropertiesServiceSpecification object itself.
     */
    public ApiOperationPropertiesServiceSpecification
        withMetricSpecifications(List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Get the logSpecifications property: Details about operations related to logs.
     * 
     * @return the logSpecifications value.
     */
    public List<LogSpecification> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: Details about operations related to logs.
     * 
     * @param logSpecifications the logSpecifications value to set.
     * @return the ApiOperationPropertiesServiceSpecification object itself.
     */
    public ApiOperationPropertiesServiceSpecification withLogSpecifications(List<LogSpecification> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
    }
}
