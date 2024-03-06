// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ReplicationVaultSettings.
 */
public interface ReplicationVaultSettings {
    /**
     * Gets the list of vault setting.
     * 
     * Gets the list of vault setting. This includes the Migration Hub connection settings.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of vault setting as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VaultSetting> list(String resourceName, String resourceGroupName);

    /**
     * Gets the list of vault setting.
     * 
     * Gets the list of vault setting. This includes the Migration Hub connection settings.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of vault setting as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VaultSetting> list(String resourceName, String resourceGroupName, Context context);

    /**
     * Gets the vault setting.
     * 
     * Gets the vault setting. This includes the Migration Hub connection settings.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault setting along with {@link Response}.
     */
    Response<VaultSetting> getWithResponse(String resourceName, String resourceGroupName, String vaultSettingName,
        Context context);

    /**
     * Gets the vault setting.
     * 
     * Gets the vault setting. This includes the Migration Hub connection settings.
     * 
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultSettingName Vault setting name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault setting.
     */
    VaultSetting get(String resourceName, String resourceGroupName, String vaultSettingName);

    /**
     * Gets the vault setting.
     * 
     * Gets the vault setting. This includes the Migration Hub connection settings.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault setting along with {@link Response}.
     */
    VaultSetting getById(String id);

    /**
     * Gets the vault setting.
     * 
     * Gets the vault setting. This includes the Migration Hub connection settings.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the vault setting along with {@link Response}.
     */
    Response<VaultSetting> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VaultSetting resource.
     * 
     * @param name resource name.
     * @return the first stage of the new VaultSetting definition.
     */
    VaultSetting.DefinitionStages.Blank define(String name);
}
