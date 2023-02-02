// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

/** Samples for Clusters ListByResourceGroup. */
public final class ClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/servicefabric/resource-manager/Microsoft.ServiceFabric/stable/2021-06-01/examples/ClusterListByResourceGroupOperation_example.json
     */
    /**
     * Sample code: List cluster by resource group.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void listClusterByResourceGroup(
        com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.clusters().listByResourceGroupWithResponse("resRg", com.azure.core.util.Context.NONE);
    }
}
