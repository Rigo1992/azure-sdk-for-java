// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.models.Encryption;
import com.azure.resourcemanager.compute.models.HyperVGeneration;
import com.azure.resourcemanager.compute.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.PublicNetworkAccess;
import com.azure.resourcemanager.compute.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.models.SupportedCapabilities;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of an incremental disk restore point. */
@Fluent
public final class DiskRestorePointProperties {
    /*
     * The timestamp of restorePoint creation
     */
    @JsonProperty(value = "timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /*
     * arm id of source disk or source disk restore point.
     */
    @JsonProperty(value = "sourceResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceResourceId;

    /*
     * The Operating System type.
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private OperatingSystemTypes osType;

    /*
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     */
    @JsonProperty(value = "hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /*
     * Purchase plan information for the the image from which the OS disk was created.
     */
    @JsonProperty(value = "purchasePlan")
    private PurchasePlanAutoGenerated purchasePlan;

    /*
     * List of supported capabilities for the image from which the OS disk was created.
     */
    @JsonProperty(value = "supportedCapabilities")
    private SupportedCapabilities supportedCapabilities;

    /*
     * id of the backing snapshot's MIS family
     */
    @JsonProperty(value = "familyId", access = JsonProperty.Access.WRITE_ONLY)
    private String familyId;

    /*
     * unique incarnation id of the source disk
     */
    @JsonProperty(value = "sourceUniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceUniqueId;

    /*
     * Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     */
    @JsonProperty(value = "encryption", access = JsonProperty.Access.WRITE_ONLY)
    private Encryption encryption;

    /*
     * Indicates the OS on a disk supports hibernation.
     */
    @JsonProperty(value = "supportsHibernation")
    private Boolean supportsHibernation;

    /*
     * Policy for accessing the disk via network.
     */
    @JsonProperty(value = "networkAccessPolicy")
    private NetworkAccessPolicy networkAccessPolicy;

    /*
     * Policy for controlling export on the disk.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     */
    @JsonProperty(value = "diskAccessId")
    private String diskAccessId;

    /*
     * Percentage complete for the background copy of disk restore point when source resource is from a different
     * region.
     */
    @JsonProperty(value = "completionPercent")
    private Float completionPercent;

    /*
     * Replication state of disk restore point when source resource is from a different region.
     */
    @JsonProperty(value = "replicationState", access = JsonProperty.Access.WRITE_ONLY)
    private String replicationState;

    /*
     * Location of source disk or source disk restore point when source resource is from a different region.
     */
    @JsonProperty(value = "sourceResourceLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceResourceLocation;

    /*
     * Contains the security related information for the resource.
     */
    @JsonProperty(value = "securityProfile")
    private DiskSecurityProfile securityProfile;

    /**
     * Get the timeCreated property: The timestamp of restorePoint creation.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the sourceResourceId property: arm id of source disk or source disk restore point.
     *
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Get the osType property: The Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the DiskRestorePointProperties object itself.
     */
    public DiskRestorePointProperties withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     *
     * @return the purchasePlan value.
     */
    public PurchasePlanAutoGenerated purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     *
     * @param purchasePlan the purchasePlan value to set.
     * @return the DiskRestorePointProperties object itself.
     */
    public DiskRestorePointProperties withPurchasePlan(PurchasePlanAutoGenerated purchasePlan) {
        this.purchasePlan = purchasePlan;
        return this;
    }

    /**
     * Get the supportedCapabilities property: List of supported capabilities for the image from which the OS disk was
     * created.
     *
     * @return the supportedCapabilities value.
     */
    public SupportedCapabilities supportedCapabilities() {
        return this.supportedCapabilities;
    }

    /**
     * Set the supportedCapabilities property: List of supported capabilities for the image from which the OS disk was
     * created.
     *
     * @param supportedCapabilities the supportedCapabilities value to set.
     * @return the DiskRestorePointProperties object itself.
     */
    public DiskRestorePointProperties withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        this.supportedCapabilities = supportedCapabilities;
        return this;
    }

    /**
     * Get the familyId property: id of the backing snapshot's MIS family.
     *
     * @return the familyId value.
     */
    public String familyId() {
        return this.familyId;
    }

    /**
     * Get the sourceUniqueId property: unique incarnation id of the source disk.
     *
     * @return the sourceUniqueId value.
     */
    public String sourceUniqueId() {
        return this.sourceUniqueId;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Get the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     *
     * @return the supportsHibernation value.
     */
    public Boolean supportsHibernation() {
        return this.supportsHibernation;
    }

    /**
     * Set the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     *
     * @param supportsHibernation the supportsHibernation value to set.
     * @return the DiskRestorePointProperties object itself.
     */
    public DiskRestorePointProperties withSupportsHibernation(Boolean supportsHibernation) {
        this.supportsHibernation = supportsHibernation;
        return this;
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.networkAccessPolicy;
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the DiskRestorePointProperties object itself.
     */
    public DiskRestorePointProperties withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        this.networkAccessPolicy = networkAccessPolicy;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DiskRestorePointProperties object itself.
     */
    public DiskRestorePointProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.diskAccessId;
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set.
     * @return the DiskRestorePointProperties object itself.
     */
    public DiskRestorePointProperties withDiskAccessId(String diskAccessId) {
        this.diskAccessId = diskAccessId;
        return this;
    }

    /**
     * Get the completionPercent property: Percentage complete for the background copy of disk restore point when source
     * resource is from a different region.
     *
     * @return the completionPercent value.
     */
    public Float completionPercent() {
        return this.completionPercent;
    }

    /**
     * Set the completionPercent property: Percentage complete for the background copy of disk restore point when source
     * resource is from a different region.
     *
     * @param completionPercent the completionPercent value to set.
     * @return the DiskRestorePointProperties object itself.
     */
    public DiskRestorePointProperties withCompletionPercent(Float completionPercent) {
        this.completionPercent = completionPercent;
        return this;
    }

    /**
     * Get the replicationState property: Replication state of disk restore point when source resource is from a
     * different region.
     *
     * @return the replicationState value.
     */
    public String replicationState() {
        return this.replicationState;
    }

    /**
     * Get the sourceResourceLocation property: Location of source disk or source disk restore point when source
     * resource is from a different region.
     *
     * @return the sourceResourceLocation value.
     */
    public String sourceResourceLocation() {
        return this.sourceResourceLocation;
    }

    /**
     * Get the securityProfile property: Contains the security related information for the resource.
     *
     * @return the securityProfile value.
     */
    public DiskSecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: Contains the security related information for the resource.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the DiskRestorePointProperties object itself.
     */
    public DiskRestorePointProperties withSecurityProfile(DiskSecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (purchasePlan() != null) {
            purchasePlan().validate();
        }
        if (supportedCapabilities() != null) {
            supportedCapabilities().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }
}
