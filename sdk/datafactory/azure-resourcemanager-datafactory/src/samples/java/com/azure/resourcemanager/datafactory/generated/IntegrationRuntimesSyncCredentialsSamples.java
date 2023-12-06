// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for IntegrationRuntimes SyncCredentials.
 */
public final class IntegrationRuntimesSyncCredentialsSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/
     * IntegrationRuntimes_SyncCredentials.json
     */
    /**
     * Sample code: IntegrationRuntimes_SyncCredentials.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void
        integrationRuntimesSyncCredentials(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.integrationRuntimes().syncCredentialsWithResponse("exampleResourceGroup", "exampleFactoryName",
            "exampleIntegrationRuntime", com.azure.core.util.Context.NONE);
    }
}
