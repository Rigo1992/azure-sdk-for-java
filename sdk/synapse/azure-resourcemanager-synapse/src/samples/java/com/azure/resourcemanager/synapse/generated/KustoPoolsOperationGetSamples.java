// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.Context;

/** Samples for KustoPoolsOperation Get. */
public final class KustoPoolsOperationGetSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/KustoPoolsGet.json
     */
    /**
     * Sample code: kustoPoolsGet.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolsGet(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .kustoPoolsOperations()
            .getWithResponse("synapseWorkspaceName", "kustoclusterrptest4", "kustorptest", Context.NONE);
    }
}
