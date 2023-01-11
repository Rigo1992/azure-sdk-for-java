// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ApiCollectionOffboardings. */
public interface ApiCollectionOffboardings {
    /**
     * Offboard an Azure API Management API from Defender for APIs
     *
     * <p>Offboard an Azure API Management API from Defender for APIs. The system will stop monitoring the operations
     * within the Azure API Management API for intrusive behaviors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String apiCollectionId, Context context);

    /**
     * Offboard an Azure API Management API from Defender for APIs
     *
     * <p>Offboard an Azure API Management API from Defender for APIs. The system will stop monitoring the operations
     * within the Azure API Management API for intrusive behaviors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String apiCollectionId);
}
