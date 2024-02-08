// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.springappdiscovery.fluent.models.SpringbootappsModelInner;
import com.azure.resourcemanager.springappdiscovery.models.SpringbootappsModel;
import com.azure.resourcemanager.springappdiscovery.models.SpringbootappsProperties;
import java.util.Collections;
import java.util.Map;

public final class SpringbootappsModelImpl implements SpringbootappsModel {
    private SpringbootappsModelInner innerObject;

    private final com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager serviceManager;

    SpringbootappsModelImpl(SpringbootappsModelInner innerObject,
        com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager serviceManager) {
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

    public SpringbootappsProperties properties() {
        return this.innerModel().properties();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public SpringbootappsModelInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager manager() {
        return this.serviceManager;
    }
}
