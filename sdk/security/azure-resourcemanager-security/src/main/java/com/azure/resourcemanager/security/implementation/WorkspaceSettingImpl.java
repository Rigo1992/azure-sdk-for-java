// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.WorkspaceSettingInner;
import com.azure.resourcemanager.security.models.WorkspaceSetting;

public final class WorkspaceSettingImpl
    implements WorkspaceSetting, WorkspaceSetting.Definition, WorkspaceSetting.Update {
    private WorkspaceSettingInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String workspaceId() {
        return this.innerModel().workspaceId();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public WorkspaceSettingInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    private String workspaceSettingName;

    public WorkspaceSetting create() {
        this.innerObject = serviceManager.serviceClient()
            .getWorkspaceSettings()
            .createWithResponse(workspaceSettingName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public WorkspaceSetting create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWorkspaceSettings()
            .createWithResponse(workspaceSettingName, this.innerModel(), context)
            .getValue();
        return this;
    }

    WorkspaceSettingImpl(String name, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = new WorkspaceSettingInner();
        this.serviceManager = serviceManager;
        this.workspaceSettingName = name;
    }

    public WorkspaceSettingImpl update() {
        return this;
    }

    public WorkspaceSetting apply() {
        this.innerObject = serviceManager.serviceClient()
            .getWorkspaceSettings()
            .updateWithResponse(workspaceSettingName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public WorkspaceSetting apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWorkspaceSettings()
            .updateWithResponse(workspaceSettingName, this.innerModel(), context)
            .getValue();
        return this;
    }

    WorkspaceSettingImpl(WorkspaceSettingInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.workspaceSettingName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "workspaceSettings");
    }

    public WorkspaceSetting refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getWorkspaceSettings()
            .getWithResponse(workspaceSettingName, Context.NONE)
            .getValue();
        return this;
    }

    public WorkspaceSetting refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWorkspaceSettings()
            .getWithResponse(workspaceSettingName, context)
            .getValue();
        return this;
    }

    public WorkspaceSettingImpl withWorkspaceId(String workspaceId) {
        this.innerModel().withWorkspaceId(workspaceId);
        return this;
    }

    public WorkspaceSettingImpl withScope(String scope) {
        this.innerModel().withScope(scope);
        return this;
    }
}
