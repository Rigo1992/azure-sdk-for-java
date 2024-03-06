// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the Inbound Security Rules resource.
 */
@Fluent
public final class InboundSecurityRules {
    /*
     * Protocol. This should be either TCP or UDP.
     */
    @JsonProperty(value = "protocol")
    private InboundSecurityRulesProtocol protocol;

    /*
     * The CIDR or source IP range. Only /30, /31 and /32 Ip ranges are allowed.
     */
    @JsonProperty(value = "sourceAddressPrefix")
    private String sourceAddressPrefix;

    /*
     * NVA port ranges to be opened up. One needs to provide specific ports.
     */
    @JsonProperty(value = "destinationPortRange")
    private Integer destinationPortRange;

    /**
     * Creates an instance of InboundSecurityRules class.
     */
    public InboundSecurityRules() {
    }

    /**
     * Get the protocol property: Protocol. This should be either TCP or UDP.
     * 
     * @return the protocol value.
     */
    public InboundSecurityRulesProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol. This should be either TCP or UDP.
     * 
     * @param protocol the protocol value to set.
     * @return the InboundSecurityRules object itself.
     */
    public InboundSecurityRules withProtocol(InboundSecurityRulesProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the sourceAddressPrefix property: The CIDR or source IP range. Only /30, /31 and /32 Ip ranges are allowed.
     * 
     * @return the sourceAddressPrefix value.
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the sourceAddressPrefix property: The CIDR or source IP range. Only /30, /31 and /32 Ip ranges are allowed.
     * 
     * @param sourceAddressPrefix the sourceAddressPrefix value to set.
     * @return the InboundSecurityRules object itself.
     */
    public InboundSecurityRules withSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
        return this;
    }

    /**
     * Get the destinationPortRange property: NVA port ranges to be opened up. One needs to provide specific ports.
     * 
     * @return the destinationPortRange value.
     */
    public Integer destinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * Set the destinationPortRange property: NVA port ranges to be opened up. One needs to provide specific ports.
     * 
     * @param destinationPortRange the destinationPortRange value to set.
     * @return the InboundSecurityRules object itself.
     */
    public InboundSecurityRules withDestinationPortRange(Integer destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
