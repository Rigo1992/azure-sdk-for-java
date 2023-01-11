// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.AttachedDataNetworksClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AttachedDataNetworkInner;
import com.azure.resourcemanager.mobilenetwork.models.AttachedDataNetwork;
import com.azure.resourcemanager.mobilenetwork.models.AttachedDataNetworks;

public final class AttachedDataNetworksImpl implements AttachedDataNetworks {
    private static final ClientLogger LOGGER = new ClientLogger(AttachedDataNetworksImpl.class);

    private final AttachedDataNetworksClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public AttachedDataNetworksImpl(
        AttachedDataNetworksClient innerClient,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        String attachedDataNetworkName) {
        this
            .serviceClient()
            .delete(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, attachedDataNetworkName);
    }

    public void delete(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        String attachedDataNetworkName,
        Context context) {
        this
            .serviceClient()
            .delete(
                resourceGroupName,
                packetCoreControlPlaneName,
                packetCoreDataPlaneName,
                attachedDataNetworkName,
                context);
    }

    public Response<AttachedDataNetwork> getWithResponse(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        String attachedDataNetworkName,
        Context context) {
        Response<AttachedDataNetworkInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName,
                    packetCoreControlPlaneName,
                    packetCoreDataPlaneName,
                    attachedDataNetworkName,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AttachedDataNetworkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AttachedDataNetwork get(
        String resourceGroupName,
        String packetCoreControlPlaneName,
        String packetCoreDataPlaneName,
        String attachedDataNetworkName) {
        AttachedDataNetworkInner inner =
            this
                .serviceClient()
                .get(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, attachedDataNetworkName);
        if (inner != null) {
            return new AttachedDataNetworkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<AttachedDataNetwork> listByPacketCoreDataPlane(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName) {
        PagedIterable<AttachedDataNetworkInner> inner =
            this
                .serviceClient()
                .listByPacketCoreDataPlane(resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName);
        return Utils.mapPage(inner, inner1 -> new AttachedDataNetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<AttachedDataNetwork> listByPacketCoreDataPlane(
        String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName, Context context) {
        PagedIterable<AttachedDataNetworkInner> inner =
            this
                .serviceClient()
                .listByPacketCoreDataPlane(
                    resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName, context);
        return Utils.mapPage(inner, inner1 -> new AttachedDataNetworkImpl(inner1, this.manager()));
    }

    public AttachedDataNetwork getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCoreDataPlaneName = Utils.getValueFromIdByName(id, "packetCoreDataPlanes");
        if (packetCoreDataPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreDataPlanes'.",
                                id)));
        }
        String attachedDataNetworkName = Utils.getValueFromIdByName(id, "attachedDataNetworks");
        if (attachedDataNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attachedDataNetworks'.",
                                id)));
        }
        return this
            .getWithResponse(
                resourceGroupName,
                packetCoreControlPlaneName,
                packetCoreDataPlaneName,
                attachedDataNetworkName,
                Context.NONE)
            .getValue();
    }

    public Response<AttachedDataNetwork> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCoreDataPlaneName = Utils.getValueFromIdByName(id, "packetCoreDataPlanes");
        if (packetCoreDataPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreDataPlanes'.",
                                id)));
        }
        String attachedDataNetworkName = Utils.getValueFromIdByName(id, "attachedDataNetworks");
        if (attachedDataNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attachedDataNetworks'.",
                                id)));
        }
        return this
            .getWithResponse(
                resourceGroupName,
                packetCoreControlPlaneName,
                packetCoreDataPlaneName,
                attachedDataNetworkName,
                context);
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
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCoreDataPlaneName = Utils.getValueFromIdByName(id, "packetCoreDataPlanes");
        if (packetCoreDataPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreDataPlanes'.",
                                id)));
        }
        String attachedDataNetworkName = Utils.getValueFromIdByName(id, "attachedDataNetworks");
        if (attachedDataNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attachedDataNetworks'.",
                                id)));
        }
        this
            .delete(
                resourceGroupName,
                packetCoreControlPlaneName,
                packetCoreDataPlaneName,
                attachedDataNetworkName,
                Context.NONE);
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
        String packetCoreControlPlaneName = Utils.getValueFromIdByName(id, "packetCoreControlPlanes");
        if (packetCoreControlPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreControlPlanes'.",
                                id)));
        }
        String packetCoreDataPlaneName = Utils.getValueFromIdByName(id, "packetCoreDataPlanes");
        if (packetCoreDataPlaneName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'packetCoreDataPlanes'.",
                                id)));
        }
        String attachedDataNetworkName = Utils.getValueFromIdByName(id, "attachedDataNetworks");
        if (attachedDataNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'attachedDataNetworks'.",
                                id)));
        }
        this
            .delete(
                resourceGroupName,
                packetCoreControlPlaneName,
                packetCoreDataPlaneName,
                attachedDataNetworkName,
                context);
    }

    private AttachedDataNetworksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public AttachedDataNetworkImpl define(String name) {
        return new AttachedDataNetworkImpl(name, this.manager());
    }
}
