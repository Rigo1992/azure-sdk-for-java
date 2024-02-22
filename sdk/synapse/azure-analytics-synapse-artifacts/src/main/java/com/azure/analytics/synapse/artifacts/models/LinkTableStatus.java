// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The LinkTableStatus model.
 */
@Fluent
public final class LinkTableStatus {
    /*
     * ID provided by the client
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Link table status, please refer to this
     * [articles](https://learn.microsoft.com/azure/synapse-analytics/synapse-link/sql-database-synapse-link#monitoring)
     * for details.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Link table error message
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /*
     * Link table start time
     */
    @JsonProperty(value = "startTime")
    private Object startTime;

    /*
     * Link table stop time
     */
    @JsonProperty(value = "stopTime")
    private Object stopTime;

    /*
     * Link table ID
     */
    @JsonProperty(value = "linkTableId")
    private String linkTableId;

    /*
     * Link table error code
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /*
     * Link table last processed data time
     */
    @JsonProperty(value = "lastProcessedData")
    private OffsetDateTime lastProcessedData;

    /*
     * Link table last transaction commit time
     */
    @JsonProperty(value = "lastTransactionCommitTime")
    private OffsetDateTime lastTransactionCommitTime;

    /**
     * Creates an instance of LinkTableStatus class.
     */
    public LinkTableStatus() {
    }

    /**
     * Get the id property: ID provided by the client.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: ID provided by the client.
     * 
     * @param id the id value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the status property: Link table status, please refer to this
     * [articles](https://learn.microsoft.com/azure/synapse-analytics/synapse-link/sql-database-synapse-link#monitoring)
     * for details.
     * 
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Link table status, please refer to this
     * [articles](https://learn.microsoft.com/azure/synapse-analytics/synapse-link/sql-database-synapse-link#monitoring)
     * for details.
     * 
     * @param status the status value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errorMessage property: Link table error message.
     * 
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Link table error message.
     * 
     * @param errorMessage the errorMessage value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the startTime property: Link table start time.
     * 
     * @return the startTime value.
     */
    public Object getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Link table start time.
     * 
     * @param startTime the startTime value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setStartTime(Object startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the stopTime property: Link table stop time.
     * 
     * @return the stopTime value.
     */
    public Object getStopTime() {
        return this.stopTime;
    }

    /**
     * Set the stopTime property: Link table stop time.
     * 
     * @param stopTime the stopTime value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setStopTime(Object stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * Get the linkTableId property: Link table ID.
     * 
     * @return the linkTableId value.
     */
    public String getLinkTableId() {
        return this.linkTableId;
    }

    /**
     * Set the linkTableId property: Link table ID.
     * 
     * @param linkTableId the linkTableId value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setLinkTableId(String linkTableId) {
        this.linkTableId = linkTableId;
        return this;
    }

    /**
     * Get the errorCode property: Link table error code.
     * 
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Link table error code.
     * 
     * @param errorCode the errorCode value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the lastProcessedData property: Link table last processed data time.
     * 
     * @return the lastProcessedData value.
     */
    public OffsetDateTime getLastProcessedData() {
        return this.lastProcessedData;
    }

    /**
     * Set the lastProcessedData property: Link table last processed data time.
     * 
     * @param lastProcessedData the lastProcessedData value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setLastProcessedData(OffsetDateTime lastProcessedData) {
        this.lastProcessedData = lastProcessedData;
        return this;
    }

    /**
     * Get the lastTransactionCommitTime property: Link table last transaction commit time.
     * 
     * @return the lastTransactionCommitTime value.
     */
    public OffsetDateTime getLastTransactionCommitTime() {
        return this.lastTransactionCommitTime;
    }

    /**
     * Set the lastTransactionCommitTime property: Link table last transaction commit time.
     * 
     * @param lastTransactionCommitTime the lastTransactionCommitTime value to set.
     * @return the LinkTableStatus object itself.
     */
    public LinkTableStatus setLastTransactionCommitTime(OffsetDateTime lastTransactionCommitTime) {
        this.lastTransactionCommitTime = lastTransactionCommitTime;
        return this;
    }
}
