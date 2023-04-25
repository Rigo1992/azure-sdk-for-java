// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The full ARM ID of an Event Hubs Namespace.
 */
@Fluent
public final class EHNamespaceIdContainer {
    /*
     * id parameter
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of EHNamespaceIdContainer class.
     */
    public EHNamespaceIdContainer() {
    }

    /**
     * Get the id property: id parameter.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: id parameter.
     *
     * @param id the id value to set.
     * @return the EHNamespaceIdContainer object itself.
     */
    public EHNamespaceIdContainer withId(String id) {
        this.id = id;
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
