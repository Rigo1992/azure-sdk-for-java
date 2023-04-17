// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Collection of instances belong to the Application Configuration Service. */
@Immutable
public final class ConfigurationServiceInstance {
    /*
     * Name of the Application Configuration Service instance
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Status of the Application Configuration Service instance
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /** Creates an instance of ConfigurationServiceInstance class. */
    public ConfigurationServiceInstance() {
    }

    /**
     * Get the name property: Name of the Application Configuration Service instance.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the status property: Status of the Application Configuration Service instance.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
