// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.DatabaseInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A List of databases.
 */
@Fluent
public final class DatabaseListResult {
    /*
     * The list of databases housed in a server
     */
    @JsonProperty(value = "value")
    private List<DatabaseInner> value;

    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of DatabaseListResult class.
     */
    public DatabaseListResult() {
    }

    /**
     * Get the value property: The list of databases housed in a server.
     * 
     * @return the value value.
     */
    public List<DatabaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of databases housed in a server.
     * 
     * @param value the value value to set.
     * @return the DatabaseListResult object itself.
     */
    public DatabaseListResult withValue(List<DatabaseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the DatabaseListResult object itself.
     */
    public DatabaseListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
