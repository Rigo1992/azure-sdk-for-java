// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.models.AssignmentType;
import com.azure.resourcemanager.authorization.models.ExpandedProperties;
import com.azure.resourcemanager.authorization.models.MemberType;
import com.azure.resourcemanager.authorization.models.PrincipalType;
import com.azure.resourcemanager.authorization.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Role Assignment schedule. */
@Fluent
public final class RoleAssignmentScheduleInner {
    /*
     * The role assignment schedule Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The role assignment schedule name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The role assignment schedule type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Role assignment schedule properties.
     */
    @JsonProperty(value = "properties")
    private RoleAssignmentScheduleProperties innerProperties;

    /**
     * Get the id property: The role assignment schedule Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The role assignment schedule name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The role assignment schedule type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: Role assignment schedule properties.
     *
     * @return the innerProperties value.
     */
    private RoleAssignmentScheduleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the scope property: The role assignment schedule scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: The role assignment schedule scope.
     *
     * @param scope the scope value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Get the roleDefinitionId property: The role definition ID.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().roleDefinitionId();
    }

    /**
     * Set the roleDefinitionId property: The role definition ID.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withRoleDefinitionId(String roleDefinitionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    /**
     * Get the principalId property: The principal ID.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: The principal ID.
     *
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the principalType property: The principal type of the assigned principal ID.
     *
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalType();
    }

    /**
     * Set the principalType property: The principal type of the assigned principal ID.
     *
     * @param principalType the principalType value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withPrincipalType(PrincipalType principalType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withPrincipalType(principalType);
        return this;
    }

    /**
     * Get the roleAssignmentScheduleRequestId property: The id of roleAssignmentScheduleRequest used to create this
     * roleAssignmentSchedule.
     *
     * @return the roleAssignmentScheduleRequestId value.
     */
    public String roleAssignmentScheduleRequestId() {
        return this.innerProperties() == null ? null : this.innerProperties().roleAssignmentScheduleRequestId();
    }

    /**
     * Set the roleAssignmentScheduleRequestId property: The id of roleAssignmentScheduleRequest used to create this
     * roleAssignmentSchedule.
     *
     * @param roleAssignmentScheduleRequestId the roleAssignmentScheduleRequestId value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withRoleAssignmentScheduleRequestId(String roleAssignmentScheduleRequestId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withRoleAssignmentScheduleRequestId(roleAssignmentScheduleRequestId);
        return this;
    }

    /**
     * Get the linkedRoleEligibilityScheduleId property: The id of roleEligibilitySchedule used to activated this
     * roleAssignmentSchedule.
     *
     * @return the linkedRoleEligibilityScheduleId value.
     */
    public String linkedRoleEligibilityScheduleId() {
        return this.innerProperties() == null ? null : this.innerProperties().linkedRoleEligibilityScheduleId();
    }

    /**
     * Set the linkedRoleEligibilityScheduleId property: The id of roleEligibilitySchedule used to activated this
     * roleAssignmentSchedule.
     *
     * @param linkedRoleEligibilityScheduleId the linkedRoleEligibilityScheduleId value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withLinkedRoleEligibilityScheduleId(String linkedRoleEligibilityScheduleId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withLinkedRoleEligibilityScheduleId(linkedRoleEligibilityScheduleId);
        return this;
    }

    /**
     * Get the assignmentType property: Assignment type of the role assignment schedule.
     *
     * @return the assignmentType value.
     */
    public AssignmentType assignmentType() {
        return this.innerProperties() == null ? null : this.innerProperties().assignmentType();
    }

    /**
     * Set the assignmentType property: Assignment type of the role assignment schedule.
     *
     * @param assignmentType the assignmentType value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withAssignmentType(AssignmentType assignmentType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withAssignmentType(assignmentType);
        return this;
    }

    /**
     * Get the memberType property: Membership type of the role assignment schedule.
     *
     * @return the memberType value.
     */
    public MemberType memberType() {
        return this.innerProperties() == null ? null : this.innerProperties().memberType();
    }

    /**
     * Set the memberType property: Membership type of the role assignment schedule.
     *
     * @param memberType the memberType value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withMemberType(MemberType memberType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withMemberType(memberType);
        return this;
    }

    /**
     * Get the status property: The status of the role assignment schedule.
     *
     * @return the status value.
     */
    public Status status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The status of the role assignment schedule.
     *
     * @param status the status value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withStatus(Status status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the startDateTime property: Start DateTime when role assignment schedule.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startDateTime();
    }

    /**
     * Set the startDateTime property: Start DateTime when role assignment schedule.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withStartDateTime(OffsetDateTime startDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withStartDateTime(startDateTime);
        return this;
    }

    /**
     * Get the endDateTime property: End DateTime when role assignment schedule.
     *
     * @return the endDateTime value.
     */
    public OffsetDateTime endDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endDateTime();
    }

    /**
     * Set the endDateTime property: End DateTime when role assignment schedule.
     *
     * @param endDateTime the endDateTime value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withEndDateTime(OffsetDateTime endDateTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withEndDateTime(endDateTime);
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
        return this.innerProperties() == null ? null : this.innerProperties().condition();
    }

    /**
     * Set the condition property: The conditions on the role assignment. This limits the resources it can be assigned
     * to. e.g.: @Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]
     * StringEqualsIgnoreCase 'foo_storage_container'.
     *
     * @param condition the condition value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withCondition(String condition) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withCondition(condition);
        return this;
    }

    /**
     * Get the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @return the conditionVersion value.
     */
    public String conditionVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().conditionVersion();
    }

    /**
     * Set the conditionVersion property: Version of the condition. Currently accepted value is '2.0'.
     *
     * @param conditionVersion the conditionVersion value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withConditionVersion(String conditionVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withConditionVersion(conditionVersion);
        return this;
    }

    /**
     * Get the createdOn property: DateTime when role assignment schedule was created.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Set the createdOn property: DateTime when role assignment schedule was created.
     *
     * @param createdOn the createdOn value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withCreatedOn(OffsetDateTime createdOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withCreatedOn(createdOn);
        return this;
    }

    /**
     * Get the updatedOn property: DateTime when role assignment schedule was modified.
     *
     * @return the updatedOn value.
     */
    public OffsetDateTime updatedOn() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedOn();
    }

    /**
     * Set the updatedOn property: DateTime when role assignment schedule was modified.
     *
     * @param updatedOn the updatedOn value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withUpdatedOn(OffsetDateTime updatedOn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withUpdatedOn(updatedOn);
        return this;
    }

    /**
     * Get the expandedProperties property: Additional properties of principal, scope and role definition.
     *
     * @return the expandedProperties value.
     */
    public ExpandedProperties expandedProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().expandedProperties();
    }

    /**
     * Set the expandedProperties property: Additional properties of principal, scope and role definition.
     *
     * @param expandedProperties the expandedProperties value to set.
     * @return the RoleAssignmentScheduleInner object itself.
     */
    public RoleAssignmentScheduleInner withExpandedProperties(ExpandedProperties expandedProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentScheduleProperties();
        }
        this.innerProperties().withExpandedProperties(expandedProperties);
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
