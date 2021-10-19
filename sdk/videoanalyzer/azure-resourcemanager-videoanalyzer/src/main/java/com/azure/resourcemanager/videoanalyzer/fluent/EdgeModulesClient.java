// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.videoanalyzer.fluent.models.EdgeModuleEntityInner;
import com.azure.resourcemanager.videoanalyzer.fluent.models.EdgeModuleProvisioningTokenInner;
import com.azure.resourcemanager.videoanalyzer.models.ListProvisioningTokenInput;

/** An instance of this class provides access to all the operations defined in EdgeModulesClient. */
public interface EdgeModulesClient {
    /**
     * List all existing edge module resources, along with their JSON representations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of EdgeModuleEntity items.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EdgeModuleEntityInner> list(String resourceGroupName, String accountName);

    /**
     * List all existing edge module resources, along with their JSON representations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of EdgeModuleEntity items.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EdgeModuleEntityInner> list(
        String resourceGroupName, String accountName, Integer top, Context context);

    /**
     * Retrieves an existing edge module resource with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the representation of an edge module.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EdgeModuleEntityInner get(String resourceGroupName, String accountName, String edgeModuleName);

    /**
     * Retrieves an existing edge module resource with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the representation of an edge module.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EdgeModuleEntityInner> getWithResponse(
        String resourceGroupName, String accountName, String edgeModuleName, Context context);

    /**
     * Creates a new edge module or updates an existing one. An edge module resource enables a single instance of an
     * Azure Video Analyzer IoT edge module to interact with the Video Analyzer Account. This is used for authorization
     * and also to make sure that the particular edge module instance only has access to the data it requires from the
     * Azure Video Analyzer service. A new edge module resource should be created for every new instance of an Azure
     * Video Analyzer edge module deployed to you Azure IoT edge environment. Edge module resources can be deleted if
     * the specific module is not in use anymore.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the representation of an edge module.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EdgeModuleEntityInner createOrUpdate(
        String resourceGroupName, String accountName, String edgeModuleName, EdgeModuleEntityInner parameters);

    /**
     * Creates a new edge module or updates an existing one. An edge module resource enables a single instance of an
     * Azure Video Analyzer IoT edge module to interact with the Video Analyzer Account. This is used for authorization
     * and also to make sure that the particular edge module instance only has access to the data it requires from the
     * Azure Video Analyzer service. A new edge module resource should be created for every new instance of an Azure
     * Video Analyzer edge module deployed to you Azure IoT edge environment. Edge module resources can be deleted if
     * the specific module is not in use anymore.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the representation of an edge module.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EdgeModuleEntityInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String accountName,
        String edgeModuleName,
        EdgeModuleEntityInner parameters,
        Context context);

    /**
     * Deletes an existing edge module resource. Deleting the edge module resource will prevent an Azure Video Analyzer
     * IoT edge module which was previously initiated with the module provisioning token from communicating with the
     * cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String edgeModuleName);

    /**
     * Deletes an existing edge module resource. Deleting the edge module resource will prevent an Azure Video Analyzer
     * IoT edge module which was previously initiated with the module provisioning token from communicating with the
     * cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String edgeModuleName, Context context);

    /**
     * Creates a new provisioning token. A provisioning token allows for a single instance of Azure Video analyzer IoT
     * edge module to be initialized and authorized to the cloud account. The provisioning token itself is short lived
     * and it is only used for the initial handshake between IoT edge module and the cloud. After the initial handshake,
     * the IoT edge module will agree on a set of authentication keys which will be auto-rotated as long as the module
     * is able to periodically connect to the cloud. A new provisioning token can be generated for the same IoT edge
     * module in case the module state lost or reset.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provisioning token properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EdgeModuleProvisioningTokenInner listProvisioningToken(
        String resourceGroupName, String accountName, String edgeModuleName, ListProvisioningTokenInput parameters);

    /**
     * Creates a new provisioning token. A provisioning token allows for a single instance of Azure Video analyzer IoT
     * edge module to be initialized and authorized to the cloud account. The provisioning token itself is short lived
     * and it is only used for the initial handshake between IoT edge module and the cloud. After the initial handshake,
     * the IoT edge module will agree on a set of authentication keys which will be auto-rotated as long as the module
     * is able to periodically connect to the cloud. A new provisioning token can be generated for the same IoT edge
     * module in case the module state lost or reset.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param edgeModuleName The Edge Module name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provisioning token properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EdgeModuleProvisioningTokenInner> listProvisioningTokenWithResponse(
        String resourceGroupName,
        String accountName,
        String edgeModuleName,
        ListProvisioningTokenInput parameters,
        Context context);
}
