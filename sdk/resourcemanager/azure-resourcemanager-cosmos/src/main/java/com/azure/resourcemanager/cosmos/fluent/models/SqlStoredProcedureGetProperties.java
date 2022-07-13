// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.models.SqlStoredProcedureGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an Azure Cosmos DB StoredProcedure. */
@Fluent
public final class SqlStoredProcedureGetProperties {
    /*
     * The resource property.
     */
    @JsonProperty(value = "resource")
    private SqlStoredProcedureGetPropertiesResource resource;

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public SqlStoredProcedureGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the SqlStoredProcedureGetProperties object itself.
     */
    public SqlStoredProcedureGetProperties withResource(SqlStoredProcedureGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() != null) {
            resource().validate();
        }
    }
}
