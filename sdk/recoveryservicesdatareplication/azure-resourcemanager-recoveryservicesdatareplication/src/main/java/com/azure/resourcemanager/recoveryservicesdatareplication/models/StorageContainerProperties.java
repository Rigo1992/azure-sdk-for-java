// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Storage container properties. */
@Fluent
public final class StorageContainerProperties {
    /*
     * Gets or sets the Name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Gets or sets the ClusterSharedVolumePath.
     */
    @JsonProperty(value = "clusterSharedVolumePath", required = true)
    private String clusterSharedVolumePath;

    /** Creates an instance of StorageContainerProperties class. */
    public StorageContainerProperties() {
    }

    /**
     * Get the name property: Gets or sets the Name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the Name.
     *
     * @param name the name value to set.
     * @return the StorageContainerProperties object itself.
     */
    public StorageContainerProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the clusterSharedVolumePath property: Gets or sets the ClusterSharedVolumePath.
     *
     * @return the clusterSharedVolumePath value.
     */
    public String clusterSharedVolumePath() {
        return this.clusterSharedVolumePath;
    }

    /**
     * Set the clusterSharedVolumePath property: Gets or sets the ClusterSharedVolumePath.
     *
     * @param clusterSharedVolumePath the clusterSharedVolumePath value to set.
     * @return the StorageContainerProperties object itself.
     */
    public StorageContainerProperties withClusterSharedVolumePath(String clusterSharedVolumePath) {
        this.clusterSharedVolumePath = clusterSharedVolumePath;
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
                    new IllegalArgumentException("Missing required property name in model StorageContainerProperties"));
        }
        if (clusterSharedVolumePath() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clusterSharedVolumePath in model StorageContainerProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageContainerProperties.class);
}
