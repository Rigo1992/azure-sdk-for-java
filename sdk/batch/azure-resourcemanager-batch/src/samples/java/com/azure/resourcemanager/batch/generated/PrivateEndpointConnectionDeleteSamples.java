// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/**
 * Samples for PrivateEndpointConnection Delete.
 */
public final class PrivateEndpointConnectionDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/batch/resource-manager/Microsoft.Batch/stable/2024-02-01/examples/PrivateEndpointConnectionDelete.
     * json
     */
    /**
     * Sample code: PrivateEndpointConnectionDelete.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void privateEndpointConnectionDelete(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.privateEndpointConnections().delete("default-azurebatch-japaneast", "sampleacct",
            "testprivateEndpointConnection5testprivateEndpointConnection5.24d6b4b5-e65c-4330-bbe9-3a290d62f8e0",
            com.azure.core.util.Context.NONE);
    }
}
