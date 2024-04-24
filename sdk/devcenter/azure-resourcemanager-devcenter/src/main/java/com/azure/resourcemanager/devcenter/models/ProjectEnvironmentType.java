// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.ProjectEnvironmentTypeInner;
import java.util.Map;

/**
 * An immutable client-side representation of ProjectEnvironmentType.
 */
public interface ProjectEnvironmentType {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: Managed identity properties.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the location property: The geo-location for the environment type.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the environmentCount property: The number of environments of this type.
     * 
     * @return the environmentCount value.
     */
    Integer environmentCount();

    /**
     * Gets the deploymentTargetId property: Id of a subscription that the environment type will be mapped to. The
     * environment's resources will be deployed into this subscription.
     * 
     * @return the deploymentTargetId value.
     */
    String deploymentTargetId();

    /**
     * Gets the displayName property: The display name of the project environment type.
     * 
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the status property: Defines whether this Environment Type can be used in this Project.
     * 
     * @return the status value.
     */
    EnvironmentTypeEnableStatus status();

    /**
     * Gets the creatorRoleAssignment property: The role definition assigned to the environment creator on backing
     * resources.
     * 
     * @return the creatorRoleAssignment value.
     */
    ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment creatorRoleAssignment();

    /**
     * Gets the userRoleAssignments property: Role Assignments created on environment backing resources. This is a
     * mapping from a user object ID to an object of role definition IDs.
     * 
     * @return the userRoleAssignments value.
     */
    Map<String, UserRoleAssignmentValue> userRoleAssignments();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.ProjectEnvironmentTypeInner object.
     * 
     * @return the inner object.
     */
    ProjectEnvironmentTypeInner innerModel();

    /**
     * The entirety of the ProjectEnvironmentType definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ProjectEnvironmentType definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ProjectEnvironmentType definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ProjectEnvironmentType definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, projectName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param projectName The name of the project.
             * @return the next definition stage.
             */
            WithCreate withExistingProject(String resourceGroupName, String projectName);
        }

        /**
         * The stage of the ProjectEnvironmentType definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation, DefinitionStages.WithTags, DefinitionStages.WithIdentity,
            DefinitionStages.WithDeploymentTargetId, DefinitionStages.WithDisplayName, DefinitionStages.WithStatus,
            DefinitionStages.WithCreatorRoleAssignment, DefinitionStages.WithUserRoleAssignments {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ProjectEnvironmentType create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ProjectEnvironmentType create(Context context);
        }

        /**
         * The stage of the ProjectEnvironmentType definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location for the environment type.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location for the environment type.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }

        /**
         * The stage of the ProjectEnvironmentType definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the ProjectEnvironmentType definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed identity properties.
             * 
             * @param identity Managed identity properties.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the ProjectEnvironmentType definition allowing to specify deploymentTargetId.
         */
        interface WithDeploymentTargetId {
            /**
             * Specifies the deploymentTargetId property: Id of a subscription that the environment type will be mapped
             * to. The environment's resources will be deployed into this subscription..
             * 
             * @param deploymentTargetId Id of a subscription that the environment type will be mapped to. The
             * environment's resources will be deployed into this subscription.
             * @return the next definition stage.
             */
            WithCreate withDeploymentTargetId(String deploymentTargetId);
        }

        /**
         * The stage of the ProjectEnvironmentType definition allowing to specify displayName.
         */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name of the project environment type..
             * 
             * @param displayName The display name of the project environment type.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the ProjectEnvironmentType definition allowing to specify status.
         */
        interface WithStatus {
            /**
             * Specifies the status property: Defines whether this Environment Type can be used in this Project..
             * 
             * @param status Defines whether this Environment Type can be used in this Project.
             * @return the next definition stage.
             */
            WithCreate withStatus(EnvironmentTypeEnableStatus status);
        }

        /**
         * The stage of the ProjectEnvironmentType definition allowing to specify creatorRoleAssignment.
         */
        interface WithCreatorRoleAssignment {
            /**
             * Specifies the creatorRoleAssignment property: The role definition assigned to the environment creator on
             * backing resources..
             * 
             * @param creatorRoleAssignment The role definition assigned to the environment creator on backing
             * resources.
             * @return the next definition stage.
             */
            WithCreate withCreatorRoleAssignment(
                ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment creatorRoleAssignment);
        }

        /**
         * The stage of the ProjectEnvironmentType definition allowing to specify userRoleAssignments.
         */
        interface WithUserRoleAssignments {
            /**
             * Specifies the userRoleAssignments property: Role Assignments created on environment backing resources.
             * This is a mapping from a user object ID to an object of role definition IDs..
             * 
             * @param userRoleAssignments Role Assignments created on environment backing resources. This is a mapping
             * from a user object ID to an object of role definition IDs.
             * @return the next definition stage.
             */
            WithCreate withUserRoleAssignments(Map<String, UserRoleAssignmentValue> userRoleAssignments);
        }
    }

    /**
     * Begins update for the ProjectEnvironmentType resource.
     * 
     * @return the stage of resource update.
     */
    ProjectEnvironmentType.Update update();

    /**
     * The template for ProjectEnvironmentType update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithDeploymentTargetId,
        UpdateStages.WithDisplayName, UpdateStages.WithStatus, UpdateStages.WithCreatorRoleAssignment,
        UpdateStages.WithUserRoleAssignments {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ProjectEnvironmentType apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ProjectEnvironmentType apply(Context context);
    }

    /**
     * The ProjectEnvironmentType update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ProjectEnvironmentType update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the ProjectEnvironmentType update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed identity properties.
             * 
             * @param identity Managed identity properties.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the ProjectEnvironmentType update allowing to specify deploymentTargetId.
         */
        interface WithDeploymentTargetId {
            /**
             * Specifies the deploymentTargetId property: Id of a subscription that the environment type will be mapped
             * to. The environment's resources will be deployed into this subscription..
             * 
             * @param deploymentTargetId Id of a subscription that the environment type will be mapped to. The
             * environment's resources will be deployed into this subscription.
             * @return the next definition stage.
             */
            Update withDeploymentTargetId(String deploymentTargetId);
        }

        /**
         * The stage of the ProjectEnvironmentType update allowing to specify displayName.
         */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: The display name of the project environment type..
             * 
             * @param displayName The display name of the project environment type.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the ProjectEnvironmentType update allowing to specify status.
         */
        interface WithStatus {
            /**
             * Specifies the status property: Defines whether this Environment Type can be used in this Project..
             * 
             * @param status Defines whether this Environment Type can be used in this Project.
             * @return the next definition stage.
             */
            Update withStatus(EnvironmentTypeEnableStatus status);
        }

        /**
         * The stage of the ProjectEnvironmentType update allowing to specify creatorRoleAssignment.
         */
        interface WithCreatorRoleAssignment {
            /**
             * Specifies the creatorRoleAssignment property: The role definition assigned to the environment creator on
             * backing resources..
             * 
             * @param creatorRoleAssignment The role definition assigned to the environment creator on backing
             * resources.
             * @return the next definition stage.
             */
            Update withCreatorRoleAssignment(
                ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment creatorRoleAssignment);
        }

        /**
         * The stage of the ProjectEnvironmentType update allowing to specify userRoleAssignments.
         */
        interface WithUserRoleAssignments {
            /**
             * Specifies the userRoleAssignments property: Role Assignments created on environment backing resources.
             * This is a mapping from a user object ID to an object of role definition IDs..
             * 
             * @param userRoleAssignments Role Assignments created on environment backing resources. This is a mapping
             * from a user object ID to an object of role definition IDs.
             * @return the next definition stage.
             */
            Update withUserRoleAssignments(Map<String, UserRoleAssignmentValue> userRoleAssignments);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ProjectEnvironmentType refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ProjectEnvironmentType refresh(Context context);
}
