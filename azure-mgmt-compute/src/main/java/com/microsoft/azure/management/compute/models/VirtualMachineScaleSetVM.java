/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Describes a virtual machine scale set virtual machine.
 */
public class VirtualMachineScaleSetVM extends Resource {
    /**
     * Gets the virtual machine instance id.
     */
    private String instanceId;

    /**
     * Gets the virtual machine sku.
     */
    private Sku sku;

    /**
     * Gets or sets the purchase plan when deploying virtual machine from VM
     * Marketplace images.
     */
    private Plan plan;

    /**
     * Gets the virtual machine child extension resources.
     */
    private List<VirtualMachineExtension> resources;

    /**
     * Specifies whether the latest model has been applied to the virtual
     * machine.
     */
    @JsonProperty(value = "properties.latestModelApplied")
    private Boolean latestModelApplied;

    /**
     * Gets the virtual machine instance view.
     */
    @JsonProperty(value = "properties.instanceView")
    private VirtualMachineInstanceView instanceView;

    /**
     * Gets or sets the hardware profile.
     */
    @JsonProperty(value = "properties.hardwareProfile")
    private HardwareProfile hardwareProfile;

    /**
     * Gets or sets the storage profile.
     */
    @JsonProperty(value = "properties.storageProfile")
    private StorageProfile storageProfile;

    /**
     * Gets or sets the OS profile.
     */
    @JsonProperty(value = "properties.osProfile")
    private OSProfile osProfile;

    /**
     * Gets or sets the network profile.
     */
    @JsonProperty(value = "properties.networkProfile")
    private NetworkProfile networkProfile;

    /**
     * Gets or sets the diagnostics profile.
     */
    @JsonProperty(value = "properties.diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /**
     * Gets or sets the reference Id of the availailbity set to which this
     * virtual machine belongs.
     */
    @JsonProperty(value = "properties.availabilitySet")
    private SubResource availabilitySet;

    /**
     * Gets or sets the provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets or sets the license type, which is for bring your own license
     * scenario.
     */
    @JsonProperty(value = "properties.licenseType")
    private String licenseType;

    /**
     * Get the instanceId value.
     *
     * @return the instanceId value
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku getSku() {
        return this.sku;
    }

    /**
     * Get the plan value.
     *
     * @return the plan value
     */
    public Plan getPlan() {
        return this.plan;
    }

    /**
     * Set the plan value.
     *
     * @param plan the plan value to set
     */
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    /**
     * Get the resources value.
     *
     * @return the resources value
     */
    public List<VirtualMachineExtension> getResources() {
        return this.resources;
    }

    /**
     * Get the latestModelApplied value.
     *
     * @return the latestModelApplied value
     */
    public Boolean getLatestModelApplied() {
        return this.latestModelApplied;
    }

    /**
     * Get the instanceView value.
     *
     * @return the instanceView value
     */
    public VirtualMachineInstanceView getInstanceView() {
        return this.instanceView;
    }

    /**
     * Get the hardwareProfile value.
     *
     * @return the hardwareProfile value
     */
    public HardwareProfile getHardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile value.
     *
     * @param hardwareProfile the hardwareProfile value to set
     */
    public void setHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
    }

    /**
     * Get the storageProfile value.
     *
     * @return the storageProfile value
     */
    public StorageProfile getStorageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile value.
     *
     * @param storageProfile the storageProfile value to set
     */
    public void setStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
    }

    /**
     * Get the osProfile value.
     *
     * @return the osProfile value
     */
    public OSProfile getOsProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile value.
     *
     * @param osProfile the osProfile value to set
     */
    public void setOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
    }

    /**
     * Get the networkProfile value.
     *
     * @return the networkProfile value
     */
    public NetworkProfile getNetworkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile value.
     *
     * @param networkProfile the networkProfile value to set
     */
    public void setNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
    }

    /**
     * Get the diagnosticsProfile value.
     *
     * @return the diagnosticsProfile value
     */
    public DiagnosticsProfile getDiagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile value.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set
     */
    public void setDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
    }

    /**
     * Get the availabilitySet value.
     *
     * @return the availabilitySet value
     */
    public SubResource getAvailabilitySet() {
        return this.availabilitySet;
    }

    /**
     * Set the availabilitySet value.
     *
     * @param availabilitySet the availabilitySet value to set
     */
    public void setAvailabilitySet(SubResource availabilitySet) {
        this.availabilitySet = availabilitySet;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * Get the licenseType value.
     *
     * @return the licenseType value
     */
    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType value.
     *
     * @param licenseType the licenseType value to set
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

}
