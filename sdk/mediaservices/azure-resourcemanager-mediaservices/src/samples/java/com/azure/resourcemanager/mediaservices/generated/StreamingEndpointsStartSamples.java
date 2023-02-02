// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/** Samples for StreamingEndpoints Start. */
public final class StreamingEndpointsStartSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Streaming/stable/2022-08-01/examples/streamingendpoint-start.json
     */
    /**
     * Sample code: Start a streaming endpoint.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void startAStreamingEndpoint(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .streamingEndpoints()
            .start("mediaresources", "slitestmedia10", "myStreamingEndpoint1", com.azure.core.util.Context.NONE);
    }
}
