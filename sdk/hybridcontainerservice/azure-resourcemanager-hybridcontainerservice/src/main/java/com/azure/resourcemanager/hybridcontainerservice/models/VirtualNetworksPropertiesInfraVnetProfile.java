// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualNetworksPropertiesInfraVnetProfile model. */
@Fluent
public final class VirtualNetworksPropertiesInfraVnetProfile {
    /*
     * Infra network profile for HCI platform
     */
    @JsonProperty(value = "hci")
    private VirtualNetworksPropertiesInfraVnetProfileHci hci;

    /*
     * Infra network profile for the NetworkCloud platform
     */
    @JsonProperty(value = "networkCloud")
    private VirtualNetworksPropertiesInfraVnetProfileNetworkCloud networkCloud;

    /*
     * Infra network profile for VMware platform
     */
    @JsonProperty(value = "vmware")
    private VirtualNetworksPropertiesInfraVnetProfileVmware vmware;

    /** Creates an instance of VirtualNetworksPropertiesInfraVnetProfile class. */
    public VirtualNetworksPropertiesInfraVnetProfile() {
    }

    /**
     * Get the hci property: Infra network profile for HCI platform.
     *
     * @return the hci value.
     */
    public VirtualNetworksPropertiesInfraVnetProfileHci hci() {
        return this.hci;
    }

    /**
     * Set the hci property: Infra network profile for HCI platform.
     *
     * @param hci the hci value to set.
     * @return the VirtualNetworksPropertiesInfraVnetProfile object itself.
     */
    public VirtualNetworksPropertiesInfraVnetProfile withHci(VirtualNetworksPropertiesInfraVnetProfileHci hci) {
        this.hci = hci;
        return this;
    }

    /**
     * Get the networkCloud property: Infra network profile for the NetworkCloud platform.
     *
     * @return the networkCloud value.
     */
    public VirtualNetworksPropertiesInfraVnetProfileNetworkCloud networkCloud() {
        return this.networkCloud;
    }

    /**
     * Set the networkCloud property: Infra network profile for the NetworkCloud platform.
     *
     * @param networkCloud the networkCloud value to set.
     * @return the VirtualNetworksPropertiesInfraVnetProfile object itself.
     */
    public VirtualNetworksPropertiesInfraVnetProfile withNetworkCloud(
        VirtualNetworksPropertiesInfraVnetProfileNetworkCloud networkCloud) {
        this.networkCloud = networkCloud;
        return this;
    }

    /**
     * Get the vmware property: Infra network profile for VMware platform.
     *
     * @return the vmware value.
     */
    public VirtualNetworksPropertiesInfraVnetProfileVmware vmware() {
        return this.vmware;
    }

    /**
     * Set the vmware property: Infra network profile for VMware platform.
     *
     * @param vmware the vmware value to set.
     * @return the VirtualNetworksPropertiesInfraVnetProfile object itself.
     */
    public VirtualNetworksPropertiesInfraVnetProfile withVmware(
        VirtualNetworksPropertiesInfraVnetProfileVmware vmware) {
        this.vmware = vmware;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hci() != null) {
            hci().validate();
        }
        if (networkCloud() != null) {
            networkCloud().validate();
        }
        if (vmware() != null) {
            vmware().validate();
        }
    }
}
