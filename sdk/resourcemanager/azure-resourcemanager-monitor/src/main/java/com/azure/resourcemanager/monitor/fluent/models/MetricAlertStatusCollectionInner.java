// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.models.MetricAlertStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents a collection of alert rule resources.
 */
@Fluent
public final class MetricAlertStatusCollectionInner {
    /*
     * the values for the alert rule resources.
     */
    @JsonProperty(value = "value")
    private List<MetricAlertStatus> value;

    /**
     * Creates an instance of MetricAlertStatusCollectionInner class.
     */
    public MetricAlertStatusCollectionInner() {
    }

    /**
     * Get the value property: the values for the alert rule resources.
     *
     * @return the value value.
     */
    public List<MetricAlertStatus> value() {
        return this.value;
    }

    /**
     * Set the value property: the values for the alert rule resources.
     *
     * @param value the value value to set.
     * @return the MetricAlertStatusCollectionInner object itself.
     */
    public MetricAlertStatusCollectionInner withValue(List<MetricAlertStatus> value) {
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
