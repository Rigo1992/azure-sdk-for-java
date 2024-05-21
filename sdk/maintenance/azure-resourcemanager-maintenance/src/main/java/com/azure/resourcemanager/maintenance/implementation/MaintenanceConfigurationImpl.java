// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.maintenance.fluent.models.MaintenanceConfigurationInner;
import com.azure.resourcemanager.maintenance.models.InputPatchConfiguration;
import com.azure.resourcemanager.maintenance.models.MaintenanceConfiguration;
import com.azure.resourcemanager.maintenance.models.MaintenanceScope;
import com.azure.resourcemanager.maintenance.models.Visibility;
import java.util.Collections;
import java.util.Map;

public final class MaintenanceConfigurationImpl
    implements MaintenanceConfiguration, MaintenanceConfiguration.Definition, MaintenanceConfiguration.Update {
    private MaintenanceConfigurationInner innerObject;

    private final com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager;

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

    public String namespace() {
        return this.innerModel().namespace();
    }

    public Map<String, String> extensionProperties() {
        Map<String, String> inner = this.innerModel().extensionProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public MaintenanceScope maintenanceScope() {
        return this.innerModel().maintenanceScope();
    }

    public Visibility visibility() {
        return this.innerModel().visibility();
    }

    public InputPatchConfiguration installPatches() {
        return this.innerModel().installPatches();
    }

    public String startDateTime() {
        return this.innerModel().startDateTime();
    }

    public String expirationDateTime() {
        return this.innerModel().expirationDateTime();
    }

    public String duration() {
        return this.innerModel().duration();
    }

    public String timeZone() {
        return this.innerModel().timeZone();
    }

    public String recurEvery() {
        return this.innerModel().recurEvery();
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

    public MaintenanceConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.maintenance.MaintenanceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    public MaintenanceConfigurationImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public MaintenanceConfiguration create() {
        this.innerObject = serviceManager.serviceClient()
            .getMaintenanceConfigurations()
            .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public MaintenanceConfiguration create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getMaintenanceConfigurations()
            .createOrUpdateWithResponse(resourceGroupName, resourceName, this.innerModel(), context)
            .getValue();
        return this;
    }

    MaintenanceConfigurationImpl(String name, com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager) {
        this.innerObject = new MaintenanceConfigurationInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public MaintenanceConfigurationImpl update() {
        return this;
    }

    public MaintenanceConfiguration apply() {
        this.innerObject = serviceManager.serviceClient()
            .getMaintenanceConfigurations()
            .updateWithResponse(resourceGroupName, resourceName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public MaintenanceConfiguration apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getMaintenanceConfigurations()
            .updateWithResponse(resourceGroupName, resourceName, this.innerModel(), context)
            .getValue();
        return this;
    }

    MaintenanceConfigurationImpl(MaintenanceConfigurationInner innerObject,
        com.azure.resourcemanager.maintenance.MaintenanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.resourceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "maintenanceConfigurations");
    }

    public MaintenanceConfiguration refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getMaintenanceConfigurations()
            .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
            .getValue();
        return this;
    }

    public MaintenanceConfiguration refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getMaintenanceConfigurations()
            .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
            .getValue();
        return this;
    }

    public MaintenanceConfigurationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public MaintenanceConfigurationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public MaintenanceConfigurationImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public MaintenanceConfigurationImpl withNamespace(String namespace) {
        this.innerModel().withNamespace(namespace);
        return this;
    }

    public MaintenanceConfigurationImpl withExtensionProperties(Map<String, String> extensionProperties) {
        this.innerModel().withExtensionProperties(extensionProperties);
        return this;
    }

    public MaintenanceConfigurationImpl withMaintenanceScope(MaintenanceScope maintenanceScope) {
        this.innerModel().withMaintenanceScope(maintenanceScope);
        return this;
    }

    public MaintenanceConfigurationImpl withVisibility(Visibility visibility) {
        this.innerModel().withVisibility(visibility);
        return this;
    }

    public MaintenanceConfigurationImpl withInstallPatches(InputPatchConfiguration installPatches) {
        this.innerModel().withInstallPatches(installPatches);
        return this;
    }

    public MaintenanceConfigurationImpl withStartDateTime(String startDateTime) {
        this.innerModel().withStartDateTime(startDateTime);
        return this;
    }

    public MaintenanceConfigurationImpl withExpirationDateTime(String expirationDateTime) {
        this.innerModel().withExpirationDateTime(expirationDateTime);
        return this;
    }

    public MaintenanceConfigurationImpl withDuration(String duration) {
        this.innerModel().withDuration(duration);
        return this;
    }

    public MaintenanceConfigurationImpl withTimeZone(String timeZone) {
        this.innerModel().withTimeZone(timeZone);
        return this;
    }

    public MaintenanceConfigurationImpl withRecurEvery(String recurEvery) {
        this.innerModel().withRecurEvery(recurEvery);
        return this;
    }
}
