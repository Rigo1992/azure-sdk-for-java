// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.management.SubResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorInner;
import java.util.List;

/** An immutable client-side representation of Vendor. */
public interface Vendor {
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
     * Gets the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the vendor resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the skus property: A list of IDs of the vendor skus offered by the vendor.
     *
     * @return the skus value.
     */
    List<SubResource> skus();

    /**
     * Gets the inner com.azure.resourcemanager.hybridnetwork.fluent.models.VendorInner object.
     *
     * @return the inner object.
     */
    VendorInner innerModel();

    /** The entirety of the Vendor definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }
    /** The Vendor definition stages. */
    interface DefinitionStages {
        /** The first stage of the Vendor definition. */
        interface Blank extends WithCreate {
        }
        /**
         * The stage of the Vendor definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Vendor create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Vendor create(Context context);
        }
    }
    /**
     * Begins update for the Vendor resource.
     *
     * @return the stage of resource update.
     */
    Vendor.Update update();

    /** The template for Vendor update. */
    interface Update {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Vendor apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Vendor apply(Context context);
    }
    /** The Vendor update stages. */
    interface UpdateStages {
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Vendor refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Vendor refresh(Context context);
}
