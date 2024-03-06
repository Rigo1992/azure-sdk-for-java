// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A web application firewall rule.
 */
@Fluent
public final class ApplicationGatewayFirewallRule {
    /*
     * The identifier of the web application firewall rule.
     */
    @JsonProperty(value = "ruleId", required = true)
    private int ruleId;

    /*
     * The string representation of the web application firewall rule identifier.
     */
    @JsonProperty(value = "ruleIdString")
    private String ruleIdString;

    /*
     * The string representation of the web application firewall rule state.
     */
    @JsonProperty(value = "state")
    private ApplicationGatewayWafRuleStateTypes state;

    /*
     * The string representation of the web application firewall rule action.
     */
    @JsonProperty(value = "action")
    private ApplicationGatewayWafRuleActionTypes action;

    /*
     * The description of the web application firewall rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of ApplicationGatewayFirewallRule class.
     */
    public ApplicationGatewayFirewallRule() {
    }

    /**
     * Get the ruleId property: The identifier of the web application firewall rule.
     * 
     * @return the ruleId value.
     */
    public int ruleId() {
        return this.ruleId;
    }

    /**
     * Set the ruleId property: The identifier of the web application firewall rule.
     * 
     * @param ruleId the ruleId value to set.
     * @return the ApplicationGatewayFirewallRule object itself.
     */
    public ApplicationGatewayFirewallRule withRuleId(int ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the ruleIdString property: The string representation of the web application firewall rule identifier.
     * 
     * @return the ruleIdString value.
     */
    public String ruleIdString() {
        return this.ruleIdString;
    }

    /**
     * Set the ruleIdString property: The string representation of the web application firewall rule identifier.
     * 
     * @param ruleIdString the ruleIdString value to set.
     * @return the ApplicationGatewayFirewallRule object itself.
     */
    public ApplicationGatewayFirewallRule withRuleIdString(String ruleIdString) {
        this.ruleIdString = ruleIdString;
        return this;
    }

    /**
     * Get the state property: The string representation of the web application firewall rule state.
     * 
     * @return the state value.
     */
    public ApplicationGatewayWafRuleStateTypes state() {
        return this.state;
    }

    /**
     * Set the state property: The string representation of the web application firewall rule state.
     * 
     * @param state the state value to set.
     * @return the ApplicationGatewayFirewallRule object itself.
     */
    public ApplicationGatewayFirewallRule withState(ApplicationGatewayWafRuleStateTypes state) {
        this.state = state;
        return this;
    }

    /**
     * Get the action property: The string representation of the web application firewall rule action.
     * 
     * @return the action value.
     */
    public ApplicationGatewayWafRuleActionTypes action() {
        return this.action;
    }

    /**
     * Set the action property: The string representation of the web application firewall rule action.
     * 
     * @param action the action value to set.
     * @return the ApplicationGatewayFirewallRule object itself.
     */
    public ApplicationGatewayFirewallRule withAction(ApplicationGatewayWafRuleActionTypes action) {
        this.action = action;
        return this;
    }

    /**
     * Get the description property: The description of the web application firewall rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the web application firewall rule.
     * 
     * @param description the description value to set.
     * @return the ApplicationGatewayFirewallRule object itself.
     */
    public ApplicationGatewayFirewallRule withDescription(String description) {
        this.description = description;
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
