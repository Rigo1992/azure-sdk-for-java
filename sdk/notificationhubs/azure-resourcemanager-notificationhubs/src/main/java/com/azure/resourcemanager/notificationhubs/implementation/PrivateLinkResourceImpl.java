// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.notificationhubs.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.notificationhubs.models.PrivateLinkResource;
import com.azure.resourcemanager.notificationhubs.models.PrivateLinkResourceProperties;

public final class PrivateLinkResourceImpl implements PrivateLinkResource {
    private PrivateLinkResourceInner innerObject;

    private final com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager;

    PrivateLinkResourceImpl(PrivateLinkResourceInner innerObject,
        com.azure.resourcemanager.notificationhubs.NotificationHubsManager serviceManager) {
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

    public PrivateLinkResourceProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public PrivateLinkResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager() {
        return this.serviceManager;
    }
}
