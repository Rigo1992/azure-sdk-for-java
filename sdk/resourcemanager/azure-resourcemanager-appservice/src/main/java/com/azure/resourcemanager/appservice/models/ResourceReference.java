// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource reference. */
@Fluent
public final class ResourceReference {
    /*
     * The resource id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Gets the resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Gets the resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /** Creates an instance of ResourceReference class. */
    public ResourceReference() {
    }

    /**
     * Get the id property: The resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource id.
     *
     * @param id the id value to set.
     * @return the ResourceReference object itself.
     */
    public ResourceReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Gets the resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Gets the resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
