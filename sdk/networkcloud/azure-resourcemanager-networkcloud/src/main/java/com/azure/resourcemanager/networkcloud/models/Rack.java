// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkcloud.fluent.models.RackInner;
import java.util.Map;

/** An immutable client-side representation of Rack. */
public interface Rack {
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
     * Gets the extendedLocation property: ExtendedLocation represents the Azure custom location where the resource will
     * be created.
     *
     * <p>The extended location of the cluster associated with the resource.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the availabilityZone property: The value that will be used for machines in this rack to represent the
     * availability zones that can be referenced by Hybrid AKS Clusters for node arrangement.
     *
     * @return the availabilityZone value.
     */
    String availabilityZone();

    /**
     * Gets the clusterId property: The resource ID of the cluster the rack is created for. This value is set when the
     * rack is created by the cluster.
     *
     * @return the clusterId value.
     */
    String clusterId();

    /**
     * Gets the detailedStatus property: The more detailed status of the rack.
     *
     * @return the detailedStatus value.
     */
    RackDetailedStatus detailedStatus();

    /**
     * Gets the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    String detailedStatusMessage();

    /**
     * Gets the provisioningState property: The provisioning state of the rack resource.
     *
     * @return the provisioningState value.
     */
    RackProvisioningState provisioningState();

    /**
     * Gets the rackLocation property: The free-form description of the rack location. (e.g. “DTN Datacenter, Floor 3,
     * Isle 9, Rack 2B”).
     *
     * @return the rackLocation value.
     */
    String rackLocation();

    /**
     * Gets the rackSerialNumber property: The unique identifier for the rack within Network Cloud cluster. An alternate
     * unique alphanumeric value other than a serial number may be provided if desired.
     *
     * @return the rackSerialNumber value.
     */
    String rackSerialNumber();

    /**
     * Gets the rackSkuId property: The SKU for the rack.
     *
     * @return the rackSkuId value.
     */
    String rackSkuId();

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
     * Gets the inner com.azure.resourcemanager.networkcloud.fluent.models.RackInner object.
     *
     * @return the inner object.
     */
    RackInner innerModel();

    /** The entirety of the Rack definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithExtendedLocation,
            DefinitionStages.WithAvailabilityZone,
            DefinitionStages.WithRackLocation,
            DefinitionStages.WithRackSerialNumber,
            DefinitionStages.WithRackSkuId,
            DefinitionStages.WithCreate {
    }

    /** The Rack definition stages. */
    interface DefinitionStages {
        /** The first stage of the Rack definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the Rack definition allowing to specify location. */
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

        /** The stage of the Rack definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithExtendedLocation withExistingResourceGroup(String resourceGroupName);
        }

        /** The stage of the Rack definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: ExtendedLocation represents the Azure custom location where the
             * resource will be created.
             *
             * <p>The extended location of the cluster associated with the resource..
             *
             * @param extendedLocation ExtendedLocation represents the Azure custom location where the resource will be
             *     created.
             *     <p>The extended location of the cluster associated with the resource.
             * @return the next definition stage.
             */
            WithAvailabilityZone withExtendedLocation(ExtendedLocation extendedLocation);
        }

        /** The stage of the Rack definition allowing to specify availabilityZone. */
        interface WithAvailabilityZone {
            /**
             * Specifies the availabilityZone property: The value that will be used for machines in this rack to
             * represent the availability zones that can be referenced by Hybrid AKS Clusters for node arrangement..
             *
             * @param availabilityZone The value that will be used for machines in this rack to represent the
             *     availability zones that can be referenced by Hybrid AKS Clusters for node arrangement.
             * @return the next definition stage.
             */
            WithRackLocation withAvailabilityZone(String availabilityZone);
        }

        /** The stage of the Rack definition allowing to specify rackLocation. */
        interface WithRackLocation {
            /**
             * Specifies the rackLocation property: The free-form description of the rack location. (e.g. “DTN
             * Datacenter, Floor 3, Isle 9, Rack 2B”).
             *
             * @param rackLocation The free-form description of the rack location. (e.g. “DTN Datacenter, Floor 3, Isle
             *     9, Rack 2B”).
             * @return the next definition stage.
             */
            WithRackSerialNumber withRackLocation(String rackLocation);
        }

        /** The stage of the Rack definition allowing to specify rackSerialNumber. */
        interface WithRackSerialNumber {
            /**
             * Specifies the rackSerialNumber property: The unique identifier for the rack within Network Cloud cluster.
             * An alternate unique alphanumeric value other than a serial number may be provided if desired..
             *
             * @param rackSerialNumber The unique identifier for the rack within Network Cloud cluster. An alternate
             *     unique alphanumeric value other than a serial number may be provided if desired.
             * @return the next definition stage.
             */
            WithRackSkuId withRackSerialNumber(String rackSerialNumber);
        }

        /** The stage of the Rack definition allowing to specify rackSkuId. */
        interface WithRackSkuId {
            /**
             * Specifies the rackSkuId property: The SKU for the rack..
             *
             * @param rackSkuId The SKU for the rack.
             * @return the next definition stage.
             */
            WithCreate withRackSkuId(String rackSkuId);
        }

        /**
         * The stage of the Rack definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Rack create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Rack create(Context context);
        }

        /** The stage of the Rack definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }

    /**
     * Begins update for the Rack resource.
     *
     * @return the stage of resource update.
     */
    Rack.Update update();

    /** The template for Rack update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithRackLocation, UpdateStages.WithRackSerialNumber {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Rack apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Rack apply(Context context);
    }

    /** The Rack update stages. */
    interface UpdateStages {
        /** The stage of the Rack update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The Azure resource tags that will replace the existing ones..
             *
             * @param tags The Azure resource tags that will replace the existing ones.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the Rack update allowing to specify rackLocation. */
        interface WithRackLocation {
            /**
             * Specifies the rackLocation property: The free-form description of the rack location. (e.g. “DTN
             * Datacenter, Floor 3, Isle 9, Rack 2B”).
             *
             * @param rackLocation The free-form description of the rack location. (e.g. “DTN Datacenter, Floor 3, Isle
             *     9, Rack 2B”).
             * @return the next definition stage.
             */
            Update withRackLocation(String rackLocation);
        }

        /** The stage of the Rack update allowing to specify rackSerialNumber. */
        interface WithRackSerialNumber {
            /**
             * Specifies the rackSerialNumber property: The globally unique identifier for the rack..
             *
             * @param rackSerialNumber The globally unique identifier for the rack.
             * @return the next definition stage.
             */
            Update withRackSerialNumber(String rackSerialNumber);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Rack refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Rack refresh(Context context);
}
