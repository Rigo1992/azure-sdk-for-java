// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.astro.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.astro.fluent.OrganizationsClient;
import com.azure.resourcemanager.astro.fluent.models.OrganizationResourceInner;
import com.azure.resourcemanager.astro.models.OrganizationResource;
import com.azure.resourcemanager.astro.models.Organizations;

public final class OrganizationsImpl implements Organizations {
    private static final ClientLogger LOGGER = new ClientLogger(OrganizationsImpl.class);

    private final OrganizationsClient innerClient;

    private final com.azure.resourcemanager.astro.AstroManager serviceManager;

    public OrganizationsImpl(OrganizationsClient innerClient,
        com.azure.resourcemanager.astro.AstroManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OrganizationResource> list() {
        PagedIterable<OrganizationResourceInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OrganizationResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<OrganizationResource> list(Context context) {
        PagedIterable<OrganizationResourceInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OrganizationResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<OrganizationResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<OrganizationResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OrganizationResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<OrganizationResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<OrganizationResourceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OrganizationResourceImpl(inner1, this.manager()));
    }

    public Response<OrganizationResource> getByResourceGroupWithResponse(String resourceGroupName,
        String organizationName, Context context) {
        Response<OrganizationResourceInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, organizationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new OrganizationResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OrganizationResource getByResourceGroup(String resourceGroupName, String organizationName) {
        OrganizationResourceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, organizationName);
        if (inner != null) {
            return new OrganizationResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String organizationName) {
        this.serviceClient().delete(resourceGroupName, organizationName);
    }

    public void delete(String resourceGroupName, String organizationName, Context context) {
        this.serviceClient().delete(resourceGroupName, organizationName, context);
    }

    public OrganizationResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String organizationName = ResourceManagerUtils.getValueFromIdByName(id, "organizations");
        if (organizationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'organizations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, organizationName, Context.NONE).getValue();
    }

    public Response<OrganizationResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String organizationName = ResourceManagerUtils.getValueFromIdByName(id, "organizations");
        if (organizationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'organizations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, organizationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String organizationName = ResourceManagerUtils.getValueFromIdByName(id, "organizations");
        if (organizationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'organizations'.", id)));
        }
        this.delete(resourceGroupName, organizationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String organizationName = ResourceManagerUtils.getValueFromIdByName(id, "organizations");
        if (organizationName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'organizations'.", id)));
        }
        this.delete(resourceGroupName, organizationName, context);
    }

    private OrganizationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.astro.AstroManager manager() {
        return this.serviceManager;
    }

    public OrganizationResourceImpl define(String name) {
        return new OrganizationResourceImpl(name, this.manager());
    }
}
