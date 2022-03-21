// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.kusto.models.ReadWriteDatabase;
import java.time.Duration;

/** Samples for Databases Update. */
public final class DatabasesUpdateSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2022-02-01/examples/KustoDatabasesUpdate.json
     */
    /**
     * Sample code: KustoDatabasesUpdate.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDatabasesUpdate(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .databases()
            .update(
                "kustorptest",
                "kustoCluster",
                "KustoDatabase8",
                new ReadWriteDatabase().withHotCachePeriod(Duration.parse("P1D")),
                Context.NONE);
    }
}
