// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.astro.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.astro.fluent.models.OrganizationResourceInner;
import com.azure.resourcemanager.astro.models.LiftrBaseDataOrganizationProperties;
import com.azure.resourcemanager.astro.models.ManagedServiceIdentity;
import com.azure.resourcemanager.astro.models.OrganizationResource;
import com.azure.resourcemanager.astro.models.OrganizationResourceUpdate;
import com.azure.resourcemanager.astro.models.OrganizationResourceUpdateProperties;
import java.util.Collections;
import java.util.Map;

public final class OrganizationResourceImpl
    implements OrganizationResource, OrganizationResource.Definition, OrganizationResource.Update {
    private OrganizationResourceInner innerObject;

    private final com.azure.resourcemanager.astro.AstroManager serviceManager;

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

    public LiftrBaseDataOrganizationProperties properties() {
        return this.innerModel().properties();
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
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

    public OrganizationResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.astro.AstroManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String organizationName;

    private OrganizationResourceUpdate updateProperties;

    public OrganizationResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public OrganizationResource create() {
        this.innerObject = serviceManager.serviceClient().getOrganizations().createOrUpdate(resourceGroupName,
            organizationName, this.innerModel(), Context.NONE);
        return this;
    }

    public OrganizationResource create(Context context) {
        this.innerObject = serviceManager.serviceClient().getOrganizations().createOrUpdate(resourceGroupName,
            organizationName, this.innerModel(), context);
        return this;
    }

    OrganizationResourceImpl(String name, com.azure.resourcemanager.astro.AstroManager serviceManager) {
        this.innerObject = new OrganizationResourceInner();
        this.serviceManager = serviceManager;
        this.organizationName = name;
    }

    public OrganizationResourceImpl update() {
        this.updateProperties = new OrganizationResourceUpdate();
        return this;
    }

    public OrganizationResource apply() {
        this.innerObject = serviceManager.serviceClient().getOrganizations().update(resourceGroupName, organizationName,
            updateProperties, Context.NONE);
        return this;
    }

    public OrganizationResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getOrganizations().update(resourceGroupName, organizationName,
            updateProperties, context);
        return this;
    }

    OrganizationResourceImpl(OrganizationResourceInner innerObject,
        com.azure.resourcemanager.astro.AstroManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.organizationName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "organizations");
    }

    public OrganizationResource refresh() {
        this.innerObject = serviceManager.serviceClient().getOrganizations()
            .getByResourceGroupWithResponse(resourceGroupName, organizationName, Context.NONE).getValue();
        return this;
    }

    public OrganizationResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getOrganizations()
            .getByResourceGroupWithResponse(resourceGroupName, organizationName, context).getValue();
        return this;
    }

    public OrganizationResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public OrganizationResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public OrganizationResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public OrganizationResourceImpl withProperties(LiftrBaseDataOrganizationProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public OrganizationResourceImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateProperties.withIdentity(identity);
            return this;
        }
    }

    public OrganizationResourceImpl withProperties(OrganizationResourceUpdateProperties properties) {
        this.updateProperties.withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
