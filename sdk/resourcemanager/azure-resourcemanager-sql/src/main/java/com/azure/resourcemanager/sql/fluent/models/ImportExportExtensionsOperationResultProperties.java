// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Contains the operation result properties for import/export operation. */
@Immutable
public final class ImportExportExtensionsOperationResultProperties {
    /*
     * Request Id.
     */
    @JsonProperty(value = "requestId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID requestId;

    /*
     * Request type.
     */
    @JsonProperty(value = "requestType", access = JsonProperty.Access.WRITE_ONLY)
    private String requestType;

    /*
     * Last modified time.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private String lastModifiedTime;

    /*
     * Server name.
     */
    @JsonProperty(value = "serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * Database name.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * Operation status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * Error message.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /** Creates an instance of ImportExportExtensionsOperationResultProperties class. */
    public ImportExportExtensionsOperationResultProperties() {
    }

    /**
     * Get the requestId property: Request Id.
     *
     * @return the requestId value.
     */
    public UUID requestId() {
        return this.requestId;
    }

    /**
     * Get the requestType property: Request type.
     *
     * @return the requestType value.
     */
    public String requestType() {
        return this.requestType;
    }

    /**
     * Get the lastModifiedTime property: Last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the serverName property: Server name.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the databaseName property: Database name.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the errorMessage property: Error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
