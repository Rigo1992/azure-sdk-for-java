// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.education.fluent.models.JoinRequestDetailsInner;
import com.azure.resourcemanager.education.models.JoinRequestDetails;
import com.azure.resourcemanager.education.models.JoinRequestStatus;

public final class JoinRequestDetailsImpl implements JoinRequestDetails {
    private JoinRequestDetailsInner innerObject;

    private final com.azure.resourcemanager.education.EducationManager serviceManager;

    JoinRequestDetailsImpl(
        JoinRequestDetailsInner innerObject, com.azure.resourcemanager.education.EducationManager serviceManager) {
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

    public String firstName() {
        return this.innerModel().firstName();
    }

    public String lastName() {
        return this.innerModel().lastName();
    }

    public String email() {
        return this.innerModel().email();
    }

    public JoinRequestStatus status() {
        return this.innerModel().status();
    }

    public JoinRequestDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.education.EducationManager manager() {
        return this.serviceManager;
    }
}
