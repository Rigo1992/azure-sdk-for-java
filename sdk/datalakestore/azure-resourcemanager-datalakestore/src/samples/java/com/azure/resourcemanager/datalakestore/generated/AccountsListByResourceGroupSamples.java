// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

/** Samples for Accounts ListByResourceGroup. */
public final class AccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/datalake-store/resource-manager/Microsoft.DataLakeStore/stable/2016-11-01/examples/Accounts_ListByResourceGroup.json
     */
    /**
     * Sample code: Lists the Data Lake Store accounts within a specific resource group.
     *
     * @param manager Entry point to DataLakeStoreManager.
     */
    public static void listsTheDataLakeStoreAccountsWithinASpecificResourceGroup(
        com.azure.resourcemanager.datalakestore.DataLakeStoreManager manager) {
        manager
            .accounts()
            .listByResourceGroup(
                "contosorg",
                "test_filter",
                1,
                1,
                "test_select",
                "test_orderby",
                false,
                com.azure.core.util.Context.NONE);
    }
}
