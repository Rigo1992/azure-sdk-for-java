// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a label selector that will always be attached. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("static")
@Immutable
public final class StaticQueueSelectorAttachment extends QueueSelectorAttachmentInternal {
    /*
     * Describes a condition that must be met against a set of labels for queue selection
     */
    @JsonProperty(value = "labelSelector", required = true)
    private QueueSelectorInternal labelSelector;

    /**
     * Creates an instance of StaticQueueSelectorAttachment class.
     *
     * @param labelSelector the labelSelector value to set.
     */
    @JsonCreator
    public StaticQueueSelectorAttachment(
            @JsonProperty(value = "labelSelector", required = true) QueueSelectorInternal labelSelector) {
        this.labelSelector = labelSelector;
    }

    /**
     * Get the labelSelector property: Describes a condition that must be met against a set of labels for queue
     * selection.
     *
     * @return the labelSelector value.
     */
    public QueueSelectorInternal getLabelSelector() {
        return this.labelSelector;
    }
}
