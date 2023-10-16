// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.fluent.models.CassandraKeyspaceCreateUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters to create and update Cosmos DB Cassandra keyspace. */
@Fluent
public final class CassandraKeyspaceCreateUpdateParameters extends ArmResourceProperties {
    /*
     * Properties to create and update Azure Cosmos DB Cassandra keyspace.
     */
    @JsonProperty(value = "properties", required = true)
    private CassandraKeyspaceCreateUpdateProperties innerProperties = new CassandraKeyspaceCreateUpdateProperties();

    /** Creates an instance of CassandraKeyspaceCreateUpdateParameters class. */
    public CassandraKeyspaceCreateUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties to create and update Azure Cosmos DB Cassandra keyspace.
     *
     * @return the innerProperties value.
     */
    private CassandraKeyspaceCreateUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraKeyspaceCreateUpdateParameters withIdentity(ManagedServiceIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraKeyspaceCreateUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CassandraKeyspaceCreateUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The standard JSON format of a Cassandra keyspace.
     *
     * @return the resource value.
     */
    public CassandraKeyspaceResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The standard JSON format of a Cassandra keyspace.
     *
     * @param resource the resource value to set.
     * @return the CassandraKeyspaceCreateUpdateParameters object itself.
     */
    public CassandraKeyspaceCreateUpdateParameters withResource(CassandraKeyspaceResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CassandraKeyspaceCreateUpdateProperties();
        }
        this.innerProperties().withResource(resource);
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @param options the options value to set.
     * @return the CassandraKeyspaceCreateUpdateParameters object itself.
     */
    public CassandraKeyspaceCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CassandraKeyspaceCreateUpdateProperties();
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
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model CassandraKeyspaceCreateUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CassandraKeyspaceCreateUpdateParameters.class);
}
