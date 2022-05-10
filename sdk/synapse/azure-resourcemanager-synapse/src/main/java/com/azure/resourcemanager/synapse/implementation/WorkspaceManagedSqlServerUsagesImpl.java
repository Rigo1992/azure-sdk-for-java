// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.WorkspaceManagedSqlServerUsagesClient;
import com.azure.resourcemanager.synapse.fluent.models.ServerUsageInner;
import com.azure.resourcemanager.synapse.models.ServerUsage;
import com.azure.resourcemanager.synapse.models.WorkspaceManagedSqlServerUsages;

public final class WorkspaceManagedSqlServerUsagesImpl implements WorkspaceManagedSqlServerUsages {
    private static final ClientLogger LOGGER = new ClientLogger(WorkspaceManagedSqlServerUsagesImpl.class);

    private final WorkspaceManagedSqlServerUsagesClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public WorkspaceManagedSqlServerUsagesImpl(
        WorkspaceManagedSqlServerUsagesClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ServerUsage> list(String resourceGroupName, String workspaceName) {
        PagedIterable<ServerUsageInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new ServerUsageImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerUsage> list(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<ServerUsageInner> inner = this.serviceClient().list(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new ServerUsageImpl(inner1, this.manager()));
    }

    private WorkspaceManagedSqlServerUsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
