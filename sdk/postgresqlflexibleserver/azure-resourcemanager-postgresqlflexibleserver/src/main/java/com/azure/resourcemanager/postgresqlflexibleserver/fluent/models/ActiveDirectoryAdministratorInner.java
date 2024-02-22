// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrincipalType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an Active Directory administrator.
 */
@Fluent
public final class ActiveDirectoryAdministratorInner extends ProxyResource {
    /*
     * Properties of the active directory administrator.
     */
    @JsonProperty(value = "properties", required = true)
    private AdministratorProperties innerProperties = new AdministratorProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ActiveDirectoryAdministratorInner class.
     */
    public ActiveDirectoryAdministratorInner() {
    }

    /**
     * Get the innerProperties property: Properties of the active directory administrator.
     * 
     * @return the innerProperties value.
     */
    private AdministratorProperties innerProperties() {
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
     * Get the principalType property: The principal type used to represent the type of Active Directory Administrator.
     * 
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalType();
    }

    /**
     * Set the principalType property: The principal type used to represent the type of Active Directory Administrator.
     * 
     * @param principalType the principalType value to set.
     * @return the ActiveDirectoryAdministratorInner object itself.
     */
    public ActiveDirectoryAdministratorInner withPrincipalType(PrincipalType principalType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorProperties();
        }
        this.innerProperties().withPrincipalType(principalType);
        return this;
    }

    /**
     * Get the principalName property: Active Directory administrator principal name.
     * 
     * @return the principalName value.
     */
    public String principalName() {
        return this.innerProperties() == null ? null : this.innerProperties().principalName();
    }

    /**
     * Set the principalName property: Active Directory administrator principal name.
     * 
     * @param principalName the principalName value to set.
     * @return the ActiveDirectoryAdministratorInner object itself.
     */
    public ActiveDirectoryAdministratorInner withPrincipalName(String principalName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorProperties();
        }
        this.innerProperties().withPrincipalName(principalName);
        return this;
    }

    /**
     * Get the objectId property: The objectId of the Active Directory administrator.
     * 
     * @return the objectId value.
     */
    public String objectId() {
        return this.innerProperties() == null ? null : this.innerProperties().objectId();
    }

    /**
     * Set the objectId property: The objectId of the Active Directory administrator.
     * 
     * @param objectId the objectId value to set.
     * @return the ActiveDirectoryAdministratorInner object itself.
     */
    public ActiveDirectoryAdministratorInner withObjectId(String objectId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorProperties();
        }
        this.innerProperties().withObjectId(objectId);
        return this;
    }

    /**
     * Get the tenantId property: The tenantId of the Active Directory administrator.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The tenantId of the Active Directory administrator.
     * 
     * @param tenantId the tenantId value to set.
     * @return the ActiveDirectoryAdministratorInner object itself.
     */
    public ActiveDirectoryAdministratorInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdministratorProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model ActiveDirectoryAdministratorInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ActiveDirectoryAdministratorInner.class);
}
