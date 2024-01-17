// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

/** Samples for Vaults GetDeleted. */
public final class VaultsGetDeletedSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2023-07-01/examples/getDeletedVault.json
     */
    /**
     * Sample code: Retrieve a deleted vault.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void retrieveADeletedVault(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .vaults()
            .manager()
            .serviceClient()
            .getVaults()
            .getDeletedWithResponse("sample-vault", "westus", com.azure.core.util.Context.NONE);
    }
}
