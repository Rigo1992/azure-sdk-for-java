// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualRouters Delete.
 */
public final class VirtualRoutersDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-11-01/examples/VirtualRouterDelete.json
     */
    /**
     * Sample code: Delete VirtualRouter.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteVirtualRouter(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getVirtualRouters()
            .delete("rg1", "virtualRouter", com.azure.core.util.Context.NONE);
    }
}
