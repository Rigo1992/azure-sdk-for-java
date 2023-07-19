// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.InternalNetworksClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForStateUpdateInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternalNetworkInner;
import com.azure.resourcemanager.managednetworkfabric.models.CommonPostActionResponseForStateUpdate;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetwork;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworks;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateAdministrativeState;

public final class InternalNetworksImpl implements InternalNetworks {
    private static final ClientLogger LOGGER = new ClientLogger(InternalNetworksImpl.class);

    private final InternalNetworksClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public InternalNetworksImpl(
        InternalNetworksClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<InternalNetwork> getWithResponse(
        String resourceGroupName, String l3IsolationDomainName, String internalNetworkName, Context context) {
        Response<InternalNetworkInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, l3IsolationDomainName, internalNetworkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new InternalNetworkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public InternalNetwork get(String resourceGroupName, String l3IsolationDomainName, String internalNetworkName) {
        InternalNetworkInner inner =
            this.serviceClient().get(resourceGroupName, l3IsolationDomainName, internalNetworkName);
        if (inner != null) {
            return new InternalNetworkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String l3IsolationDomainName, String internalNetworkName) {
        this.serviceClient().delete(resourceGroupName, l3IsolationDomainName, internalNetworkName);
    }

    public void delete(
        String resourceGroupName, String l3IsolationDomainName, String internalNetworkName, Context context) {
        this.serviceClient().delete(resourceGroupName, l3IsolationDomainName, internalNetworkName, context);
    }

    public PagedIterable<InternalNetwork> listByL3IsolationDomain(
        String resourceGroupName, String l3IsolationDomainName) {
        PagedIterable<InternalNetworkInner> inner =
            this.serviceClient().listByL3IsolationDomain(resourceGroupName, l3IsolationDomainName);
        return Utils.mapPage(inner, inner1 -> new InternalNetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<InternalNetwork> listByL3IsolationDomain(
        String resourceGroupName, String l3IsolationDomainName, Context context) {
        PagedIterable<InternalNetworkInner> inner =
            this.serviceClient().listByL3IsolationDomain(resourceGroupName, l3IsolationDomainName, context);
        return Utils.mapPage(inner, inner1 -> new InternalNetworkImpl(inner1, this.manager()));
    }

    public CommonPostActionResponseForStateUpdate updateAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String internalNetworkName,
        UpdateAdministrativeState body) {
        CommonPostActionResponseForStateUpdateInner inner =
            this
                .serviceClient()
                .updateAdministrativeState(resourceGroupName, l3IsolationDomainName, internalNetworkName, body);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate updateAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String internalNetworkName,
        UpdateAdministrativeState body,
        Context context) {
        CommonPostActionResponseForStateUpdateInner inner =
            this
                .serviceClient()
                .updateAdministrativeState(
                    resourceGroupName, l3IsolationDomainName, internalNetworkName, body, context);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate updateBgpAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String internalNetworkName,
        UpdateAdministrativeState body) {
        CommonPostActionResponseForStateUpdateInner inner =
            this
                .serviceClient()
                .updateBgpAdministrativeState(resourceGroupName, l3IsolationDomainName, internalNetworkName, body);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate updateBgpAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String internalNetworkName,
        UpdateAdministrativeState body,
        Context context) {
        CommonPostActionResponseForStateUpdateInner inner =
            this
                .serviceClient()
                .updateBgpAdministrativeState(
                    resourceGroupName, l3IsolationDomainName, internalNetworkName, body, context);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate updateStaticRouteBfdAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String internalNetworkName,
        UpdateAdministrativeState body) {
        CommonPostActionResponseForStateUpdateInner inner =
            this
                .serviceClient()
                .updateStaticRouteBfdAdministrativeState(
                    resourceGroupName, l3IsolationDomainName, internalNetworkName, body);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommonPostActionResponseForStateUpdate updateStaticRouteBfdAdministrativeState(
        String resourceGroupName,
        String l3IsolationDomainName,
        String internalNetworkName,
        UpdateAdministrativeState body,
        Context context) {
        CommonPostActionResponseForStateUpdateInner inner =
            this
                .serviceClient()
                .updateStaticRouteBfdAdministrativeState(
                    resourceGroupName, l3IsolationDomainName, internalNetworkName, body, context);
        if (inner != null) {
            return new CommonPostActionResponseForStateUpdateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public InternalNetwork getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String l3IsolationDomainName = Utils.getValueFromIdByName(id, "l3IsolationDomains");
        if (l3IsolationDomainName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'l3IsolationDomains'.", id)));
        }
        String internalNetworkName = Utils.getValueFromIdByName(id, "internalNetworks");
        if (internalNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'internalNetworks'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, l3IsolationDomainName, internalNetworkName, Context.NONE)
            .getValue();
    }

    public Response<InternalNetwork> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String l3IsolationDomainName = Utils.getValueFromIdByName(id, "l3IsolationDomains");
        if (l3IsolationDomainName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'l3IsolationDomains'.", id)));
        }
        String internalNetworkName = Utils.getValueFromIdByName(id, "internalNetworks");
        if (internalNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'internalNetworks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, l3IsolationDomainName, internalNetworkName, context);
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
        String l3IsolationDomainName = Utils.getValueFromIdByName(id, "l3IsolationDomains");
        if (l3IsolationDomainName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'l3IsolationDomains'.", id)));
        }
        String internalNetworkName = Utils.getValueFromIdByName(id, "internalNetworks");
        if (internalNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'internalNetworks'.", id)));
        }
        this.delete(resourceGroupName, l3IsolationDomainName, internalNetworkName, Context.NONE);
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
        String l3IsolationDomainName = Utils.getValueFromIdByName(id, "l3IsolationDomains");
        if (l3IsolationDomainName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'l3IsolationDomains'.", id)));
        }
        String internalNetworkName = Utils.getValueFromIdByName(id, "internalNetworks");
        if (internalNetworkName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'internalNetworks'.", id)));
        }
        this.delete(resourceGroupName, l3IsolationDomainName, internalNetworkName, context);
    }

    private InternalNetworksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public InternalNetworkImpl define(String name) {
        return new InternalNetworkImpl(name, this.manager());
    }
}
