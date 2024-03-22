// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.AuthConfigInner;
import com.azure.resourcemanager.appcontainers.models.AuthConfig;
import com.azure.resourcemanager.appcontainers.models.AuthPlatform;
import com.azure.resourcemanager.appcontainers.models.EncryptionSettings;
import com.azure.resourcemanager.appcontainers.models.GlobalValidation;
import com.azure.resourcemanager.appcontainers.models.HttpSettings;
import com.azure.resourcemanager.appcontainers.models.IdentityProviders;
import com.azure.resourcemanager.appcontainers.models.Login;

public final class AuthConfigImpl implements AuthConfig, AuthConfig.Definition, AuthConfig.Update {
    private AuthConfigInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

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

    public AuthPlatform platform() {
        return this.innerModel().platform();
    }

    public GlobalValidation globalValidation() {
        return this.innerModel().globalValidation();
    }

    public IdentityProviders identityProviders() {
        return this.innerModel().identityProviders();
    }

    public Login login() {
        return this.innerModel().login();
    }

    public HttpSettings httpSettings() {
        return this.innerModel().httpSettings();
    }

    public EncryptionSettings encryptionSettings() {
        return this.innerModel().encryptionSettings();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AuthConfigInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String containerAppName;

    private String authConfigName;

    public AuthConfigImpl withExistingContainerApp(String resourceGroupName, String containerAppName) {
        this.resourceGroupName = resourceGroupName;
        this.containerAppName = containerAppName;
        return this;
    }

    public AuthConfig create() {
        this.innerObject
            = serviceManager.serviceClient().getContainerAppsAuthConfigs().createOrUpdateWithResponse(resourceGroupName,
                containerAppName, authConfigName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public AuthConfig create(Context context) {
        this.innerObject = serviceManager.serviceClient().getContainerAppsAuthConfigs()
            .createOrUpdateWithResponse(resourceGroupName, containerAppName, authConfigName, this.innerModel(), context)
            .getValue();
        return this;
    }

    AuthConfigImpl(String name, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = new AuthConfigInner();
        this.serviceManager = serviceManager;
        this.authConfigName = name;
    }

    public AuthConfigImpl update() {
        return this;
    }

    public AuthConfig apply() {
        this.innerObject
            = serviceManager.serviceClient().getContainerAppsAuthConfigs().createOrUpdateWithResponse(resourceGroupName,
                containerAppName, authConfigName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public AuthConfig apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getContainerAppsAuthConfigs()
            .createOrUpdateWithResponse(resourceGroupName, containerAppName, authConfigName, this.innerModel(), context)
            .getValue();
        return this;
    }

    AuthConfigImpl(AuthConfigInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.containerAppName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "containerApps");
        this.authConfigName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "authConfigs");
    }

    public AuthConfig refresh() {
        this.innerObject = serviceManager.serviceClient().getContainerAppsAuthConfigs()
            .getWithResponse(resourceGroupName, containerAppName, authConfigName, Context.NONE).getValue();
        return this;
    }

    public AuthConfig refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getContainerAppsAuthConfigs()
            .getWithResponse(resourceGroupName, containerAppName, authConfigName, context).getValue();
        return this;
    }

    public AuthConfigImpl withPlatform(AuthPlatform platform) {
        this.innerModel().withPlatform(platform);
        return this;
    }

    public AuthConfigImpl withGlobalValidation(GlobalValidation globalValidation) {
        this.innerModel().withGlobalValidation(globalValidation);
        return this;
    }

    public AuthConfigImpl withIdentityProviders(IdentityProviders identityProviders) {
        this.innerModel().withIdentityProviders(identityProviders);
        return this;
    }

    public AuthConfigImpl withLogin(Login login) {
        this.innerModel().withLogin(login);
        return this;
    }

    public AuthConfigImpl withHttpSettings(HttpSettings httpSettings) {
        this.innerModel().withHttpSettings(httpSettings);
        return this;
    }

    public AuthConfigImpl withEncryptionSettings(EncryptionSettings encryptionSettings) {
        this.innerModel().withEncryptionSettings(encryptionSettings);
        return this;
    }
}
