// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for Databases Pause. */
public final class DatabasesPauseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/PauseDatabase.json
     */
    /**
     * Sample code: Pauses a database.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void pausesADatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabases()
            .pause("Default-SQL-SouthEastAsia", "testsvr", "testdwdb", Context.NONE);
    }
}
