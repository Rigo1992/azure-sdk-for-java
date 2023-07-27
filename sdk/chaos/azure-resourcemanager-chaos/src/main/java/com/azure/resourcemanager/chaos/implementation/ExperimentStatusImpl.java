// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.implementation;

import com.azure.resourcemanager.chaos.fluent.models.ExperimentStatusInner;
import com.azure.resourcemanager.chaos.models.ExperimentStatus;
import java.time.OffsetDateTime;

public final class ExperimentStatusImpl implements ExperimentStatus {
    private ExperimentStatusInner innerObject;

    private final com.azure.resourcemanager.chaos.ChaosManager serviceManager;

    ExperimentStatusImpl(
        ExperimentStatusInner innerObject, com.azure.resourcemanager.chaos.ChaosManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String type() {
        return this.innerModel().type();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String status() {
        return this.innerModel().status();
    }

    public OffsetDateTime createdDateUtc() {
        return this.innerModel().createdDateUtc();
    }

    public OffsetDateTime endDateUtc() {
        return this.innerModel().endDateUtc();
    }

    public ExperimentStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.chaos.ChaosManager manager() {
        return this.serviceManager;
    }
}