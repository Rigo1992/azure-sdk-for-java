// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner;

/** An instance of this class provides access to all the operations defined in ApplyUpdateForResourceGroupsClient. */
public interface ApplyUpdateForResourceGroupsClient {
    /**
     * Get Configuration records within a subscription and resource group.
     *
     * @param resourceGroupName Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration records within a subscription and resource group as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplyUpdateInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get Configuration records within a subscription and resource group.
     *
     * @param resourceGroupName Resource Group Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration records within a subscription and resource group as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplyUpdateInner> listByResourceGroup(String resourceGroupName, Context context);
}
