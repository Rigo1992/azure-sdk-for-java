// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Document Database Collection sink.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = DocumentDbCollectionSink.class,
    visible = true)
@JsonTypeName("DocumentDbCollectionSink")
@Fluent
public final class DocumentDbCollectionSink extends CopySink {
    /*
     * Copy sink type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "DocumentDbCollectionSink";

    /*
     * Nested properties separator. Default is . (dot). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "nestingSeparator")
    private Object nestingSeparator;

    /*
     * Describes how to write data to Azure Cosmos DB. Type: string (or Expression with resultType string). Allowed values: insert and upsert.
     */
    @JsonProperty(value = "writeBehavior")
    private Object writeBehavior;

    /**
     * Creates an instance of DocumentDbCollectionSink class.
     */
    public DocumentDbCollectionSink() {
    }

    /**
     * Get the type property: Copy sink type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the nestingSeparator property: Nested properties separator. Default is . (dot). Type: string (or Expression
     * with resultType string).
     * 
     * @return the nestingSeparator value.
     */
    public Object nestingSeparator() {
        return this.nestingSeparator;
    }

    /**
     * Set the nestingSeparator property: Nested properties separator. Default is . (dot). Type: string (or Expression
     * with resultType string).
     * 
     * @param nestingSeparator the nestingSeparator value to set.
     * @return the DocumentDbCollectionSink object itself.
     */
    public DocumentDbCollectionSink withNestingSeparator(Object nestingSeparator) {
        this.nestingSeparator = nestingSeparator;
        return this;
    }

    /**
     * Get the writeBehavior property: Describes how to write data to Azure Cosmos DB. Type: string (or Expression with
     * resultType string). Allowed values: insert and upsert.
     * 
     * @return the writeBehavior value.
     */
    public Object writeBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: Describes how to write data to Azure Cosmos DB. Type: string (or Expression with
     * resultType string). Allowed values: insert and upsert.
     * 
     * @param writeBehavior the writeBehavior value to set.
     * @return the DocumentDbCollectionSink object itself.
     */
    public DocumentDbCollectionSink withWriteBehavior(Object writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentDbCollectionSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentDbCollectionSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentDbCollectionSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentDbCollectionSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentDbCollectionSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentDbCollectionSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
    }
}
