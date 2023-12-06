// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The ConfigurationValue with no secrets.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "configurationType")
@JsonTypeName("Open")
@Fluent
public final class ConfigurationValueWithoutSecrets extends ConfigurationGroupValuePropertiesFormat {
    /*
     * Name and value pairs that define the configuration value. It can be a well formed escaped JSON string.
     */
    @JsonProperty(value = "configurationValue")
    private String configurationValue;

    /**
     * Creates an instance of ConfigurationValueWithoutSecrets class.
     */
    public ConfigurationValueWithoutSecrets() {
    }

    /**
     * Get the configurationValue property: Name and value pairs that define the configuration value. It can be a well
     * formed escaped JSON string.
     * 
     * @return the configurationValue value.
     */
    public String configurationValue() {
        return this.configurationValue;
    }

    /**
     * Set the configurationValue property: Name and value pairs that define the configuration value. It can be a well
     * formed escaped JSON string.
     * 
     * @param configurationValue the configurationValue value to set.
     * @return the ConfigurationValueWithoutSecrets object itself.
     */
    public ConfigurationValueWithoutSecrets withConfigurationValue(String configurationValue) {
        this.configurationValue = configurationValue;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigurationValueWithoutSecrets withConfigurationGroupSchemaResourceReference(
        DeploymentResourceIdReference configurationGroupSchemaResourceReference) {
        super.withConfigurationGroupSchemaResourceReference(configurationGroupSchemaResourceReference);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
