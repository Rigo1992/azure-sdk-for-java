// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Role assignment properties with scope. */
@Fluent
public final class RoleAssignmentPropertiesWithScope {
    /*
     * The role assignment scope.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * The role definition ID.
     */
    @JsonProperty(value = "roleDefinitionId")
    private String roleDefinitionId;

    /*
     * The principal ID.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * The conditions on the role assignment. This limits the resources it can
     * be assigned to. e.g.:
     * @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'
     */
    @JsonProperty(value = "condition")
    private String condition;

    /*
     * Version of the condition. Currently accepted value is '2.0'
     */
    @JsonProperty(value = "conditionVersion")
    private String conditionVersion;

    /**
     * Get the scope property: The role assignment scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The role assignment scope.
     *
     * @param scope the scope value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the roleDefinitionId property: The role definition ID.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The role definition ID.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope withRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: The principal ID.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID.
     *
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     *
     * @return the condition value.
     */
    public String condition() {
        return this.condition;
    }

    /**
     * Set the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     *
     * @param condition the condition value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @return the conditionVersion value.
     */
    public String conditionVersion() {
        return this.conditionVersion;
    }

    /**
     * Set the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @param conditionVersion the conditionVersion value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope withConditionVersion(String conditionVersion) {
        this.conditionVersion = conditionVersion;
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
