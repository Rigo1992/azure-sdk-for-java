// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appplatform.models.ConfigurationServiceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application Configuration Service resource.
 */
@Fluent
public final class ConfigurationServiceResourceInner extends ProxyResource {
    /*
     * Application Configuration Service properties payload
     */
    @JsonProperty(value = "properties")
    private ConfigurationServiceProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ConfigurationServiceResourceInner class.
     */
    public ConfigurationServiceResourceInner() {
    }

    /**
     * Get the properties property: Application Configuration Service properties payload.
     * 
     * @return the properties value.
     */
    public ConfigurationServiceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Application Configuration Service properties payload.
     * 
     * @param properties the properties value to set.
     * @return the ConfigurationServiceResourceInner object itself.
     */
    public ConfigurationServiceResourceInner withProperties(ConfigurationServiceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
