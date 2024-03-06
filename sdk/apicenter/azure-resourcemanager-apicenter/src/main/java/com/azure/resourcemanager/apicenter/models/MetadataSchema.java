// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apicenter.fluent.models.MetadataSchemaInner;

/**
 * An immutable client-side representation of MetadataSchema.
 */
public interface MetadataSchema {
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
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    MetadataSchemaProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.apicenter.fluent.models.MetadataSchemaInner object.
     * 
     * @return the inner object.
     */
    MetadataSchemaInner innerModel();

    /**
     * The entirety of the MetadataSchema definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The MetadataSchema definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the MetadataSchema definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the MetadataSchema definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serviceName The name of Azure API Center service.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String serviceName);
        }

        /**
         * The stage of the MetadataSchema definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            MetadataSchema create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MetadataSchema create(Context context);
        }

        /**
         * The stage of the MetadataSchema definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(MetadataSchemaProperties properties);
        }
    }

    /**
     * Begins update for the MetadataSchema resource.
     * 
     * @return the stage of resource update.
     */
    MetadataSchema.Update update();

    /**
     * The template for MetadataSchema update.
     */
    interface Update {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        MetadataSchema apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MetadataSchema apply(Context context);
    }

    /**
     * The MetadataSchema update stages.
     */
    interface UpdateStages {
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    MetadataSchema refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MetadataSchema refresh(Context context);
}
