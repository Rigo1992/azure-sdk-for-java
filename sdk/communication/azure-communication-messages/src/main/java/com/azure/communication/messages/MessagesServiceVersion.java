// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.communication.messages;

import com.azure.core.util.ServiceVersion;

/**
 * Service version of MessagesClient.
 */
public enum MessagesServiceVersion implements ServiceVersion {
    /**
     * Enum value 2024-02-01.
     */
    V2024_02_01("2024-02-01");

    private final String version;

    MessagesServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     * 
     * @return The latest {@link MessagesServiceVersion}.
     */
    public static MessagesServiceVersion getLatest() {
        return V2024_02_01;
    }
}
