// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.models.RestoreDetailsName;

/** Samples for ManagedDatabaseRestoreDetails Get. */
public final class ManagedDatabaseRestoreDetailsGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2019-06-01-preview/examples/ManagedDatabaseRestoreDetails.json
     */
    /**
     * Sample code: Managed database restore details.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void managedDatabaseRestoreDetails(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedDatabaseRestoreDetails()
            .getWithResponse(
                "Default-SQL-SouthEastAsia", "managedInstance", "testdb", RestoreDetailsName.DEFAULT, Context.NONE);
    }
}
