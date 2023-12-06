// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A copy activity Azure Blob sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BlobSink")
@Fluent
public final class BlobSink extends CopySink {
    /*
     * Blob writer overwrite files. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "blobWriterOverwriteFiles")
    private Object blobWriterOverwriteFiles;

    /*
     * Blob writer date time format. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "blobWriterDateTimeFormat")
    private Object blobWriterDateTimeFormat;

    /*
     * Blob writer add header. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "blobWriterAddHeader")
    private Object blobWriterAddHeader;

    /*
     * The type of copy behavior for copy sink.
     */
    @JsonProperty(value = "copyBehavior")
    private Object copyBehavior;

    /*
     * Specify the custom metadata to be added to sink data. Type: array of objects (or Expression with resultType
     * array of objects).
     */
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Creates an instance of BlobSink class.
     */
    public BlobSink() {
    }

    /**
     * Get the blobWriterOverwriteFiles property: Blob writer overwrite files. Type: boolean (or Expression with
     * resultType boolean).
     * 
     * @return the blobWriterOverwriteFiles value.
     */
    public Object blobWriterOverwriteFiles() {
        return this.blobWriterOverwriteFiles;
    }

    /**
     * Set the blobWriterOverwriteFiles property: Blob writer overwrite files. Type: boolean (or Expression with
     * resultType boolean).
     * 
     * @param blobWriterOverwriteFiles the blobWriterOverwriteFiles value to set.
     * @return the BlobSink object itself.
     */
    public BlobSink withBlobWriterOverwriteFiles(Object blobWriterOverwriteFiles) {
        this.blobWriterOverwriteFiles = blobWriterOverwriteFiles;
        return this;
    }

    /**
     * Get the blobWriterDateTimeFormat property: Blob writer date time format. Type: string (or Expression with
     * resultType string).
     * 
     * @return the blobWriterDateTimeFormat value.
     */
    public Object blobWriterDateTimeFormat() {
        return this.blobWriterDateTimeFormat;
    }

    /**
     * Set the blobWriterDateTimeFormat property: Blob writer date time format. Type: string (or Expression with
     * resultType string).
     * 
     * @param blobWriterDateTimeFormat the blobWriterDateTimeFormat value to set.
     * @return the BlobSink object itself.
     */
    public BlobSink withBlobWriterDateTimeFormat(Object blobWriterDateTimeFormat) {
        this.blobWriterDateTimeFormat = blobWriterDateTimeFormat;
        return this;
    }

    /**
     * Get the blobWriterAddHeader property: Blob writer add header. Type: boolean (or Expression with resultType
     * boolean).
     * 
     * @return the blobWriterAddHeader value.
     */
    public Object blobWriterAddHeader() {
        return this.blobWriterAddHeader;
    }

    /**
     * Set the blobWriterAddHeader property: Blob writer add header. Type: boolean (or Expression with resultType
     * boolean).
     * 
     * @param blobWriterAddHeader the blobWriterAddHeader value to set.
     * @return the BlobSink object itself.
     */
    public BlobSink withBlobWriterAddHeader(Object blobWriterAddHeader) {
        this.blobWriterAddHeader = blobWriterAddHeader;
        return this;
    }

    /**
     * Get the copyBehavior property: The type of copy behavior for copy sink.
     * 
     * @return the copyBehavior value.
     */
    public Object copyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the copyBehavior property: The type of copy behavior for copy sink.
     * 
     * @param copyBehavior the copyBehavior value to set.
     * @return the BlobSink object itself.
     */
    public BlobSink withCopyBehavior(Object copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

    /**
     * Get the metadata property: Specify the custom metadata to be added to sink data. Type: array of objects (or
     * Expression with resultType array of objects).
     * 
     * @return the metadata value.
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Specify the custom metadata to be added to sink data. Type: array of objects (or
     * Expression with resultType array of objects).
     * 
     * @param metadata the metadata value to set.
     * @return the BlobSink object itself.
     */
    public BlobSink withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobSink withDisableMetricsCollection(Object disableMetricsCollection) {
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
        if (metadata() != null) {
            metadata().forEach(e -> e.validate());
        }
    }
}
