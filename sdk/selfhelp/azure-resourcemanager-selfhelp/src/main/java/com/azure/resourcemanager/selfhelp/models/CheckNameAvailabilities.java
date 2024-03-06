// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of CheckNameAvailabilities.
 */
public interface CheckNameAvailabilities {
    /**
     * This API is used to check the uniqueness of a resource name used for a diagnostic, troubleshooter or solutions.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param checkNameAvailabilityRequest The required parameters for availability check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for whether the requested resource name is available or not along with {@link Response}.
     */
    Response<CheckNameAvailabilityResponse> postWithResponse(String scope,
        CheckNameAvailabilityRequest checkNameAvailabilityRequest, Context context);

    /**
     * This API is used to check the uniqueness of a resource name used for a diagnostic, troubleshooter or solutions.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for whether the requested resource name is available or not.
     */
    CheckNameAvailabilityResponse post(String scope);
}
