// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.LinkedServicesClient;
import com.azure.resourcemanager.loganalytics.fluent.models.LinkedServiceInner;
import com.azure.resourcemanager.loganalytics.models.LinkedService;
import com.azure.resourcemanager.loganalytics.models.LinkedServices;

public final class LinkedServicesImpl implements LinkedServices {
    private static final ClientLogger LOGGER = new ClientLogger(LinkedServicesImpl.class);

    private final LinkedServicesClient innerClient;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    public LinkedServicesImpl(
        LinkedServicesClient innerClient, com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LinkedService delete(String resourceGroupName, String workspaceName, String linkedServiceName) {
        LinkedServiceInner inner = this.serviceClient().delete(resourceGroupName, workspaceName, linkedServiceName);
        if (inner != null) {
            return new LinkedServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LinkedService delete(
        String resourceGroupName, String workspaceName, String linkedServiceName, Context context) {
        LinkedServiceInner inner =
            this.serviceClient().delete(resourceGroupName, workspaceName, linkedServiceName, context);
        if (inner != null) {
            return new LinkedServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LinkedService get(String resourceGroupName, String workspaceName, String linkedServiceName) {
        LinkedServiceInner inner = this.serviceClient().get(resourceGroupName, workspaceName, linkedServiceName);
        if (inner != null) {
            return new LinkedServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LinkedService> getWithResponse(
        String resourceGroupName, String workspaceName, String linkedServiceName, Context context) {
        Response<LinkedServiceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, linkedServiceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LinkedServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<LinkedService> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<LinkedServiceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new LinkedServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<LinkedService> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<LinkedServiceInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new LinkedServiceImpl(inner1, this.manager()));
    }

    public LinkedService getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String linkedServiceName = Utils.getValueFromIdByName(id, "linkedServices");
        if (linkedServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'linkedServices'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, linkedServiceName, Context.NONE).getValue();
    }

    public Response<LinkedService> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String linkedServiceName = Utils.getValueFromIdByName(id, "linkedServices");
        if (linkedServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'linkedServices'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, linkedServiceName, context);
    }

    public LinkedService deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String linkedServiceName = Utils.getValueFromIdByName(id, "linkedServices");
        if (linkedServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'linkedServices'.", id)));
        }
        return this.delete(resourceGroupName, workspaceName, linkedServiceName, Context.NONE);
    }

    public LinkedService deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String linkedServiceName = Utils.getValueFromIdByName(id, "linkedServices");
        if (linkedServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'linkedServices'.", id)));
        }
        return this.delete(resourceGroupName, workspaceName, linkedServiceName, context);
    }

    private LinkedServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    public LinkedServiceImpl define(String name) {
        return new LinkedServiceImpl(name, this.manager());
    }
}
