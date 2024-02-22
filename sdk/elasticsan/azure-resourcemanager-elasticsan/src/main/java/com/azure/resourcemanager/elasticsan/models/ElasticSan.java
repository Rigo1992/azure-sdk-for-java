// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of ElasticSan.
 */
public interface ElasticSan {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the sku property: resource sku.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the availabilityZones property: Logical zone for Elastic San resource; example: ["1"].
     * 
     * @return the availabilityZones value.
     */
    List<String> availabilityZones();

    /**
     * Gets the provisioningState property: State of the operation on the resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningStates provisioningState();

    /**
     * Gets the baseSizeTiB property: Base size of the Elastic San appliance in TiB.
     * 
     * @return the baseSizeTiB value.
     */
    long baseSizeTiB();

    /**
     * Gets the extendedCapacitySizeTiB property: Extended size of the Elastic San appliance in TiB.
     * 
     * @return the extendedCapacitySizeTiB value.
     */
    long extendedCapacitySizeTiB();

    /**
     * Gets the totalVolumeSizeGiB property: Total size of the provisioned Volumes in GiB.
     * 
     * @return the totalVolumeSizeGiB value.
     */
    Long totalVolumeSizeGiB();

    /**
     * Gets the volumeGroupCount property: Total number of volume groups in this Elastic San appliance.
     * 
     * @return the volumeGroupCount value.
     */
    Long volumeGroupCount();

    /**
     * Gets the totalIops property: Total Provisioned IOPS of the Elastic San appliance.
     * 
     * @return the totalIops value.
     */
    Long totalIops();

    /**
     * Gets the totalMBps property: Total Provisioned MBps Elastic San appliance.
     * 
     * @return the totalMBps value.
     */
    Long totalMBps();

    /**
     * Gets the totalSizeTiB property: Total size of the Elastic San appliance in TB.
     * 
     * @return the totalSizeTiB value.
     */
    Long totalSizeTiB();

    /**
     * Gets the privateEndpointConnections property: The list of Private Endpoint Connections.
     * 
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the publicNetworkAccess property: Allow or disallow public network access to ElasticSan. Value is optional
     * but if passed in, must be 'Enabled' or 'Disabled'.
     * 
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

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
     * Gets the inner com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanInner object.
     * 
     * @return the inner object.
     */
    ElasticSanInner innerModel();

    /**
     * The entirety of the ElasticSan definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithSku, DefinitionStages.WithBaseSizeTiB,
        DefinitionStages.WithExtendedCapacitySizeTiB, DefinitionStages.WithCreate {
    }

    /**
     * The ElasticSan definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ElasticSan definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the ElasticSan definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the ElasticSan definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithSku withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the ElasticSan definition allowing to specify sku.
         */
        interface WithSku {
            /**
             * Specifies the sku property: resource sku.
             * 
             * @param sku resource sku.
             * @return the next definition stage.
             */
            WithBaseSizeTiB withSku(Sku sku);
        }

        /**
         * The stage of the ElasticSan definition allowing to specify baseSizeTiB.
         */
        interface WithBaseSizeTiB {
            /**
             * Specifies the baseSizeTiB property: Base size of the Elastic San appliance in TiB..
             * 
             * @param baseSizeTiB Base size of the Elastic San appliance in TiB.
             * @return the next definition stage.
             */
            WithExtendedCapacitySizeTiB withBaseSizeTiB(long baseSizeTiB);
        }

        /**
         * The stage of the ElasticSan definition allowing to specify extendedCapacitySizeTiB.
         */
        interface WithExtendedCapacitySizeTiB {
            /**
             * Specifies the extendedCapacitySizeTiB property: Extended size of the Elastic San appliance in TiB..
             * 
             * @param extendedCapacitySizeTiB Extended size of the Elastic San appliance in TiB.
             * @return the next definition stage.
             */
            WithCreate withExtendedCapacitySizeTiB(long extendedCapacitySizeTiB);
        }

        /**
         * The stage of the ElasticSan definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithAvailabilityZones,
            DefinitionStages.WithPublicNetworkAccess {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ElasticSan create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ElasticSan create(Context context);
        }

        /**
         * The stage of the ElasticSan definition allowing to specify tags.
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
         * The stage of the ElasticSan definition allowing to specify availabilityZones.
         */
        interface WithAvailabilityZones {
            /**
             * Specifies the availabilityZones property: Logical zone for Elastic San resource; example: ["1"]..
             * 
             * @param availabilityZones Logical zone for Elastic San resource; example: ["1"].
             * @return the next definition stage.
             */
            WithCreate withAvailabilityZones(List<String> availabilityZones);
        }

        /**
         * The stage of the ElasticSan definition allowing to specify publicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Allow or disallow public network access to ElasticSan. Value
             * is optional but if passed in, must be 'Enabled' or 'Disabled'..
             * 
             * @param publicNetworkAccess Allow or disallow public network access to ElasticSan. Value is optional but
             * if passed in, must be 'Enabled' or 'Disabled'.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
    }

    /**
     * Begins update for the ElasticSan resource.
     * 
     * @return the stage of resource update.
     */
    ElasticSan.Update update();

    /**
     * The template for ElasticSan update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithBaseSizeTiB,
        UpdateStages.WithExtendedCapacitySizeTiB, UpdateStages.WithPublicNetworkAccess {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        ElasticSan apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ElasticSan apply(Context context);
    }

    /**
     * The ElasticSan update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ElasticSan update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Update tags.
             * 
             * @param tags Update tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the ElasticSan update allowing to specify baseSizeTiB.
         */
        interface WithBaseSizeTiB {
            /**
             * Specifies the baseSizeTiB property: Base size of the Elastic San appliance in TiB..
             * 
             * @param baseSizeTiB Base size of the Elastic San appliance in TiB.
             * @return the next definition stage.
             */
            Update withBaseSizeTiB(Long baseSizeTiB);
        }

        /**
         * The stage of the ElasticSan update allowing to specify extendedCapacitySizeTiB.
         */
        interface WithExtendedCapacitySizeTiB {
            /**
             * Specifies the extendedCapacitySizeTiB property: Extended size of the Elastic San appliance in TiB..
             * 
             * @param extendedCapacitySizeTiB Extended size of the Elastic San appliance in TiB.
             * @return the next definition stage.
             */
            Update withExtendedCapacitySizeTiB(Long extendedCapacitySizeTiB);
        }

        /**
         * The stage of the ElasticSan update allowing to specify publicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Allow or disallow public network access to ElasticSan
             * Account. Value is optional but if passed in, must be 'Enabled' or 'Disabled'..
             * 
             * @param publicNetworkAccess Allow or disallow public network access to ElasticSan Account. Value is
             * optional but if passed in, must be 'Enabled' or 'Disabled'.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ElasticSan refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ElasticSan refresh(Context context);
}
