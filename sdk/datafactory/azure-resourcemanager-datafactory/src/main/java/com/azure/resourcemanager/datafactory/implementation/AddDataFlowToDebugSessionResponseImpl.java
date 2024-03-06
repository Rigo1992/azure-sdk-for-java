// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.AddDataFlowToDebugSessionResponseInner;
import com.azure.resourcemanager.datafactory.models.AddDataFlowToDebugSessionResponse;

public final class AddDataFlowToDebugSessionResponseImpl implements AddDataFlowToDebugSessionResponse {
    private AddDataFlowToDebugSessionResponseInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    AddDataFlowToDebugSessionResponseImpl(AddDataFlowToDebugSessionResponseInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String jobVersion() {
        return this.innerModel().jobVersion();
    }

    public AddDataFlowToDebugSessionResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
