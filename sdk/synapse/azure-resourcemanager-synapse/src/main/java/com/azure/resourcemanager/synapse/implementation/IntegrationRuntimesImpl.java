// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.IntegrationRuntimesClient;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeResourceInner;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeStatusResponseInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeResource;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeStatusResponse;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimes;

public final class IntegrationRuntimesImpl implements IntegrationRuntimes {
    private static final ClientLogger LOGGER = new ClientLogger(IntegrationRuntimesImpl.class);

    private final IntegrationRuntimesClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public IntegrationRuntimesImpl(
        IntegrationRuntimesClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IntegrationRuntimeResource get(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        IntegrationRuntimeResourceInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeResource> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String ifNoneMatch,
        Context context) {
        Response<IntegrationRuntimeResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, integrationRuntimeName, ifNoneMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IntegrationRuntimeResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, integrationRuntimeName);
    }

    public void delete(String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, integrationRuntimeName, context);
    }

    public void upgrade(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        this.serviceClient().upgrade(resourceGroupName, workspaceName, integrationRuntimeName);
    }

    public Response<Void> upgradeWithResponse(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        return this
            .serviceClient()
            .upgradeWithResponse(resourceGroupName, workspaceName, integrationRuntimeName, context);
    }

    public PagedIterable<IntegrationRuntimeResource> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<IntegrationRuntimeResourceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new IntegrationRuntimeResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<IntegrationRuntimeResource> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<IntegrationRuntimeResourceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new IntegrationRuntimeResourceImpl(inner1, this.manager()));
    }

    public IntegrationRuntimeStatusResponse start(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        IntegrationRuntimeStatusResponseInner inner =
            this.serviceClient().start(resourceGroupName, workspaceName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeStatusResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public IntegrationRuntimeStatusResponse start(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        IntegrationRuntimeStatusResponseInner inner =
            this.serviceClient().start(resourceGroupName, workspaceName, integrationRuntimeName, context);
        if (inner != null) {
            return new IntegrationRuntimeStatusResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void stop(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        this.serviceClient().stop(resourceGroupName, workspaceName, integrationRuntimeName);
    }

    public void stop(String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        this.serviceClient().stop(resourceGroupName, workspaceName, integrationRuntimeName, context);
    }

    public IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse listOutboundNetworkDependenciesEndpoints(
        String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner inner =
            this
                .serviceClient()
                .listOutboundNetworkDependenciesEndpoints(resourceGroupName, workspaceName, integrationRuntimeName);
        if (inner != null) {
            return new IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse>
        listOutboundNetworkDependenciesEndpointsWithResponse(
            String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        Response<IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner> inner =
            this
                .serviceClient()
                .listOutboundNetworkDependenciesEndpointsWithResponse(
                    resourceGroupName, workspaceName, integrationRuntimeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseImpl(
                    inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void enableInteractiveQuery(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        this.serviceClient().enableInteractiveQuery(resourceGroupName, workspaceName, integrationRuntimeName);
    }

    public void enableInteractiveQuery(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        this.serviceClient().enableInteractiveQuery(resourceGroupName, workspaceName, integrationRuntimeName, context);
    }

    public void disableInteractiveQuery(String resourceGroupName, String workspaceName, String integrationRuntimeName) {
        this.serviceClient().disableInteractiveQuery(resourceGroupName, workspaceName, integrationRuntimeName);
    }

    public void disableInteractiveQuery(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, Context context) {
        this.serviceClient().disableInteractiveQuery(resourceGroupName, workspaceName, integrationRuntimeName, context);
    }

    public IntegrationRuntimeResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String integrationRuntimeName = Utils.getValueFromIdByName(id, "integrationRuntimes");
        if (integrationRuntimeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationRuntimes'.", id)));
        }
        String localIfNoneMatch = null;
        return this
            .getWithResponse(resourceGroupName, workspaceName, integrationRuntimeName, localIfNoneMatch, Context.NONE)
            .getValue();
    }

    public Response<IntegrationRuntimeResource> getByIdWithResponse(String id, String ifNoneMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String integrationRuntimeName = Utils.getValueFromIdByName(id, "integrationRuntimes");
        if (integrationRuntimeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationRuntimes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, integrationRuntimeName, ifNoneMatch, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String integrationRuntimeName = Utils.getValueFromIdByName(id, "integrationRuntimes");
        if (integrationRuntimeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationRuntimes'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, integrationRuntimeName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String integrationRuntimeName = Utils.getValueFromIdByName(id, "integrationRuntimes");
        if (integrationRuntimeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationRuntimes'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, integrationRuntimeName, context);
    }

    private IntegrationRuntimesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    public IntegrationRuntimeResourceImpl define(String name) {
        return new IntegrationRuntimeResourceImpl(name, this.manager());
    }
}
