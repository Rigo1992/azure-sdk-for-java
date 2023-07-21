// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/** Samples for ServerAutomaticTuning Get. */
public final class ServerAutomaticTuningGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/ServerAutomaticTuningGet.json
     */
    /**
     * Sample code: Get a server's automatic tuning settings.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAServerSAutomaticTuningSettings(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerAutomaticTunings()
            .getWithResponse("default-sql-onebox", "testsvr11", com.azure.core.util.Context.NONE);
    }
}
