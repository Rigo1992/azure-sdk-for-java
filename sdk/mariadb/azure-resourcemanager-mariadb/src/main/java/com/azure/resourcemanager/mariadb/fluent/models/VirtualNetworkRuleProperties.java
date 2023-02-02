// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mariadb.models.VirtualNetworkRuleState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a virtual network rule. */
@Fluent
public final class VirtualNetworkRuleProperties {
    /*
     * The ARM resource id of the virtual network subnet.
     */
    @JsonProperty(value = "virtualNetworkSubnetId", required = true)
    private String virtualNetworkSubnetId;

    /*
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     */
    @JsonProperty(value = "ignoreMissingVnetServiceEndpoint")
    private Boolean ignoreMissingVnetServiceEndpoint;

    /*
     * Virtual Network Rule State
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkRuleState state;

    /** Creates an instance of VirtualNetworkRuleProperties class. */
    public VirtualNetworkRuleProperties() {
    }

    /**
     * Get the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet.
     *
     * @return the virtualNetworkSubnetId value.
     */
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    /**
     * Set the virtualNetworkSubnetId property: The ARM resource id of the virtual network subnet.
     *
     * @param virtualNetworkSubnetId the virtualNetworkSubnetId value to set.
     * @return the VirtualNetworkRuleProperties object itself.
     */
    public VirtualNetworkRuleProperties withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
        return this;
    }

    /**
     * Get the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network has vnet
     * service endpoint enabled.
     *
     * @return the ignoreMissingVnetServiceEndpoint value.
     */
    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint;
    }

    /**
     * Set the ignoreMissingVnetServiceEndpoint property: Create firewall rule before the virtual network has vnet
     * service endpoint enabled.
     *
     * @param ignoreMissingVnetServiceEndpoint the ignoreMissingVnetServiceEndpoint value to set.
     * @return the VirtualNetworkRuleProperties object itself.
     */
    public VirtualNetworkRuleProperties withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        return this;
    }

    /**
     * Get the state property: Virtual Network Rule State.
     *
     * @return the state value.
     */
    public VirtualNetworkRuleState state() {
        return this.state;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkSubnetId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property virtualNetworkSubnetId in model VirtualNetworkRuleProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkRuleProperties.class);
}
