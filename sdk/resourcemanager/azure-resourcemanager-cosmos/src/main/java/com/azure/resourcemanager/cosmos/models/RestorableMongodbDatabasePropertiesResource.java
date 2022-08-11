// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource of an Azure Cosmos DB MongoDB database event. */
@Immutable
public final class RestorableMongodbDatabasePropertiesResource {
    /*
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "_rid", access = JsonProperty.Access.WRITE_ONLY)
    private String rid;

    /*
     * The operation type of this database event.
     */
    @JsonProperty(value = "operationType", access = JsonProperty.Access.WRITE_ONLY)
    private OperationType operationType;

    /*
     * The time when this database event happened.
     */
    @JsonProperty(value = "eventTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String eventTimestamp;

    /*
     * The name of this MongoDB database.
     */
    @JsonProperty(value = "ownerId", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerId;

    /*
     * The resource ID of this MongoDB database.
     */
    @JsonProperty(value = "ownerResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerResourceId;

    /**
     * Get the rid property: A system generated property. A unique identifier.
     *
     * @return the rid value.
     */
    public String rid() {
        return this.rid;
    }

    /**
     * Get the operationType property: The operation type of this database event.
     *
     * @return the operationType value.
     */
    public OperationType operationType() {
        return this.operationType;
    }

    /**
     * Get the eventTimestamp property: The time when this database event happened.
     *
     * @return the eventTimestamp value.
     */
    public String eventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * Get the ownerId property: The name of this MongoDB database.
     *
     * @return the ownerId value.
     */
    public String ownerId() {
        return this.ownerId;
    }

    /**
     * Get the ownerResourceId property: The resource ID of this MongoDB database.
     *
     * @return the ownerResourceId value.
     */
    public String ownerResourceId() {
        return this.ownerResourceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
