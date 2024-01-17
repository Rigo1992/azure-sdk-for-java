// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

/**
 * Samples for PrivateEndpointConnections ListByAccount.
 */
public final class PrivateEndpointConnectionsListByAccountSamples {
    /*
     * x-ms-original-file:
     * specification/deviceupdate/resource-manager/Microsoft.DeviceUpdate/stable/2023-07-01/examples/
     * PrivateEndpointConnections/PrivateEndpointConnection_ListByAccount.json
     */
    /**
     * Sample code: PrivateEndpointConnectionList.
     * 
     * @param manager Entry point to DeviceUpdateManager.
     */
    public static void
        privateEndpointConnectionList(com.azure.resourcemanager.deviceupdate.DeviceUpdateManager manager) {
        manager.privateEndpointConnections().listByAccount("test-rg", "contoso", com.azure.core.util.Context.NONE);
    }
}
