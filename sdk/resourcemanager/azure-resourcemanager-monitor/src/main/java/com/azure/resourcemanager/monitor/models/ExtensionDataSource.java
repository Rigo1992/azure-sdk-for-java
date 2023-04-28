// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Definition of which data will be collected from a separate VM extension that integrates with the Azure Monitor
 * Agent.
 * Collected from either Windows and Linux machines, depending on which extension is defined.
 */
@Fluent
public final class ExtensionDataSource {
    /*
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will
     * be sent to.
     */
    @JsonProperty(value = "streams")
    private List<KnownExtensionDataSourceStreams> streams;

    /*
     * The name of the VM extension.
     */
    @JsonProperty(value = "extensionName", required = true)
    private String extensionName;

    /*
     * The extension settings. The format is specific for particular extension.
     */
    @JsonProperty(value = "extensionSettings")
    private Object extensionSettings;

    /*
     * The list of data sources this extension needs data from.
     */
    @JsonProperty(value = "inputDataSources")
    private List<String> inputDataSources;

    /*
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Creates an instance of ExtensionDataSource class.
     */
    public ExtensionDataSource() {
    }

    /**
     * Get the streams property: List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will
     * be sent to.
     *
     * @return the streams value.
     */
    public List<KnownExtensionDataSourceStreams> streams() {
        return this.streams;
    }

    /**
     * Set the streams property: List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will
     * be sent to.
     *
     * @param streams the streams value to set.
     * @return the ExtensionDataSource object itself.
     */
    public ExtensionDataSource withStreams(List<KnownExtensionDataSourceStreams> streams) {
        this.streams = streams;
        return this;
    }

    /**
     * Get the extensionName property: The name of the VM extension.
     *
     * @return the extensionName value.
     */
    public String extensionName() {
        return this.extensionName;
    }

    /**
     * Set the extensionName property: The name of the VM extension.
     *
     * @param extensionName the extensionName value to set.
     * @return the ExtensionDataSource object itself.
     */
    public ExtensionDataSource withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * Get the extensionSettings property: The extension settings. The format is specific for particular extension.
     *
     * @return the extensionSettings value.
     */
    public Object extensionSettings() {
        return this.extensionSettings;
    }

    /**
     * Set the extensionSettings property: The extension settings. The format is specific for particular extension.
     *
     * @param extensionSettings the extensionSettings value to set.
     * @return the ExtensionDataSource object itself.
     */
    public ExtensionDataSource withExtensionSettings(Object extensionSettings) {
        this.extensionSettings = extensionSettings;
        return this;
    }

    /**
     * Get the inputDataSources property: The list of data sources this extension needs data from.
     *
     * @return the inputDataSources value.
     */
    public List<String> inputDataSources() {
        return this.inputDataSources;
    }

    /**
     * Set the inputDataSources property: The list of data sources this extension needs data from.
     *
     * @param inputDataSources the inputDataSources value to set.
     * @return the ExtensionDataSource object itself.
     */
    public ExtensionDataSource withInputDataSources(List<String> inputDataSources) {
        this.inputDataSources = inputDataSources;
        return this;
    }

    /**
     * Get the name property: A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     *
     * @param name the name value to set.
     * @return the ExtensionDataSource object itself.
     */
    public ExtensionDataSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extensionName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("Missing required property extensionName in model ExtensionDataSource"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExtensionDataSource.class);
}
