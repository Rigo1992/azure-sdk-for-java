// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * HybridAKSNetworkSpec defines the desired state of HybridAKSNetwork.
 */
@Fluent
public final class VirtualNetworkProperties {
    /*
     * The infraVnetProfile property.
     */
    @JsonProperty(value = "infraVnetProfile")
    private VirtualNetworkPropertiesInfraVnetProfile infraVnetProfile;

    /*
     * Virtual IP Pool for Kubernetes
     */
    @JsonProperty(value = "vipPool")
    private List<VirtualNetworkPropertiesVipPoolItem> vipPool;

    /*
     * IP Pool for Virtual Machines
     */
    @JsonProperty(value = "vmipPool")
    private List<VirtualNetworkPropertiesVmipPoolItem> vmipPool;

    /*
     * Address of the DHCP servers associated with the network
     */
    @JsonProperty(value = "dhcpServers")
    private List<String> dhcpServers;

    /*
     * Address of the DNS servers associated with the network
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /*
     * Address of the Gateway associated with the network
     */
    @JsonProperty(value = "gateway")
    private String gateway;

    /*
     * IP Address Prefix of the network
     */
    @JsonProperty(value = "ipAddressPrefix")
    private String ipAddressPrefix;

    /*
     * VLAN Id used by the network
     */
    @JsonProperty(value = "vlanID")
    private Integer vlanId;

    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * HybridAKSNetworkStatus defines the observed state of HybridAKSNetwork
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkPropertiesStatus status;

    /**
     * Creates an instance of VirtualNetworkProperties class.
     */
    public VirtualNetworkProperties() {
    }

    /**
     * Get the infraVnetProfile property: The infraVnetProfile property.
     * 
     * @return the infraVnetProfile value.
     */
    public VirtualNetworkPropertiesInfraVnetProfile infraVnetProfile() {
        return this.infraVnetProfile;
    }

    /**
     * Set the infraVnetProfile property: The infraVnetProfile property.
     * 
     * @param infraVnetProfile the infraVnetProfile value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withInfraVnetProfile(VirtualNetworkPropertiesInfraVnetProfile infraVnetProfile) {
        this.infraVnetProfile = infraVnetProfile;
        return this;
    }

    /**
     * Get the vipPool property: Virtual IP Pool for Kubernetes.
     * 
     * @return the vipPool value.
     */
    public List<VirtualNetworkPropertiesVipPoolItem> vipPool() {
        return this.vipPool;
    }

    /**
     * Set the vipPool property: Virtual IP Pool for Kubernetes.
     * 
     * @param vipPool the vipPool value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withVipPool(List<VirtualNetworkPropertiesVipPoolItem> vipPool) {
        this.vipPool = vipPool;
        return this;
    }

    /**
     * Get the vmipPool property: IP Pool for Virtual Machines.
     * 
     * @return the vmipPool value.
     */
    public List<VirtualNetworkPropertiesVmipPoolItem> vmipPool() {
        return this.vmipPool;
    }

    /**
     * Set the vmipPool property: IP Pool for Virtual Machines.
     * 
     * @param vmipPool the vmipPool value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withVmipPool(List<VirtualNetworkPropertiesVmipPoolItem> vmipPool) {
        this.vmipPool = vmipPool;
        return this;
    }

    /**
     * Get the dhcpServers property: Address of the DHCP servers associated with the network.
     * 
     * @return the dhcpServers value.
     */
    public List<String> dhcpServers() {
        return this.dhcpServers;
    }

    /**
     * Set the dhcpServers property: Address of the DHCP servers associated with the network.
     * 
     * @param dhcpServers the dhcpServers value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withDhcpServers(List<String> dhcpServers) {
        this.dhcpServers = dhcpServers;
        return this;
    }

    /**
     * Get the dnsServers property: Address of the DNS servers associated with the network.
     * 
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: Address of the DNS servers associated with the network.
     * 
     * @param dnsServers the dnsServers value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get the gateway property: Address of the Gateway associated with the network.
     * 
     * @return the gateway value.
     */
    public String gateway() {
        return this.gateway;
    }

    /**
     * Set the gateway property: Address of the Gateway associated with the network.
     * 
     * @param gateway the gateway value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * Get the ipAddressPrefix property: IP Address Prefix of the network.
     * 
     * @return the ipAddressPrefix value.
     */
    public String ipAddressPrefix() {
        return this.ipAddressPrefix;
    }

    /**
     * Set the ipAddressPrefix property: IP Address Prefix of the network.
     * 
     * @param ipAddressPrefix the ipAddressPrefix value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withIpAddressPrefix(String ipAddressPrefix) {
        this.ipAddressPrefix = ipAddressPrefix;
        return this;
    }

    /**
     * Get the vlanId property: VLAN Id used by the network.
     * 
     * @return the vlanId value.
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId property: VLAN Id used by the network.
     * 
     * @param vlanId the vlanId value to set.
     * @return the VirtualNetworkProperties object itself.
     */
    public VirtualNetworkProperties withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: HybridAKSNetworkStatus defines the observed state of HybridAKSNetwork.
     * 
     * @return the status value.
     */
    public VirtualNetworkPropertiesStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (infraVnetProfile() != null) {
            infraVnetProfile().validate();
        }
        if (vipPool() != null) {
            vipPool().forEach(e -> e.validate());
        }
        if (vmipPool() != null) {
            vmipPool().forEach(e -> e.validate());
        }
        if (status() != null) {
            status().validate();
        }
    }
}
