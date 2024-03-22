// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.SimGroupsClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimGroupInner;
import com.azure.resourcemanager.mobilenetwork.models.SimGroup;
import com.azure.resourcemanager.mobilenetwork.models.SimGroups;

public final class SimGroupsImpl implements SimGroups {
    private static final ClientLogger LOGGER = new ClientLogger(SimGroupsImpl.class);

    private final SimGroupsClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public SimGroupsImpl(SimGroupsClient innerClient,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String simGroupName) {
        this.serviceClient().delete(resourceGroupName, simGroupName);
    }

    public void delete(String resourceGroupName, String simGroupName, Context context) {
        this.serviceClient().delete(resourceGroupName, simGroupName, context);
    }

    public Response<SimGroup> getByResourceGroupWithResponse(String resourceGroupName, String simGroupName,
        Context context) {
        Response<SimGroupInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, simGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SimGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SimGroup getByResourceGroup(String resourceGroupName, String simGroupName) {
        SimGroupInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, simGroupName);
        if (inner != null) {
            return new SimGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<SimGroup> list() {
        PagedIterable<SimGroupInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SimGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<SimGroup> list(Context context) {
        PagedIterable<SimGroupInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SimGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<SimGroup> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SimGroupInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SimGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<SimGroup> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SimGroupInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SimGroupImpl(inner1, this.manager()));
    }

    public SimGroup getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String simGroupName = ResourceManagerUtils.getValueFromIdByName(id, "simGroups");
        if (simGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'simGroups'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, simGroupName, Context.NONE).getValue();
    }

    public Response<SimGroup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String simGroupName = ResourceManagerUtils.getValueFromIdByName(id, "simGroups");
        if (simGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'simGroups'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, simGroupName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String simGroupName = ResourceManagerUtils.getValueFromIdByName(id, "simGroups");
        if (simGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'simGroups'.", id)));
        }
        this.delete(resourceGroupName, simGroupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String simGroupName = ResourceManagerUtils.getValueFromIdByName(id, "simGroups");
        if (simGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'simGroups'.", id)));
        }
        this.delete(resourceGroupName, simGroupName, context);
    }

    private SimGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public SimGroupImpl define(String name) {
        return new SimGroupImpl(name, this.manager());
    }
}
