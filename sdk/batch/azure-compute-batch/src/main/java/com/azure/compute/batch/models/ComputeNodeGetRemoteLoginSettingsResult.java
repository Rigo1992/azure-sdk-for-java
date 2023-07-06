// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The remote login settings for a Compute Node. */
@Immutable
public final class ComputeNodeGetRemoteLoginSettingsResult {

    /*
     * The IP address used for remote login to the Compute Node.
     */
    @Generated
    @JsonProperty(value = "remoteLoginIPAddress")
    private String remoteLoginIPAddress;

    /*
     * The port used for remote login to the Compute Node.
     */
    @Generated
    @JsonProperty(value = "remoteLoginPort")
    private int remoteLoginPort;

    /**
     * Creates an instance of ComputeNodeGetRemoteLoginSettingsResult class.
     *
     * @param remoteLoginIPAddress the remoteLoginIPAddress value to set.
     * @param remoteLoginPort the remoteLoginPort value to set.
     */
    @Generated
    @JsonCreator
    private ComputeNodeGetRemoteLoginSettingsResult(
            @JsonProperty(value = "remoteLoginIPAddress") String remoteLoginIPAddress,
            @JsonProperty(value = "remoteLoginPort") int remoteLoginPort) {
        this.remoteLoginIPAddress = remoteLoginIPAddress;
        this.remoteLoginPort = remoteLoginPort;
    }

    /**
     * Get the remoteLoginIPAddress property: The IP address used for remote login to the Compute Node.
     *
     * @return the remoteLoginIPAddress value.
     */
    @Generated
    public String getRemoteLoginIPAddress() {
        return this.remoteLoginIPAddress;
    }

    /**
     * Get the remoteLoginPort property: The port used for remote login to the Compute Node.
     *
     * @return the remoteLoginPort value.
     */
    @Generated
    public int getRemoteLoginPort() {
        return this.remoteLoginPort;
    }
}
