// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.resourcemanager.support.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.support.models.CheckNameAvailabilityOutput;

public final class CheckNameAvailabilityOutputImpl implements CheckNameAvailabilityOutput {
    private CheckNameAvailabilityOutputInner innerObject;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    CheckNameAvailabilityOutputImpl(
        CheckNameAvailabilityOutputInner innerObject, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityOutputInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }
}
