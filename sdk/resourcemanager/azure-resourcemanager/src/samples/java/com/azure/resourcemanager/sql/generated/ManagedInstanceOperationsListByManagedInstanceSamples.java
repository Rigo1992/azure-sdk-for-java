// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for ManagedInstanceOperations ListByManagedInstance. */
public final class ManagedInstanceOperationsListByManagedInstanceSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ListManagedInstanceOperations.json
     */
    /**
     * Sample code: List the managed instance management operations.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listTheManagedInstanceManagementOperations(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstanceOperations()
            .listByManagedInstance("sqlcrudtest-7398", "sqlcrudtest-4645", com.azure.core.util.Context.NONE);
    }
}
