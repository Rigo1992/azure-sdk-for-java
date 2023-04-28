// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.fluent.models.AutoscaleSettingResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Represents a collection of autoscale setting resources.
 */
@Fluent
public final class AutoscaleSettingResourceCollection {
    /*
     * the values for the autoscale setting resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<AutoscaleSettingResourceInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of AutoscaleSettingResourceCollection class.
     */
    public AutoscaleSettingResourceCollection() {
    }

    /**
     * Get the value property: the values for the autoscale setting resources.
     *
     * @return the value value.
     */
    public List<AutoscaleSettingResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the values for the autoscale setting resources.
     *
     * @param value the value value to set.
     * @return the AutoscaleSettingResourceCollection object itself.
     */
    public AutoscaleSettingResourceCollection withValue(List<AutoscaleSettingResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the AutoscaleSettingResourceCollection object itself.
     */
    public AutoscaleSettingResourceCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("Missing required property value in model AutoscaleSettingResourceCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutoscaleSettingResourceCollection.class);
}
