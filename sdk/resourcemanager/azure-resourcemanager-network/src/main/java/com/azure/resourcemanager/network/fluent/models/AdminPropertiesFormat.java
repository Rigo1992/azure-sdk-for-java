// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.AddressPrefixItem;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.SecurityConfigurationRuleAccess;
import com.azure.resourcemanager.network.models.SecurityConfigurationRuleDirection;
import com.azure.resourcemanager.network.models.SecurityConfigurationRuleProtocol;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Security admin rule resource.
 */
@Fluent
public final class AdminPropertiesFormat {
    /*
     * A description for this rule. Restricted to 140 chars.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Network protocol this rule applies to.
     */
    @JsonProperty(value = "protocol", required = true)
    private SecurityConfigurationRuleProtocol protocol;

    /*
     * The CIDR or source IP ranges.
     */
    @JsonProperty(value = "sources")
    private List<AddressPrefixItem> sources;

    /*
     * The destination address prefixes. CIDR or destination IP ranges.
     */
    @JsonProperty(value = "destinations")
    private List<AddressPrefixItem> destinations;

    /*
     * The source port ranges.
     */
    @JsonProperty(value = "sourcePortRanges")
    private List<String> sourcePortRanges;

    /*
     * The destination port ranges.
     */
    @JsonProperty(value = "destinationPortRanges")
    private List<String> destinationPortRanges;

    /*
     * Indicates the access allowed for this particular rule
     */
    @JsonProperty(value = "access", required = true)
    private SecurityConfigurationRuleAccess access;

    /*
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /*
     * Indicates if the traffic matched against the rule in inbound or outbound.
     */
    @JsonProperty(value = "direction", required = true)
    private SecurityConfigurationRuleDirection direction;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Unique identifier for this resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * Creates an instance of AdminPropertiesFormat class.
     */
    public AdminPropertiesFormat() {
    }

    /**
     * Get the description property: A description for this rule. Restricted to 140 chars.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for this rule. Restricted to 140 chars.
     *
     * @param description the description value to set.
     * @return the AdminPropertiesFormat object itself.
     */
    public AdminPropertiesFormat withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the protocol property: Network protocol this rule applies to.
     *
     * @return the protocol value.
     */
    public SecurityConfigurationRuleProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Network protocol this rule applies to.
     *
     * @param protocol the protocol value to set.
     * @return the AdminPropertiesFormat object itself.
     */
    public AdminPropertiesFormat withProtocol(SecurityConfigurationRuleProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the sources property: The CIDR or source IP ranges.
     *
     * @return the sources value.
     */
    public List<AddressPrefixItem> sources() {
        return this.sources;
    }

    /**
     * Set the sources property: The CIDR or source IP ranges.
     *
     * @param sources the sources value to set.
     * @return the AdminPropertiesFormat object itself.
     */
    public AdminPropertiesFormat withSources(List<AddressPrefixItem> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the destinations property: The destination address prefixes. CIDR or destination IP ranges.
     *
     * @return the destinations value.
     */
    public List<AddressPrefixItem> destinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: The destination address prefixes. CIDR or destination IP ranges.
     *
     * @param destinations the destinations value to set.
     * @return the AdminPropertiesFormat object itself.
     */
    public AdminPropertiesFormat withDestinations(List<AddressPrefixItem> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Get the sourcePortRanges property: The source port ranges.
     *
     * @return the sourcePortRanges value.
     */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }

    /**
     * Set the sourcePortRanges property: The source port ranges.
     *
     * @param sourcePortRanges the sourcePortRanges value to set.
     * @return the AdminPropertiesFormat object itself.
     */
    public AdminPropertiesFormat withSourcePortRanges(List<String> sourcePortRanges) {
        this.sourcePortRanges = sourcePortRanges;
        return this;
    }

    /**
     * Get the destinationPortRanges property: The destination port ranges.
     *
     * @return the destinationPortRanges value.
     */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * Set the destinationPortRanges property: The destination port ranges.
     *
     * @param destinationPortRanges the destinationPortRanges value to set.
     * @return the AdminPropertiesFormat object itself.
     */
    public AdminPropertiesFormat withDestinationPortRanges(List<String> destinationPortRanges) {
        this.destinationPortRanges = destinationPortRanges;
        return this;
    }

    /**
     * Get the access property: Indicates the access allowed for this particular rule.
     *
     * @return the access value.
     */
    public SecurityConfigurationRuleAccess access() {
        return this.access;
    }

    /**
     * Set the access property: Indicates the access allowed for this particular rule.
     *
     * @param access the access value to set.
     * @return the AdminPropertiesFormat object itself.
     */
    public AdminPropertiesFormat withAccess(SecurityConfigurationRuleAccess access) {
        this.access = access;
        return this;
    }

    /**
     * Get the priority property: The priority of the rule. The value can be between 1 and 4096. The priority number
     * must be unique for each rule in the collection. The lower the priority number, the higher the priority of the
     * rule.
     *
     * @return the priority value.
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority property: The priority of the rule. The value can be between 1 and 4096. The priority number
     * must be unique for each rule in the collection. The lower the priority number, the higher the priority of the
     * rule.
     *
     * @param priority the priority value to set.
     * @return the AdminPropertiesFormat object itself.
     */
    public AdminPropertiesFormat withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the direction property: Indicates if the traffic matched against the rule in inbound or outbound.
     *
     * @return the direction value.
     */
    public SecurityConfigurationRuleDirection direction() {
        return this.direction;
    }

    /**
     * Set the direction property: Indicates if the traffic matched against the rule in inbound or outbound.
     *
     * @param direction the direction value to set.
     * @return the AdminPropertiesFormat object itself.
     */
    public AdminPropertiesFormat withDirection(SecurityConfigurationRuleDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceGuid property: Unique identifier for this resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (protocol() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property protocol in model AdminPropertiesFormat"));
        }
        if (sources() != null) {
            sources().forEach(e -> e.validate());
        }
        if (destinations() != null) {
            destinations().forEach(e -> e.validate());
        }
        if (access() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property access in model AdminPropertiesFormat"));
        }
        if (direction() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property direction in model AdminPropertiesFormat"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AdminPropertiesFormat.class);
}
