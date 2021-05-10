// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.resourcemanager.labservices.fluent.models.OperationResultInner;
import com.azure.resourcemanager.labservices.models.OperationError;
import com.azure.resourcemanager.labservices.models.OperationResult;

public final class OperationResultImpl implements OperationResult {
    private OperationResultInner innerObject;

    private final com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager;

    OperationResultImpl(
        OperationResultInner innerObject, com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String status() {
        return this.innerModel().status();
    }

    public OperationError error() {
        return this.innerModel().error();
    }

    public OperationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.labservices.ManagedLabsManager manager() {
        return this.serviceManager;
    }
}
