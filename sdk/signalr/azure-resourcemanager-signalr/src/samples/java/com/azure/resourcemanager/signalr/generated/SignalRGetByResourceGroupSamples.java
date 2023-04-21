// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

/** Samples for SignalR GetByResourceGroup. */
public final class SignalRGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/stable/2023-02-01/examples/SignalR_Get.json
     */
    /**
     * Sample code: SignalR_Get.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRGet(com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager
            .signalRs()
            .getByResourceGroupWithResponse("myResourceGroup", "mySignalRService", com.azure.core.util.Context.NONE);
    }
}
