// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.digitaltwins.fluent.models.DigitalTwinsEndpointResourceInner;

/** An immutable client-side representation of DigitalTwinsEndpointResource. */
public interface DigitalTwinsEndpointResource {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: DigitalTwinsInstance endpoint resource properties.
     *
     * @return the properties value.
     */
    DigitalTwinsEndpointResourceProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.digitaltwins.fluent.models.DigitalTwinsEndpointResourceInner object.
     *
     * @return the inner object.
     */
    DigitalTwinsEndpointResourceInner innerModel();

    /** The entirety of the DigitalTwinsEndpointResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The DigitalTwinsEndpointResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the DigitalTwinsEndpointResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the DigitalTwinsEndpointResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName.
             *
             * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
             * @param resourceName The name of the DigitalTwinsInstance.
             * @return the next definition stage.
             */
            WithProperties withExistingDigitalTwinsInstance(String resourceGroupName, String resourceName);
        }
        /** The stage of the DigitalTwinsEndpointResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: DigitalTwinsInstance endpoint resource properties..
             *
             * @param properties DigitalTwinsInstance endpoint resource properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(DigitalTwinsEndpointResourceProperties properties);
        }
        /**
         * The stage of the DigitalTwinsEndpointResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DigitalTwinsEndpointResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DigitalTwinsEndpointResource create(Context context);
        }
    }
    /**
     * Begins update for the DigitalTwinsEndpointResource resource.
     *
     * @return the stage of resource update.
     */
    DigitalTwinsEndpointResource.Update update();

    /** The template for DigitalTwinsEndpointResource update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DigitalTwinsEndpointResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DigitalTwinsEndpointResource apply(Context context);
    }
    /** The DigitalTwinsEndpointResource update stages. */
    interface UpdateStages {
        /** The stage of the DigitalTwinsEndpointResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: DigitalTwinsInstance endpoint resource properties..
             *
             * @param properties DigitalTwinsInstance endpoint resource properties.
             * @return the next definition stage.
             */
            Update withProperties(DigitalTwinsEndpointResourceProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DigitalTwinsEndpointResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DigitalTwinsEndpointResource refresh(Context context);
}
