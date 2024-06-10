// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ApplicationGateways BackendHealth.
 */
public final class ApplicationGatewaysBackendHealthSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/ApplicationGatewayBackendHealthGet.json
     */
    /**
     * Sample code: Get Backend Health.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getBackendHealth(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getApplicationGateways()
            .backendHealth("appgw", "appgw", null, com.azure.core.util.Context.NONE);
    }
}
