// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logz.fluent.MonitorsClient;
import com.azure.resourcemanager.logz.fluent.models.LogzMonitorResourceInner;
import com.azure.resourcemanager.logz.fluent.models.MonitoredResourceInner;
import com.azure.resourcemanager.logz.fluent.models.UserRoleResponseInner;
import com.azure.resourcemanager.logz.models.LogzMonitorResource;
import com.azure.resourcemanager.logz.models.MonitoredResource;
import com.azure.resourcemanager.logz.models.Monitors;
import com.azure.resourcemanager.logz.models.UserRoleRequest;
import com.azure.resourcemanager.logz.models.UserRoleResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MonitorsImpl implements Monitors {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MonitorsImpl.class);

    private final MonitorsClient innerClient;

    private final com.azure.resourcemanager.logz.LogzManager serviceManager;

    public MonitorsImpl(MonitorsClient innerClient, com.azure.resourcemanager.logz.LogzManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MonitoredResource> listMonitoredResources(String resourceGroupName, String monitorName) {
        PagedIterable<MonitoredResourceInner> inner =
            this.serviceClient().listMonitoredResources(resourceGroupName, monitorName);
        return Utils.mapPage(inner, inner1 -> new MonitoredResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MonitoredResource> listMonitoredResources(
        String resourceGroupName, String monitorName, Context context) {
        PagedIterable<MonitoredResourceInner> inner =
            this.serviceClient().listMonitoredResources(resourceGroupName, monitorName, context);
        return Utils.mapPage(inner, inner1 -> new MonitoredResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LogzMonitorResource> list() {
        PagedIterable<LogzMonitorResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new LogzMonitorResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LogzMonitorResource> list(Context context) {
        PagedIterable<LogzMonitorResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new LogzMonitorResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LogzMonitorResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<LogzMonitorResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new LogzMonitorResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LogzMonitorResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<LogzMonitorResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new LogzMonitorResourceImpl(inner1, this.manager()));
    }

    public LogzMonitorResource getByResourceGroup(String resourceGroupName, String monitorName) {
        LogzMonitorResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, monitorName);
        if (inner != null) {
            return new LogzMonitorResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LogzMonitorResource> getByResourceGroupWithResponse(
        String resourceGroupName, String monitorName, Context context) {
        Response<LogzMonitorResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, monitorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LogzMonitorResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String monitorName) {
        this.serviceClient().delete(resourceGroupName, monitorName);
    }

    public void delete(String resourceGroupName, String monitorName, Context context) {
        this.serviceClient().delete(resourceGroupName, monitorName, context);
    }

    public PagedIterable<UserRoleResponse> listUserRoles(String resourceGroupName, String monitorName) {
        PagedIterable<UserRoleResponseInner> inner = this.serviceClient().listUserRoles(resourceGroupName, monitorName);
        return Utils.mapPage(inner, inner1 -> new UserRoleResponseImpl(inner1, this.manager()));
    }

    public PagedIterable<UserRoleResponse> listUserRoles(
        String resourceGroupName, String monitorName, UserRoleRequest body, Context context) {
        PagedIterable<UserRoleResponseInner> inner =
            this.serviceClient().listUserRoles(resourceGroupName, monitorName, body, context);
        return Utils.mapPage(inner, inner1 -> new UserRoleResponseImpl(inner1, this.manager()));
    }

    public LogzMonitorResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, monitorName, Context.NONE).getValue();
    }

    public Response<LogzMonitorResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, monitorName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        this.delete(resourceGroupName, monitorName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        this.delete(resourceGroupName, monitorName, context);
    }

    private MonitorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.logz.LogzManager manager() {
        return this.serviceManager;
    }

    public LogzMonitorResourceImpl define(String name) {
        return new LogzMonitorResourceImpl(name, this.manager());
    }
}
