// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Quotas. */
public interface Quotas {
    /**
     * Update quota for each VM family in workspace.
     *
     * @param location The location for update quota is queried.
     * @param parameters Quota update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of update workspace quota.
     */
    UpdateWorkspaceQuotasResult update(String location, QuotaUpdateParameters parameters);

    /**
     * Update quota for each VM family in workspace.
     *
     * @param location The location for update quota is queried.
     * @param parameters Quota update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of update workspace quota along with {@link Response}.
     */
    Response<UpdateWorkspaceQuotasResult> updateWithResponse(
        String location, QuotaUpdateParameters parameters, Context context);

    /**
     * Gets the currently assigned Workspace Quotas based on VMFamily.
     *
     * @param location The location for which resource usage is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently assigned Workspace Quotas based on VMFamily as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ResourceQuota> list(String location);

    /**
     * Gets the currently assigned Workspace Quotas based on VMFamily.
     *
     * @param location The location for which resource usage is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently assigned Workspace Quotas based on VMFamily as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<ResourceQuota> list(String location, Context context);
}
