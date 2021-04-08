// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.delegatednetwork.fluent.models.DelegatedControllerInner;
import com.azure.resourcemanager.delegatednetwork.models.ControllerResourceUpdateParameters;
import com.azure.resourcemanager.delegatednetwork.models.ControllerState;
import com.azure.resourcemanager.delegatednetwork.models.DelegatedController;
import java.util.Collections;
import java.util.Map;

public final class DelegatedControllerImpl
    implements DelegatedController, DelegatedController.Definition, DelegatedController.Update {
    private DelegatedControllerInner innerObject;

    private final com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager serviceManager;

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

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ControllerState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String dncAppId() {
        return this.innerModel().dncAppId();
    }

    public String dncTenantId() {
        return this.innerModel().dncTenantId();
    }

    public String dncEndpoint() {
        return this.innerModel().dncEndpoint();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public DelegatedControllerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private ControllerResourceUpdateParameters updateParameters;

    public DelegatedControllerImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DelegatedController create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getControllers()
                .create(resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public DelegatedController create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getControllers()
                .create(resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    DelegatedControllerImpl(
        String name, com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager serviceManager) {
        this.innerObject = new DelegatedControllerInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public DelegatedControllerImpl update() {
        this.updateParameters = new ControllerResourceUpdateParameters();
        return this;
    }

    public DelegatedController apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getControllers()
                .patchWithResponse(resourceGroupName, resourceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public DelegatedController apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getControllers()
                .patchWithResponse(resourceGroupName, resourceName, updateParameters, context)
                .getValue();
        return this;
    }

    DelegatedControllerImpl(
        DelegatedControllerInner innerObject,
        com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "controller");
    }

    public DelegatedController refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getControllers()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public DelegatedController refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getControllers()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public DelegatedControllerImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DelegatedControllerImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DelegatedControllerImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
