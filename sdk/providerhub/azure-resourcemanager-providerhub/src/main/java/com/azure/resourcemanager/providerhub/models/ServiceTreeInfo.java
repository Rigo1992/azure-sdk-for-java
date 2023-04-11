// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ServiceTreeInfo model. */
@Fluent
public final class ServiceTreeInfo {
    /*
     * The serviceId property.
     */
    @JsonProperty(value = "serviceId")
    private String serviceId;

    /*
     * The componentId property.
     */
    @JsonProperty(value = "componentId")
    private String componentId;

    /** Creates an instance of ServiceTreeInfo class. */
    public ServiceTreeInfo() {
    }

    /**
     * Get the serviceId property: The serviceId property.
     *
     * @return the serviceId value.
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Set the serviceId property: The serviceId property.
     *
     * @param serviceId the serviceId value to set.
     * @return the ServiceTreeInfo object itself.
     */
    public ServiceTreeInfo withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get the componentId property: The componentId property.
     *
     * @return the componentId value.
     */
    public String componentId() {
        return this.componentId;
    }

    /**
     * Set the componentId property: The componentId property.
     *
     * @param componentId the componentId value to set.
     * @return the ServiceTreeInfo object itself.
     */
    public ServiceTreeInfo withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
