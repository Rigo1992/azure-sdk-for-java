// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.GalleryInner;

/**
 * An immutable client-side representation of Gallery.
 */
public interface Gallery {
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
     * Gets the galleryResourceId property: The resource ID of the backing Azure Compute Gallery.
     * 
     * @return the galleryResourceId value.
     */
    String galleryResourceId();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.GalleryInner object.
     * 
     * @return the inner object.
     */
    GalleryInner innerModel();

    /**
     * The entirety of the Gallery definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Gallery definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Gallery definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Gallery definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, devCenterName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param devCenterName The name of the devcenter.
             * @return the next definition stage.
             */
            WithCreate withExistingDevcenter(String resourceGroupName, String devCenterName);
        }

        /**
         * The stage of the Gallery definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithGalleryResourceId {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Gallery create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Gallery create(Context context);
        }

        /**
         * The stage of the Gallery definition allowing to specify galleryResourceId.
         */
        interface WithGalleryResourceId {
            /**
             * Specifies the galleryResourceId property: The resource ID of the backing Azure Compute Gallery..
             * 
             * @param galleryResourceId The resource ID of the backing Azure Compute Gallery.
             * @return the next definition stage.
             */
            WithCreate withGalleryResourceId(String galleryResourceId);
        }
    }

    /**
     * Begins update for the Gallery resource.
     * 
     * @return the stage of resource update.
     */
    Gallery.Update update();

    /**
     * The template for Gallery update.
     */
    interface Update {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Gallery apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Gallery apply(Context context);
    }

    /**
     * The Gallery update stages.
     */
    interface UpdateStages {
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Gallery refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Gallery refresh(Context context);
}
