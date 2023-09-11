// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of ApiWikisOperations. */
public interface ApiWikisOperations {
    /**
     * Gets the wikis for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the wikis for an API specified by its identifier as paginated response with {@link PagedIterable}.
     */
    PagedIterable<WikiContract> list(String resourceGroupName, String serviceName, String apiId);

    /**
     * Gets the wikis for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | eq |
     *     contains |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the wikis for an API specified by its identifier as paginated response with {@link PagedIterable}.
     */
    PagedIterable<WikiContract> list(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String filter,
        Integer top,
        Integer skip,
        Context context);
}
