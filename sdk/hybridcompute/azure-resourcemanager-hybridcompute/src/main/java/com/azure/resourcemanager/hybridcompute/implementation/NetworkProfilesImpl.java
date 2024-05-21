// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcompute.fluent.NetworkProfilesClient;
import com.azure.resourcemanager.hybridcompute.fluent.models.NetworkProfileInner;
import com.azure.resourcemanager.hybridcompute.models.NetworkProfile;
import com.azure.resourcemanager.hybridcompute.models.NetworkProfiles;

public final class NetworkProfilesImpl implements NetworkProfiles {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkProfilesImpl.class);

    private final NetworkProfilesClient innerClient;

    private final com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager;

    public NetworkProfilesImpl(NetworkProfilesClient innerClient,
        com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NetworkProfile> getWithResponse(String resourceGroupName, String machineName, Context context) {
        Response<NetworkProfileInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, machineName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkProfileImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkProfile get(String resourceGroupName, String machineName) {
        NetworkProfileInner inner = this.serviceClient().get(resourceGroupName, machineName);
        if (inner != null) {
            return new NetworkProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private NetworkProfilesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridcompute.HybridComputeManager manager() {
        return this.serviceManager;
    }
}
