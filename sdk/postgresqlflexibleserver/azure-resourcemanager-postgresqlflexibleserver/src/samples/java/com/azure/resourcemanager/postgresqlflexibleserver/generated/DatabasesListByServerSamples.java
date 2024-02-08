// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

/**
 * Samples for Databases ListByServer.
 */
public final class DatabasesListByServerSamples {
    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2023-06-01-preview/examples/
     * DatabasesListByServer.json
     */
    /**
     * Sample code: List databases in a server.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void
        listDatabasesInAServer(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.databases().listByServer("TestGroup", "testserver", com.azure.core.util.Context.NONE);
    }
}
