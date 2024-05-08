// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger for an exception action on exceeding queue length. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("queueLength")
@Immutable
public final class QueueLengthExceptionTrigger extends ExceptionTrigger {

    /*
     * Threshold of number of jobs ahead in the queue to for this trigger to fire.
     */
    @JsonProperty(value = "threshold")
    private int threshold;

    /**
     * Creates an instance of QueueLengthExceptionTrigger class.
     *
     * @param threshold the threshold value to set.
     */
    @JsonCreator
    public QueueLengthExceptionTrigger(@JsonProperty(value = "threshold") int threshold) {
        this.threshold = threshold;
    }

    /**
     * Returns kind discriminator.
     * @return kind.
     */
    public ExceptionTriggerKind getKind() {
        return ExceptionTriggerKind.QUEUE_LENGTH;
    }

    /**
     * Get the threshold property: Threshold of number of jobs ahead in the queue to for this trigger to fire.
     *
     * @return the threshold value.
     */
    public int getThreshold() {
        return this.threshold;
    }
}
