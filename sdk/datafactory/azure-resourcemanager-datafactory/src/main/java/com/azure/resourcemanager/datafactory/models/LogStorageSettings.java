// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * (Deprecated. Please use LogSettings) Log storage settings.
 */
@Fluent
public final class LogStorageSettings {
    /*
     * Log storage linked service reference.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /*
     * The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "path")
    private Object path;

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

    /*
     * (Deprecated. Please use LogSettings) Log storage settings.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of LogStorageSettings class.
     */
    public LogStorageSettings() {
    }

    /**
     * Get the linkedServiceName property: Log storage linked service reference.
     * 
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set the linkedServiceName property: Log storage linked service reference.
     * 
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the LogStorageSettings object itself.
     */
    public LogStorageSettings withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

    /**
     * Get the path property: The path to storage for storing detailed logs of activity execution. Type: string (or
     * Expression with resultType string).
     * 
     * @return the path value.
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the path property: The path to storage for storing detailed logs of activity execution. Type: string (or
     * Expression with resultType string).
     * 
     * @param path the path value to set.
     * @return the LogStorageSettings object itself.
     */
    public LogStorageSettings withPath(Object path) {
        this.path = path;
        return this;
    }

    /**
     * Get the logLevel property: Gets or sets the log level, support: Info, Warning. Type: string (or Expression with
     * resultType string).
     * 
     * @return the logLevel value.
     */
    public Object logLevel() {
        return this.logLevel;
    }

    /**
     * Set the logLevel property: Gets or sets the log level, support: Info, Warning. Type: string (or Expression with
     * resultType string).
     * 
     * @param logLevel the logLevel value to set.
     * @return the LogStorageSettings object itself.
     */
    public LogStorageSettings withLogLevel(Object logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * Get the enableReliableLogging property: Specifies whether to enable reliable logging. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the enableReliableLogging value.
     */
    public Object enableReliableLogging() {
        return this.enableReliableLogging;
    }

    /**
     * Set the enableReliableLogging property: Specifies whether to enable reliable logging. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param enableReliableLogging the enableReliableLogging value to set.
     * @return the LogStorageSettings object itself.
     */
    public LogStorageSettings withEnableReliableLogging(Object enableReliableLogging) {
        this.enableReliableLogging = enableReliableLogging;
        return this;
    }

    /**
     * Get the additionalProperties property: (Deprecated. Please use LogSettings) Log storage settings.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: (Deprecated. Please use LogSettings) Log storage settings.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the LogStorageSettings object itself.
     */
    public LogStorageSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linkedServiceName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property linkedServiceName in model LogStorageSettings"));
        } else {
            linkedServiceName().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogStorageSettings.class);
}
