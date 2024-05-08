// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.resourcemanager.mysqlflexibleserver.models.AdministratorName;

/**
 * Samples for AzureADAdministrators Delete.
 */
public final class AzureADAdministratorsDeleteSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/AAD/preview/2023-06-01-preview/examples/AzureADAdministratorDelete.json
     */
    /**
     * Sample code: Delete an azure ad administrator.
     * 
     * @param manager Entry point to MySqlManager.
     */
    public static void
        deleteAnAzureAdAdministrator(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.azureADAdministrators()
            .delete("testrg", "mysqltestsvc4", AdministratorName.ACTIVE_DIRECTORY, com.azure.core.util.Context.NONE);
    }
}
