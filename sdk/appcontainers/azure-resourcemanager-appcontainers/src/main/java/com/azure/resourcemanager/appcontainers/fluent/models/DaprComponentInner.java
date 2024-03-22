// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appcontainers.models.DaprComponentServiceBinding;
import com.azure.resourcemanager.appcontainers.models.DaprMetadata;
import com.azure.resourcemanager.appcontainers.models.Secret;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Dapr Component.
 */
@Fluent
public final class DaprComponentInner extends ProxyResource {
    /*
     * Dapr Component resource specific properties
     */
    @JsonProperty(value = "properties")
    private DaprComponentProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of DaprComponentInner class.
     */
    public DaprComponentInner() {
    }

    /**
     * Get the innerProperties property: Dapr Component resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private DaprComponentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the componentType property: Component type.
     * 
     * @return the componentType value.
     */
    public String componentType() {
        return this.innerProperties() == null ? null : this.innerProperties().componentType();
    }

    /**
     * Set the componentType property: Component type.
     * 
     * @param componentType the componentType value to set.
     * @return the DaprComponentInner object itself.
     */
    public DaprComponentInner withComponentType(String componentType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DaprComponentProperties();
        }
        this.innerProperties().withComponentType(componentType);
        return this;
    }

    /**
     * Get the version property: Component version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Set the version property: Component version.
     * 
     * @param version the version value to set.
     * @return the DaprComponentInner object itself.
     */
    public DaprComponentInner withVersion(String version) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DaprComponentProperties();
        }
        this.innerProperties().withVersion(version);
        return this;
    }

    /**
     * Get the ignoreErrors property: Boolean describing if the component errors are ignores.
     * 
     * @return the ignoreErrors value.
     */
    public Boolean ignoreErrors() {
        return this.innerProperties() == null ? null : this.innerProperties().ignoreErrors();
    }

    /**
     * Set the ignoreErrors property: Boolean describing if the component errors are ignores.
     * 
     * @param ignoreErrors the ignoreErrors value to set.
     * @return the DaprComponentInner object itself.
     */
    public DaprComponentInner withIgnoreErrors(Boolean ignoreErrors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DaprComponentProperties();
        }
        this.innerProperties().withIgnoreErrors(ignoreErrors);
        return this;
    }

    /**
     * Get the initTimeout property: Initialization timeout.
     * 
     * @return the initTimeout value.
     */
    public String initTimeout() {
        return this.innerProperties() == null ? null : this.innerProperties().initTimeout();
    }

    /**
     * Set the initTimeout property: Initialization timeout.
     * 
     * @param initTimeout the initTimeout value to set.
     * @return the DaprComponentInner object itself.
     */
    public DaprComponentInner withInitTimeout(String initTimeout) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DaprComponentProperties();
        }
        this.innerProperties().withInitTimeout(initTimeout);
        return this;
    }

    /**
     * Get the secrets property: Collection of secrets used by a Dapr component.
     * 
     * @return the secrets value.
     */
    public List<Secret> secrets() {
        return this.innerProperties() == null ? null : this.innerProperties().secrets();
    }

    /**
     * Set the secrets property: Collection of secrets used by a Dapr component.
     * 
     * @param secrets the secrets value to set.
     * @return the DaprComponentInner object itself.
     */
    public DaprComponentInner withSecrets(List<Secret> secrets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DaprComponentProperties();
        }
        this.innerProperties().withSecrets(secrets);
        return this;
    }

    /**
     * Get the secretStoreComponent property: Name of a Dapr component to retrieve component secrets from.
     * 
     * @return the secretStoreComponent value.
     */
    public String secretStoreComponent() {
        return this.innerProperties() == null ? null : this.innerProperties().secretStoreComponent();
    }

    /**
     * Set the secretStoreComponent property: Name of a Dapr component to retrieve component secrets from.
     * 
     * @param secretStoreComponent the secretStoreComponent value to set.
     * @return the DaprComponentInner object itself.
     */
    public DaprComponentInner withSecretStoreComponent(String secretStoreComponent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DaprComponentProperties();
        }
        this.innerProperties().withSecretStoreComponent(secretStoreComponent);
        return this;
    }

    /**
     * Get the metadata property: Component metadata.
     * 
     * @return the metadata value.
     */
    public List<DaprMetadata> metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: Component metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the DaprComponentInner object itself.
     */
    public DaprComponentInner withMetadata(List<DaprMetadata> metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DaprComponentProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the scopes property: Names of container apps that can use this Dapr component.
     * 
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.innerProperties() == null ? null : this.innerProperties().scopes();
    }

    /**
     * Set the scopes property: Names of container apps that can use this Dapr component.
     * 
     * @param scopes the scopes value to set.
     * @return the DaprComponentInner object itself.
     */
    public DaprComponentInner withScopes(List<String> scopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DaprComponentProperties();
        }
        this.innerProperties().withScopes(scopes);
        return this;
    }

    /**
     * Get the serviceComponentBind property: List of container app services that are bound to the Dapr component.
     * 
     * @return the serviceComponentBind value.
     */
    public List<DaprComponentServiceBinding> serviceComponentBind() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceComponentBind();
    }

    /**
     * Set the serviceComponentBind property: List of container app services that are bound to the Dapr component.
     * 
     * @param serviceComponentBind the serviceComponentBind value to set.
     * @return the DaprComponentInner object itself.
     */
    public DaprComponentInner withServiceComponentBind(List<DaprComponentServiceBinding> serviceComponentBind) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DaprComponentProperties();
        }
        this.innerProperties().withServiceComponentBind(serviceComponentBind);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
