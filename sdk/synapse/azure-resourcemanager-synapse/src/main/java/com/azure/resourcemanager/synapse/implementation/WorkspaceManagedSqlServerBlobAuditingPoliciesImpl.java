// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.WorkspaceManagedSqlServerBlobAuditingPoliciesClient;
import com.azure.resourcemanager.synapse.fluent.models.ServerBlobAuditingPolicyInner;
import com.azure.resourcemanager.synapse.models.BlobAuditingPolicyName;
import com.azure.resourcemanager.synapse.models.ServerBlobAuditingPolicy;
import com.azure.resourcemanager.synapse.models.WorkspaceManagedSqlServerBlobAuditingPolicies;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkspaceManagedSqlServerBlobAuditingPoliciesImpl
    implements WorkspaceManagedSqlServerBlobAuditingPolicies {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(WorkspaceManagedSqlServerBlobAuditingPoliciesImpl.class);

    private final WorkspaceManagedSqlServerBlobAuditingPoliciesClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public WorkspaceManagedSqlServerBlobAuditingPoliciesImpl(
        WorkspaceManagedSqlServerBlobAuditingPoliciesClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServerBlobAuditingPolicy get(
        String resourceGroupName, String workspaceName, BlobAuditingPolicyName blobAuditingPolicyName) {
        ServerBlobAuditingPolicyInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, blobAuditingPolicyName);
        if (inner != null) {
            return new ServerBlobAuditingPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerBlobAuditingPolicy> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        BlobAuditingPolicyName blobAuditingPolicyName,
        Context context) {
        Response<ServerBlobAuditingPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, blobAuditingPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerBlobAuditingPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ServerBlobAuditingPolicy> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<ServerBlobAuditingPolicyInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new ServerBlobAuditingPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerBlobAuditingPolicy> listByWorkspace(
        String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<ServerBlobAuditingPolicyInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new ServerBlobAuditingPolicyImpl(inner1, this.manager()));
    }

    public ServerBlobAuditingPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        BlobAuditingPolicyName blobAuditingPolicyName =
            BlobAuditingPolicyName.fromString(Utils.getValueFromIdByName(id, "auditingSettings"));
        if (blobAuditingPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'auditingSettings'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, blobAuditingPolicyName, Context.NONE).getValue();
    }

    public Response<ServerBlobAuditingPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        BlobAuditingPolicyName blobAuditingPolicyName =
            BlobAuditingPolicyName.fromString(Utils.getValueFromIdByName(id, "auditingSettings"));
        if (blobAuditingPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'auditingSettings'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, blobAuditingPolicyName, context);
    }

    private WorkspaceManagedSqlServerBlobAuditingPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    public ServerBlobAuditingPolicyImpl define(BlobAuditingPolicyName name) {
        return new ServerBlobAuditingPolicyImpl(name, this.manager());
    }
}
