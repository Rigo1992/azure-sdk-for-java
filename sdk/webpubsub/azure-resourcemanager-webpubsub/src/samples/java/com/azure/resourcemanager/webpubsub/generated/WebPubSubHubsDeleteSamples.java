// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.Context;

/** Samples for WebPubSubHubs Delete. */
public final class WebPubSubHubsDeleteSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/stable/2021-10-01/examples/WebPubSubHubs_Delete.json
     */
    /**
     * Sample code: WebPubSubHubs_Delete.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubHubsDelete(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager.webPubSubHubs().delete("exampleHub", "myResourceGroup", "myWebPubSubService", Context.NONE);
    }
}
