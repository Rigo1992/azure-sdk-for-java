// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The trigger for this exception rule. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = ExceptionTrigger.class)
@JsonTypeName("ExceptionTrigger")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "queueLength", value = QueueLengthExceptionTrigger.class),
    @JsonSubTypes.Type(name = "waitTime", value = WaitTimeExceptionTrigger.class)
})
@Immutable
public abstract class ExceptionTrigger {
    /**
     * kind discriminator.
     */
    @JsonProperty(value = "kind")
    private ExceptionTriggerKind kind;

    /** Creates an instance of ExceptionTrigger class. */
    public ExceptionTrigger() {}

    /**
     * Returns kind discriminator.
     * @return kind.
     */
    public abstract ExceptionTriggerKind getKind();
}
