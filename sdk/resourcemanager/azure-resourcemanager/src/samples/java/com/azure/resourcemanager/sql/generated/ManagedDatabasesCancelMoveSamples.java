// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.ManagedDatabaseMoveDefinition;

/** Samples for ManagedDatabases CancelMove. */
public final class ManagedDatabasesCancelMoveSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-08-01-preview/examples/ManagedDatabaseCancelMove.json
     */
    /**
     * Sample code: Cancels a managed database move.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cancelsAManagedDatabaseMove(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedDatabases()
            .cancelMove(
                "group1",
                "testInstanceSrc",
                "testDatabase",
                new ManagedDatabaseMoveDefinition()
                    .withDestinationManagedDatabaseId(
                        "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/managedInstances/testInstanceTgt/databases/testDatabase"),
                com.azure.core.util.Context.NONE);
    }
}
