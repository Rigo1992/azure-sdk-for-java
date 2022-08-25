// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated;

import com.azure.core.util.Context;

/** Samples for LocalUsersOperation List. */
public final class LocalUsersOperationListSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2022-05-01/examples/LocalUsersList.json
     */
    /**
     * Sample code: ListLocalUsers.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listLocalUsers(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .storageAccounts()
            .manager()
            .serviceClient()
            .getLocalUsersOperations()
            .list("res6977", "sto2527", Context.NONE);
    }
}
