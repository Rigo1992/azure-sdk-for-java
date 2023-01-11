// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.loadtesting.fluent.models.CheckQuotaAvailabilityResponseInner;
import com.azure.resourcemanager.loadtesting.models.CheckQuotaAvailabilityResponse;

public final class CheckQuotaAvailabilityResponseImpl implements CheckQuotaAvailabilityResponse {
    private CheckQuotaAvailabilityResponseInner innerObject;

    private final com.azure.resourcemanager.loadtesting.LoadTestManager serviceManager;

    CheckQuotaAvailabilityResponseImpl(
        CheckQuotaAvailabilityResponseInner innerObject,
        com.azure.resourcemanager.loadtesting.LoadTestManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Boolean isAvailable() {
        return this.innerModel().isAvailable();
    }

    public String availabilityStatus() {
        return this.innerModel().availabilityStatus();
    }

    public CheckQuotaAvailabilityResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.loadtesting.LoadTestManager manager() {
        return this.serviceManager;
    }
}
