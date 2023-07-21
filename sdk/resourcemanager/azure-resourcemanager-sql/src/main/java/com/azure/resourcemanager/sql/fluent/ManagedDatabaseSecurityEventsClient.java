// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.SecurityEventInner;

/** An instance of this class provides access to all the operations defined in ManagedDatabaseSecurityEventsClient. */
public interface ManagedDatabaseSecurityEventsClient {
    /**
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param skiptoken An opaque token that identifies a starting point in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SecurityEventInner> listByDatabaseAsync(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String filter,
        Integer skip,
        Integer top,
        String skiptoken);

    /**
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SecurityEventInner> listByDatabaseAsync(
        String resourceGroupName, String managedInstanceName, String databaseName);

    /**
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityEventInner> listByDatabase(
        String resourceGroupName, String managedInstanceName, String databaseName);

    /**
     * Gets a list of security events.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security events are retrieved.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param skip The number of elements in the collection to skip.
     * @param top The number of elements to return from the collection.
     * @param skiptoken An opaque token that identifies a starting point in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of security events as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityEventInner> listByDatabase(
        String resourceGroupName,
        String managedInstanceName,
        String databaseName,
        String filter,
        Integer skip,
        Integer top,
        String skiptoken,
        Context context);
}
