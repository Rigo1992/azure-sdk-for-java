// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.nginx.fluent.models.NginxCertificateInner;

/**
 * An immutable client-side representation of NginxCertificate.
 */
public interface NginxCertificate {
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
     * Gets the properties property: The properties property.
     * 
     * @return the properties value.
     */
    NginxCertificateProperties properties();

    /**
     * Gets the location property: The location property.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

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
     * Gets the inner com.azure.resourcemanager.nginx.fluent.models.NginxCertificateInner object.
     * 
     * @return the inner object.
     */
    NginxCertificateInner innerModel();

    /**
     * The entirety of the NginxCertificate definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The NginxCertificate definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the NginxCertificate definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the NginxCertificate definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, deploymentName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param deploymentName The name of targeted NGINX deployment.
             * @return the next definition stage.
             */
            WithCreate withExistingNginxDeployment(String resourceGroupName, String deploymentName);
        }

        /**
         * The stage of the NginxCertificate definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLocation, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            NginxCertificate create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NginxCertificate create(Context context);
        }

        /**
         * The stage of the NginxCertificate definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The location property.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The location property.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }

        /**
         * The stage of the NginxCertificate definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties property..
             * 
             * @param properties The properties property.
             * @return the next definition stage.
             */
            WithCreate withProperties(NginxCertificateProperties properties);
        }
    }

    /**
     * Begins update for the NginxCertificate resource.
     * 
     * @return the stage of resource update.
     */
    NginxCertificate.Update update();

    /**
     * The template for NginxCertificate update.
     */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        NginxCertificate apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NginxCertificate apply(Context context);
    }

    /**
     * The NginxCertificate update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the NginxCertificate update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties property..
             * 
             * @param properties The properties property.
             * @return the next definition stage.
             */
            Update withProperties(NginxCertificateProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    NginxCertificate refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NginxCertificate refresh(Context context);
}
