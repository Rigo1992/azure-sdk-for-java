// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for DistributedAvailabilityGroups ListByInstance. */
public final class DistributedAvailabilityGroupsListByInstanceSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/DistributedAvailabilityGroupsListByInstance.json
     */
    /**
     * Sample code: Lists all distributed availability groups in instance.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listsAllDistributedAvailabilityGroupsInInstance(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDistributedAvailabilityGroups()
            .listByInstance("testrg", "testcl", Context.NONE);
    }
}
