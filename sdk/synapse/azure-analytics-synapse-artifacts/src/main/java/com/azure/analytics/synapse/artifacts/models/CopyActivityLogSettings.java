// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings for copy activity log. */
@Fluent
public final class CopyActivityLogSettings {
    /*
     * Gets or sets the log level, support: Info, Warning. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "logLevel")
    private Object logLevel;

    /*
     * Specifies whether to enable reliable logging. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "enableReliableLogging")
    private Object enableReliableLogging;

    /** Creates an instance of CopyActivityLogSettings class. */
    public CopyActivityLogSettings() {}

    /**
     * Get the logLevel property: Gets or sets the log level, support: Info, Warning. Type: string (or Expression with
     * resultType string).
     *
     * @return the logLevel value.
     */
    public Object getLogLevel() {
        return this.logLevel;
    }

    /**
     * Set the logLevel property: Gets or sets the log level, support: Info, Warning. Type: string (or Expression with
     * resultType string).
     *
     * @param logLevel the logLevel value to set.
     * @return the CopyActivityLogSettings object itself.
     */
    public CopyActivityLogSettings setLogLevel(Object logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * Get the enableReliableLogging property: Specifies whether to enable reliable logging. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the enableReliableLogging value.
     */
    public Object getEnableReliableLogging() {
        return this.enableReliableLogging;
    }

    /**
     * Set the enableReliableLogging property: Specifies whether to enable reliable logging. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param enableReliableLogging the enableReliableLogging value to set.
     * @return the CopyActivityLogSettings object itself.
     */
    public CopyActivityLogSettings setEnableReliableLogging(Object enableReliableLogging) {
        this.enableReliableLogging = enableReliableLogging;
        return this;
    }
}
