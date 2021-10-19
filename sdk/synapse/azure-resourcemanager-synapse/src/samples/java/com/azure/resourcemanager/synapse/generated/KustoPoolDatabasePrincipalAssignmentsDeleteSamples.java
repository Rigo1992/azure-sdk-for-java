// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for KustoPoolDatabasePrincipalAssignments Delete. */
public final class KustoPoolDatabasePrincipalAssignmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/KustoPoolDatabasePrincipalAssignmentsDelete.json
     */
    /**
     * Sample code: KustoPoolDatabasePrincipalAssignmentsDelete.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolDatabasePrincipalAssignmentsDelete(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .kustoPoolDatabasePrincipalAssignments()
            .delete(
                "synapseWorkspaceName",
                "kustoclusterrptest4",
                "Kustodatabase8",
                "kustoprincipal1",
                "kustorptest",
                Context.NONE);
    }
}
