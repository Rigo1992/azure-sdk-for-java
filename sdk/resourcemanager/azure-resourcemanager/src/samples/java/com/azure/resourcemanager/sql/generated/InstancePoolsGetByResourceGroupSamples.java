// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for InstancePools GetByResourceGroup. */
public final class InstancePoolsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/GetInstancePool.json
     */
    /**
     * Sample code: Get an instance pool.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAnInstancePool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getInstancePools()
            .getByResourceGroupWithResponse("group1", "testIP", com.azure.core.util.Context.NONE);
    }
}
