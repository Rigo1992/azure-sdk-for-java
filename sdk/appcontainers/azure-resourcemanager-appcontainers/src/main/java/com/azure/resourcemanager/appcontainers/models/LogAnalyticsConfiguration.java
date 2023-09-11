// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Log Analytics configuration, must only be provided when destination is configured as 'log-analytics'. */
@Fluent
public final class LogAnalyticsConfiguration {
    /*
     * Log analytics customer id
     */
    @JsonProperty(value = "customerId")
    private String customerId;

    /*
     * Log analytics customer key
     */
    @JsonProperty(value = "sharedKey")
    private String sharedKey;

    /** Creates an instance of LogAnalyticsConfiguration class. */
    public LogAnalyticsConfiguration() {
    }

    /**
     * Get the customerId property: Log analytics customer id.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Set the customerId property: Log analytics customer id.
     *
     * @param customerId the customerId value to set.
     * @return the LogAnalyticsConfiguration object itself.
     */
    public LogAnalyticsConfiguration withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Get the sharedKey property: Log analytics customer key.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: Log analytics customer key.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the LogAnalyticsConfiguration object itself.
     */
    public LogAnalyticsConfiguration withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
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
