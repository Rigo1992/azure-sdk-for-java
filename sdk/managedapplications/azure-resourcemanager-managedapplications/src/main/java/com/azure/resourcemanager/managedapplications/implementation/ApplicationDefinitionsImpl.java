// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managedapplications.fluent.ApplicationDefinitionsClient;
import com.azure.resourcemanager.managedapplications.fluent.models.ApplicationDefinitionInner;
import com.azure.resourcemanager.managedapplications.models.ApplicationDefinition;
import com.azure.resourcemanager.managedapplications.models.ApplicationDefinitions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ApplicationDefinitionsImpl implements ApplicationDefinitions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationDefinitionsImpl.class);

    private final ApplicationDefinitionsClient innerClient;

    private final com.azure.resourcemanager.managedapplications.ApplicationManager serviceManager;

    public ApplicationDefinitionsImpl(
        ApplicationDefinitionsClient innerClient,
        com.azure.resourcemanager.managedapplications.ApplicationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ApplicationDefinition getByResourceGroup(String resourceGroupName, String applicationDefinitionName) {
        ApplicationDefinitionInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, applicationDefinitionName);
        if (inner != null) {
            return new ApplicationDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationDefinition> getByResourceGroupWithResponse(
        String resourceGroupName, String applicationDefinitionName, Context context) {
        Response<ApplicationDefinitionInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, applicationDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String applicationDefinitionName) {
        this.serviceClient().delete(resourceGroupName, applicationDefinitionName);
    }

    public void delete(String resourceGroupName, String applicationDefinitionName, Context context) {
        this.serviceClient().delete(resourceGroupName, applicationDefinitionName, context);
    }

    public PagedIterable<ApplicationDefinition> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ApplicationDefinitionInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ApplicationDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationDefinition> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ApplicationDefinitionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ApplicationDefinitionImpl(inner1, this.manager()));
    }

    public ApplicationDefinition getById(String resourceGroupName, String applicationDefinitionName) {
        ApplicationDefinitionInner inner = this.serviceClient().getById(resourceGroupName, applicationDefinitionName);
        if (inner != null) {
            return new ApplicationDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ApplicationDefinition> getByIdWithResponse(
        String resourceGroupName, String applicationDefinitionName, Context context) {
        Response<ApplicationDefinitionInner> inner =
            this.serviceClient().getByIdWithResponse(resourceGroupName, applicationDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ApplicationDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteById(String resourceGroupName, String applicationDefinitionName) {
        this.serviceClient().deleteById(resourceGroupName, applicationDefinitionName);
    }

    public void deleteById(String resourceGroupName, String applicationDefinitionName, Context context) {
        this.serviceClient().deleteById(resourceGroupName, applicationDefinitionName, context);
    }

    public ApplicationDefinition createOrUpdateById(
        String resourceGroupName, String applicationDefinitionName, ApplicationDefinitionInner parameters) {
        ApplicationDefinitionInner inner =
            this.serviceClient().createOrUpdateById(resourceGroupName, applicationDefinitionName, parameters);
        if (inner != null) {
            return new ApplicationDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApplicationDefinition createOrUpdateById(
        String resourceGroupName,
        String applicationDefinitionName,
        ApplicationDefinitionInner parameters,
        Context context) {
        ApplicationDefinitionInner inner =
            this.serviceClient().createOrUpdateById(resourceGroupName, applicationDefinitionName, parameters, context);
        if (inner != null) {
            return new ApplicationDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ApplicationDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managedapplications.ApplicationManager manager() {
        return this.serviceManager;
    }

    public ApplicationDefinitionImpl define(String name) {
        return new ApplicationDefinitionImpl(name, this.manager());
    }
}
