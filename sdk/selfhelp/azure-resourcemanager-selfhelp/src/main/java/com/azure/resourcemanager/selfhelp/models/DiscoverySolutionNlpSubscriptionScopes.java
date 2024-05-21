// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of DiscoverySolutionNlpSubscriptionScopes.
 */
public interface DiscoverySolutionNlpSubscriptionScopes {
    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary and
     * subscription.
     * 
     * @param subscriptionId The Azure subscription ID.
     * @param discoverSolutionRequest Request body for discovering solutions using NLP.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata along with {@link Response}.
     */
    Response<DiscoveryNlpResponse> postWithResponse(String subscriptionId, DiscoveryNlpRequest discoverSolutionRequest,
        Context context);

    /**
     * Search for relevant Azure Diagnostics, Solutions and Troubleshooters using a natural language issue summary and
     * subscription.
     * 
     * @param subscriptionId The Azure subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return successfully fetched list of solution metadata.
     */
    DiscoveryNlpResponse post(String subscriptionId);
}
