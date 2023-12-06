// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Endpoint Configuration for frontend and backend.
 */
@Fluent
public final class EndpointConfiguration {
    /*
     * port ID
     */
    @JsonProperty(value = "port", required = true)
    private String port;

    /*
     * Address Space
     */
    @JsonProperty(value = "address", required = true)
    private IpAddress address;

    /**
     * Creates an instance of EndpointConfiguration class.
     */
    public EndpointConfiguration() {
    }

    /**
     * Get the port property: port ID.
     * 
     * @return the port value.
     */
    public String port() {
        return this.port;
    }

    /**
     * Set the port property: port ID.
     * 
     * @param port the port value to set.
     * @return the EndpointConfiguration object itself.
     */
    public EndpointConfiguration withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * Get the address property: Address Space.
     * 
     * @return the address value.
     */
    public IpAddress address() {
        return this.address;
    }

    /**
     * Set the address property: Address Space.
     * 
     * @param address the address value to set.
     * @return the EndpointConfiguration object itself.
     */
    public EndpointConfiguration withAddress(IpAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (port() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property port in model EndpointConfiguration"));
        }
        if (address() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property address in model EndpointConfiguration"));
        } else {
            address().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EndpointConfiguration.class);
}
