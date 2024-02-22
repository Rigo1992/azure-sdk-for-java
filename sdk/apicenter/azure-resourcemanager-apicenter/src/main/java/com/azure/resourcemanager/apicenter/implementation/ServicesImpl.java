// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apicenter.fluent.ServicesClient;
import com.azure.resourcemanager.apicenter.fluent.models.MetadataSchemaExportResultInner;
import com.azure.resourcemanager.apicenter.fluent.models.ServiceInner;
import com.azure.resourcemanager.apicenter.models.MetadataSchemaExportRequest;
import com.azure.resourcemanager.apicenter.models.MetadataSchemaExportResult;
import com.azure.resourcemanager.apicenter.models.Service;
import com.azure.resourcemanager.apicenter.models.Services;

public final class ServicesImpl implements Services {
    private static final ClientLogger LOGGER = new ClientLogger(ServicesImpl.class);

    private final ServicesClient innerClient;

    private final com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager;

    public ServicesImpl(ServicesClient innerClient,
        com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Service> list() {
        PagedIterable<ServiceInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<Service> list(Context context) {
        PagedIterable<ServiceInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<Service> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ServiceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<Service> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ServiceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ServiceImpl(inner1, this.manager()));
    }

    public Response<Service> getByResourceGroupWithResponse(String resourceGroupName, String serviceName,
        Context context) {
        Response<ServiceInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Service getByResourceGroup(String resourceGroupName, String serviceName) {
        ServiceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, serviceName);
        if (inner != null) {
            return new ServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String serviceName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String serviceName) {
        this.serviceClient().delete(resourceGroupName, serviceName);
    }

    public MetadataSchemaExportResult exportMetadataSchema(String resourceGroupName, String serviceName,
        MetadataSchemaExportRequest body) {
        MetadataSchemaExportResultInner inner
            = this.serviceClient().exportMetadataSchema(resourceGroupName, serviceName, body);
        if (inner != null) {
            return new MetadataSchemaExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MetadataSchemaExportResult exportMetadataSchema(String resourceGroupName, String serviceName,
        MetadataSchemaExportRequest body, Context context) {
        MetadataSchemaExportResultInner inner
            = this.serviceClient().exportMetadataSchema(resourceGroupName, serviceName, body, context);
        if (inner != null) {
            return new MetadataSchemaExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Service getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, serviceName, Context.NONE).getValue();
    }

    public Response<Service> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, serviceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, serviceName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, serviceName, context);
    }

    private ServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apicenter.ApiCenterManager manager() {
        return this.serviceManager;
    }

    public ServiceImpl define(String name) {
        return new ServiceImpl(name, this.manager());
    }
}
