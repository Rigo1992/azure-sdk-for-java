/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The performance counter info.
 */
public class EventsPerformanceCounterInfo {
    /**
     * The value of the performance counter.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * The name of the performance counter.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The category of the performance counter.
     */
    @JsonProperty(value = "category")
    private String category;

    /**
     * The counter of the performance counter.
     */
    @JsonProperty(value = "counter")
    private String counter;

    /**
     * The instance name of the performance counter.
     */
    @JsonProperty(value = "instanceName")
    private String instanceName;

    /**
     * The instance of the performance counter.
     */
    @JsonProperty(value = "instance")
    private String instance;

    /**
     * Get the value of the performance counter.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the value of the performance counter.
     *
     * @param value the value value to set
     * @return the EventsPerformanceCounterInfo object itself.
     */
    public EventsPerformanceCounterInfo withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Get the name of the performance counter.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the performance counter.
     *
     * @param name the name value to set
     * @return the EventsPerformanceCounterInfo object itself.
     */
    public EventsPerformanceCounterInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the category of the performance counter.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category of the performance counter.
     *
     * @param category the category value to set
     * @return the EventsPerformanceCounterInfo object itself.
     */
    public EventsPerformanceCounterInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the counter of the performance counter.
     *
     * @return the counter value
     */
    public String counter() {
        return this.counter;
    }

    /**
     * Set the counter of the performance counter.
     *
     * @param counter the counter value to set
     * @return the EventsPerformanceCounterInfo object itself.
     */
    public EventsPerformanceCounterInfo withCounter(String counter) {
        this.counter = counter;
        return this;
    }

    /**
     * Get the instance name of the performance counter.
     *
     * @return the instanceName value
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Set the instance name of the performance counter.
     *
     * @param instanceName the instanceName value to set
     * @return the EventsPerformanceCounterInfo object itself.
     */
    public EventsPerformanceCounterInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * Get the instance of the performance counter.
     *
     * @return the instance value
     */
    public String instance() {
        return this.instance;
    }

    /**
     * Set the instance of the performance counter.
     *
     * @param instance the instance value to set
     * @return the EventsPerformanceCounterInfo object itself.
     */
    public EventsPerformanceCounterInfo withInstance(String instance) {
        this.instance = instance;
        return this;
    }

}
