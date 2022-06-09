// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.NotebookResourceInfoInner;
import com.azure.resourcemanager.machinelearning.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.machinelearning.fluent.models.WorkspaceInner;
import com.azure.resourcemanager.machinelearning.models.DiagnoseResponseResult;
import com.azure.resourcemanager.machinelearning.models.DiagnoseWorkspaceParameters;
import com.azure.resourcemanager.machinelearning.models.EncryptionProperty;
import com.azure.resourcemanager.machinelearning.models.ListNotebookKeysResult;
import com.azure.resourcemanager.machinelearning.models.ListStorageAccountKeysResult;
import com.azure.resourcemanager.machinelearning.models.ListWorkspaceKeysResult;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.NotebookAccessTokenResult;
import com.azure.resourcemanager.machinelearning.models.NotebookResourceInfo;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointConnection;
import com.azure.resourcemanager.machinelearning.models.ProvisioningState;
import com.azure.resourcemanager.machinelearning.models.PublicNetworkAccess;
import com.azure.resourcemanager.machinelearning.models.ServiceManagedResourcesSettings;
import com.azure.resourcemanager.machinelearning.models.SharedPrivateLinkResource;
import com.azure.resourcemanager.machinelearning.models.Sku;
import com.azure.resourcemanager.machinelearning.models.Workspace;
import com.azure.resourcemanager.machinelearning.models.WorkspaceUpdateParameters;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class WorkspaceImpl implements Workspace, Workspace.Definition, Workspace.Update {
    private WorkspaceInner innerObject;

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

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String workspaceId() {
        return this.innerModel().workspaceId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String keyVault() {
        return this.innerModel().keyVault();
    }

    public String applicationInsights() {
        return this.innerModel().applicationInsights();
    }

    public String containerRegistry() {
        return this.innerModel().containerRegistry();
    }

    public String storageAccount() {
        return this.innerModel().storageAccount();
    }

    public String discoveryUrl() {
        return this.innerModel().discoveryUrl();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public EncryptionProperty encryption() {
        return this.innerModel().encryption();
    }

    public Boolean hbiWorkspace() {
        return this.innerModel().hbiWorkspace();
    }

    public String serviceProvisionedResourceGroup() {
        return this.innerModel().serviceProvisionedResourceGroup();
    }

    public Integer privateLinkCount() {
        return this.innerModel().privateLinkCount();
    }

    public String imageBuildCompute() {
        return this.innerModel().imageBuildCompute();
    }

    public Boolean allowPublicAccessWhenBehindVnet() {
        return this.innerModel().allowPublicAccessWhenBehindVnet();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<SharedPrivateLinkResource> sharedPrivateLinkResources() {
        List<SharedPrivateLinkResource> inner = this.innerModel().sharedPrivateLinkResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NotebookResourceInfo notebookInfo() {
        NotebookResourceInfoInner inner = this.innerModel().notebookInfo();
        if (inner != null) {
            return new NotebookResourceInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServiceManagedResourcesSettings serviceManagedResourcesSettings() {
        return this.innerModel().serviceManagedResourcesSettings();
    }

    public String primaryUserAssignedIdentity() {
        return this.innerModel().primaryUserAssignedIdentity();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public Boolean storageHnsEnabled() {
        return this.innerModel().storageHnsEnabled();
    }

    public String mlFlowTrackingUri() {
        return this.innerModel().mlFlowTrackingUri();
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

    public WorkspaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private WorkspaceUpdateParameters updateParameters;

    public WorkspaceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Workspace create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), Context.NONE);
        return this;
    }

    public Workspace create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .createOrUpdate(resourceGroupName, workspaceName, this.innerModel(), context);
        return this;
    }

    WorkspaceImpl(String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new WorkspaceInner();
        this.serviceManager = serviceManager;
        this.workspaceName = name;
    }

    public WorkspaceImpl update() {
        this.updateParameters = new WorkspaceUpdateParameters();
        return this;
    }

    public Workspace apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .update(resourceGroupName, workspaceName, updateParameters, Context.NONE);
        return this;
    }

    public Workspace apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .update(resourceGroupName, workspaceName, updateParameters, context);
        return this;
    }

    WorkspaceImpl(
        WorkspaceInner innerObject, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
    }

    public Workspace refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, Context.NONE)
                .getValue();
        return this;
    }

    public Workspace refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWorkspaces()
                .getByResourceGroupWithResponse(resourceGroupName, workspaceName, context)
                .getValue();
        return this;
    }

    public DiagnoseResponseResult diagnose(DiagnoseWorkspaceParameters parameters) {
        return serviceManager.workspaces().diagnose(resourceGroupName, workspaceName, parameters);
    }

    public DiagnoseResponseResult diagnose() {
        return serviceManager.workspaces().diagnose(resourceGroupName, workspaceName);
    }

    public DiagnoseResponseResult diagnose(DiagnoseWorkspaceParameters parameters, Context context) {
        return serviceManager.workspaces().diagnose(resourceGroupName, workspaceName, parameters, context);
    }

    public ListWorkspaceKeysResult listKeys() {
        return serviceManager.workspaces().listKeys(resourceGroupName, workspaceName);
    }

    public Response<ListWorkspaceKeysResult> listKeysWithResponse(Context context) {
        return serviceManager.workspaces().listKeysWithResponse(resourceGroupName, workspaceName, context);
    }

    public void resyncKeys() {
        serviceManager.workspaces().resyncKeys(resourceGroupName, workspaceName);
    }

    public void resyncKeys(Context context) {
        serviceManager.workspaces().resyncKeys(resourceGroupName, workspaceName, context);
    }

    public NotebookAccessTokenResult listNotebookAccessToken() {
        return serviceManager.workspaces().listNotebookAccessToken(resourceGroupName, workspaceName);
    }

    public Response<NotebookAccessTokenResult> listNotebookAccessTokenWithResponse(Context context) {
        return serviceManager
            .workspaces()
            .listNotebookAccessTokenWithResponse(resourceGroupName, workspaceName, context);
    }

    public NotebookResourceInfo prepareNotebook() {
        return serviceManager.workspaces().prepareNotebook(resourceGroupName, workspaceName);
    }

    public NotebookResourceInfo prepareNotebook(Context context) {
        return serviceManager.workspaces().prepareNotebook(resourceGroupName, workspaceName, context);
    }

    public ListStorageAccountKeysResult listStorageAccountKeys() {
        return serviceManager.workspaces().listStorageAccountKeys(resourceGroupName, workspaceName);
    }

    public Response<ListStorageAccountKeysResult> listStorageAccountKeysWithResponse(Context context) {
        return serviceManager
            .workspaces()
            .listStorageAccountKeysWithResponse(resourceGroupName, workspaceName, context);
    }

    public ListNotebookKeysResult listNotebookKeys() {
        return serviceManager.workspaces().listNotebookKeys(resourceGroupName, workspaceName);
    }

    public Response<ListNotebookKeysResult> listNotebookKeysWithResponse(Context context) {
        return serviceManager.workspaces().listNotebookKeysWithResponse(resourceGroupName, workspaceName, context);
    }

    public WorkspaceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public WorkspaceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public WorkspaceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public WorkspaceImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public WorkspaceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public WorkspaceImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateParameters.withDescription(description);
            return this;
        }
    }

    public WorkspaceImpl withFriendlyName(String friendlyName) {
        if (isInCreateMode()) {
            this.innerModel().withFriendlyName(friendlyName);
            return this;
        } else {
            this.updateParameters.withFriendlyName(friendlyName);
            return this;
        }
    }

    public WorkspaceImpl withKeyVault(String keyVault) {
        this.innerModel().withKeyVault(keyVault);
        return this;
    }

    public WorkspaceImpl withApplicationInsights(String applicationInsights) {
        if (isInCreateMode()) {
            this.innerModel().withApplicationInsights(applicationInsights);
            return this;
        } else {
            this.updateParameters.withApplicationInsights(applicationInsights);
            return this;
        }
    }

    public WorkspaceImpl withContainerRegistry(String containerRegistry) {
        if (isInCreateMode()) {
            this.innerModel().withContainerRegistry(containerRegistry);
            return this;
        } else {
            this.updateParameters.withContainerRegistry(containerRegistry);
            return this;
        }
    }

    public WorkspaceImpl withStorageAccount(String storageAccount) {
        this.innerModel().withStorageAccount(storageAccount);
        return this;
    }

    public WorkspaceImpl withDiscoveryUrl(String discoveryUrl) {
        this.innerModel().withDiscoveryUrl(discoveryUrl);
        return this;
    }

    public WorkspaceImpl withEncryption(EncryptionProperty encryption) {
        this.innerModel().withEncryption(encryption);
        return this;
    }

    public WorkspaceImpl withHbiWorkspace(Boolean hbiWorkspace) {
        this.innerModel().withHbiWorkspace(hbiWorkspace);
        return this;
    }

    public WorkspaceImpl withImageBuildCompute(String imageBuildCompute) {
        if (isInCreateMode()) {
            this.innerModel().withImageBuildCompute(imageBuildCompute);
            return this;
        } else {
            this.updateParameters.withImageBuildCompute(imageBuildCompute);
            return this;
        }
    }

    public WorkspaceImpl withAllowPublicAccessWhenBehindVnet(Boolean allowPublicAccessWhenBehindVnet) {
        this.innerModel().withAllowPublicAccessWhenBehindVnet(allowPublicAccessWhenBehindVnet);
        return this;
    }

    public WorkspaceImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public WorkspaceImpl withSharedPrivateLinkResources(List<SharedPrivateLinkResource> sharedPrivateLinkResources) {
        this.innerModel().withSharedPrivateLinkResources(sharedPrivateLinkResources);
        return this;
    }

    public WorkspaceImpl withServiceManagedResourcesSettings(
        ServiceManagedResourcesSettings serviceManagedResourcesSettings) {
        if (isInCreateMode()) {
            this.innerModel().withServiceManagedResourcesSettings(serviceManagedResourcesSettings);
            return this;
        } else {
            this.updateParameters.withServiceManagedResourcesSettings(serviceManagedResourcesSettings);
            return this;
        }
    }

    public WorkspaceImpl withPrimaryUserAssignedIdentity(String primaryUserAssignedIdentity) {
        if (isInCreateMode()) {
            this.innerModel().withPrimaryUserAssignedIdentity(primaryUserAssignedIdentity);
            return this;
        } else {
            this.updateParameters.withPrimaryUserAssignedIdentity(primaryUserAssignedIdentity);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
