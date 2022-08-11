// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for SyncAgents GenerateKey. */
public final class SyncAgentsGenerateKeySamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2015-05-01-preview/examples/SyncAgentGenerateKey.json
     */
    /**
     * Sample code: Generate a sync agent key.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void generateASyncAgentKey(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getSyncAgents()
            .generateKeyWithResponse("syncagentcrud-65440", "syncagentcrud-8475", "syncagentcrud-3187", Context.NONE);
    }
}
