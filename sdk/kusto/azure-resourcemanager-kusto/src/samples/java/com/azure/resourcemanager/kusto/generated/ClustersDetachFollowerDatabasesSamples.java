// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.kusto.fluent.models.FollowerDatabaseDefinitionInner;

/** Samples for Clusters DetachFollowerDatabases. */
public final class ClustersDetachFollowerDatabasesSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2022-02-01/examples/KustoClusterDetachFollowerDatabases.json
     */
    /**
     * Sample code: KustoClusterDetachFollowerDatabases.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoClusterDetachFollowerDatabases(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .clusters()
            .detachFollowerDatabases(
                "kustorptest",
                "kustoCluster",
                new FollowerDatabaseDefinitionInner()
                    .withClusterResourceId(
                        "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/clusters/kustoCluster2")
                    .withAttachedDatabaseConfigurationName("attachedDatabaseConfigurationsTest"),
                Context.NONE);
    }
}
