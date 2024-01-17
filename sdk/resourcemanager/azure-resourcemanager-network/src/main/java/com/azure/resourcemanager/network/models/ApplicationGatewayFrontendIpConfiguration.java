// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayFrontendIpConfigurationPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Frontend IP configuration of an application gateway.
 */
@Fluent
public final class ApplicationGatewayFrontendIpConfiguration extends SubResource {
    /*
     * Properties of the application gateway frontend IP configuration.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayFrontendIpConfigurationPropertiesFormat innerProperties;

    /*
     * Name of the frontend IP configuration that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Creates an instance of ApplicationGatewayFrontendIpConfiguration class.
     */
    public ApplicationGatewayFrontendIpConfiguration() {
    }

    /**
     * Get the innerProperties property: Properties of the application gateway frontend IP configuration.
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewayFrontendIpConfigurationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the frontend IP configuration that is unique within an Application Gateway.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the frontend IP configuration that is unique within an Application Gateway.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewayFrontendIpConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the privateIpAddress property: PrivateIPAddress of the network interface IP Configuration.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddress();
    }

    /**
     * Set the privateIpAddress property: PrivateIPAddress of the network interface IP Configuration.
     * 
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withPrivateIpAddress(String privateIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayFrontendIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAllocationMethod();
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration
        withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayFrontendIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPrivateIpAllocationMethod(privateIpAllocationMethod);
        return this;
    }

    /**
     * Get the subnet property: Reference to the subnet resource.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: Reference to the subnet resource.
     * 
     * @param subnet the subnet value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withSubnet(SubResource subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayFrontendIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the publicIpAddress property: Reference to the PublicIP resource.
     * 
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddress();
    }

    /**
     * Set the publicIpAddress property: Reference to the PublicIP resource.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration withPublicIpAddress(SubResource publicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayFrontendIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * Get the privateLinkConfiguration property: Reference to the application gateway private link configuration.
     * 
     * @return the privateLinkConfiguration value.
     */
    public SubResource privateLinkConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkConfiguration();
    }

    /**
     * Set the privateLinkConfiguration property: Reference to the application gateway private link configuration.
     * 
     * @param privateLinkConfiguration the privateLinkConfiguration value to set.
     * @return the ApplicationGatewayFrontendIpConfiguration object itself.
     */
    public ApplicationGatewayFrontendIpConfiguration
        withPrivateLinkConfiguration(SubResource privateLinkConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayFrontendIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPrivateLinkConfiguration(privateLinkConfiguration);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the frontend IP configuration resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
