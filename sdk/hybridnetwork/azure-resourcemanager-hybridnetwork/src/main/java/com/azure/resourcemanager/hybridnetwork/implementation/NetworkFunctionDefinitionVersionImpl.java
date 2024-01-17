// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionDefinitionVersionInner;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionDefinitionVersionUpdateStateInner;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionDefinitionVersion;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionDefinitionVersionPropertiesFormat;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionDefinitionVersionUpdateState;
import com.azure.resourcemanager.hybridnetwork.models.TagsObject;
import java.util.Collections;
import java.util.Map;

public final class NetworkFunctionDefinitionVersionImpl implements NetworkFunctionDefinitionVersion,
    NetworkFunctionDefinitionVersion.Definition, NetworkFunctionDefinitionVersion.Update {
    private NetworkFunctionDefinitionVersionInner innerObject;

    private final com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public NetworkFunctionDefinitionVersionPropertiesFormat properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public NetworkFunctionDefinitionVersionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String publisherName;

    private String networkFunctionDefinitionGroupName;

    private String networkFunctionDefinitionVersionName;

    private TagsObject updateParameters;

    public NetworkFunctionDefinitionVersionImpl withExistingNetworkFunctionDefinitionGroup(String resourceGroupName,
        String publisherName, String networkFunctionDefinitionGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.publisherName = publisherName;
        this.networkFunctionDefinitionGroupName = networkFunctionDefinitionGroupName;
        return this;
    }

    public NetworkFunctionDefinitionVersion create() {
        this.innerObject = serviceManager.serviceClient().getNetworkFunctionDefinitionVersions().createOrUpdate(
            resourceGroupName, publisherName, networkFunctionDefinitionGroupName, networkFunctionDefinitionVersionName,
            this.innerModel(), Context.NONE);
        return this;
    }

    public NetworkFunctionDefinitionVersion create(Context context) {
        this.innerObject = serviceManager.serviceClient().getNetworkFunctionDefinitionVersions().createOrUpdate(
            resourceGroupName, publisherName, networkFunctionDefinitionGroupName, networkFunctionDefinitionVersionName,
            this.innerModel(), context);
        return this;
    }

    NetworkFunctionDefinitionVersionImpl(String name,
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerObject = new NetworkFunctionDefinitionVersionInner();
        this.serviceManager = serviceManager;
        this.networkFunctionDefinitionVersionName = name;
    }

    public NetworkFunctionDefinitionVersionImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public NetworkFunctionDefinitionVersion apply() {
        this.innerObject = serviceManager.serviceClient().getNetworkFunctionDefinitionVersions()
            .updateWithResponse(resourceGroupName, publisherName, networkFunctionDefinitionGroupName,
                networkFunctionDefinitionVersionName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public NetworkFunctionDefinitionVersion apply(Context context) {
        this.innerObject = serviceManager
            .serviceClient().getNetworkFunctionDefinitionVersions().updateWithResponse(resourceGroupName, publisherName,
                networkFunctionDefinitionGroupName, networkFunctionDefinitionVersionName, updateParameters, context)
            .getValue();
        return this;
    }

    NetworkFunctionDefinitionVersionImpl(NetworkFunctionDefinitionVersionInner innerObject,
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.publisherName = Utils.getValueFromIdByName(innerObject.id(), "publishers");
        this.networkFunctionDefinitionGroupName
            = Utils.getValueFromIdByName(innerObject.id(), "networkFunctionDefinitionGroups");
        this.networkFunctionDefinitionVersionName
            = Utils.getValueFromIdByName(innerObject.id(), "networkFunctionDefinitionVersions");
    }

    public NetworkFunctionDefinitionVersion refresh() {
        this.innerObject = serviceManager.serviceClient().getNetworkFunctionDefinitionVersions()
            .getWithResponse(resourceGroupName, publisherName, networkFunctionDefinitionGroupName,
                networkFunctionDefinitionVersionName, Context.NONE)
            .getValue();
        return this;
    }

    public NetworkFunctionDefinitionVersion refresh(Context context) {
        this.innerObject
            = serviceManager
                .serviceClient().getNetworkFunctionDefinitionVersions().getWithResponse(resourceGroupName,
                    publisherName, networkFunctionDefinitionGroupName, networkFunctionDefinitionVersionName, context)
                .getValue();
        return this;
    }

    public NetworkFunctionDefinitionVersionUpdateState
        updateState(NetworkFunctionDefinitionVersionUpdateStateInner parameters) {
        return serviceManager.networkFunctionDefinitionVersions().updateState(resourceGroupName, publisherName,
            networkFunctionDefinitionGroupName, networkFunctionDefinitionVersionName, parameters);
    }

    public NetworkFunctionDefinitionVersionUpdateState
        updateState(NetworkFunctionDefinitionVersionUpdateStateInner parameters, Context context) {
        return serviceManager.networkFunctionDefinitionVersions().updateState(resourceGroupName, publisherName,
            networkFunctionDefinitionGroupName, networkFunctionDefinitionVersionName, parameters, context);
    }

    public NetworkFunctionDefinitionVersionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkFunctionDefinitionVersionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkFunctionDefinitionVersionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NetworkFunctionDefinitionVersionImpl
        withProperties(NetworkFunctionDefinitionVersionPropertiesFormat properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
