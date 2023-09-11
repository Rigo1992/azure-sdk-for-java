// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsInner;
import com.azure.resourcemanager.appcontainers.models.Diagnostics;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsProperties;

public final class DiagnosticsImpl implements Diagnostics {
    private DiagnosticsInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    DiagnosticsImpl(
        DiagnosticsInner innerObject, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public DiagnosticsProperties properties() {
        return this.innerModel().properties();
    }

    public DiagnosticsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }
}
