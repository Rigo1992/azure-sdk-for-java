// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

/** Samples for Vaults Delete. */
public final class VaultsDeleteSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2023-02-01/examples/deleteVault.json
     */
    /**
     * Sample code: Delete a vault.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteAVault(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .vaults()
            .manager()
            .serviceClient()
            .getVaults()
            .deleteWithResponse("sample-resource-group", "sample-vault", com.azure.core.util.Context.NONE);
    }
}
