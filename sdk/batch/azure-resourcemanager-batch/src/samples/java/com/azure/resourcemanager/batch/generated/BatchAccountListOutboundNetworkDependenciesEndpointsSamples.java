// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/**
 * Samples for BatchAccount ListOutboundNetworkDependenciesEndpoints.
 */
public final class BatchAccountListOutboundNetworkDependenciesEndpointsSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2024-02-01/examples/
     * BatchAccountListOutboundNetworkDependenciesEndpoints.json
     */
    /**
     * Sample code: ListOutboundNetworkDependencies.
     * 
     * @param manager Entry point to BatchManager.
     */
    public static void listOutboundNetworkDependencies(com.azure.resourcemanager.batch.BatchManager manager) {
        manager.batchAccounts().listOutboundNetworkDependenciesEndpoints("default-azurebatch-japaneast", "sampleacct",
            com.azure.core.util.Context.NONE);
    }
}
