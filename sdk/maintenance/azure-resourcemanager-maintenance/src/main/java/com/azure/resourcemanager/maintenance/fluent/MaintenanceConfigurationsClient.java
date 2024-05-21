// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.maintenance.fluent.models.MaintenanceConfigurationInner;

/**
 * An instance of this class provides access to all the operations defined in MaintenanceConfigurationsClient.
 */
public interface MaintenanceConfigurationsClient {
    /**
     * Get Configuration record.
     * 
     * @param resourceGroupName Resource Group Name.
     * @param resourceName Maintenance Configuration Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration record along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MaintenanceConfigurationInner> getByResourceGroupWithResponse(String resourceGroupName,
        String resourceName, Context context);

    /**
     * Get Configuration record.
     * 
     * @param resourceGroupName Resource Group Name.
     * @param resourceName Maintenance Configuration Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration record.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MaintenanceConfigurationInner getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Create or Update configuration record.
     * 
     * @param resourceGroupName Resource Group Name.
     * @param resourceName Maintenance Configuration Name.
     * @param configuration The configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return maintenance configuration record type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MaintenanceConfigurationInner> createOrUpdateWithResponse(String resourceGroupName, String resourceName,
        MaintenanceConfigurationInner configuration, Context context);

    /**
     * Create or Update configuration record.
     * 
     * @param resourceGroupName Resource Group Name.
     * @param resourceName Maintenance Configuration Name.
     * @param configuration The configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return maintenance configuration record type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MaintenanceConfigurationInner createOrUpdate(String resourceGroupName, String resourceName,
        MaintenanceConfigurationInner configuration);

    /**
     * Delete Configuration record.
     * 
     * @param resourceGroupName Resource Group Name.
     * @param resourceName Maintenance Configuration Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return maintenance configuration record type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MaintenanceConfigurationInner> deleteWithResponse(String resourceGroupName, String resourceName,
        Context context);

    /**
     * Delete Configuration record.
     * 
     * @param resourceGroupName Resource Group Name.
     * @param resourceName Maintenance Configuration Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return maintenance configuration record type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MaintenanceConfigurationInner delete(String resourceGroupName, String resourceName);

    /**
     * Patch configuration record.
     * 
     * @param resourceGroupName Resource Group Name.
     * @param resourceName Maintenance Configuration Name.
     * @param configuration The configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return maintenance configuration record type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MaintenanceConfigurationInner> updateWithResponse(String resourceGroupName, String resourceName,
        MaintenanceConfigurationInner configuration, Context context);

    /**
     * Patch configuration record.
     * 
     * @param resourceGroupName Resource Group Name.
     * @param resourceName Maintenance Configuration Name.
     * @param configuration The configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return maintenance configuration record type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MaintenanceConfigurationInner update(String resourceGroupName, String resourceName,
        MaintenanceConfigurationInner configuration);

    /**
     * Get Configuration records within a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration records within a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MaintenanceConfigurationInner> list();

    /**
     * Get Configuration records within a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration records within a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MaintenanceConfigurationInner> list(Context context);
}
