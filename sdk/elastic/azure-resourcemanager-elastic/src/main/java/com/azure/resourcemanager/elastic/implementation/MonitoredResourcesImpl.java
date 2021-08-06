// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elastic.fluent.MonitoredResourcesClient;
import com.azure.resourcemanager.elastic.fluent.models.MonitoredResourceInner;
import com.azure.resourcemanager.elastic.models.MonitoredResource;
import com.azure.resourcemanager.elastic.models.MonitoredResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MonitoredResourcesImpl implements MonitoredResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MonitoredResourcesImpl.class);

    private final MonitoredResourcesClient innerClient;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    public MonitoredResourcesImpl(
        MonitoredResourcesClient innerClient, com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MonitoredResource> list(String resourceGroupName, String monitorName) {
        PagedIterable<MonitoredResourceInner> inner = this.serviceClient().list(resourceGroupName, monitorName);
        return Utils.mapPage(inner, inner1 -> new MonitoredResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MonitoredResource> list(String resourceGroupName, String monitorName, Context context) {
        PagedIterable<MonitoredResourceInner> inner =
            this.serviceClient().list(resourceGroupName, monitorName, context);
        return Utils.mapPage(inner, inner1 -> new MonitoredResourceImpl(inner1, this.manager()));
    }

    private MonitoredResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }
}
