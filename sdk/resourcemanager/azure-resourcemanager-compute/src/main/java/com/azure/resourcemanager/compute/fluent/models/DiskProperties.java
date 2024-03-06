// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.CreationData;
import com.azure.resourcemanager.compute.models.DataAccessAuthMode;
import com.azure.resourcemanager.compute.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.models.DiskState;
import com.azure.resourcemanager.compute.models.Encryption;
import com.azure.resourcemanager.compute.models.EncryptionSettingsCollection;
import com.azure.resourcemanager.compute.models.HyperVGeneration;
import com.azure.resourcemanager.compute.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.PropertyUpdatesInProgress;
import com.azure.resourcemanager.compute.models.PublicNetworkAccess;
import com.azure.resourcemanager.compute.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.models.ShareInfoElement;
import com.azure.resourcemanager.compute.models.SupportedCapabilities;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Disk resource properties.
 */
@Fluent
public final class DiskProperties {
    /*
     * The time when the disk was created.
     */
    @JsonProperty(value = "timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /*
     * The Operating System type.
     */
    @JsonProperty(value = "osType")
    private OperatingSystemTypes osType;

    /*
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     */
    @JsonProperty(value = "hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /*
     * Purchase plan information for the the image from which the OS disk was created. E.g. - {name: 2019-Datacenter,
     * publisher: MicrosoftWindowsServer, product: WindowsServer}
     */
    @JsonProperty(value = "purchasePlan")
    private PurchasePlanAutoGenerated purchasePlan;

    /*
     * List of supported capabilities for the image from which the OS disk was created.
     */
    @JsonProperty(value = "supportedCapabilities")
    private SupportedCapabilities supportedCapabilities;

    /*
     * Disk source information. CreationData information cannot be changed after the disk has been created.
     */
    @JsonProperty(value = "creationData", required = true)
    private CreationData creationData;

    /*
     * If creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create.
     * If this field is present for updates or creation with other options, it indicates a resize. Resizes are only
     * allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * The size of the disk in bytes. This field is read only.
     */
    @JsonProperty(value = "diskSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long diskSizeBytes;

    /*
     * Unique Guid identifying the resource.
     */
    @JsonProperty(value = "uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /*
     * Encryption settings collection used for Azure Disk Encryption, can contain multiple encryption settings per disk
     * or snapshot.
     */
    @JsonProperty(value = "encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /*
     * The disk provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between
     * 4k and 256k bytes.
     */
    @JsonProperty(value = "diskIOPSReadWrite")
    private Long diskIopsReadWrite;

    /*
     * The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second -
     * MB here uses the ISO notation, of powers of 10.
     */
    @JsonProperty(value = "diskMBpsReadWrite")
    private Long diskMBpsReadWrite;

    /*
     * The total number of IOPS that will be allowed across all VMs mounting the shared disk as ReadOnly. One operation
     * can transfer between 4k and 256k bytes.
     */
    @JsonProperty(value = "diskIOPSReadOnly")
    private Long diskIopsReadOnly;

    /*
     * The total throughput (MBps) that will be allowed across all VMs mounting the shared disk as ReadOnly. MBps means
     * millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     */
    @JsonProperty(value = "diskMBpsReadOnly")
    private Long diskMBpsReadOnly;

    /*
     * The state of the disk.
     */
    @JsonProperty(value = "diskState", access = JsonProperty.Access.WRITE_ONLY)
    private DiskState diskState;

    /*
     * Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     */
    @JsonProperty(value = "encryption")
    private Encryption encryption;

    /*
     * The maximum number of VMs that can attach to the disk at the same time. Value greater than one indicates a disk
     * that can be mounted on multiple VMs at the same time.
     */
    @JsonProperty(value = "maxShares")
    private Integer maxShares;

    /*
     * Details of the list of all VMs that have the disk attached. maxShares should be set to a value greater than one
     * for disks to allow attaching them to multiple VMs.
     */
    @JsonProperty(value = "shareInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<ShareInfoElement> shareInfo;

    /*
     * Policy for accessing the disk via network.
     */
    @JsonProperty(value = "networkAccessPolicy")
    private NetworkAccessPolicy networkAccessPolicy;

    /*
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     */
    @JsonProperty(value = "diskAccessId")
    private String diskAccessId;

    /*
     * Latest time when bursting was last enabled on a disk.
     */
    @JsonProperty(value = "burstingEnabledTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime burstingEnabledTime;

    /*
     * Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * Set to true to enable bursting beyond the provisioned performance target of the disk. Bursting is disabled by
     * default. Does not apply to Ultra disks.
     */
    @JsonProperty(value = "burstingEnabled")
    private Boolean burstingEnabled;

    /*
     * Properties of the disk for which update is pending.
     */
    @JsonProperty(value = "propertyUpdatesInProgress", access = JsonProperty.Access.WRITE_ONLY)
    private PropertyUpdatesInProgress propertyUpdatesInProgress;

    /*
     * Indicates the OS on a disk supports hibernation.
     */
    @JsonProperty(value = "supportsHibernation")
    private Boolean supportsHibernation;

    /*
     * Contains the security related information for the resource.
     */
    @JsonProperty(value = "securityProfile")
    private DiskSecurityProfile securityProfile;

    /*
     * Percentage complete for the background copy when a resource is created via the CopyStart operation.
     */
    @JsonProperty(value = "completionPercent")
    private Float completionPercent;

    /*
     * Policy for controlling export on the disk.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Additional authentication requirements when exporting or uploading to a disk or snapshot.
     */
    @JsonProperty(value = "dataAccessAuthMode")
    private DataAccessAuthMode dataAccessAuthMode;

    /*
     * Setting this property to true improves reliability and performance of data disks that are frequently (more than
     * 5 times a day) by detached from one virtual machine and attached to another. This property should not be set for
     * disks that are not detached and attached frequently as it causes the disks to not align with the fault domain of
     * the virtual machine.
     */
    @JsonProperty(value = "optimizedForFrequentAttach")
    private Boolean optimizedForFrequentAttach;

    /*
     * The UTC time when the ownership state of the disk was last changed i.e., the time the disk was last attached or
     * detached from a VM or the time when the VM to which the disk was attached was deallocated or started.
     */
    @JsonProperty(value = "LastOwnershipUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastOwnershipUpdateTime;

    /**
     * Creates an instance of DiskProperties class.
     */
    public DiskProperties() {
    }

    /**
     * Get the timeCreated property: The time when the disk was created.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
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
     * Set the osType property: The Operating System type.
     * 
     * @param osType the osType value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     * 
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     * 
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     * E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}.
     * 
     * @return the purchasePlan value.
     */
    public PurchasePlanAutoGenerated purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     * E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}.
     * 
     * @param purchasePlan the purchasePlan value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withPurchasePlan(PurchasePlanAutoGenerated purchasePlan) {
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
     * @return the DiskProperties object itself.
     */
    public DiskProperties withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        this.supportedCapabilities = supportedCapabilities;
        return this;
    }

    /**
     * Get the creationData property: Disk source information. CreationData information cannot be changed after the
     * disk has been created.
     * 
     * @return the creationData value.
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set the creationData property: Disk source information. CreationData information cannot be changed after the
     * disk has been created.
     * 
     * @param creationData the creationData value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withCreationData(CreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the diskSizeBytes property: The size of the disk in bytes. This field is read only.
     * 
     * @return the diskSizeBytes value.
     */
    public Long diskSizeBytes() {
        return this.diskSizeBytes;
    }

    /**
     * Get the uniqueId property: Unique Guid identifying the resource.
     * 
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used for Azure Disk Encryption,
     * can contain multiple encryption settings per disk or snapshot.
     * 
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used for Azure Disk Encryption,
     * can contain multiple encryption settings per disk or snapshot.
     * 
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the provisioningState property: The disk provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     * 
     * @return the diskIopsReadWrite value.
     */
    public Long diskIopsReadWrite() {
        return this.diskIopsReadWrite;
    }

    /**
     * Set the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     * 
     * @param diskIopsReadWrite the diskIopsReadWrite value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskIopsReadWrite(Long diskIopsReadWrite) {
        this.diskIopsReadWrite = diskIopsReadWrite;
        return this;
    }

    /**
     * Get the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
     * @return the diskMBpsReadWrite value.
     */
    public Long diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Set the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        return this;
    }

    /**
     * Get the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     * 
     * @return the diskIopsReadOnly value.
     */
    public Long diskIopsReadOnly() {
        return this.diskIopsReadOnly;
    }

    /**
     * Set the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     * 
     * @param diskIopsReadOnly the diskIopsReadOnly value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskIopsReadOnly(Long diskIopsReadOnly) {
        this.diskIopsReadOnly = diskIopsReadOnly;
        return this;
    }

    /**
     * Get the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     * 
     * @return the diskMBpsReadOnly value.
     */
    public Long diskMBpsReadOnly() {
        return this.diskMBpsReadOnly;
    }

    /**
     * Set the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     * 
     * @param diskMBpsReadOnly the diskMBpsReadOnly value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskMBpsReadOnly(Long diskMBpsReadOnly) {
        this.diskMBpsReadOnly = diskMBpsReadOnly;
        return this;
    }

    /**
     * Get the diskState property: The state of the disk.
     * 
     * @return the diskState value.
     */
    public DiskState diskState() {
        return this.diskState;
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
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     * 
     * @param encryption the encryption value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value
     * greater than one indicates a disk that can be mounted on multiple VMs at the same time.
     * 
     * @return the maxShares value.
     */
    public Integer maxShares() {
        return this.maxShares;
    }

    /**
     * Set the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value
     * greater than one indicates a disk that can be mounted on multiple VMs at the same time.
     * 
     * @param maxShares the maxShares value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withMaxShares(Integer maxShares) {
        this.maxShares = maxShares;
        return this;
    }

    /**
     * Get the shareInfo property: Details of the list of all VMs that have the disk attached. maxShares should be set
     * to a value greater than one for disks to allow attaching them to multiple VMs.
     * 
     * @return the shareInfo value.
     */
    public List<ShareInfoElement> shareInfo() {
        return this.shareInfo;
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
     * @return the DiskProperties object itself.
     */
    public DiskProperties withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        this.networkAccessPolicy = networkAccessPolicy;
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
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDiskAccessId(String diskAccessId) {
        this.diskAccessId = diskAccessId;
        return this;
    }

    /**
     * Get the burstingEnabledTime property: Latest time when bursting was last enabled on a disk.
     * 
     * @return the burstingEnabledTime value.
     */
    public OffsetDateTime burstingEnabledTime() {
        return this.burstingEnabledTime;
    }

    /**
     * Get the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     * 
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     * 
     * @param tier the tier value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the burstingEnabled property: Set to true to enable bursting beyond the provisioned performance target of
     * the disk. Bursting is disabled by default. Does not apply to Ultra disks.
     * 
     * @return the burstingEnabled value.
     */
    public Boolean burstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * Set the burstingEnabled property: Set to true to enable bursting beyond the provisioned performance target of
     * the disk. Bursting is disabled by default. Does not apply to Ultra disks.
     * 
     * @param burstingEnabled the burstingEnabled value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }

    /**
     * Get the propertyUpdatesInProgress property: Properties of the disk for which update is pending.
     * 
     * @return the propertyUpdatesInProgress value.
     */
    public PropertyUpdatesInProgress propertyUpdatesInProgress() {
        return this.propertyUpdatesInProgress;
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
     * @return the DiskProperties object itself.
     */
    public DiskProperties withSupportsHibernation(Boolean supportsHibernation) {
        this.supportsHibernation = supportsHibernation;
        return this;
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
     * @return the DiskProperties object itself.
     */
    public DiskProperties withSecurityProfile(DiskSecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the completionPercent property: Percentage complete for the background copy when a resource is created via
     * the CopyStart operation.
     * 
     * @return the completionPercent value.
     */
    public Float completionPercent() {
        return this.completionPercent;
    }

    /**
     * Set the completionPercent property: Percentage complete for the background copy when a resource is created via
     * the CopyStart operation.
     * 
     * @param completionPercent the completionPercent value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withCompletionPercent(Float completionPercent) {
        this.completionPercent = completionPercent;
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
     * @return the DiskProperties object itself.
     */
    public DiskProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a
     * disk or snapshot.
     * 
     * @return the dataAccessAuthMode value.
     */
    public DataAccessAuthMode dataAccessAuthMode() {
        return this.dataAccessAuthMode;
    }

    /**
     * Set the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a
     * disk or snapshot.
     * 
     * @param dataAccessAuthMode the dataAccessAuthMode value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withDataAccessAuthMode(DataAccessAuthMode dataAccessAuthMode) {
        this.dataAccessAuthMode = dataAccessAuthMode;
        return this;
    }

    /**
     * Get the optimizedForFrequentAttach property: Setting this property to true improves reliability and performance
     * of data disks that are frequently (more than 5 times a day) by detached from one virtual machine and attached to
     * another. This property should not be set for disks that are not detached and attached frequently as it causes
     * the disks to not align with the fault domain of the virtual machine.
     * 
     * @return the optimizedForFrequentAttach value.
     */
    public Boolean optimizedForFrequentAttach() {
        return this.optimizedForFrequentAttach;
    }

    /**
     * Set the optimizedForFrequentAttach property: Setting this property to true improves reliability and performance
     * of data disks that are frequently (more than 5 times a day) by detached from one virtual machine and attached to
     * another. This property should not be set for disks that are not detached and attached frequently as it causes
     * the disks to not align with the fault domain of the virtual machine.
     * 
     * @param optimizedForFrequentAttach the optimizedForFrequentAttach value to set.
     * @return the DiskProperties object itself.
     */
    public DiskProperties withOptimizedForFrequentAttach(Boolean optimizedForFrequentAttach) {
        this.optimizedForFrequentAttach = optimizedForFrequentAttach;
        return this;
    }

    /**
     * Get the lastOwnershipUpdateTime property: The UTC time when the ownership state of the disk was last changed
     * i.e., the time the disk was last attached or detached from a VM or the time when the VM to which the disk was
     * attached was deallocated or started.
     * 
     * @return the lastOwnershipUpdateTime value.
     */
    public OffsetDateTime lastOwnershipUpdateTime() {
        return this.lastOwnershipUpdateTime;
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
        if (creationData() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property creationData in model DiskProperties"));
        } else {
            creationData().validate();
        }
        if (encryptionSettingsCollection() != null) {
            encryptionSettingsCollection().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (shareInfo() != null) {
            shareInfo().forEach(e -> e.validate());
        }
        if (propertyUpdatesInProgress() != null) {
            propertyUpdatesInProgress().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiskProperties.class);
}
