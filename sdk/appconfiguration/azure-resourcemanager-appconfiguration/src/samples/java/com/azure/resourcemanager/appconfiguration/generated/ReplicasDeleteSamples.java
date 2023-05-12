// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

/** Samples for Replicas Delete. */
public final class ReplicasDeleteSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2023-03-01/examples/ConfigurationStoresDeleteReplica.json
     */
    /**
     * Sample code: Replicas_Delete.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void replicasDelete(com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.replicas().delete("myResourceGroup", "contoso", "myReplicaEus", com.azure.core.util.Context.NONE);
    }
}
