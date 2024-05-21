// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;

/**
 * An immutable client-side representation of ConfigurationAssignment.
 */
public interface ConfigurationAssignment {
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
     * Gets the location property: Location of the resource.
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
     * Gets the maintenanceConfigurationId property: The maintenance configuration Id.
     * 
     * @return the maintenanceConfigurationId value.
     */
    String maintenanceConfigurationId();

    /**
     * Gets the resourceId property: The unique resourceId.
     * 
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the filter property: Properties of the configuration assignment.
     * 
     * @return the filter value.
     */
    ConfigurationAssignmentFilterProperties filter();

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
     * Gets the inner com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner object.
     * 
     * @return the inner object.
     */
    ConfigurationAssignmentInner innerModel();

    /**
     * The entirety of the ConfigurationAssignment definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }

    /**
     * The ConfigurationAssignment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ConfigurationAssignment definition.
         */
        interface Blank extends WithCreate {
        }

        /**
         * The stage of the ConfigurationAssignment definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLocation, DefinitionStages.WithMaintenanceConfigurationId,
            DefinitionStages.WithResourceId, DefinitionStages.WithFilter {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ConfigurationAssignment create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ConfigurationAssignment create(Context context);
        }

        /**
         * The stage of the ConfigurationAssignment definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location Location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location Location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }

        /**
         * The stage of the ConfigurationAssignment definition allowing to specify maintenanceConfigurationId.
         */
        interface WithMaintenanceConfigurationId {
            /**
             * Specifies the maintenanceConfigurationId property: The maintenance configuration Id.
             * 
             * @param maintenanceConfigurationId The maintenance configuration Id.
             * @return the next definition stage.
             */
            WithCreate withMaintenanceConfigurationId(String maintenanceConfigurationId);
        }

        /**
         * The stage of the ConfigurationAssignment definition allowing to specify resourceId.
         */
        interface WithResourceId {
            /**
             * Specifies the resourceId property: The unique resourceId.
             * 
             * @param resourceId The unique resourceId.
             * @return the next definition stage.
             */
            WithCreate withResourceId(String resourceId);
        }

        /**
         * The stage of the ConfigurationAssignment definition allowing to specify filter.
         */
        interface WithFilter {
            /**
             * Specifies the filter property: Properties of the configuration assignment.
             * 
             * @param filter Properties of the configuration assignment.
             * @return the next definition stage.
             */
            WithCreate withFilter(ConfigurationAssignmentFilterProperties filter);
        }
    }

    /**
     * Begins update for the ConfigurationAssignment resource.
     * 
     * @return the stage of resource update.
     */
    ConfigurationAssignment.Update update();

    /**
     * The template for ConfigurationAssignment update.
     */
    interface Update
        extends UpdateStages.WithMaintenanceConfigurationId, UpdateStages.WithResourceId, UpdateStages.WithFilter {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ConfigurationAssignment apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ConfigurationAssignment apply(Context context);
    }

    /**
     * The ConfigurationAssignment update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ConfigurationAssignment update allowing to specify maintenanceConfigurationId.
         */
        interface WithMaintenanceConfigurationId {
            /**
             * Specifies the maintenanceConfigurationId property: The maintenance configuration Id.
             * 
             * @param maintenanceConfigurationId The maintenance configuration Id.
             * @return the next definition stage.
             */
            Update withMaintenanceConfigurationId(String maintenanceConfigurationId);
        }

        /**
         * The stage of the ConfigurationAssignment update allowing to specify resourceId.
         */
        interface WithResourceId {
            /**
             * Specifies the resourceId property: The unique resourceId.
             * 
             * @param resourceId The unique resourceId.
             * @return the next definition stage.
             */
            Update withResourceId(String resourceId);
        }

        /**
         * The stage of the ConfigurationAssignment update allowing to specify filter.
         */
        interface WithFilter {
            /**
             * Specifies the filter property: Properties of the configuration assignment.
             * 
             * @param filter Properties of the configuration assignment.
             * @return the next definition stage.
             */
            Update withFilter(ConfigurationAssignmentFilterProperties filter);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ConfigurationAssignment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ConfigurationAssignment refresh(Context context);
}
