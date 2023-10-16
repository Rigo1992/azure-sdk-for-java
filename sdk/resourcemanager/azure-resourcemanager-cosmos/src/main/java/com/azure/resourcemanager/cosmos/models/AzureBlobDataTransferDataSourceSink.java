// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** An Azure Blob Storage data source/sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "component")
@JsonTypeName("AzureBlobStorage")
@Fluent
public final class AzureBlobDataTransferDataSourceSink extends DataTransferDataSourceSink {
    /*
     * The containerName property.
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /*
     * The endpointUrl property.
     */
    @JsonProperty(value = "endpointUrl")
    private String endpointUrl;

    /** Creates an instance of AzureBlobDataTransferDataSourceSink class. */
    public AzureBlobDataTransferDataSourceSink() {
    }

    /**
     * Get the containerName property: The containerName property.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The containerName property.
     *
     * @param containerName the containerName value to set.
     * @return the AzureBlobDataTransferDataSourceSink object itself.
     */
    public AzureBlobDataTransferDataSourceSink withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the endpointUrl property: The endpointUrl property.
     *
     * @return the endpointUrl value.
     */
    public String endpointUrl() {
        return this.endpointUrl;
    }

    /**
     * Set the endpointUrl property: The endpointUrl property.
     *
     * @param endpointUrl the endpointUrl value to set.
     * @return the AzureBlobDataTransferDataSourceSink object itself.
     */
    public AzureBlobDataTransferDataSourceSink withEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
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
        if (containerName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property containerName in model AzureBlobDataTransferDataSourceSink"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureBlobDataTransferDataSourceSink.class);
}
