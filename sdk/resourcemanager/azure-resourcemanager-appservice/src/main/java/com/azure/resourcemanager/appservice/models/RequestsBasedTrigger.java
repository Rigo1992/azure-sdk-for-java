// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Trigger based on total requests.
 */
@Fluent
public final class RequestsBasedTrigger {
    /*
     * Request Count.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * Time interval.
     */
    @JsonProperty(value = "timeInterval")
    private String timeInterval;

    /**
     * Creates an instance of RequestsBasedTrigger class.
     */
    public RequestsBasedTrigger() {
    }

    /**
     * Get the count property: Request Count.
     * 
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Request Count.
     * 
     * @param count the count value to set.
     * @return the RequestsBasedTrigger object itself.
     */
    public RequestsBasedTrigger withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the timeInterval property: Time interval.
     * 
     * @return the timeInterval value.
     */
    public String timeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval property: Time interval.
     * 
     * @param timeInterval the timeInterval value to set.
     * @return the RequestsBasedTrigger object itself.
     */
    public RequestsBasedTrigger withTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
