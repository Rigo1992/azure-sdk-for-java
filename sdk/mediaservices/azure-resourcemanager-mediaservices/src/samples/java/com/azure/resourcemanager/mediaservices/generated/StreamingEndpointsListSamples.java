// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/** Samples for StreamingEndpoints List. */
public final class StreamingEndpointsListSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Streaming/stable/2022-08-01/examples/streamingendpoint-list-all.json
     */
    /**
     * Sample code: List all streaming endpoints.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void listAllStreamingEndpoints(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.streamingEndpoints().list("mediaresources", "slitestmedia10", com.azure.core.util.Context.NONE);
    }
}
