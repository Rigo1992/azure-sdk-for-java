// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for ComputeManagementClient class.
 */
public interface ComputeManagementClient {
    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the UsagesClient object to access its operations.
     * 
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the VirtualMachineSizesClient object to access its operations.
     * 
     * @return the VirtualMachineSizesClient object.
     */
    VirtualMachineSizesClient getVirtualMachineSizes();

    /**
     * Gets the VirtualMachineScaleSetsClient object to access its operations.
     * 
     * @return the VirtualMachineScaleSetsClient object.
     */
    VirtualMachineScaleSetsClient getVirtualMachineScaleSets();

    /**
     * Gets the VirtualMachineScaleSetExtensionsClient object to access its operations.
     * 
     * @return the VirtualMachineScaleSetExtensionsClient object.
     */
    VirtualMachineScaleSetExtensionsClient getVirtualMachineScaleSetExtensions();

    /**
     * Gets the VirtualMachineScaleSetRollingUpgradesClient object to access its operations.
     * 
     * @return the VirtualMachineScaleSetRollingUpgradesClient object.
     */
    VirtualMachineScaleSetRollingUpgradesClient getVirtualMachineScaleSetRollingUpgrades();

    /**
     * Gets the VirtualMachineScaleSetVMExtensionsClient object to access its operations.
     * 
     * @return the VirtualMachineScaleSetVMExtensionsClient object.
     */
    VirtualMachineScaleSetVMExtensionsClient getVirtualMachineScaleSetVMExtensions();

    /**
     * Gets the VirtualMachineScaleSetVMsClient object to access its operations.
     * 
     * @return the VirtualMachineScaleSetVMsClient object.
     */
    VirtualMachineScaleSetVMsClient getVirtualMachineScaleSetVMs();

    /**
     * Gets the VirtualMachineExtensionsClient object to access its operations.
     * 
     * @return the VirtualMachineExtensionsClient object.
     */
    VirtualMachineExtensionsClient getVirtualMachineExtensions();

    /**
     * Gets the VirtualMachinesClient object to access its operations.
     * 
     * @return the VirtualMachinesClient object.
     */
    VirtualMachinesClient getVirtualMachines();

    /**
     * Gets the VirtualMachineImagesClient object to access its operations.
     * 
     * @return the VirtualMachineImagesClient object.
     */
    VirtualMachineImagesClient getVirtualMachineImages();

    /**
     * Gets the VirtualMachineImagesEdgeZonesClient object to access its operations.
     * 
     * @return the VirtualMachineImagesEdgeZonesClient object.
     */
    VirtualMachineImagesEdgeZonesClient getVirtualMachineImagesEdgeZones();

    /**
     * Gets the VirtualMachineExtensionImagesClient object to access its operations.
     * 
     * @return the VirtualMachineExtensionImagesClient object.
     */
    VirtualMachineExtensionImagesClient getVirtualMachineExtensionImages();

    /**
     * Gets the AvailabilitySetsClient object to access its operations.
     * 
     * @return the AvailabilitySetsClient object.
     */
    AvailabilitySetsClient getAvailabilitySets();

    /**
     * Gets the ProximityPlacementGroupsClient object to access its operations.
     * 
     * @return the ProximityPlacementGroupsClient object.
     */
    ProximityPlacementGroupsClient getProximityPlacementGroups();

    /**
     * Gets the DedicatedHostGroupsClient object to access its operations.
     * 
     * @return the DedicatedHostGroupsClient object.
     */
    DedicatedHostGroupsClient getDedicatedHostGroups();

    /**
     * Gets the DedicatedHostsClient object to access its operations.
     * 
     * @return the DedicatedHostsClient object.
     */
    DedicatedHostsClient getDedicatedHosts();

    /**
     * Gets the SshPublicKeysClient object to access its operations.
     * 
     * @return the SshPublicKeysClient object.
     */
    SshPublicKeysClient getSshPublicKeys();

    /**
     * Gets the ImagesClient object to access its operations.
     * 
     * @return the ImagesClient object.
     */
    ImagesClient getImages();

    /**
     * Gets the RestorePointCollectionsClient object to access its operations.
     * 
     * @return the RestorePointCollectionsClient object.
     */
    RestorePointCollectionsClient getRestorePointCollections();

    /**
     * Gets the RestorePointsClient object to access its operations.
     * 
     * @return the RestorePointsClient object.
     */
    RestorePointsClient getRestorePoints();

    /**
     * Gets the CapacityReservationGroupsClient object to access its operations.
     * 
     * @return the CapacityReservationGroupsClient object.
     */
    CapacityReservationGroupsClient getCapacityReservationGroups();

    /**
     * Gets the CapacityReservationsClient object to access its operations.
     * 
     * @return the CapacityReservationsClient object.
     */
    CapacityReservationsClient getCapacityReservations();

    /**
     * Gets the LogAnalyticsClient object to access its operations.
     * 
     * @return the LogAnalyticsClient object.
     */
    LogAnalyticsClient getLogAnalytics();

    /**
     * Gets the VirtualMachineRunCommandsClient object to access its operations.
     * 
     * @return the VirtualMachineRunCommandsClient object.
     */
    VirtualMachineRunCommandsClient getVirtualMachineRunCommands();

    /**
     * Gets the VirtualMachineScaleSetVMRunCommandsClient object to access its operations.
     * 
     * @return the VirtualMachineScaleSetVMRunCommandsClient object.
     */
    VirtualMachineScaleSetVMRunCommandsClient getVirtualMachineScaleSetVMRunCommands();

    /**
     * Gets the DisksClient object to access its operations.
     * 
     * @return the DisksClient object.
     */
    DisksClient getDisks();

    /**
     * Gets the DiskAccessesClient object to access its operations.
     * 
     * @return the DiskAccessesClient object.
     */
    DiskAccessesClient getDiskAccesses();

    /**
     * Gets the DiskEncryptionSetsClient object to access its operations.
     * 
     * @return the DiskEncryptionSetsClient object.
     */
    DiskEncryptionSetsClient getDiskEncryptionSets();

    /**
     * Gets the DiskRestorePointsClient object to access its operations.
     * 
     * @return the DiskRestorePointsClient object.
     */
    DiskRestorePointsClient getDiskRestorePoints();

    /**
     * Gets the SnapshotsClient object to access its operations.
     * 
     * @return the SnapshotsClient object.
     */
    SnapshotsClient getSnapshots();

    /**
     * Gets the ResourceSkusClient object to access its operations.
     * 
     * @return the ResourceSkusClient object.
     */
    ResourceSkusClient getResourceSkus();

    /**
     * Gets the GalleriesClient object to access its operations.
     * 
     * @return the GalleriesClient object.
     */
    GalleriesClient getGalleries();

    /**
     * Gets the GalleryImagesClient object to access its operations.
     * 
     * @return the GalleryImagesClient object.
     */
    GalleryImagesClient getGalleryImages();

    /**
     * Gets the GalleryImageVersionsClient object to access its operations.
     * 
     * @return the GalleryImageVersionsClient object.
     */
    GalleryImageVersionsClient getGalleryImageVersions();

    /**
     * Gets the GalleryApplicationsClient object to access its operations.
     * 
     * @return the GalleryApplicationsClient object.
     */
    GalleryApplicationsClient getGalleryApplications();

    /**
     * Gets the GalleryApplicationVersionsClient object to access its operations.
     * 
     * @return the GalleryApplicationVersionsClient object.
     */
    GalleryApplicationVersionsClient getGalleryApplicationVersions();

    /**
     * Gets the GallerySharingProfilesClient object to access its operations.
     * 
     * @return the GallerySharingProfilesClient object.
     */
    GallerySharingProfilesClient getGallerySharingProfiles();

    /**
     * Gets the SharedGalleriesClient object to access its operations.
     * 
     * @return the SharedGalleriesClient object.
     */
    SharedGalleriesClient getSharedGalleries();

    /**
     * Gets the SharedGalleryImagesClient object to access its operations.
     * 
     * @return the SharedGalleryImagesClient object.
     */
    SharedGalleryImagesClient getSharedGalleryImages();

    /**
     * Gets the SharedGalleryImageVersionsClient object to access its operations.
     * 
     * @return the SharedGalleryImageVersionsClient object.
     */
    SharedGalleryImageVersionsClient getSharedGalleryImageVersions();

    /**
     * Gets the CommunityGalleriesClient object to access its operations.
     * 
     * @return the CommunityGalleriesClient object.
     */
    CommunityGalleriesClient getCommunityGalleries();

    /**
     * Gets the CommunityGalleryImagesClient object to access its operations.
     * 
     * @return the CommunityGalleryImagesClient object.
     */
    CommunityGalleryImagesClient getCommunityGalleryImages();

    /**
     * Gets the CommunityGalleryImageVersionsClient object to access its operations.
     * 
     * @return the CommunityGalleryImageVersionsClient object.
     */
    CommunityGalleryImageVersionsClient getCommunityGalleryImageVersions();

    /**
     * Gets the CloudServiceRoleInstancesClient object to access its operations.
     * 
     * @return the CloudServiceRoleInstancesClient object.
     */
    CloudServiceRoleInstancesClient getCloudServiceRoleInstances();

    /**
     * Gets the CloudServiceRolesClient object to access its operations.
     * 
     * @return the CloudServiceRolesClient object.
     */
    CloudServiceRolesClient getCloudServiceRoles();

    /**
     * Gets the CloudServicesClient object to access its operations.
     * 
     * @return the CloudServicesClient object.
     */
    CloudServicesClient getCloudServices();

    /**
     * Gets the CloudServicesUpdateDomainsClient object to access its operations.
     * 
     * @return the CloudServicesUpdateDomainsClient object.
     */
    CloudServicesUpdateDomainsClient getCloudServicesUpdateDomains();

    /**
     * Gets the CloudServiceOperatingSystemsClient object to access its operations.
     * 
     * @return the CloudServiceOperatingSystemsClient object.
     */
    CloudServiceOperatingSystemsClient getCloudServiceOperatingSystems();
}
