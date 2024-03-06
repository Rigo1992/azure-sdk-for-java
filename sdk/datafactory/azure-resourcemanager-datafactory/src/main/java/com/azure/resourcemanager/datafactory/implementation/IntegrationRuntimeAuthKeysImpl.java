// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeAuthKeysInner;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeAuthKeys;

public final class IntegrationRuntimeAuthKeysImpl implements IntegrationRuntimeAuthKeys {
    private IntegrationRuntimeAuthKeysInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    IntegrationRuntimeAuthKeysImpl(IntegrationRuntimeAuthKeysInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String authKey1() {
        return this.innerModel().authKey1();
    }

    public String authKey2() {
        return this.innerModel().authKey2();
    }

    public IntegrationRuntimeAuthKeysInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
