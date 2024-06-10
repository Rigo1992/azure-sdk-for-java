// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Authentication method to access the storage account for deployment.
 */
@Fluent
public final class FunctionsDeploymentStorageAuthentication {
    /*
     * Property to select authentication type to access the selected storage account. Available options: SystemAssignedIdentity, UserAssignedIdentity, StorageAccountConnectionString.
     */
    @JsonProperty(value = "type")
    private AuthenticationType type;

    /*
     * Use this property for UserAssignedIdentity. Set the resource ID of the identity. Do not set a value for this property when using other authentication type.
     */
    @JsonProperty(value = "userAssignedIdentityResourceId")
    private String userAssignedIdentityResourceId;

    /*
     * Use this property for StorageAccountConnectionString. Set the name of the app setting that has the storage account connection string. Do not set a value for this property when using other authentication type.
     */
    @JsonProperty(value = "storageAccountConnectionStringName")
    private String storageAccountConnectionStringName;

    /**
     * Creates an instance of FunctionsDeploymentStorageAuthentication class.
     */
    public FunctionsDeploymentStorageAuthentication() {
    }

    /**
     * Get the type property: Property to select authentication type to access the selected storage account. Available
     * options: SystemAssignedIdentity, UserAssignedIdentity, StorageAccountConnectionString.
     * 
     * @return the type value.
     */
    public AuthenticationType type() {
        return this.type;
    }

    /**
     * Set the type property: Property to select authentication type to access the selected storage account. Available
     * options: SystemAssignedIdentity, UserAssignedIdentity, StorageAccountConnectionString.
     * 
     * @param type the type value to set.
     * @return the FunctionsDeploymentStorageAuthentication object itself.
     */
    public FunctionsDeploymentStorageAuthentication withType(AuthenticationType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentityResourceId property: Use this property for UserAssignedIdentity. Set the resource ID
     * of the identity. Do not set a value for this property when using other authentication type.
     * 
     * @return the userAssignedIdentityResourceId value.
     */
    public String userAssignedIdentityResourceId() {
        return this.userAssignedIdentityResourceId;
    }

    /**
     * Set the userAssignedIdentityResourceId property: Use this property for UserAssignedIdentity. Set the resource ID
     * of the identity. Do not set a value for this property when using other authentication type.
     * 
     * @param userAssignedIdentityResourceId the userAssignedIdentityResourceId value to set.
     * @return the FunctionsDeploymentStorageAuthentication object itself.
     */
    public FunctionsDeploymentStorageAuthentication
        withUserAssignedIdentityResourceId(String userAssignedIdentityResourceId) {
        this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
        return this;
    }

    /**
     * Get the storageAccountConnectionStringName property: Use this property for StorageAccountConnectionString. Set
     * the name of the app setting that has the storage account connection string. Do not set a value for this property
     * when using other authentication type.
     * 
     * @return the storageAccountConnectionStringName value.
     */
    public String storageAccountConnectionStringName() {
        return this.storageAccountConnectionStringName;
    }

    /**
     * Set the storageAccountConnectionStringName property: Use this property for StorageAccountConnectionString. Set
     * the name of the app setting that has the storage account connection string. Do not set a value for this property
     * when using other authentication type.
     * 
     * @param storageAccountConnectionStringName the storageAccountConnectionStringName value to set.
     * @return the FunctionsDeploymentStorageAuthentication object itself.
     */
    public FunctionsDeploymentStorageAuthentication
        withStorageAccountConnectionStringName(String storageAccountConnectionStringName) {
        this.storageAccountConnectionStringName = storageAccountConnectionStringName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
