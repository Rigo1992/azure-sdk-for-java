// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.AzureDevOpsRepositoryInner;
import com.azure.resourcemanager.security.models.AzureDevOpsRepository;
import com.azure.resourcemanager.security.models.AzureDevOpsRepositoryProperties;

public final class AzureDevOpsRepositoryImpl
    implements AzureDevOpsRepository, AzureDevOpsRepository.Definition, AzureDevOpsRepository.Update {
    private AzureDevOpsRepositoryInner innerObject;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public AzureDevOpsRepositoryProperties properties() {
        return this.innerModel().properties();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AzureDevOpsRepositoryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String securityConnectorName;

    private String orgName;

    private String projectName;

    private String repoName;

    public AzureDevOpsRepositoryImpl withExistingProject(String resourceGroupName, String securityConnectorName,
        String orgName, String projectName) {
        this.resourceGroupName = resourceGroupName;
        this.securityConnectorName = securityConnectorName;
        this.orgName = orgName;
        this.projectName = projectName;
        return this;
    }

    public AzureDevOpsRepository create() {
        this.innerObject = serviceManager.serviceClient()
            .getAzureDevOpsRepos()
            .createOrUpdate(resourceGroupName, securityConnectorName, orgName, projectName, repoName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public AzureDevOpsRepository create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAzureDevOpsRepos()
            .createOrUpdate(resourceGroupName, securityConnectorName, orgName, projectName, repoName, this.innerModel(),
                context);
        return this;
    }

    AzureDevOpsRepositoryImpl(String name, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = new AzureDevOpsRepositoryInner();
        this.serviceManager = serviceManager;
        this.repoName = name;
    }

    public AzureDevOpsRepositoryImpl update() {
        return this;
    }

    public AzureDevOpsRepository apply() {
        this.innerObject = serviceManager.serviceClient()
            .getAzureDevOpsRepos()
            .update(resourceGroupName, securityConnectorName, orgName, projectName, repoName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public AzureDevOpsRepository apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAzureDevOpsRepos()
            .update(resourceGroupName, securityConnectorName, orgName, projectName, repoName, this.innerModel(),
                context);
        return this;
    }

    AzureDevOpsRepositoryImpl(AzureDevOpsRepositoryInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.securityConnectorName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "securityConnectors");
        this.orgName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "azureDevOpsOrgs");
        this.projectName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "projects");
        this.repoName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "repos");
    }

    public AzureDevOpsRepository refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAzureDevOpsRepos()
            .getWithResponse(resourceGroupName, securityConnectorName, orgName, projectName, repoName, Context.NONE)
            .getValue();
        return this;
    }

    public AzureDevOpsRepository refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAzureDevOpsRepos()
            .getWithResponse(resourceGroupName, securityConnectorName, orgName, projectName, repoName, context)
            .getValue();
        return this;
    }

    public AzureDevOpsRepositoryImpl withProperties(AzureDevOpsRepositoryProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
