// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.AzureADOnlyAuthenticationsClient;
import com.azure.resourcemanager.synapse.fluent.models.AzureADOnlyAuthenticationInner;
import com.azure.resourcemanager.synapse.models.AzureADOnlyAuthentication;
import com.azure.resourcemanager.synapse.models.AzureADOnlyAuthenticationName;
import com.azure.resourcemanager.synapse.models.AzureADOnlyAuthentications;

public final class AzureADOnlyAuthenticationsImpl implements AzureADOnlyAuthentications {
    private static final ClientLogger LOGGER = new ClientLogger(AzureADOnlyAuthenticationsImpl.class);

    private final AzureADOnlyAuthenticationsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public AzureADOnlyAuthenticationsImpl(
        AzureADOnlyAuthenticationsClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AzureADOnlyAuthentication get(
        String resourceGroupName, String workspaceName, AzureADOnlyAuthenticationName azureADOnlyAuthenticationName) {
        AzureADOnlyAuthenticationInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, azureADOnlyAuthenticationName);
        if (inner != null) {
            return new AzureADOnlyAuthenticationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AzureADOnlyAuthentication> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        AzureADOnlyAuthenticationName azureADOnlyAuthenticationName,
        Context context) {
        Response<AzureADOnlyAuthenticationInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, azureADOnlyAuthenticationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureADOnlyAuthenticationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<AzureADOnlyAuthentication> list(String resourceGroupName, String workspaceName) {
        PagedIterable<AzureADOnlyAuthenticationInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new AzureADOnlyAuthenticationImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureADOnlyAuthentication> list(
        String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<AzureADOnlyAuthenticationInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new AzureADOnlyAuthenticationImpl(inner1, this.manager()));
    }

    public AzureADOnlyAuthentication getById(String id) {
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
        AzureADOnlyAuthenticationName azureADOnlyAuthenticationName =
            AzureADOnlyAuthenticationName.fromString(Utils.getValueFromIdByName(id, "azureADOnlyAuthentications"));
        if (azureADOnlyAuthenticationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureADOnlyAuthentications'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, workspaceName, azureADOnlyAuthenticationName, Context.NONE)
            .getValue();
    }

    public Response<AzureADOnlyAuthentication> getByIdWithResponse(String id, Context context) {
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
        AzureADOnlyAuthenticationName azureADOnlyAuthenticationName =
            AzureADOnlyAuthenticationName.fromString(Utils.getValueFromIdByName(id, "azureADOnlyAuthentications"));
        if (azureADOnlyAuthenticationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureADOnlyAuthentications'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, azureADOnlyAuthenticationName, context);
    }

    private AzureADOnlyAuthenticationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    public AzureADOnlyAuthenticationImpl define(AzureADOnlyAuthenticationName name) {
        return new AzureADOnlyAuthenticationImpl(name, this.manager());
    }
}
