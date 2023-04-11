// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

/** Samples for PrivateEndpointConnections List. */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/digitaltwins/resource-manager/Microsoft.DigitalTwins/stable/2023-01-31/examples/PrivateEndpointConnectionsList_example.json
     */
    /**
     * Sample code: List private endpoint connection properties.
     *
     * @param manager Entry point to AzureDigitalTwinsManager.
     */
    public static void listPrivateEndpointConnectionProperties(
        com.azure.resourcemanager.digitaltwins.AzureDigitalTwinsManager manager) {
        manager
            .privateEndpointConnections()
            .listWithResponse("resRg", "myDigitalTwinsService", com.azure.core.util.Context.NONE);
    }
}
