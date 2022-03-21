// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.models.AutomaticRepairsPolicy;
import com.azure.resourcemanager.compute.models.OrchestrationMode;
import com.azure.resourcemanager.compute.models.ScaleInPolicy;
import com.azure.resourcemanager.compute.models.SpotRestorePolicy;
import com.azure.resourcemanager.compute.models.UpgradePolicy;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetVMProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Describes the properties of a Virtual Machine Scale Set. */
@Fluent
public final class VirtualMachineScaleSetProperties {
    /*
     * The upgrade policy.
     */
    @JsonProperty(value = "upgradePolicy")
    private UpgradePolicy upgradePolicy;

    /*
     * Policy for automatic repairs.
     */
    @JsonProperty(value = "automaticRepairsPolicy")
    private AutomaticRepairsPolicy automaticRepairsPolicy;

    /*
     * The virtual machine profile.
     */
    @JsonProperty(value = "virtualMachineProfile")
    private VirtualMachineScaleSetVMProfile virtualMachineProfile;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Specifies whether the Virtual Machine Scale Set should be
     * overprovisioned.
     */
    @JsonProperty(value = "overprovision")
    private Boolean overprovision;

    /*
     * When Overprovision is enabled, extensions are launched only on the
     * requested number of VMs which are finally kept. This property will hence
     * ensure that the extensions do not run on the extra overprovisioned VMs.
     */
    @JsonProperty(value = "doNotRunExtensionsOnOverprovisionedVMs")
    private Boolean doNotRunExtensionsOnOverprovisionedVMs;

    /*
     * Specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     */
    @JsonProperty(value = "uniqueId", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueId;

    /*
     * When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may
     * be modified to false. However, if singlePlacementGroup is false, it may
     * not be modified to true.
     */
    @JsonProperty(value = "singlePlacementGroup")
    private Boolean singlePlacementGroup;

    /*
     * Whether to force strictly even Virtual Machine distribution cross
     * x-zones in case there is zone outage. zoneBalance property can only be
     * set if the zones property of the scale set contains more than one zone.
     * If there are no zones or only one zone specified, then zoneBalance
     * property should not be set.
     */
    @JsonProperty(value = "zoneBalance")
    private Boolean zoneBalance;

    /*
     * Fault Domain count for each placement group.
     */
    @JsonProperty(value = "platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /*
     * Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. <br><br>Minimum
     * api-version: 2018-04-01.
     */
    @JsonProperty(value = "proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /*
     * Specifies information about the dedicated host group that the virtual
     * machine scale set resides in. <br><br>Minimum api-version: 2020-06-01.
     */
    @JsonProperty(value = "hostGroup")
    private SubResource hostGroup;

    /*
     * Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the
     * Virtual Machines have the capability to support attaching managed data
     * disks with UltraSSD_LRS storage account type.
     */
    @JsonProperty(value = "additionalCapabilities")
    private AdditionalCapabilities additionalCapabilities;

    /*
     * Specifies the policies applied when scaling in Virtual Machines in the
     * Virtual Machine Scale Set.
     */
    @JsonProperty(value = "scaleInPolicy")
    private ScaleInPolicy scaleInPolicy;

    /*
     * Specifies the orchestration mode for the virtual machine scale set.
     */
    @JsonProperty(value = "orchestrationMode")
    private OrchestrationMode orchestrationMode;

    /*
     * Specifies the Spot Restore properties for the virtual machine scale set.
     */
    @JsonProperty(value = "spotRestorePolicy")
    private SpotRestorePolicy spotRestorePolicy;

    /*
     * Specifies the time at which the Virtual Machine Scale Set resource was
     * created.<br><br>Minimum api-version: 2021-11-01.
     */
    @JsonProperty(value = "timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /**
     * Get the upgradePolicy property: The upgrade policy.
     *
     * @return the upgradePolicy value.
     */
    public UpgradePolicy upgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * Set the upgradePolicy property: The upgrade policy.
     *
     * @param upgradePolicy the upgradePolicy value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withUpgradePolicy(UpgradePolicy upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }

    /**
     * Get the automaticRepairsPolicy property: Policy for automatic repairs.
     *
     * @return the automaticRepairsPolicy value.
     */
    public AutomaticRepairsPolicy automaticRepairsPolicy() {
        return this.automaticRepairsPolicy;
    }

    /**
     * Set the automaticRepairsPolicy property: Policy for automatic repairs.
     *
     * @param automaticRepairsPolicy the automaticRepairsPolicy value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withAutomaticRepairsPolicy(AutomaticRepairsPolicy automaticRepairsPolicy) {
        this.automaticRepairsPolicy = automaticRepairsPolicy;
        return this;
    }

    /**
     * Get the virtualMachineProfile property: The virtual machine profile.
     *
     * @return the virtualMachineProfile value.
     */
    public VirtualMachineScaleSetVMProfile virtualMachineProfile() {
        return this.virtualMachineProfile;
    }

    /**
     * Set the virtualMachineProfile property: The virtual machine profile.
     *
     * @param virtualMachineProfile the virtualMachineProfile value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withVirtualMachineProfile(
        VirtualMachineScaleSetVMProfile virtualMachineProfile) {
        this.virtualMachineProfile = virtualMachineProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the overprovision property: Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @return the overprovision value.
     */
    public Boolean overprovision() {
        return this.overprovision;
    }

    /**
     * Set the overprovision property: Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @param overprovision the overprovision value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withOverprovision(Boolean overprovision) {
        this.overprovision = overprovision;
        return this;
    }

    /**
     * Get the doNotRunExtensionsOnOverprovisionedVMs property: When Overprovision is enabled, extensions are launched
     * only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions
     * do not run on the extra overprovisioned VMs.
     *
     * @return the doNotRunExtensionsOnOverprovisionedVMs value.
     */
    public Boolean doNotRunExtensionsOnOverprovisionedVMs() {
        return this.doNotRunExtensionsOnOverprovisionedVMs;
    }

    /**
     * Set the doNotRunExtensionsOnOverprovisionedVMs property: When Overprovision is enabled, extensions are launched
     * only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions
     * do not run on the extra overprovisioned VMs.
     *
     * @param doNotRunExtensionsOnOverprovisionedVMs the doNotRunExtensionsOnOverprovisionedVMs value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withDoNotRunExtensionsOnOverprovisionedVMs(
        Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        this.doNotRunExtensionsOnOverprovisionedVMs = doNotRunExtensionsOnOverprovisionedVMs;
        return this;
    }

    /**
     * Get the uniqueId property: Specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     *
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Get the singlePlacementGroup property: When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if
     * singlePlacementGroup is false, it may not be modified to true.
     *
     * @return the singlePlacementGroup value.
     */
    public Boolean singlePlacementGroup() {
        return this.singlePlacementGroup;
    }

    /**
     * Set the singlePlacementGroup property: When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if
     * singlePlacementGroup is false, it may not be modified to true.
     *
     * @param singlePlacementGroup the singlePlacementGroup value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withSinglePlacementGroup(Boolean singlePlacementGroup) {
        this.singlePlacementGroup = singlePlacementGroup;
        return this;
    }

    /**
     * Get the zoneBalance property: Whether to force strictly even Virtual Machine distribution cross x-zones in case
     * there is zone outage. zoneBalance property can only be set if the zones property of the scale set contains more
     * than one zone. If there are no zones or only one zone specified, then zoneBalance property should not be set.
     *
     * @return the zoneBalance value.
     */
    public Boolean zoneBalance() {
        return this.zoneBalance;
    }

    /**
     * Set the zoneBalance property: Whether to force strictly even Virtual Machine distribution cross x-zones in case
     * there is zone outage. zoneBalance property can only be set if the zones property of the scale set contains more
     * than one zone. If there are no zones or only one zone specified, then zoneBalance property should not be set.
     *
     * @param zoneBalance the zoneBalance value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withZoneBalance(Boolean zoneBalance) {
        this.zoneBalance = zoneBalance;
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Fault Domain count for each placement group.
     *
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount property: Fault Domain count for each placement group.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    public SubResource proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Get the hostGroup property: Specifies information about the dedicated host group that the virtual machine scale
     * set resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @return the hostGroup value.
     */
    public SubResource hostGroup() {
        return this.hostGroup;
    }

    /**
     * Set the hostGroup property: Specifies information about the dedicated host group that the virtual machine scale
     * set resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @param hostGroup the hostGroup value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withHostGroup(SubResource hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }

    /**
     * Get the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to
     * support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @return the additionalCapabilities value.
     */
    public AdditionalCapabilities additionalCapabilities() {
        return this.additionalCapabilities;
    }

    /**
     * Set the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to
     * support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        this.additionalCapabilities = additionalCapabilities;
        return this;
    }

    /**
     * Get the scaleInPolicy property: Specifies the policies applied when scaling in Virtual Machines in the Virtual
     * Machine Scale Set.
     *
     * @return the scaleInPolicy value.
     */
    public ScaleInPolicy scaleInPolicy() {
        return this.scaleInPolicy;
    }

    /**
     * Set the scaleInPolicy property: Specifies the policies applied when scaling in Virtual Machines in the Virtual
     * Machine Scale Set.
     *
     * @param scaleInPolicy the scaleInPolicy value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withScaleInPolicy(ScaleInPolicy scaleInPolicy) {
        this.scaleInPolicy = scaleInPolicy;
        return this;
    }

    /**
     * Get the orchestrationMode property: Specifies the orchestration mode for the virtual machine scale set.
     *
     * @return the orchestrationMode value.
     */
    public OrchestrationMode orchestrationMode() {
        return this.orchestrationMode;
    }

    /**
     * Set the orchestrationMode property: Specifies the orchestration mode for the virtual machine scale set.
     *
     * @param orchestrationMode the orchestrationMode value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withOrchestrationMode(OrchestrationMode orchestrationMode) {
        this.orchestrationMode = orchestrationMode;
        return this;
    }

    /**
     * Get the spotRestorePolicy property: Specifies the Spot Restore properties for the virtual machine scale set.
     *
     * @return the spotRestorePolicy value.
     */
    public SpotRestorePolicy spotRestorePolicy() {
        return this.spotRestorePolicy;
    }

    /**
     * Set the spotRestorePolicy property: Specifies the Spot Restore properties for the virtual machine scale set.
     *
     * @param spotRestorePolicy the spotRestorePolicy value to set.
     * @return the VirtualMachineScaleSetProperties object itself.
     */
    public VirtualMachineScaleSetProperties withSpotRestorePolicy(SpotRestorePolicy spotRestorePolicy) {
        this.spotRestorePolicy = spotRestorePolicy;
        return this;
    }

    /**
     * Get the timeCreated property: Specifies the time at which the Virtual Machine Scale Set resource was
     * created.&lt;br&gt;&lt;br&gt;Minimum api-version: 2021-11-01.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (upgradePolicy() != null) {
            upgradePolicy().validate();
        }
        if (automaticRepairsPolicy() != null) {
            automaticRepairsPolicy().validate();
        }
        if (virtualMachineProfile() != null) {
            virtualMachineProfile().validate();
        }
        if (additionalCapabilities() != null) {
            additionalCapabilities().validate();
        }
        if (scaleInPolicy() != null) {
            scaleInPolicy().validate();
        }
        if (spotRestorePolicy() != null) {
            spotRestorePolicy().validate();
        }
    }
}
