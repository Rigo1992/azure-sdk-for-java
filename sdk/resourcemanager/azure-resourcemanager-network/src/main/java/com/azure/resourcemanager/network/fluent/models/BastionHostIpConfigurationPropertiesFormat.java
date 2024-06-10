// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of IP configuration of an Bastion Host.
 */
@Fluent
public final class BastionHostIpConfigurationPropertiesFormat {
    /*
     * Reference of the subnet resource.
     */
    @JsonProperty(value = "subnet", required = true)
    private SubResource subnet;

    /*
     * Reference of the PublicIP resource.
     */
    @JsonProperty(value = "publicIPAddress", required = true)
    private SubResource publicIpAddress;

    /*
     * The provisioning state of the bastion host IP configuration resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Private IP allocation method.
     */
    @JsonProperty(value = "privateIPAllocationMethod")
    private IpAllocationMethod privateIpAllocationMethod;

    /**
     * Creates an instance of BastionHostIpConfigurationPropertiesFormat class.
     */
    public BastionHostIpConfigurationPropertiesFormat() {
    }

    /**
     * Get the subnet property: Reference of the subnet resource.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Reference of the subnet resource.
     * 
     * @param subnet the subnet value to set.
     * @return the BastionHostIpConfigurationPropertiesFormat object itself.
     */
    public BastionHostIpConfigurationPropertiesFormat withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIpAddress property: Reference of the PublicIP resource.
     * 
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: Reference of the PublicIP resource.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the BastionHostIpConfigurationPropertiesFormat object itself.
     */
    public BastionHostIpConfigurationPropertiesFormat withPublicIpAddress(SubResource publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the bastion host IP configuration resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateIpAllocationMethod property: Private IP allocation method.
     * 
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: Private IP allocation method.
     * 
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the BastionHostIpConfigurationPropertiesFormat object itself.
     */
    public BastionHostIpConfigurationPropertiesFormat
        withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property subnet in model BastionHostIpConfigurationPropertiesFormat"));
        }
        if (publicIpAddress() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property publicIpAddress in model BastionHostIpConfigurationPropertiesFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BastionHostIpConfigurationPropertiesFormat.class);
}
