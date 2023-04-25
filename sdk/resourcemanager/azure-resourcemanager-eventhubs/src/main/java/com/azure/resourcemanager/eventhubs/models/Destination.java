// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventhubs.fluent.models.DestinationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/**
 * Capture storage details for capture description.
 */
@Fluent
public final class Destination {
    /*
     * Name for capture destination
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Properties describing the storage account, blob container and archive name format for capture destination
     */
    @JsonProperty(value = "properties")
    private DestinationProperties innerProperties;

    /**
     * Creates an instance of Destination class.
     */
    public Destination() {
    }

    /**
     * Get the name property: Name for capture destination.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name for capture destination.
     *
     * @param name the name value to set.
     * @return the Destination object itself.
     */
    public Destination withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Properties describing the storage account, blob container and archive name
     * format for capture destination.
     *
     * @return the innerProperties value.
     */
    private DestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the storageAccountResourceId property: Resource id of the storage account to be used to create the blobs.
     *
     * @return the storageAccountResourceId value.
     */
    public String storageAccountResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountResourceId();
    }

    /**
     * Set the storageAccountResourceId property: Resource id of the storage account to be used to create the blobs.
     *
     * @param storageAccountResourceId the storageAccountResourceId value to set.
     * @return the Destination object itself.
     */
    public Destination withStorageAccountResourceId(String storageAccountResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DestinationProperties();
        }
        this.innerProperties().withStorageAccountResourceId(storageAccountResourceId);
        return this;
    }

    /**
     * Get the blobContainer property: Blob container Name.
     *
     * @return the blobContainer value.
     */
    public String blobContainer() {
        return this.innerProperties() == null ? null : this.innerProperties().blobContainer();
    }

    /**
     * Set the blobContainer property: Blob container Name.
     *
     * @param blobContainer the blobContainer value to set.
     * @return the Destination object itself.
     */
    public Destination withBlobContainer(String blobContainer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DestinationProperties();
        }
        this.innerProperties().withBlobContainer(blobContainer);
        return this;
    }

    /**
     * Get the archiveNameFormat property: Blob naming convention for archive, e.g.
     * {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters
     * (Namespace,EventHub .. etc) are mandatory irrespective of order.
     *
     * @return the archiveNameFormat value.
     */
    public String archiveNameFormat() {
        return this.innerProperties() == null ? null : this.innerProperties().archiveNameFormat();
    }

    /**
     * Set the archiveNameFormat property: Blob naming convention for archive, e.g.
     * {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters
     * (Namespace,EventHub .. etc) are mandatory irrespective of order.
     *
     * @param archiveNameFormat the archiveNameFormat value to set.
     * @return the Destination object itself.
     */
    public Destination withArchiveNameFormat(String archiveNameFormat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DestinationProperties();
        }
        this.innerProperties().withArchiveNameFormat(archiveNameFormat);
        return this;
    }

    /**
     * Get the dataLakeSubscriptionId property: Subscription Id of Azure Data Lake Store.
     *
     * @return the dataLakeSubscriptionId value.
     */
    public UUID dataLakeSubscriptionId() {
        return this.innerProperties() == null ? null : this.innerProperties().dataLakeSubscriptionId();
    }

    /**
     * Set the dataLakeSubscriptionId property: Subscription Id of Azure Data Lake Store.
     *
     * @param dataLakeSubscriptionId the dataLakeSubscriptionId value to set.
     * @return the Destination object itself.
     */
    public Destination withDataLakeSubscriptionId(UUID dataLakeSubscriptionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DestinationProperties();
        }
        this.innerProperties().withDataLakeSubscriptionId(dataLakeSubscriptionId);
        return this;
    }

    /**
     * Get the dataLakeAccountName property: The Azure Data Lake Store name for the captured events.
     *
     * @return the dataLakeAccountName value.
     */
    public String dataLakeAccountName() {
        return this.innerProperties() == null ? null : this.innerProperties().dataLakeAccountName();
    }

    /**
     * Set the dataLakeAccountName property: The Azure Data Lake Store name for the captured events.
     *
     * @param dataLakeAccountName the dataLakeAccountName value to set.
     * @return the Destination object itself.
     */
    public Destination withDataLakeAccountName(String dataLakeAccountName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DestinationProperties();
        }
        this.innerProperties().withDataLakeAccountName(dataLakeAccountName);
        return this;
    }

    /**
     * Get the dataLakeFolderPath property: The destination folder path for the captured events.
     *
     * @return the dataLakeFolderPath value.
     */
    public String dataLakeFolderPath() {
        return this.innerProperties() == null ? null : this.innerProperties().dataLakeFolderPath();
    }

    /**
     * Set the dataLakeFolderPath property: The destination folder path for the captured events.
     *
     * @param dataLakeFolderPath the dataLakeFolderPath value to set.
     * @return the Destination object itself.
     */
    public Destination withDataLakeFolderPath(String dataLakeFolderPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DestinationProperties();
        }
        this.innerProperties().withDataLakeFolderPath(dataLakeFolderPath);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
