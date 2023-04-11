// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagemover.fluent.AgentsClient;
import com.azure.resourcemanager.storagemover.fluent.models.AgentInner;
import com.azure.resourcemanager.storagemover.models.Agent;
import com.azure.resourcemanager.storagemover.models.Agents;

public final class AgentsImpl implements Agents {
    private static final ClientLogger LOGGER = new ClientLogger(AgentsImpl.class);

    private final AgentsClient innerClient;

    private final com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager;

    public AgentsImpl(
        AgentsClient innerClient, com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Agent> list(String resourceGroupName, String storageMoverName) {
        PagedIterable<AgentInner> inner = this.serviceClient().list(resourceGroupName, storageMoverName);
        return Utils.mapPage(inner, inner1 -> new AgentImpl(inner1, this.manager()));
    }

    public PagedIterable<Agent> list(String resourceGroupName, String storageMoverName, Context context) {
        PagedIterable<AgentInner> inner = this.serviceClient().list(resourceGroupName, storageMoverName, context);
        return Utils.mapPage(inner, inner1 -> new AgentImpl(inner1, this.manager()));
    }

    public Response<Agent> getWithResponse(
        String resourceGroupName, String storageMoverName, String agentName, Context context) {
        Response<AgentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, storageMoverName, agentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AgentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Agent get(String resourceGroupName, String storageMoverName, String agentName) {
        AgentInner inner = this.serviceClient().get(resourceGroupName, storageMoverName, agentName);
        if (inner != null) {
            return new AgentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String storageMoverName, String agentName) {
        this.serviceClient().delete(resourceGroupName, storageMoverName, agentName);
    }

    public void delete(String resourceGroupName, String storageMoverName, String agentName, Context context) {
        this.serviceClient().delete(resourceGroupName, storageMoverName, agentName, context);
    }

    public Agent getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String agentName = Utils.getValueFromIdByName(id, "agents");
        if (agentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'agents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, storageMoverName, agentName, Context.NONE).getValue();
    }

    public Response<Agent> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String agentName = Utils.getValueFromIdByName(id, "agents");
        if (agentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'agents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, storageMoverName, agentName, context);
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
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String agentName = Utils.getValueFromIdByName(id, "agents");
        if (agentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'agents'.", id)));
        }
        this.delete(resourceGroupName, storageMoverName, agentName, Context.NONE);
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
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String agentName = Utils.getValueFromIdByName(id, "agents");
        if (agentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'agents'.", id)));
        }
        this.delete(resourceGroupName, storageMoverName, agentName, context);
    }

    private AgentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagemover.StorageMoverManager manager() {
        return this.serviceManager;
    }

    public AgentImpl define(String name) {
        return new AgentImpl(name, this.manager());
    }
}
