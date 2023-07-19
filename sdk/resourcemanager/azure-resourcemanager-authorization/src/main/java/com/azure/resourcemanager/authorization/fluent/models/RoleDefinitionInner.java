// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Role definition. */
@Fluent
public final class RoleDefinitionInner extends ProxyResource {
    /*
     * Role definition properties.
     */
    @JsonProperty(value = "properties")
    private RoleDefinitionProperties innerProperties;

    /** Creates an instance of RoleDefinitionInner class. */
    public RoleDefinitionInner() {
    }

    /**
     * Get the innerProperties property: Role definition properties.
     *
     * @return the innerProperties value.
     */
    private RoleDefinitionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the roleName property: The role name.
     *
     * @return the roleName value.
     */
    public String roleName() {
        return this.innerProperties() == null ? null : this.innerProperties().roleName();
    }

    /**
     * Set the roleName property: The role name.
     *
     * @param roleName the roleName value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withRoleName(String roleName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleDefinitionProperties();
        }
        this.innerProperties().withRoleName(roleName);
        return this;
    }

    /**
     * Get the description property: The role definition description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The role definition description.
     *
     * @param description the description value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleDefinitionProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the roleType property: The role type.
     *
     * @return the roleType value.
     */
    public String roleType() {
        return this.innerProperties() == null ? null : this.innerProperties().roleType();
    }

    /**
     * Set the roleType property: The role type.
     *
     * @param roleType the roleType value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withRoleType(String roleType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleDefinitionProperties();
        }
        this.innerProperties().withRoleType(roleType);
        return this;
    }

    /**
     * Get the permissions property: Role definition permissions.
     *
     * @return the permissions value.
     */
    public List<PermissionInner> permissions() {
        return this.innerProperties() == null ? null : this.innerProperties().permissions();
    }

    /**
     * Set the permissions property: Role definition permissions.
     *
     * @param permissions the permissions value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withPermissions(List<PermissionInner> permissions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleDefinitionProperties();
        }
        this.innerProperties().withPermissions(permissions);
        return this;
    }

    /**
     * Get the assignableScopes property: Role definition assignable scopes.
     *
     * @return the assignableScopes value.
     */
    public List<String> assignableScopes() {
        return this.innerProperties() == null ? null : this.innerProperties().assignableScopes();
    }

    /**
     * Set the assignableScopes property: Role definition assignable scopes.
     *
     * @param assignableScopes the assignableScopes value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withAssignableScopes(List<String> assignableScopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleDefinitionProperties();
        }
        this.innerProperties().withAssignableScopes(assignableScopes);
        return this;
    }

    /**
     * Get the createdOn property: Time it was created.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Get the updatedOn property: Time it was updated.
     *
     * @return the updatedOn value.
     */
    public OffsetDateTime updatedOn() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedOn();
    }

    /**
     * Get the createdBy property: Id of the user who created the assignment.
     *
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.innerProperties() == null ? null : this.innerProperties().createdBy();
    }

    /**
     * Get the updatedBy property: Id of the user who updated the assignment.
     *
     * @return the updatedBy value.
     */
    public String updatedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedBy();
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
