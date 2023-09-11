// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for ClusterManagers List. */
public final class ClusterManagersListSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/ClusterManagers_ListBySubscription.json
     */
    /**
     * Sample code: List cluster managers for subscription.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void listClusterManagersForSubscription(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.clusterManagers().list(com.azure.core.util.Context.NONE);
    }
}
