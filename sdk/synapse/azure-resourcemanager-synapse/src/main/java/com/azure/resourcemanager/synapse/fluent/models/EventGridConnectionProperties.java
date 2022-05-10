// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.BlobStorageEventType;
import com.azure.resourcemanager.synapse.models.EventGridDataFormat;
import com.azure.resourcemanager.synapse.models.ResourceProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class representing the Kusto event grid connection properties. */
@Fluent
public final class EventGridConnectionProperties {
    /*
     * The resource ID of the storage account where the data resides.
     */
    @JsonProperty(value = "storageAccountResourceId", required = true)
    private String storageAccountResourceId;

    /*
     * The resource ID where the event grid is configured to send events.
     */
    @JsonProperty(value = "eventHubResourceId", required = true)
    private String eventHubResourceId;

    /*
     * The event hub consumer group.
     */
    @JsonProperty(value = "consumerGroup", required = true)
    private String consumerGroup;

    /*
     * The table where the data should be ingested. Optionally the table
     * information can be added to each message.
     */
    @JsonProperty(value = "tableName")
    private String tableName;

    /*
     * The mapping rule to be used to ingest the data. Optionally the mapping
     * information can be added to each message.
     */
    @JsonProperty(value = "mappingRuleName")
    private String mappingRuleName;

    /*
     * The data format of the message. Optionally the data format can be added
     * to each message.
     */
    @JsonProperty(value = "dataFormat")
    private EventGridDataFormat dataFormat;

    /*
     * A Boolean value that, if set to true, indicates that ingestion should
     * ignore the first record of every file
     */
    @JsonProperty(value = "ignoreFirstRecord")
    private Boolean ignoreFirstRecord;

    /*
     * The name of blob storage event type to process.
     */
    @JsonProperty(value = "blobStorageEventType")
    private BlobStorageEventType blobStorageEventType;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceProvisioningState provisioningState;

    /**
     * Get the storageAccountResourceId property: The resource ID of the storage account where the data resides.
     *
     * @return the storageAccountResourceId value.
     */
    public String storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * Set the storageAccountResourceId property: The resource ID of the storage account where the data resides.
     *
     * @param storageAccountResourceId the storageAccountResourceId value to set.
     * @return the EventGridConnectionProperties object itself.
     */
    public EventGridConnectionProperties withStorageAccountResourceId(String storageAccountResourceId) {
        this.storageAccountResourceId = storageAccountResourceId;
        return this;
    }

    /**
     * Get the eventHubResourceId property: The resource ID where the event grid is configured to send events.
     *
     * @return the eventHubResourceId value.
     */
    public String eventHubResourceId() {
        return this.eventHubResourceId;
    }

    /**
     * Set the eventHubResourceId property: The resource ID where the event grid is configured to send events.
     *
     * @param eventHubResourceId the eventHubResourceId value to set.
     * @return the EventGridConnectionProperties object itself.
     */
    public EventGridConnectionProperties withEventHubResourceId(String eventHubResourceId) {
        this.eventHubResourceId = eventHubResourceId;
        return this;
    }

    /**
     * Get the consumerGroup property: The event hub consumer group.
     *
     * @return the consumerGroup value.
     */
    public String consumerGroup() {
        return this.consumerGroup;
    }

    /**
     * Set the consumerGroup property: The event hub consumer group.
     *
     * @param consumerGroup the consumerGroup value to set.
     * @return the EventGridConnectionProperties object itself.
     */
    public EventGridConnectionProperties withConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }

    /**
     * Get the tableName property: The table where the data should be ingested. Optionally the table information can be
     * added to each message.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The table where the data should be ingested. Optionally the table information can be
     * added to each message.
     *
     * @param tableName the tableName value to set.
     * @return the EventGridConnectionProperties object itself.
     */
    public EventGridConnectionProperties withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the mappingRuleName property: The mapping rule to be used to ingest the data. Optionally the mapping
     * information can be added to each message.
     *
     * @return the mappingRuleName value.
     */
    public String mappingRuleName() {
        return this.mappingRuleName;
    }

    /**
     * Set the mappingRuleName property: The mapping rule to be used to ingest the data. Optionally the mapping
     * information can be added to each message.
     *
     * @param mappingRuleName the mappingRuleName value to set.
     * @return the EventGridConnectionProperties object itself.
     */
    public EventGridConnectionProperties withMappingRuleName(String mappingRuleName) {
        this.mappingRuleName = mappingRuleName;
        return this;
    }

    /**
     * Get the dataFormat property: The data format of the message. Optionally the data format can be added to each
     * message.
     *
     * @return the dataFormat value.
     */
    public EventGridDataFormat dataFormat() {
        return this.dataFormat;
    }

    /**
     * Set the dataFormat property: The data format of the message. Optionally the data format can be added to each
     * message.
     *
     * @param dataFormat the dataFormat value to set.
     * @return the EventGridConnectionProperties object itself.
     */
    public EventGridConnectionProperties withDataFormat(EventGridDataFormat dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * Get the ignoreFirstRecord property: A Boolean value that, if set to true, indicates that ingestion should ignore
     * the first record of every file.
     *
     * @return the ignoreFirstRecord value.
     */
    public Boolean ignoreFirstRecord() {
        return this.ignoreFirstRecord;
    }

    /**
     * Set the ignoreFirstRecord property: A Boolean value that, if set to true, indicates that ingestion should ignore
     * the first record of every file.
     *
     * @param ignoreFirstRecord the ignoreFirstRecord value to set.
     * @return the EventGridConnectionProperties object itself.
     */
    public EventGridConnectionProperties withIgnoreFirstRecord(Boolean ignoreFirstRecord) {
        this.ignoreFirstRecord = ignoreFirstRecord;
        return this;
    }

    /**
     * Get the blobStorageEventType property: The name of blob storage event type to process.
     *
     * @return the blobStorageEventType value.
     */
    public BlobStorageEventType blobStorageEventType() {
        return this.blobStorageEventType;
    }

    /**
     * Set the blobStorageEventType property: The name of blob storage event type to process.
     *
     * @param blobStorageEventType the blobStorageEventType value to set.
     * @return the EventGridConnectionProperties object itself.
     */
    public EventGridConnectionProperties withBlobStorageEventType(BlobStorageEventType blobStorageEventType) {
        this.blobStorageEventType = blobStorageEventType;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageAccountResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageAccountResourceId in model EventGridConnectionProperties"));
        }
        if (eventHubResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property eventHubResourceId in model EventGridConnectionProperties"));
        }
        if (consumerGroup() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property consumerGroup in model EventGridConnectionProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EventGridConnectionProperties.class);
}
