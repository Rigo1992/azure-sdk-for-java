// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ApplicationGatewayFirewallManifestRuleSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ApplicationGatewayWafDynamicManifest API service call.
 */
@Fluent
public final class ApplicationGatewayWafDynamicManifestResultInner {
    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Properties of the ApplicationGatewayWafDynamicManifest .
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayWafDynamicManifestPropertiesResult innerProperties;

    /**
     * Creates an instance of ApplicationGatewayWafDynamicManifestResultInner class.
     */
    public ApplicationGatewayWafDynamicManifestResultInner() {
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the ApplicationGatewayWafDynamicManifestResultInner object itself.
     */
    public ApplicationGatewayWafDynamicManifestResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: Properties of the ApplicationGatewayWafDynamicManifest .
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewayWafDynamicManifestPropertiesResult innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the availableRuleSets property: The available rulesets.
     * 
     * @return the availableRuleSets value.
     */
    public List<ApplicationGatewayFirewallManifestRuleSet> availableRuleSets() {
        return this.innerProperties() == null ? null : this.innerProperties().availableRuleSets();
    }

    /**
     * Set the availableRuleSets property: The available rulesets.
     * 
     * @param availableRuleSets the availableRuleSets value to set.
     * @return the ApplicationGatewayWafDynamicManifestResultInner object itself.
     */
    public ApplicationGatewayWafDynamicManifestResultInner
        withAvailableRuleSets(List<ApplicationGatewayFirewallManifestRuleSet> availableRuleSets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayWafDynamicManifestPropertiesResult();
        }
        this.innerProperties().withAvailableRuleSets(availableRuleSets);
        return this;
    }

    /**
     * Get the ruleSetType property: The type of the web application firewall rule set.
     * 
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetType();
    }

    /**
     * Set the ruleSetType property: The type of the web application firewall rule set.
     * 
     * @param ruleSetType the ruleSetType value to set.
     * @return the ApplicationGatewayWafDynamicManifestResultInner object itself.
     */
    public ApplicationGatewayWafDynamicManifestResultInner withRuleSetType(String ruleSetType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayWafDynamicManifestPropertiesResult();
        }
        this.innerProperties().withRuleSetType(ruleSetType);
        return this;
    }

    /**
     * Get the ruleSetVersion property: The version of the web application firewall rule set type.
     * 
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleSetVersion();
    }

    /**
     * Set the ruleSetVersion property: The version of the web application firewall rule set type.
     * 
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the ApplicationGatewayWafDynamicManifestResultInner object itself.
     */
    public ApplicationGatewayWafDynamicManifestResultInner withRuleSetVersion(String ruleSetVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayWafDynamicManifestPropertiesResult();
        }
        this.innerProperties().withRuleSetVersion(ruleSetVersion);
        return this;
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
