// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hardwaresecuritymodules.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.hardwaresecuritymodules.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpointConnection;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpointConnections;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager serviceManager;

    public PrivateEndpointConnectionsImpl(PrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateEndpointConnection> listByCloudHsmCluster(String resourceGroupName,
        String cloudHsmClusterName) {
        PagedIterable<PrivateEndpointConnectionInner> inner
            = this.serviceClient().listByCloudHsmCluster(resourceGroupName, cloudHsmClusterName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> listByCloudHsmCluster(String resourceGroupName,
        String cloudHsmClusterName, Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner
            = this.serviceClient().listByCloudHsmCluster(resourceGroupName, cloudHsmClusterName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager() {
        return this.serviceManager;
    }
}
