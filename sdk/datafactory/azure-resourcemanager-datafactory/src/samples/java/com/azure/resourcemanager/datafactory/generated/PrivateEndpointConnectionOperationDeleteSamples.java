// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

/**
 * Samples for PrivateEndpointConnectionOperation Delete.
 */
public final class PrivateEndpointConnectionOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/
     * DeletePrivateEndpointConnection.json
     */
    /**
     * Sample code: Delete a private endpoint connection for a datafactory.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void deleteAPrivateEndpointConnectionForADatafactory(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.privateEndpointConnectionOperations().deleteWithResponse("exampleResourceGroup", "exampleFactoryName",
            "connection", com.azure.core.util.Context.NONE);
    }
}
