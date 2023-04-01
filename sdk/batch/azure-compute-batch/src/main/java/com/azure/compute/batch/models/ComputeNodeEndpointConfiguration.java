// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The endpoint configuration for the Compute Node. */
@Immutable
public final class ComputeNodeEndpointConfiguration {
    /*
     * The list of inbound endpoints that are accessible on the Compute Node.
     */
    @JsonProperty(value = "inboundEndpoints", required = true)
    private List<InboundEndpoint> inboundEndpoints;

    /**
     * Creates an instance of ComputeNodeEndpointConfiguration class.
     *
     * @param inboundEndpoints the inboundEndpoints value to set.
     */
    @JsonCreator
    private ComputeNodeEndpointConfiguration(
            @JsonProperty(value = "inboundEndpoints", required = true) List<InboundEndpoint> inboundEndpoints) {
        this.inboundEndpoints = inboundEndpoints;
    }

    /**
     * Get the inboundEndpoints property: The list of inbound endpoints that are accessible on the Compute Node.
     *
     * @return the inboundEndpoints value.
     */
    public List<InboundEndpoint> getInboundEndpoints() {
        return this.inboundEndpoints;
    }
}
