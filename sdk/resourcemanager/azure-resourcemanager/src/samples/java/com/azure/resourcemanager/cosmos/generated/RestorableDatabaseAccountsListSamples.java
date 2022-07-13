// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.util.Context;

/** Samples for RestorableDatabaseAccounts List. */
public final class RestorableDatabaseAccountsListSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-05-15/examples/CosmosDBRestorableDatabaseAccountNoLocationList.json
     */
    /**
     * Sample code: CosmosDBRestorableDatabaseAccountNoLocationList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBRestorableDatabaseAccountNoLocationList(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getRestorableDatabaseAccounts().list(Context.NONE);
    }
}
