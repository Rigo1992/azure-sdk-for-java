// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.ManagedPrivateEndpointsClient;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedPrivateEndpointResourceInner;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpointResource;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpoints;

public final class ManagedPrivateEndpointsImpl implements ManagedPrivateEndpoints {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedPrivateEndpointsImpl.class);

    private final ManagedPrivateEndpointsClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public ManagedPrivateEndpointsImpl(ManagedPrivateEndpointsClient innerClient,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagedPrivateEndpointResource> listByFactory(String resourceGroupName, String factoryName,
        String managedVirtualNetworkName) {
        PagedIterable<ManagedPrivateEndpointResourceInner> inner
            = this.serviceClient().listByFactory(resourceGroupName, factoryName, managedVirtualNetworkName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ManagedPrivateEndpointResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedPrivateEndpointResource> listByFactory(String resourceGroupName, String factoryName,
        String managedVirtualNetworkName, Context context) {
        PagedIterable<ManagedPrivateEndpointResourceInner> inner
            = this.serviceClient().listByFactory(resourceGroupName, factoryName, managedVirtualNetworkName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ManagedPrivateEndpointResourceImpl(inner1, this.manager()));
    }

    public Response<ManagedPrivateEndpointResource> getWithResponse(String resourceGroupName, String factoryName,
        String managedVirtualNetworkName, String managedPrivateEndpointName, String ifNoneMatch, Context context) {
        Response<ManagedPrivateEndpointResourceInner> inner = this.serviceClient().getWithResponse(resourceGroupName,
            factoryName, managedVirtualNetworkName, managedPrivateEndpointName, ifNoneMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ManagedPrivateEndpointResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedPrivateEndpointResource get(String resourceGroupName, String factoryName,
        String managedVirtualNetworkName, String managedPrivateEndpointName) {
        ManagedPrivateEndpointResourceInner inner = this.serviceClient().get(resourceGroupName, factoryName,
            managedVirtualNetworkName, managedPrivateEndpointName);
        if (inner != null) {
            return new ManagedPrivateEndpointResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String factoryName,
        String managedVirtualNetworkName, String managedPrivateEndpointName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, factoryName, managedVirtualNetworkName,
            managedPrivateEndpointName, context);
    }

    public void delete(String resourceGroupName, String factoryName, String managedVirtualNetworkName,
        String managedPrivateEndpointName) {
        this.serviceClient().delete(resourceGroupName, factoryName, managedVirtualNetworkName,
            managedPrivateEndpointName);
    }

    public ManagedPrivateEndpointResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String managedVirtualNetworkName = ResourceManagerUtils.getValueFromIdByName(id, "managedVirtualNetworks");
        if (managedVirtualNetworkName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedVirtualNetworks'.", id)));
        }
        String managedPrivateEndpointName = ResourceManagerUtils.getValueFromIdByName(id, "managedPrivateEndpoints");
        if (managedPrivateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedPrivateEndpoints'.", id)));
        }
        String localIfNoneMatch = null;
        return this.getWithResponse(resourceGroupName, factoryName, managedVirtualNetworkName,
            managedPrivateEndpointName, localIfNoneMatch, Context.NONE).getValue();
    }

    public Response<ManagedPrivateEndpointResource> getByIdWithResponse(String id, String ifNoneMatch,
        Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String managedVirtualNetworkName = ResourceManagerUtils.getValueFromIdByName(id, "managedVirtualNetworks");
        if (managedVirtualNetworkName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedVirtualNetworks'.", id)));
        }
        String managedPrivateEndpointName = ResourceManagerUtils.getValueFromIdByName(id, "managedPrivateEndpoints");
        if (managedPrivateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedPrivateEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, factoryName, managedVirtualNetworkName,
            managedPrivateEndpointName, ifNoneMatch, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String managedVirtualNetworkName = ResourceManagerUtils.getValueFromIdByName(id, "managedVirtualNetworks");
        if (managedVirtualNetworkName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedVirtualNetworks'.", id)));
        }
        String managedPrivateEndpointName = ResourceManagerUtils.getValueFromIdByName(id, "managedPrivateEndpoints");
        if (managedPrivateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedPrivateEndpoints'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, factoryName, managedVirtualNetworkName, managedPrivateEndpointName,
            Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String managedVirtualNetworkName = ResourceManagerUtils.getValueFromIdByName(id, "managedVirtualNetworks");
        if (managedVirtualNetworkName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedVirtualNetworks'.", id)));
        }
        String managedPrivateEndpointName = ResourceManagerUtils.getValueFromIdByName(id, "managedPrivateEndpoints");
        if (managedPrivateEndpointName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'managedPrivateEndpoints'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, factoryName, managedVirtualNetworkName,
            managedPrivateEndpointName, context);
    }

    private ManagedPrivateEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    public ManagedPrivateEndpointResourceImpl define(String name) {
        return new ManagedPrivateEndpointResourceImpl(name, this.manager());
    }
}
