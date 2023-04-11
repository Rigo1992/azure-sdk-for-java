// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.models.SqlDatabaseGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.models.SqlDatabaseGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An Azure Cosmos DB SQL database. */
@Fluent
public final class SqlDatabaseGetResultsInner extends ArmResourceProperties {
    /*
     * The properties of an Azure Cosmos DB SQL database
     */
    @JsonProperty(value = "properties")
    private SqlDatabaseGetProperties innerProperties;

    /** Creates an instance of SqlDatabaseGetResultsInner class. */
    public SqlDatabaseGetResultsInner() {
    }

    /**
     * Get the innerProperties property: The properties of an Azure Cosmos DB SQL database.
     *
     * @return the innerProperties value.
     */
    private SqlDatabaseGetProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDatabaseGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDatabaseGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public SqlDatabaseGetPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the SqlDatabaseGetResultsInner object itself.
     */
    public SqlDatabaseGetResultsInner withResource(SqlDatabaseGetPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlDatabaseGetProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public SqlDatabaseGetPropertiesOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the SqlDatabaseGetResultsInner object itself.
     */
    public SqlDatabaseGetResultsInner withOptions(SqlDatabaseGetPropertiesOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlDatabaseGetProperties();
        }
        this.innerProperties().withOptions(options);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
