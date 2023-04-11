// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.synapse.fluent.models.EventHubConnectionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Class representing an event hub data connection. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("EventHub")
@Fluent
public final class EventHubDataConnection extends DataConnectionInner {
    /*
     * The Event Hub data connection properties to validate.
     */
    @JsonProperty(value = "properties")
    private EventHubConnectionProperties innerProperties;

    /** Creates an instance of EventHubDataConnection class. */
    public EventHubDataConnection() {
    }

    /**
     * Get the innerProperties property: The Event Hub data connection properties to validate.
     *
     * @return the innerProperties value.
     */
    private EventHubConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public EventHubDataConnection withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Get the eventHubResourceId property: The resource ID of the event hub to be used to create a data connection.
     *
     * @return the eventHubResourceId value.
     */
    public String eventHubResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().eventHubResourceId();
    }

    /**
     * Set the eventHubResourceId property: The resource ID of the event hub to be used to create a data connection.
     *
     * @param eventHubResourceId the eventHubResourceId value to set.
     * @return the EventHubDataConnection object itself.
     */
    public EventHubDataConnection withEventHubResourceId(String eventHubResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubConnectionProperties();
        }
        this.innerProperties().withEventHubResourceId(eventHubResourceId);
        return this;
    }

    /**
     * Get the consumerGroup property: The event hub consumer group.
     *
     * @return the consumerGroup value.
     */
    public String consumerGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().consumerGroup();
    }

    /**
     * Set the consumerGroup property: The event hub consumer group.
     *
     * @param consumerGroup the consumerGroup value to set.
     * @return the EventHubDataConnection object itself.
     */
    public EventHubDataConnection withConsumerGroup(String consumerGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubConnectionProperties();
        }
        this.innerProperties().withConsumerGroup(consumerGroup);
        return this;
    }

    /**
     * Get the tableName property: The table where the data should be ingested. Optionally the table information can be
     * added to each message.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.innerProperties() == null ? null : this.innerProperties().tableName();
    }

    /**
     * Set the tableName property: The table where the data should be ingested. Optionally the table information can be
     * added to each message.
     *
     * @param tableName the tableName value to set.
     * @return the EventHubDataConnection object itself.
     */
    public EventHubDataConnection withTableName(String tableName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubConnectionProperties();
        }
        this.innerProperties().withTableName(tableName);
        return this;
    }

    /**
     * Get the mappingRuleName property: The mapping rule to be used to ingest the data. Optionally the mapping
     * information can be added to each message.
     *
     * @return the mappingRuleName value.
     */
    public String mappingRuleName() {
        return this.innerProperties() == null ? null : this.innerProperties().mappingRuleName();
    }

    /**
     * Set the mappingRuleName property: The mapping rule to be used to ingest the data. Optionally the mapping
     * information can be added to each message.
     *
     * @param mappingRuleName the mappingRuleName value to set.
     * @return the EventHubDataConnection object itself.
     */
    public EventHubDataConnection withMappingRuleName(String mappingRuleName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubConnectionProperties();
        }
        this.innerProperties().withMappingRuleName(mappingRuleName);
        return this;
    }

    /**
     * Get the dataFormat property: The data format of the message. Optionally the data format can be added to each
     * message.
     *
     * @return the dataFormat value.
     */
    public EventHubDataFormat dataFormat() {
        return this.innerProperties() == null ? null : this.innerProperties().dataFormat();
    }

    /**
     * Set the dataFormat property: The data format of the message. Optionally the data format can be added to each
     * message.
     *
     * @param dataFormat the dataFormat value to set.
     * @return the EventHubDataConnection object itself.
     */
    public EventHubDataConnection withDataFormat(EventHubDataFormat dataFormat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubConnectionProperties();
        }
        this.innerProperties().withDataFormat(dataFormat);
        return this;
    }

    /**
     * Get the eventSystemProperties property: System properties of the event hub.
     *
     * @return the eventSystemProperties value.
     */
    public List<String> eventSystemProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().eventSystemProperties();
    }

    /**
     * Set the eventSystemProperties property: System properties of the event hub.
     *
     * @param eventSystemProperties the eventSystemProperties value to set.
     * @return the EventHubDataConnection object itself.
     */
    public EventHubDataConnection withEventSystemProperties(List<String> eventSystemProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubConnectionProperties();
        }
        this.innerProperties().withEventSystemProperties(eventSystemProperties);
        return this;
    }

    /**
     * Get the compression property: The event hub messages compression type.
     *
     * @return the compression value.
     */
    public Compression compression() {
        return this.innerProperties() == null ? null : this.innerProperties().compression();
    }

    /**
     * Set the compression property: The event hub messages compression type.
     *
     * @param compression the compression value to set.
     * @return the EventHubDataConnection object itself.
     */
    public EventHubDataConnection withCompression(Compression compression) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubConnectionProperties();
        }
        this.innerProperties().withCompression(compression);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the managedIdentityResourceId property: The resource ID of a managed identity (system or user assigned) to be
     * used to authenticate with event hub.
     *
     * @return the managedIdentityResourceId value.
     */
    public String managedIdentityResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().managedIdentityResourceId();
    }

    /**
     * Set the managedIdentityResourceId property: The resource ID of a managed identity (system or user assigned) to be
     * used to authenticate with event hub.
     *
     * @param managedIdentityResourceId the managedIdentityResourceId value to set.
     * @return the EventHubDataConnection object itself.
     */
    public EventHubDataConnection withManagedIdentityResourceId(String managedIdentityResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubConnectionProperties();
        }
        this.innerProperties().withManagedIdentityResourceId(managedIdentityResourceId);
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
