// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The set of roles permitted through this Role Definition. */
@Fluent
public final class Role {
    /*
     * The database name the role is applied.
     */
    @JsonProperty(value = "db")
    private String db;

    /*
     * The role name.
     */
    @JsonProperty(value = "role")
    private String role;

    /** Creates an instance of Role class. */
    public Role() {
    }

    /**
     * Get the db property: The database name the role is applied.
     *
     * @return the db value.
     */
    public String db() {
        return this.db;
    }

    /**
     * Set the db property: The database name the role is applied.
     *
     * @param db the db value to set.
     * @return the Role object itself.
     */
    public Role withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * Get the role property: The role name.
     *
     * @return the role value.
     */
    public String role() {
        return this.role;
    }

    /**
     * Set the role property: The role name.
     *
     * @param role the role value to set.
     * @return the Role object itself.
     */
    public Role withRole(String role) {
        this.role = role;
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
