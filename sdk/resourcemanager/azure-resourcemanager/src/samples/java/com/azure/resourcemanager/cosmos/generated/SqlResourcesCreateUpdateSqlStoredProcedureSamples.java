// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.models.SqlStoredProcedureCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.models.SqlStoredProcedureResource;

/**
 * Samples for SqlResources CreateUpdateSqlStoredProcedure.
 */
public final class SqlResourcesCreateUpdateSqlStoredProcedureSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-11-15/examples/
     * CosmosDBSqlStoredProcedureCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBSqlStoredProcedureCreateUpdate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlStoredProcedureCreateUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getSqlResources().createUpdateSqlStoredProcedure("rg1",
            "ddb1", "databaseName", "containerName", "storedProcedureName",
            new SqlStoredProcedureCreateUpdateParameters()
                .withResource(new SqlStoredProcedureResource().withId("storedProcedureName").withBody("body"))
                .withOptions(new CreateUpdateOptions()),
            com.azure.core.util.Context.NONE);
    }
}
