// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.RestorableDroppedSqlPoolsClient;
import com.azure.resourcemanager.synapse.fluent.models.RestorableDroppedSqlPoolInner;
import com.azure.resourcemanager.synapse.models.RestorableDroppedSqlPool;
import com.azure.resourcemanager.synapse.models.RestorableDroppedSqlPools;

public final class RestorableDroppedSqlPoolsImpl implements RestorableDroppedSqlPools {
    private static final ClientLogger LOGGER = new ClientLogger(RestorableDroppedSqlPoolsImpl.class);

    private final RestorableDroppedSqlPoolsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public RestorableDroppedSqlPoolsImpl(
        RestorableDroppedSqlPoolsClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public RestorableDroppedSqlPool get(
        String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId) {
        RestorableDroppedSqlPoolInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, restorableDroppedSqlPoolId);
        if (inner != null) {
            return new RestorableDroppedSqlPoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RestorableDroppedSqlPool> getWithResponse(
        String resourceGroupName, String workspaceName, String restorableDroppedSqlPoolId, Context context) {
        Response<RestorableDroppedSqlPoolInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, restorableDroppedSqlPoolId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RestorableDroppedSqlPoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<RestorableDroppedSqlPool> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<RestorableDroppedSqlPoolInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new RestorableDroppedSqlPoolImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableDroppedSqlPool> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<RestorableDroppedSqlPoolInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new RestorableDroppedSqlPoolImpl(inner1, this.manager()));
    }

    private RestorableDroppedSqlPoolsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
