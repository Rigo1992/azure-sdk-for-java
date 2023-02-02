// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storageimportexport.fluent.models.JobResponseInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of JobResponse. */
public interface JobResponse {
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
     * Gets the systemData property: SystemData of ImportExport Jobs.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: Specifies the job properties.
     *
     * @return the properties value.
     */
    JobDetails properties();

    /**
     * Gets the identity property: Specifies the job identity details.
     *
     * @return the identity value.
     */
    IdentityDetails identity();

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
     * Gets the inner com.azure.resourcemanager.storageimportexport.fluent.models.JobResponseInner object.
     *
     * @return the inner object.
     */
    JobResponseInner innerModel();

    /** The entirety of the JobResponse definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }
    /** The JobResponse definition stages. */
    interface DefinitionStages {
        /** The first stage of the JobResponse definition. */
        interface Blank extends WithResourceGroup {
        }
        /** The stage of the JobResponse definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
             *     subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the JobResponse definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithTags,
                DefinitionStages.WithProperties,
                DefinitionStages.WithClientTenantId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            JobResponse create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            JobResponse create(Context context);
        }
        /** The stage of the JobResponse definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location Specifies the supported Azure location where the job should be created.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location Specifies the supported Azure location where the job should be created.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the JobResponse definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Specifies the tags that will be assigned to the job..
             *
             * @param tags Specifies the tags that will be assigned to the job.
             * @return the next definition stage.
             */
            WithCreate withTags(Object tags);
        }
        /** The stage of the JobResponse definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Specifies the job properties.
             *
             * @param properties Specifies the job properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(JobDetails properties);
        }
        /** The stage of the JobResponse definition allowing to specify clientTenantId. */
        interface WithClientTenantId {
            /**
             * Specifies the clientTenantId property: The tenant ID of the client making the request..
             *
             * @param clientTenantId The tenant ID of the client making the request.
             * @return the next definition stage.
             */
            WithCreate withClientTenantId(String clientTenantId);
        }
    }
    /**
     * Begins update for the JobResponse resource.
     *
     * @return the stage of resource update.
     */
    JobResponse.Update update();

    /** The template for JobResponse update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithCancelRequested,
            UpdateStages.WithState,
            UpdateStages.WithReturnAddress,
            UpdateStages.WithReturnShipping,
            UpdateStages.WithDeliveryPackage,
            UpdateStages.WithLogLevel,
            UpdateStages.WithBackupDriveManifest,
            UpdateStages.WithDriveList {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        JobResponse apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        JobResponse apply(Context context);
    }
    /** The JobResponse update stages. */
    interface UpdateStages {
        /** The stage of the JobResponse update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Specifies the tags that will be assigned to the job.
             *
             * @param tags Specifies the tags that will be assigned to the job.
             * @return the next definition stage.
             */
            Update withTags(Object tags);
        }
        /** The stage of the JobResponse update allowing to specify cancelRequested. */
        interface WithCancelRequested {
            /**
             * Specifies the cancelRequested property: If specified, the value must be true. The service will attempt to
             * cancel the job. .
             *
             * @param cancelRequested If specified, the value must be true. The service will attempt to cancel the job.
             * @return the next definition stage.
             */
            Update withCancelRequested(Boolean cancelRequested);
        }
        /** The stage of the JobResponse update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: If specified, the value must be Shipping, which tells the Import/Export
             * service that the package for the job has been shipped. The ReturnAddress and DeliveryPackage properties
             * must have been set either in this request or in a previous request, otherwise the request will fail. .
             *
             * @param state If specified, the value must be Shipping, which tells the Import/Export service that the
             *     package for the job has been shipped. The ReturnAddress and DeliveryPackage properties must have been
             *     set either in this request or in a previous request, otherwise the request will fail.
             * @return the next definition stage.
             */
            Update withState(String state);
        }
        /** The stage of the JobResponse update allowing to specify returnAddress. */
        interface WithReturnAddress {
            /**
             * Specifies the returnAddress property: Specifies the return address information for the job..
             *
             * @param returnAddress Specifies the return address information for the job.
             * @return the next definition stage.
             */
            Update withReturnAddress(ReturnAddress returnAddress);
        }
        /** The stage of the JobResponse update allowing to specify returnShipping. */
        interface WithReturnShipping {
            /**
             * Specifies the returnShipping property: Specifies the return carrier and customer's account with the
             * carrier..
             *
             * @param returnShipping Specifies the return carrier and customer's account with the carrier.
             * @return the next definition stage.
             */
            Update withReturnShipping(ReturnShipping returnShipping);
        }
        /** The stage of the JobResponse update allowing to specify deliveryPackage. */
        interface WithDeliveryPackage {
            /**
             * Specifies the deliveryPackage property: Contains information about the package being shipped by the
             * customer to the Microsoft data center..
             *
             * @param deliveryPackage Contains information about the package being shipped by the customer to the
             *     Microsoft data center.
             * @return the next definition stage.
             */
            Update withDeliveryPackage(DeliveryPackageInformation deliveryPackage);
        }
        /** The stage of the JobResponse update allowing to specify logLevel. */
        interface WithLogLevel {
            /**
             * Specifies the logLevel property: Indicates whether error logging or verbose logging is enabled..
             *
             * @param logLevel Indicates whether error logging or verbose logging is enabled.
             * @return the next definition stage.
             */
            Update withLogLevel(String logLevel);
        }
        /** The stage of the JobResponse update allowing to specify backupDriveManifest. */
        interface WithBackupDriveManifest {
            /**
             * Specifies the backupDriveManifest property: Indicates whether the manifest files on the drives should be
             * copied to block blobs..
             *
             * @param backupDriveManifest Indicates whether the manifest files on the drives should be copied to block
             *     blobs.
             * @return the next definition stage.
             */
            Update withBackupDriveManifest(Boolean backupDriveManifest);
        }
        /** The stage of the JobResponse update allowing to specify driveList. */
        interface WithDriveList {
            /**
             * Specifies the driveList property: List of drives that comprise the job..
             *
             * @param driveList List of drives that comprise the job.
             * @return the next definition stage.
             */
            Update withDriveList(List<DriveStatus> driveList);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    JobResponse refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    JobResponse refresh(Context context);
}
