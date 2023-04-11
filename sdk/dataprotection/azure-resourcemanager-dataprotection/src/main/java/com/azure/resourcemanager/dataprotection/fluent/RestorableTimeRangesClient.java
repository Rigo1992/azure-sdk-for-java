// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.fluent.models.AzureBackupFindRestorableTimeRangesResponseResourceInner;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesRequest;

/** An instance of this class provides access to all the operations defined in RestorableTimeRangesClient. */
public interface RestorableTimeRangesClient {
    /**
     * The find operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the backup vault.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list Restore Ranges Response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureBackupFindRestorableTimeRangesResponseResourceInner> findWithResponse(
        String resourceGroupName,
        String vaultName,
        String backupInstanceName,
        AzureBackupFindRestorableTimeRangesRequest parameters,
        Context context);

    /**
     * The find operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param vaultName The name of the backup vault.
     * @param backupInstanceName The name of the backup instance.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list Restore Ranges Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureBackupFindRestorableTimeRangesResponseResourceInner find(
        String resourceGroupName,
        String vaultName,
        String backupInstanceName,
        AzureBackupFindRestorableTimeRangesRequest parameters);
}
