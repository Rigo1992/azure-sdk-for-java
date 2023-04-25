// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventhubs.models.DefaultAction;
import com.azure.resourcemanager.eventhubs.models.NWRuleSetIpRules;
import com.azure.resourcemanager.eventhubs.models.NWRuleSetVirtualNetworkRules;
import com.azure.resourcemanager.eventhubs.models.PublicNetworkAccessFlag;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * NetworkRuleSet properties.
 */
@Fluent
public final class NetworkRuleSetProperties {
    /*
     * Value that indicates whether Trusted Service Access is Enabled or not.
     */
    @JsonProperty(value = "trustedServiceAccessEnabled")
    private Boolean trustedServiceAccessEnabled;

    /*
     * Default Action for Network Rule Set
     */
    @JsonProperty(value = "defaultAction")
    private DefaultAction defaultAction;

    /*
     * List VirtualNetwork Rules
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<NWRuleSetVirtualNetworkRules> virtualNetworkRules;

    /*
     * List of IpRules
     */
    @JsonProperty(value = "ipRules")
    private List<NWRuleSetIpRules> ipRules;

    /*
     * This determines if traffic is allowed over public network. By default it is enabled. If value is
     * SecuredByPerimeter then Inbound and Outbound communication is controlled by the network security perimeter and
     * profile's access rules.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccessFlag publicNetworkAccess;

    /**
     * Creates an instance of NetworkRuleSetProperties class.
     */
    public NetworkRuleSetProperties() {
    }

    /**
     * Get the trustedServiceAccessEnabled property: Value that indicates whether Trusted Service Access is Enabled or
     * not.
     *
     * @return the trustedServiceAccessEnabled value.
     */
    public Boolean trustedServiceAccessEnabled() {
        return this.trustedServiceAccessEnabled;
    }

    /**
     * Set the trustedServiceAccessEnabled property: Value that indicates whether Trusted Service Access is Enabled or
     * not.
     *
     * @param trustedServiceAccessEnabled the trustedServiceAccessEnabled value to set.
     * @return the NetworkRuleSetProperties object itself.
     */
    public NetworkRuleSetProperties withTrustedServiceAccessEnabled(Boolean trustedServiceAccessEnabled) {
        this.trustedServiceAccessEnabled = trustedServiceAccessEnabled;
        return this;
    }

    /**
     * Get the defaultAction property: Default Action for Network Rule Set.
     *
     * @return the defaultAction value.
     */
    public DefaultAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: Default Action for Network Rule Set.
     *
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSetProperties object itself.
     */
    public NetworkRuleSetProperties withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: List VirtualNetwork Rules.
     *
     * @return the virtualNetworkRules value.
     */
    public List<NWRuleSetVirtualNetworkRules> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: List VirtualNetwork Rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the NetworkRuleSetProperties object itself.
     */
    public NetworkRuleSetProperties withVirtualNetworkRules(List<NWRuleSetVirtualNetworkRules> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the ipRules property: List of IpRules.
     *
     * @return the ipRules value.
     */
    public List<NWRuleSetIpRules> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IpRules.
     *
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSetProperties object itself.
     */
    public NetworkRuleSetProperties withIpRules(List<NWRuleSetIpRules> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled. If value is SecuredByPerimeter then Inbound and Outbound communication is controlled by the network
     * security perimeter and profile's access rules.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessFlag publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled. If value is SecuredByPerimeter then Inbound and Outbound communication is controlled by the network
     * security perimeter and profile's access rules.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NetworkRuleSetProperties object itself.
     */
    public NetworkRuleSetProperties withPublicNetworkAccess(PublicNetworkAccessFlag publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
    }
}
