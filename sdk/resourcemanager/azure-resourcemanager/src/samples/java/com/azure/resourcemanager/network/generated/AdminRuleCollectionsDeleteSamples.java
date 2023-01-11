// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for AdminRuleCollections Delete. */
public final class AdminRuleCollectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkManagerAdminRuleCollectionDelete.json
     */
    /**
     * Sample code: Deletes an admin rule collection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deletesAnAdminRuleCollection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getAdminRuleCollections()
            .delete("rg1", "testNetworkManager", "myTestSecurityConfig", "testRuleCollection", false, Context.NONE);
    }
}
