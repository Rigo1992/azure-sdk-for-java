// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dependency reference for a serverless runtime resource.
 */
@Immutable
public final class ServerlessRuntimeDependency {
    /*
     * Dependency ID
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Application context ID
     */
    @JsonProperty(value = "appContextId", required = true)
    private String appContextId;

    /*
     * Dependency path
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /*
     * document type
     */
    @JsonProperty(value = "documentType", required = true)
    private String documentType;

    /*
     * description of Dependency
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /*
     * Last Update Time
     */
    @JsonProperty(value = "lastUpdatedTime", required = true)
    private String lastUpdatedTime;

    /**
     * Creates an instance of ServerlessRuntimeDependency class.
     */
    private ServerlessRuntimeDependency() {
    }

    /**
     * Get the id property: Dependency ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the appContextId property: Application context ID.
     * 
     * @return the appContextId value.
     */
    public String appContextId() {
        return this.appContextId;
    }

    /**
     * Get the path property: Dependency path.
     * 
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Get the documentType property: document type.
     * 
     * @return the documentType value.
     */
    public String documentType() {
        return this.documentType;
    }

    /**
     * Get the description property: description of Dependency.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the lastUpdatedTime property: Last Update Time.
     * 
     * @return the lastUpdatedTime value.
     */
    public String lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property id in model ServerlessRuntimeDependency"));
        }
        if (appContextId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property appContextId in model ServerlessRuntimeDependency"));
        }
        if (path() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property path in model ServerlessRuntimeDependency"));
        }
        if (documentType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property documentType in model ServerlessRuntimeDependency"));
        }
        if (description() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property description in model ServerlessRuntimeDependency"));
        }
        if (lastUpdatedTime() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property lastUpdatedTime in model ServerlessRuntimeDependency"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerlessRuntimeDependency.class);
}
