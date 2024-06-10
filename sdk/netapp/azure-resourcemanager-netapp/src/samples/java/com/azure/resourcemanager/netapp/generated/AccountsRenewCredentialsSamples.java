// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for Accounts RenewCredentials.
 */
public final class AccountsRenewCredentialsSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-11-01/examples/Accounts_RenewCredentials.json
     */
    /**
     * Sample code: Accounts_RenewCredentials.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void accountsRenewCredentials(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.accounts().renewCredentials("myRG", "account1", com.azure.core.util.Context.NONE);
    }
}
