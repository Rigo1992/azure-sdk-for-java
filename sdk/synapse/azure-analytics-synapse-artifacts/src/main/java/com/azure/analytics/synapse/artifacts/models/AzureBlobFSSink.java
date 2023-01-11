// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure Data Lake Storage Gen2 sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobFSSink")
@Fluent
public final class AzureBlobFSSink extends CopySink {
    /*
     * The type of copy behavior for copy sink.
     */
    @JsonProperty(value = "copyBehavior")
    private Object copyBehavior;

    /** Creates an instance of AzureBlobFSSink class. */
    public AzureBlobFSSink() {}

    /**
     * Get the copyBehavior property: The type of copy behavior for copy sink.
     *
     * @return the copyBehavior value.
     */
    public Object getCopyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the copyBehavior property: The type of copy behavior for copy sink.
     *
     * @param copyBehavior the copyBehavior value to set.
     * @return the AzureBlobFSSink object itself.
     */
    public AzureBlobFSSink setCopyBehavior(Object copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
