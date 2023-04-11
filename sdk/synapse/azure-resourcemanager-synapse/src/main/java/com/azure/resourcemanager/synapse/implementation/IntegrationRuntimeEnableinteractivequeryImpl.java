// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeEnableinteractivequeryInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeEnableinteractivequery;
import com.azure.resourcemanager.synapse.models.WorkspaceStatus;

public final class IntegrationRuntimeEnableinteractivequeryImpl implements IntegrationRuntimeEnableinteractivequery {
    private IntegrationRuntimeEnableinteractivequeryInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    IntegrationRuntimeEnableinteractivequeryImpl(
        IntegrationRuntimeEnableinteractivequeryInner innerObject,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public WorkspaceStatus status() {
        return this.innerModel().status();
    }

    public String name() {
        return this.innerModel().name();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public String error() {
        return this.innerModel().error();
    }

    public IntegrationRuntimeEnableinteractivequeryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
