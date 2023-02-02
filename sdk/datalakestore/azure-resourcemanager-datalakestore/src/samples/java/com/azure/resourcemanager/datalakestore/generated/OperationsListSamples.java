// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/datalake-store/resource-manager/Microsoft.DataLakeStore/stable/2016-11-01/examples/Operations_List.json
     */
    /**
     * Sample code: Lists all of the available Data Lake Store REST API operations.
     *
     * @param manager Entry point to DataLakeStoreManager.
     */
    public static void listsAllOfTheAvailableDataLakeStoreRESTAPIOperations(
        com.azure.resourcemanager.datalakestore.DataLakeStoreManager manager) {
        manager.operations().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
