// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The AzureDataExplorerDataConnectionData model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("azureDataExplorer")
@Fluent
public final class AzureDataExplorerDataConnectionData extends DataConnectionData {

    /*
     * properties
     */
    @Generated
    @JsonProperty(value = "properties")
    private AzureDataExplorerDataConnectionProperties properties;

    /**
     * Creates an instance of AzureDataExplorerDataConnectionData class.
     *
     * @param properties the properties value to set.
     */
    @Generated
    @JsonCreator
    public AzureDataExplorerDataConnectionData(
        @JsonProperty(value = "properties") AzureDataExplorerDataConnectionProperties properties) {
        this.properties = properties;
    }

    /**
     * Get the properties property: properties.
     *
     * @return the properties value.
     */
    @Generated
    public AzureDataExplorerDataConnectionProperties getProperties() {
        return this.properties;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureDataExplorerDataConnectionData setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureDataExplorerDataConnectionData setContent(DataConnectionContent content) {
        super.setContent(content);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureDataExplorerDataConnectionData setFrequency(DataConnectionFrequency frequency) {
        super.setFrequency(frequency);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureDataExplorerDataConnectionData setFrequencyOffset(Integer frequencyOffset) {
        super.setFrequencyOffset(frequencyOffset);
        return this;
    }
}
