// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Microsoft Access sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MicrosoftAccessSink")
@Fluent
public final class MicrosoftAccessSink extends CopySink {
    /*
     * A query to execute before starting the copy. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /**
     * Get the preCopyScript property: A query to execute before starting the copy. Type: string (or Expression with
     * resultType string).
     *
     * @return the preCopyScript value.
     */
    public Object getPreCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: A query to execute before starting the copy. Type: string (or Expression with
     * resultType string).
     *
     * @param preCopyScript the preCopyScript value to set.
     * @return the MicrosoftAccessSink object itself.
     */
    public MicrosoftAccessSink setPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftAccessSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
