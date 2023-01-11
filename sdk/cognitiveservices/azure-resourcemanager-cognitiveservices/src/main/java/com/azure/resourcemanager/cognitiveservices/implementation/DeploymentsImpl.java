// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.fluent.DeploymentsClient;
import com.azure.resourcemanager.cognitiveservices.fluent.models.DeploymentInner;
import com.azure.resourcemanager.cognitiveservices.models.Deployment;
import com.azure.resourcemanager.cognitiveservices.models.Deployments;

public final class DeploymentsImpl implements Deployments {
    private static final ClientLogger LOGGER = new ClientLogger(DeploymentsImpl.class);

    private final DeploymentsClient innerClient;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

    public DeploymentsImpl(
        DeploymentsClient innerClient,
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Deployment> list(String resourceGroupName, String accountName) {
        PagedIterable<DeploymentInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new DeploymentImpl(inner1, this.manager()));
    }

    public PagedIterable<Deployment> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<DeploymentInner> inner = this.serviceClient().list(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new DeploymentImpl(inner1, this.manager()));
    }

    public Response<Deployment> getWithResponse(
        String resourceGroupName, String accountName, String deploymentName, Context context) {
        Response<DeploymentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Deployment get(String resourceGroupName, String accountName, String deploymentName) {
        DeploymentInner inner = this.serviceClient().get(resourceGroupName, accountName, deploymentName);
        if (inner != null) {
            return new DeploymentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String deploymentName) {
        this.serviceClient().delete(resourceGroupName, accountName, deploymentName);
    }

    public void delete(String resourceGroupName, String accountName, String deploymentName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, deploymentName, context);
    }

    public Deployment getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, deploymentName, Context.NONE).getValue();
    }

    public Response<Deployment> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, deploymentName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        this.delete(resourceGroupName, accountName, deploymentName, Context.NONE);
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
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        this.delete(resourceGroupName, accountName, deploymentName, context);
    }

    private DeploymentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }

    public DeploymentImpl define(String name) {
        return new DeploymentImpl(name, this.manager());
    }
}
