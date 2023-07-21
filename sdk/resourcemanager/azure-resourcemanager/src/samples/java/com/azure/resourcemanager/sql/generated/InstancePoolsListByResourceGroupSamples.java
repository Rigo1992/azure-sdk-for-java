// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for InstancePools ListByResourceGroup. */
public final class InstancePoolsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ListInstancePoolsByResourceGroup.json
     */
    /**
     * Sample code: List instance pools by resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listInstancePoolsByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getInstancePools()
            .listByResourceGroup("group1", com.azure.core.util.Context.NONE);
    }
}
