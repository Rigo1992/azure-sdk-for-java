// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ReplicationMigrationItems. */
public interface ReplicationMigrationItems {
    /**
     * Gets the list of migration items in the protection container.
     *
     * <p>Gets the list of ASR migration items in the protection container.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ASR migration items in the protection container as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<MigrationItem> listByReplicationProtectionContainers(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName);

    /**
     * Gets the list of migration items in the protection container.
     *
     * <p>Gets the list of ASR migration items in the protection container.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param skipToken The pagination token.
     * @param takeToken The page size.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ASR migration items in the protection container as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<MigrationItem> listByReplicationProtectionContainers(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String skipToken,
        String takeToken,
        String filter,
        Context context);

    /**
     * Gets the details of a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a migration item along with {@link Response}.
     */
    Response<MigrationItem> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        Context context);

    /**
     * Gets the details of a migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric unique name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a migration item.
     */
    MigrationItem get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName);

    /**
     * Delete the migration item.
     *
     * <p>The operation to delete an ASR migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName);

    /**
     * Delete the migration item.
     *
     * <p>The operation to delete an ASR migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param deleteOption The delete option.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String deleteOption,
        Context context);

    /**
     * Migrate item.
     *
     * <p>The operation to initiate migration of the item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param migrateInput Migrate input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem migrate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        MigrateInput migrateInput);

    /**
     * Migrate item.
     *
     * <p>The operation to initiate migration of the item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param migrateInput Migrate input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem migrate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        MigrateInput migrateInput,
        Context context);

    /**
     * Pause replication.
     *
     * <p>The operation to initiate pause replication of the item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param pauseReplicationInput Pause replication input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem pauseReplication(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        PauseReplicationInput pauseReplicationInput);

    /**
     * Pause replication.
     *
     * <p>The operation to initiate pause replication of the item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param pauseReplicationInput Pause replication input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem pauseReplication(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        PauseReplicationInput pauseReplicationInput,
        Context context);

    /**
     * Resume replication.
     *
     * <p>The operation to initiate resume replication of the item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param resumeReplicationInput Resume replication input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem resumeReplication(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        ResumeReplicationInput resumeReplicationInput);

    /**
     * Resume replication.
     *
     * <p>The operation to initiate resume replication of the item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param resumeReplicationInput Resume replication input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem resumeReplication(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        ResumeReplicationInput resumeReplicationInput,
        Context context);

    /**
     * Resynchronizes replication.
     *
     * <p>The operation to resynchronize replication of an ASR migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param input Resync input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem resync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        ResyncInput input);

    /**
     * Resynchronizes replication.
     *
     * <p>The operation to resynchronize replication of an ASR migration item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param input Resync input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem resync(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        ResyncInput input,
        Context context);

    /**
     * Test migrate item.
     *
     * <p>The operation to initiate test migration of the item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param testMigrateInput Test migrate input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem testMigrate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        TestMigrateInput testMigrateInput);

    /**
     * Test migrate item.
     *
     * <p>The operation to initiate test migration of the item.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param testMigrateInput Test migrate input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem testMigrate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        TestMigrateInput testMigrateInput,
        Context context);

    /**
     * Test migrate cleanup.
     *
     * <p>The operation to initiate test migrate cleanup.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param testMigrateCleanupInput Test migrate cleanup input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem testMigrateCleanup(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        TestMigrateCleanupInput testMigrateCleanupInput);

    /**
     * Test migrate cleanup.
     *
     * <p>The operation to initiate test migrate cleanup.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param migrationItemName Migration item name.
     * @param testMigrateCleanupInput Test migrate cleanup input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem testMigrateCleanup(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        TestMigrateCleanupInput testMigrateCleanupInput,
        Context context);

    /**
     * Gets the list of migration items in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of migration items in the vault as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MigrationItem> list(String resourceName, String resourceGroupName);

    /**
     * Gets the list of migration items in the vault.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param skipToken The pagination token.
     * @param takeToken The page size.
     * @param filter OData filter options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of migration items in the vault as paginated response with {@link PagedIterable}.
     */
    PagedIterable<MigrationItem> list(
        String resourceName,
        String resourceGroupName,
        String skipToken,
        String takeToken,
        String filter,
        Context context);

    /**
     * Gets the details of a migration item.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a migration item along with {@link Response}.
     */
    MigrationItem getById(String id);

    /**
     * Gets the details of a migration item.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a migration item along with {@link Response}.
     */
    Response<MigrationItem> getByIdWithResponse(String id, Context context);

    /**
     * Delete the migration item.
     *
     * <p>The operation to delete an ASR migration item.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the migration item.
     *
     * <p>The operation to delete an ASR migration item.
     *
     * @param id the resource ID.
     * @param deleteOption The delete option.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, String deleteOption, Context context);

    /**
     * Begins definition for a new MigrationItem resource.
     *
     * @param name resource name.
     * @return the first stage of the new MigrationItem definition.
     */
    MigrationItem.DefinitionStages.Blank define(String name);
}
