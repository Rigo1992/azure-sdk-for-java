// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NeighborGroupInner;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborGroup;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborGroupDestination;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborGroupPatch;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NeighborGroupImpl implements NeighborGroup, NeighborGroup.Definition, NeighborGroup.Update {
    private NeighborGroupInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<String> networkTapIds() {
        List<String> inner = this.innerModel().networkTapIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> networkTapRuleIds() {
        List<String> inner = this.innerModel().networkTapRuleIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NeighborGroupDestination destination() {
        return this.innerModel().destination();
    }

    public String annotation() {
        return this.innerModel().annotation();
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

    public NeighborGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String neighborGroupName;

    private NeighborGroupPatch updateBody;

    public NeighborGroupImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NeighborGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNeighborGroups()
                .create(resourceGroupName, neighborGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public NeighborGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNeighborGroups()
                .create(resourceGroupName, neighborGroupName, this.innerModel(), context);
        return this;
    }

    NeighborGroupImpl(
        String name, com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = new NeighborGroupInner();
        this.serviceManager = serviceManager;
        this.neighborGroupName = name;
    }

    public NeighborGroupImpl update() {
        this.updateBody = new NeighborGroupPatch();
        return this;
    }

    public NeighborGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNeighborGroups()
                .update(resourceGroupName, neighborGroupName, updateBody, Context.NONE);
        return this;
    }

    public NeighborGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNeighborGroups()
                .update(resourceGroupName, neighborGroupName, updateBody, context);
        return this;
    }

    NeighborGroupImpl(
        NeighborGroupInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.neighborGroupName = Utils.getValueFromIdByName(innerObject.id(), "neighborGroups");
    }

    public NeighborGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNeighborGroups()
                .getByResourceGroupWithResponse(resourceGroupName, neighborGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public NeighborGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNeighborGroups()
                .getByResourceGroupWithResponse(resourceGroupName, neighborGroupName, context)
                .getValue();
        return this;
    }

    public NeighborGroupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NeighborGroupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NeighborGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public NeighborGroupImpl withDestination(NeighborGroupDestination destination) {
        if (isInCreateMode()) {
            this.innerModel().withDestination(destination);
            return this;
        } else {
            this.updateBody.withDestination(destination);
            return this;
        }
    }

    public NeighborGroupImpl withAnnotation(String annotation) {
        if (isInCreateMode()) {
            this.innerModel().withAnnotation(annotation);
            return this;
        } else {
            this.updateBody.withAnnotation(annotation);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}