// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** InterfaceIPConfiguration iPConfiguration in a network interface. */
@Fluent
public final class IpConfiguration {
    /*
     * Name - The name of the resource that is unique within a resource group. This name can be used to access the
     * resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * InterfaceIPConfigurationPropertiesFormat properties of IP configuration.
     */
    @JsonProperty(value = "properties")
    private IpConfigurationProperties properties;

    /** Creates an instance of IpConfiguration class. */
    public IpConfiguration() {
    }

    /**
     * Get the name property: Name - The name of the resource that is unique within a resource group. This name can be
     * used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name - The name of the resource that is unique within a resource group. This name can be
     * used to access the resource.
     *
     * @param name the name value to set.
     * @return the IpConfiguration object itself.
     */
    public IpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: InterfaceIPConfigurationPropertiesFormat properties of IP configuration.
     *
     * @return the properties value.
     */
    public IpConfigurationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: InterfaceIPConfigurationPropertiesFormat properties of IP configuration.
     *
     * @param properties the properties value to set.
     * @return the IpConfiguration object itself.
     */
    public IpConfiguration withProperties(IpConfigurationProperties properties) {
        this.properties = properties;
        return this;
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
