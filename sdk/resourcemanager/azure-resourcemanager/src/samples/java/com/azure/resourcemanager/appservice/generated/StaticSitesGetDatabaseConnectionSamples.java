// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for StaticSites GetDatabaseConnection.
 */
public final class StaticSitesGetDatabaseConnectionSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/GetStaticSiteDatabaseConnection.json
     */
    /**
     * Sample code: Get overview of database connections for the static site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getOverviewOfDatabaseConnectionsForTheStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getStaticSites().getDatabaseConnectionWithResponse("rg",
            "testStaticSite0", "default", com.azure.core.util.Context.NONE);
    }
}
