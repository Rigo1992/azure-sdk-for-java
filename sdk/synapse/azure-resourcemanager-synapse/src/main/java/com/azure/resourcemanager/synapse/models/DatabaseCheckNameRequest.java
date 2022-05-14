// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result returned from a database check name availability request. */
@Fluent
public final class DatabaseCheckNameRequest {
    /*
     * Resource name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of resource, for instance
     * Microsoft.Synapse/workspaces/kustoPools/databases.
     */
    @JsonProperty(value = "type", required = true)
    private Type type;

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     *
     * @param name the name value to set.
     * @return the DatabaseCheckNameRequest object itself.
     */
    public DatabaseCheckNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource, for instance Microsoft.Synapse/workspaces/kustoPools/databases.
     *
     * @return the type value.
     */
    public Type type() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource, for instance Microsoft.Synapse/workspaces/kustoPools/databases.
     *
     * @param type the type value to set.
     * @return the DatabaseCheckNameRequest object itself.
     */
    public DatabaseCheckNameRequest withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model DatabaseCheckNameRequest"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model DatabaseCheckNameRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabaseCheckNameRequest.class);
}
