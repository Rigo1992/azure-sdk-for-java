// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.LoadBalancerBackendAddressAdminState;
import com.azure.resourcemanager.network.models.NatRulePortMapping;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the load balancer backend addresses. */
@Fluent
public final class LoadBalancerBackendAddressPropertiesFormat {
    /*
     * Reference to an existing virtual network.
     */
    @JsonProperty(value = "virtualNetwork")
    private SubResource virtualNetwork;

    /*
     * Reference to an existing subnet.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /*
     * IP Address belonging to the referenced virtual network.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * Reference to IP address defined in network interfaces.
     */
    @JsonProperty(value = "networkInterfaceIPConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource networkInterfaceIpConfiguration;

    /*
     * Reference to the frontend ip address configuration defined in regional loadbalancer.
     */
    @JsonProperty(value = "loadBalancerFrontendIPConfiguration")
    private SubResource loadBalancerFrontendIpConfiguration;

    /*
     * Collection of inbound NAT rule port mappings.
     */
    @JsonProperty(value = "inboundNatRulesPortMapping", access = JsonProperty.Access.WRITE_ONLY)
    private List<NatRulePortMapping> inboundNatRulesPortMapping;

    /*
     * A list of administrative states which once set can override health probe so that Load Balancer will always
     * forward new connections to backend, or deny new connections and reset existing connections.
     */
    @JsonProperty(value = "adminState")
    private LoadBalancerBackendAddressAdminState adminState;

    /**
     * Get the virtualNetwork property: Reference to an existing virtual network.
     *
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork property: Reference to an existing virtual network.
     *
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the LoadBalancerBackendAddressPropertiesFormat object itself.
     */
    public LoadBalancerBackendAddressPropertiesFormat withVirtualNetwork(SubResource virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Get the subnet property: Reference to an existing subnet.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference to an existing subnet.
     *
     * @param subnet the subnet value to set.
     * @return the LoadBalancerBackendAddressPropertiesFormat object itself.
     */
    public LoadBalancerBackendAddressPropertiesFormat withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the ipAddress property: IP Address belonging to the referenced virtual network.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: IP Address belonging to the referenced virtual network.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the LoadBalancerBackendAddressPropertiesFormat object itself.
     */
    public LoadBalancerBackendAddressPropertiesFormat withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the networkInterfaceIpConfiguration property: Reference to IP address defined in network interfaces.
     *
     * @return the networkInterfaceIpConfiguration value.
     */
    public SubResource networkInterfaceIpConfiguration() {
        return this.networkInterfaceIpConfiguration;
    }

    /**
     * Get the loadBalancerFrontendIpConfiguration property: Reference to the frontend ip address configuration defined
     * in regional loadbalancer.
     *
     * @return the loadBalancerFrontendIpConfiguration value.
     */
    public SubResource loadBalancerFrontendIpConfiguration() {
        return this.loadBalancerFrontendIpConfiguration;
    }

    /**
     * Set the loadBalancerFrontendIpConfiguration property: Reference to the frontend ip address configuration defined
     * in regional loadbalancer.
     *
     * @param loadBalancerFrontendIpConfiguration the loadBalancerFrontendIpConfiguration value to set.
     * @return the LoadBalancerBackendAddressPropertiesFormat object itself.
     */
    public LoadBalancerBackendAddressPropertiesFormat withLoadBalancerFrontendIpConfiguration(
        SubResource loadBalancerFrontendIpConfiguration) {
        this.loadBalancerFrontendIpConfiguration = loadBalancerFrontendIpConfiguration;
        return this;
    }

    /**
     * Get the inboundNatRulesPortMapping property: Collection of inbound NAT rule port mappings.
     *
     * @return the inboundNatRulesPortMapping value.
     */
    public List<NatRulePortMapping> inboundNatRulesPortMapping() {
        return this.inboundNatRulesPortMapping;
    }

    /**
     * Get the adminState property: A list of administrative states which once set can override health probe so that
     * Load Balancer will always forward new connections to backend, or deny new connections and reset existing
     * connections.
     *
     * @return the adminState value.
     */
    public LoadBalancerBackendAddressAdminState adminState() {
        return this.adminState;
    }

    /**
     * Set the adminState property: A list of administrative states which once set can override health probe so that
     * Load Balancer will always forward new connections to backend, or deny new connections and reset existing
     * connections.
     *
     * @param adminState the adminState value to set.
     * @return the LoadBalancerBackendAddressPropertiesFormat object itself.
     */
    public LoadBalancerBackendAddressPropertiesFormat withAdminState(LoadBalancerBackendAddressAdminState adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inboundNatRulesPortMapping() != null) {
            inboundNatRulesPortMapping().forEach(e -> e.validate());
        }
    }
}
