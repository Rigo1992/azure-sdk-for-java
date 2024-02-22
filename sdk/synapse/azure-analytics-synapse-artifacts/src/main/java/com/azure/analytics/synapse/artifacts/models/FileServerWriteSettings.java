// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * File server write settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FileServerWriteSettings")
@Fluent
public final class FileServerWriteSettings extends StoreWriteSettings {
    /**
     * Creates an instance of FileServerWriteSettings class.
     */
    public FileServerWriteSettings() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileServerWriteSettings setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileServerWriteSettings setCopyBehavior(Object copyBehavior) {
        super.setCopyBehavior(copyBehavior);
        return this;
    }
}
