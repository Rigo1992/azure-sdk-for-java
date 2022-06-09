// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.implementation;

import com.azure.resourcemanager.workloads.fluent.models.WordpressInstanceResourceInner;
import com.azure.resourcemanager.workloads.models.ApplicationProvisioningState;
import com.azure.resourcemanager.workloads.models.WordpressInstanceResource;
import com.azure.resourcemanager.workloads.models.WordpressVersions;

public final class WordpressInstanceResourceImpl implements WordpressInstanceResource {
    private WordpressInstanceResourceInner innerObject;

    private final com.azure.resourcemanager.workloads.WorkloadsManager serviceManager;

    WordpressInstanceResourceImpl(
        WordpressInstanceResourceInner innerObject,
        com.azure.resourcemanager.workloads.WorkloadsManager serviceManager) {
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

    public WordpressVersions version() {
        return this.innerModel().version();
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public String databaseUser() {
        return this.innerModel().databaseUser();
    }

    public String siteUrl() {
        return this.innerModel().siteUrl();
    }

    public ApplicationProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public WordpressInstanceResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.workloads.WorkloadsManager manager() {
        return this.serviceManager;
    }
}
