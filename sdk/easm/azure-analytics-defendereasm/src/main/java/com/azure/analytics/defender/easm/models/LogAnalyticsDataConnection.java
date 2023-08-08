// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The LogAnalyticsDataConnection model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("logAnalytics")
@Immutable
public final class LogAnalyticsDataConnection extends DataConnection {
    /*
     * properties
     */
    @Generated
    @JsonProperty(value = "properties")
    private LogAnalyticsDataConnectionProperties properties;

    /**
     * Creates an instance of LogAnalyticsDataConnection class.
     *
     * @param properties the properties value to set.
     */
    @Generated
    @JsonCreator
    private LogAnalyticsDataConnection(
            @JsonProperty(value = "properties") LogAnalyticsDataConnectionProperties properties) {
        this.properties = properties;
    }

    /**
     * Get the properties property: properties.
     *
     * @return the properties value.
     */
    @Generated
    public LogAnalyticsDataConnectionProperties getProperties() {
        return this.properties;
    }
}
