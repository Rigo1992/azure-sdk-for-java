// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualNetworks. */
public interface VirtualNetworks {
    /**
     * Implements list available virtual networks within a subscription method
     *
     * <p>Return list of virtual networks in location for private cloud.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains virtual networks.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual networks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualNetwork> list(String regionId, String pcName, String resourcePoolName);

    /**
     * Implements list available virtual networks within a subscription method
     *
     * <p>Return list of virtual networks in location for private cloud.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param resourcePoolName Resource pool used to derive vSphere cluster which contains virtual networks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual networks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualNetwork> list(String regionId, String pcName, String resourcePoolName, Context context);

    /**
     * Implements virtual network GET method
     *
     * <p>Return virtual network by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param virtualNetworkName virtual network id (vsphereId).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network model along with {@link Response}.
     */
    Response<VirtualNetwork> getWithResponse(
        String regionId, String pcName, String virtualNetworkName, Context context);

    /**
     * Implements virtual network GET method
     *
     * <p>Return virtual network by its name.
     *
     * @param regionId The region Id (westus, eastus).
     * @param pcName The private cloud name.
     * @param virtualNetworkName virtual network id (vsphereId).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual network model.
     */
    VirtualNetwork get(String regionId, String pcName, String virtualNetworkName);
}
