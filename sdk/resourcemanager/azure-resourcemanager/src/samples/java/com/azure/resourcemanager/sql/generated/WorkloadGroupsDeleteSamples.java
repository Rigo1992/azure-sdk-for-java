// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for WorkloadGroups Delete. */
public final class WorkloadGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/DeleteWorkloadGroup.json
     */
    /**
     * Sample code: Delete a workload group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAWorkloadGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getWorkloadGroups()
            .delete("Default-SQL-SouthEastAsia", "testsvr", "testdb", "wlm_workloadgroup", Context.NONE);
    }
}
