// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.LogFilesClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LogFileInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LogFile;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LogFiles;

public final class LogFilesImpl implements LogFiles {
    private static final ClientLogger LOGGER = new ClientLogger(LogFilesImpl.class);

    private final LogFilesClient innerClient;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    public LogFilesImpl(LogFilesClient innerClient,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LogFile> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<LogFileInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LogFileImpl(inner1, this.manager()));
    }

    public PagedIterable<LogFile> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<LogFileInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LogFileImpl(inner1, this.manager()));
    }

    private LogFilesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
