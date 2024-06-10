// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB options resource object.
 */
@Fluent
public class OptionsResource {
    /*
     * Value of the Cosmos DB resource throughput or autoscaleSettings. Use the ThroughputSetting resource when retrieving offer details.
     */
    @JsonProperty(value = "throughput")
    private Integer throughput;

    /*
     * Specifies the Autoscale settings.
     */
    @JsonProperty(value = "autoscaleSettings")
    private AutoscaleSettings autoscaleSettings;

    /**
     * Creates an instance of OptionsResource class.
     */
    public OptionsResource() {
    }

    /**
     * Get the throughput property: Value of the Cosmos DB resource throughput or autoscaleSettings. Use the
     * ThroughputSetting resource when retrieving offer details.
     * 
     * @return the throughput value.
     */
    public Integer throughput() {
        return this.throughput;
    }

    /**
     * Set the throughput property: Value of the Cosmos DB resource throughput or autoscaleSettings. Use the
     * ThroughputSetting resource when retrieving offer details.
     * 
     * @param throughput the throughput value to set.
     * @return the OptionsResource object itself.
     */
    public OptionsResource withThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * Get the autoscaleSettings property: Specifies the Autoscale settings.
     * 
     * @return the autoscaleSettings value.
     */
    public AutoscaleSettings autoscaleSettings() {
        return this.autoscaleSettings;
    }

    /**
     * Set the autoscaleSettings property: Specifies the Autoscale settings.
     * 
     * @param autoscaleSettings the autoscaleSettings value to set.
     * @return the OptionsResource object itself.
     */
    public OptionsResource withAutoscaleSettings(AutoscaleSettings autoscaleSettings) {
        this.autoscaleSettings = autoscaleSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoscaleSettings() != null) {
            autoscaleSettings().validate();
        }
    }
}
