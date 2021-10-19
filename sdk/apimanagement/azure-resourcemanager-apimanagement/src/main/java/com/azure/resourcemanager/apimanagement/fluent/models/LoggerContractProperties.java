// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.LoggerType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The Logger entity in API Management represents an event sink that you can use to log API Management events. Currently
 * the Logger entity supports logging API Management events to Azure Event Hubs.
 */
@Fluent
public final class LoggerContractProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoggerContractProperties.class);

    /*
     * Logger type.
     */
    @JsonProperty(value = "loggerType", required = true)
    private LoggerType loggerType;

    /*
     * Logger description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The name and SendRule connection string of the event hub for
     * azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     */
    @JsonProperty(value = "credentials")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> credentials;

    /*
     * Whether records are buffered in the logger before publishing. Default is
     * assumed to be true.
     */
    @JsonProperty(value = "isBuffered")
    private Boolean isBuffered;

    /*
     * Azure Resource Id of a log target (either Azure Event Hub resource or
     * Azure Application Insights resource).
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Get the loggerType property: Logger type.
     *
     * @return the loggerType value.
     */
    public LoggerType loggerType() {
        return this.loggerType;
    }

    /**
     * Set the loggerType property: Logger type.
     *
     * @param loggerType the loggerType value to set.
     * @return the LoggerContractProperties object itself.
     */
    public LoggerContractProperties withLoggerType(LoggerType loggerType) {
        this.loggerType = loggerType;
        return this;
    }

    /**
     * Get the description property: Logger description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Logger description.
     *
     * @param description the description value to set.
     * @return the LoggerContractProperties object itself.
     */
    public LoggerContractProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the credentials property: The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     *
     * @return the credentials value.
     */
    public Map<String, String> credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     *
     * @param credentials the credentials value to set.
     * @return the LoggerContractProperties object itself.
     */
    public LoggerContractProperties withCredentials(Map<String, String> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the isBuffered property: Whether records are buffered in the logger before publishing. Default is assumed to
     * be true.
     *
     * @return the isBuffered value.
     */
    public Boolean isBuffered() {
        return this.isBuffered;
    }

    /**
     * Set the isBuffered property: Whether records are buffered in the logger before publishing. Default is assumed to
     * be true.
     *
     * @param isBuffered the isBuffered value to set.
     * @return the LoggerContractProperties object itself.
     */
    public LoggerContractProperties withIsBuffered(Boolean isBuffered) {
        this.isBuffered = isBuffered;
        return this;
    }

    /**
     * Get the resourceId property: Azure Resource Id of a log target (either Azure Event Hub resource or Azure
     * Application Insights resource).
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Azure Resource Id of a log target (either Azure Event Hub resource or Azure
     * Application Insights resource).
     *
     * @param resourceId the resourceId value to set.
     * @return the LoggerContractProperties object itself.
     */
    public LoggerContractProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (loggerType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property loggerType in model LoggerContractProperties"));
        }
    }
}
