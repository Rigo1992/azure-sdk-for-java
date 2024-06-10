// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcompute.fluent.NetworkSecurityPerimeterConfigurationsClient;
import com.azure.resourcemanager.hybridcompute.fluent.models.NetworkSecurityPerimeterConfigurationInner;
import com.azure.resourcemanager.hybridcompute.models.NetworkSecurityPerimeterConfiguration;
import com.azure.resourcemanager.hybridcompute.models.NetworkSecurityPerimeterConfigurations;

public final class NetworkSecurityPerimeterConfigurationsImpl implements NetworkSecurityPerimeterConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkSecurityPerimeterConfigurationsImpl.class);

    private final NetworkSecurityPerimeterConfigurationsClient innerClient;

    private final com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager;

    public NetworkSecurityPerimeterConfigurationsImpl(NetworkSecurityPerimeterConfigurationsClient innerClient,
        com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NetworkSecurityPerimeterConfiguration> getByPrivateLinkScopeWithResponse(String resourceGroupName,
        String scopeName, String perimeterName, Context context) {
        Response<NetworkSecurityPerimeterConfigurationInner> inner = this.serviceClient()
            .getByPrivateLinkScopeWithResponse(resourceGroupName, scopeName, perimeterName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkSecurityPerimeterConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkSecurityPerimeterConfiguration getByPrivateLinkScope(String resourceGroupName, String scopeName,
        String perimeterName) {
        NetworkSecurityPerimeterConfigurationInner inner
            = this.serviceClient().getByPrivateLinkScope(resourceGroupName, scopeName, perimeterName);
        if (inner != null) {
            return new NetworkSecurityPerimeterConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkSecurityPerimeterConfiguration> listByPrivateLinkScope(String resourceGroupName,
        String scopeName) {
        PagedIterable<NetworkSecurityPerimeterConfigurationInner> inner
            = this.serviceClient().listByPrivateLinkScope(resourceGroupName, scopeName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new NetworkSecurityPerimeterConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkSecurityPerimeterConfiguration> listByPrivateLinkScope(String resourceGroupName,
        String scopeName, Context context) {
        PagedIterable<NetworkSecurityPerimeterConfigurationInner> inner
            = this.serviceClient().listByPrivateLinkScope(resourceGroupName, scopeName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new NetworkSecurityPerimeterConfigurationImpl(inner1, this.manager()));
    }

    private NetworkSecurityPerimeterConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridcompute.HybridComputeManager manager() {
        return this.serviceManager;
    }
}
