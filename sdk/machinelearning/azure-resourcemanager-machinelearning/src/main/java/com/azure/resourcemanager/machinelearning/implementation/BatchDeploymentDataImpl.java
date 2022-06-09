// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.BatchDeploymentDataInner;
import com.azure.resourcemanager.machinelearning.models.BatchDeploymentData;
import com.azure.resourcemanager.machinelearning.models.BatchDeploymentDetails;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.PartialBatchDeployment;
import com.azure.resourcemanager.machinelearning.models.PartialBatchDeploymentPartialTrackedResource;
import com.azure.resourcemanager.machinelearning.models.PartialManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.PartialSku;
import com.azure.resourcemanager.machinelearning.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class BatchDeploymentDataImpl
    implements BatchDeploymentData, BatchDeploymentData.Definition, BatchDeploymentData.Update {
    private BatchDeploymentDataInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

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

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public BatchDeploymentDetails properties() {
        return this.innerModel().properties();
    }

    public Sku sku() {
        return this.innerModel().sku();
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

    public BatchDeploymentDataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String endpointName;

    private String deploymentName;

    private PartialBatchDeploymentPartialTrackedResource updateBody;

    public BatchDeploymentDataImpl withExistingBatchEndpoint(
        String resourceGroupName, String workspaceName, String endpointName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.endpointName = endpointName;
        return this;
    }

    public BatchDeploymentData create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBatchDeployments()
                .createOrUpdate(
                    resourceGroupName, workspaceName, endpointName, deploymentName, this.innerModel(), Context.NONE);
        return this;
    }

    public BatchDeploymentData create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBatchDeployments()
                .createOrUpdate(
                    resourceGroupName, workspaceName, endpointName, deploymentName, this.innerModel(), context);
        return this;
    }

    BatchDeploymentDataImpl(
        String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new BatchDeploymentDataInner();
        this.serviceManager = serviceManager;
        this.deploymentName = name;
    }

    public BatchDeploymentDataImpl update() {
        this.updateBody = new PartialBatchDeploymentPartialTrackedResource();
        return this;
    }

    public BatchDeploymentData apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBatchDeployments()
                .update(resourceGroupName, workspaceName, endpointName, deploymentName, updateBody, Context.NONE);
        return this;
    }

    public BatchDeploymentData apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBatchDeployments()
                .update(resourceGroupName, workspaceName, endpointName, deploymentName, updateBody, context);
        return this;
    }

    BatchDeploymentDataImpl(
        BatchDeploymentDataInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.endpointName = Utils.getValueFromIdByName(innerObject.id(), "batchEndpoints");
        this.deploymentName = Utils.getValueFromIdByName(innerObject.id(), "deployments");
    }

    public BatchDeploymentData refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBatchDeployments()
                .getWithResponse(resourceGroupName, workspaceName, endpointName, deploymentName, Context.NONE)
                .getValue();
        return this;
    }

    public BatchDeploymentData refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBatchDeployments()
                .getWithResponse(resourceGroupName, workspaceName, endpointName, deploymentName, context)
                .getValue();
        return this;
    }

    public BatchDeploymentDataImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public BatchDeploymentDataImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public BatchDeploymentDataImpl withProperties(BatchDeploymentDetails properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public BatchDeploymentDataImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public BatchDeploymentDataImpl withIdentity(ManagedServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public BatchDeploymentDataImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateBody.withKind(kind);
            return this;
        }
    }

    public BatchDeploymentDataImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public BatchDeploymentDataImpl withIdentity(PartialManagedServiceIdentity identity) {
        this.updateBody.withIdentity(identity);
        return this;
    }

    public BatchDeploymentDataImpl withProperties(PartialBatchDeployment properties) {
        this.updateBody.withProperties(properties);
        return this;
    }

    public BatchDeploymentDataImpl withSku(PartialSku sku) {
        this.updateBody.withSku(sku);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
