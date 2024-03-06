// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.workloadssapvirtualinstance.fluent.models.SapCentralServerInstanceInner;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.OperationStatusResult;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapCentralServerInstance;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.SapCentralServerProperties;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.StartRequest;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.StopRequest;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.UpdateSapCentralInstanceRequest;
import java.util.Collections;
import java.util.Map;

public final class SapCentralServerInstanceImpl
    implements SapCentralServerInstance, SapCentralServerInstance.Definition, SapCentralServerInstance.Update {
    private SapCentralServerInstanceInner innerObject;

    private final com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager serviceManager;

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

    public SapCentralServerProperties properties() {
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

    public SapCentralServerInstanceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String sapVirtualInstanceName;

    private String centralInstanceName;

    private UpdateSapCentralInstanceRequest updateBody;

    public SapCentralServerInstanceImpl withExistingSapVirtualInstance(String resourceGroupName,
        String sapVirtualInstanceName) {
        this.resourceGroupName = resourceGroupName;
        this.sapVirtualInstanceName = sapVirtualInstanceName;
        return this;
    }

    public SapCentralServerInstance create() {
        this.innerObject = serviceManager.serviceClient().getSapCentralInstances().create(resourceGroupName,
            sapVirtualInstanceName, centralInstanceName, this.innerModel(), Context.NONE);
        return this;
    }

    public SapCentralServerInstance create(Context context) {
        this.innerObject = serviceManager.serviceClient().getSapCentralInstances().create(resourceGroupName,
            sapVirtualInstanceName, centralInstanceName, this.innerModel(), context);
        return this;
    }

    SapCentralServerInstanceImpl(String name,
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager serviceManager) {
        this.innerObject = new SapCentralServerInstanceInner();
        this.serviceManager = serviceManager;
        this.centralInstanceName = name;
    }

    public SapCentralServerInstanceImpl update() {
        this.updateBody = new UpdateSapCentralInstanceRequest();
        return this;
    }

    public SapCentralServerInstance apply() {
        this.innerObject = serviceManager.serviceClient().getSapCentralInstances().updateWithResponse(resourceGroupName,
            sapVirtualInstanceName, centralInstanceName, updateBody, Context.NONE).getValue();
        return this;
    }

    public SapCentralServerInstance apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getSapCentralInstances()
            .updateWithResponse(resourceGroupName, sapVirtualInstanceName, centralInstanceName, updateBody, context)
            .getValue();
        return this;
    }

    SapCentralServerInstanceImpl(SapCentralServerInstanceInner innerObject,
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.sapVirtualInstanceName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "sapVirtualInstances");
        this.centralInstanceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "centralInstances");
    }

    public SapCentralServerInstance refresh() {
        this.innerObject = serviceManager.serviceClient().getSapCentralInstances()
            .getWithResponse(resourceGroupName, sapVirtualInstanceName, centralInstanceName, Context.NONE).getValue();
        return this;
    }

    public SapCentralServerInstance refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getSapCentralInstances()
            .getWithResponse(resourceGroupName, sapVirtualInstanceName, centralInstanceName, context).getValue();
        return this;
    }

    public OperationStatusResult startInstance() {
        return serviceManager.sapCentralInstances().startInstance(resourceGroupName, sapVirtualInstanceName,
            centralInstanceName);
    }

    public OperationStatusResult startInstance(StartRequest body, Context context) {
        return serviceManager.sapCentralInstances().startInstance(resourceGroupName, sapVirtualInstanceName,
            centralInstanceName, body, context);
    }

    public OperationStatusResult stopInstance() {
        return serviceManager.sapCentralInstances().stopInstance(resourceGroupName, sapVirtualInstanceName,
            centralInstanceName);
    }

    public OperationStatusResult stopInstance(StopRequest body, Context context) {
        return serviceManager.sapCentralInstances().stopInstance(resourceGroupName, sapVirtualInstanceName,
            centralInstanceName, body, context);
    }

    public SapCentralServerInstanceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SapCentralServerInstanceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SapCentralServerInstanceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public SapCentralServerInstanceImpl withProperties(SapCentralServerProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
