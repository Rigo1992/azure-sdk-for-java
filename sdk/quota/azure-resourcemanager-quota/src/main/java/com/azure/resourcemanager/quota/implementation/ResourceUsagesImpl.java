// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.quota.fluent.models.ResourceUsagesInner;
import com.azure.resourcemanager.quota.models.GroupQuotaUsagesBase;
import com.azure.resourcemanager.quota.models.ResourceUsages;

public final class ResourceUsagesImpl implements ResourceUsages {
    private ResourceUsagesInner innerObject;

    private final com.azure.resourcemanager.quota.QuotaManager serviceManager;

    ResourceUsagesImpl(ResourceUsagesInner innerObject, com.azure.resourcemanager.quota.QuotaManager serviceManager) {
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

    public GroupQuotaUsagesBase properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ResourceUsagesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.quota.QuotaManager manager() {
        return this.serviceManager;
    }
}
