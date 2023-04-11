// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ThrottlingRule model. */
@Fluent
public final class ThrottlingRule {
    /*
     * The action property.
     */
    @JsonProperty(value = "action", required = true)
    private String action;

    /*
     * The metrics property.
     */
    @JsonProperty(value = "metrics", required = true)
    private List<ThrottlingMetric> metrics;

    /*
     * The requiredFeatures property.
     */
    @JsonProperty(value = "requiredFeatures")
    private List<String> requiredFeatures;

    /** Creates an instance of ThrottlingRule class. */
    public ThrottlingRule() {
    }

    /**
     * Get the action property: The action property.
     *
     * @return the action value.
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the action property: The action property.
     *
     * @param action the action value to set.
     * @return the ThrottlingRule object itself.
     */
    public ThrottlingRule withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the metrics property: The metrics property.
     *
     * @return the metrics value.
     */
    public List<ThrottlingMetric> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: The metrics property.
     *
     * @param metrics the metrics value to set.
     * @return the ThrottlingRule object itself.
     */
    public ThrottlingRule withMetrics(List<ThrottlingMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the requiredFeatures property: The requiredFeatures property.
     *
     * @return the requiredFeatures value.
     */
    public List<String> requiredFeatures() {
        return this.requiredFeatures;
    }

    /**
     * Set the requiredFeatures property: The requiredFeatures property.
     *
     * @param requiredFeatures the requiredFeatures value to set.
     * @return the ThrottlingRule object itself.
     */
    public ThrottlingRule withRequiredFeatures(List<String> requiredFeatures) {
        this.requiredFeatures = requiredFeatures;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (action() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property action in model ThrottlingRule"));
        }
        if (metrics() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property metrics in model ThrottlingRule"));
        } else {
            metrics().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ThrottlingRule.class);
}
