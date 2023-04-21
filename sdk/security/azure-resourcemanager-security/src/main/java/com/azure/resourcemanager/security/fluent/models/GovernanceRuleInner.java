// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.GovernanceRuleEmailNotification;
import com.azure.resourcemanager.security.models.GovernanceRuleMetadata;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSource;
import com.azure.resourcemanager.security.models.GovernanceRuleSourceResourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Governance rule over a given scope. */
@Fluent
public final class GovernanceRuleInner extends ProxyResource {
    /*
     * Properties of a governance rule
     */
    @JsonProperty(value = "properties")
    private GovernanceRuleProperties innerProperties;

    /** Creates an instance of GovernanceRuleInner class. */
    public GovernanceRuleInner() {
    }

    /**
     * Get the innerProperties property: Properties of a governance rule.
     *
     * @return the innerProperties value.
     */
    private GovernanceRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tenantId property: The tenantId (GUID).
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Get the displayName property: Display name of the governance rule.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display name of the governance rule.
     *
     * @param displayName the displayName value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: Description of the governance rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the governance rule.
     *
     * @param description the description value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the remediationTimeframe property: Governance rule remediation timeframe - this is the time that will affect
     * on the grace-period duration e.g. 7.00:00:00 - means 7 days.
     *
     * @return the remediationTimeframe value.
     */
    public String remediationTimeframe() {
        return this.innerProperties() == null ? null : this.innerProperties().remediationTimeframe();
    }

    /**
     * Set the remediationTimeframe property: Governance rule remediation timeframe - this is the time that will affect
     * on the grace-period duration e.g. 7.00:00:00 - means 7 days.
     *
     * @param remediationTimeframe the remediationTimeframe value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withRemediationTimeframe(String remediationTimeframe) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withRemediationTimeframe(remediationTimeframe);
        return this;
    }

    /**
     * Get the isGracePeriod property: Defines whether there is a grace period on the governance rule.
     *
     * @return the isGracePeriod value.
     */
    public Boolean isGracePeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().isGracePeriod();
    }

    /**
     * Set the isGracePeriod property: Defines whether there is a grace period on the governance rule.
     *
     * @param isGracePeriod the isGracePeriod value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withIsGracePeriod(Boolean isGracePeriod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withIsGracePeriod(isGracePeriod);
        return this;
    }

    /**
     * Get the rulePriority property: The governance rule priority, priority to the lower number. Rules with the same
     * priority on the same scope will not be allowed.
     *
     * @return the rulePriority value.
     */
    public Integer rulePriority() {
        return this.innerProperties() == null ? null : this.innerProperties().rulePriority();
    }

    /**
     * Set the rulePriority property: The governance rule priority, priority to the lower number. Rules with the same
     * priority on the same scope will not be allowed.
     *
     * @param rulePriority the rulePriority value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withRulePriority(Integer rulePriority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withRulePriority(rulePriority);
        return this;
    }

    /**
     * Get the isDisabled property: Defines whether the rule is active/inactive.
     *
     * @return the isDisabled value.
     */
    public Boolean isDisabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isDisabled();
    }

    /**
     * Set the isDisabled property: Defines whether the rule is active/inactive.
     *
     * @param isDisabled the isDisabled value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withIsDisabled(Boolean isDisabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withIsDisabled(isDisabled);
        return this;
    }

    /**
     * Get the ruleType property: The rule type of the governance rule, defines the source of the rule e.g. Integrated.
     *
     * @return the ruleType value.
     */
    public GovernanceRuleType ruleType() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleType();
    }

    /**
     * Set the ruleType property: The rule type of the governance rule, defines the source of the rule e.g. Integrated.
     *
     * @param ruleType the ruleType value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withRuleType(GovernanceRuleType ruleType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withRuleType(ruleType);
        return this;
    }

    /**
     * Get the sourceResourceType property: The governance rule source, what the rule affects, e.g. Assessments.
     *
     * @return the sourceResourceType value.
     */
    public GovernanceRuleSourceResourceType sourceResourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceResourceType();
    }

    /**
     * Set the sourceResourceType property: The governance rule source, what the rule affects, e.g. Assessments.
     *
     * @param sourceResourceType the sourceResourceType value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withSourceResourceType(GovernanceRuleSourceResourceType sourceResourceType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withSourceResourceType(sourceResourceType);
        return this;
    }

    /**
     * Get the excludedScopes property: Excluded scopes, filter out the descendants of the scope (on management scopes).
     *
     * @return the excludedScopes value.
     */
    public List<String> excludedScopes() {
        return this.innerProperties() == null ? null : this.innerProperties().excludedScopes();
    }

    /**
     * Set the excludedScopes property: Excluded scopes, filter out the descendants of the scope (on management scopes).
     *
     * @param excludedScopes the excludedScopes value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withExcludedScopes(List<String> excludedScopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withExcludedScopes(excludedScopes);
        return this;
    }

    /**
     * Get the conditionSets property: The governance rule conditionSets - see examples.
     *
     * @return the conditionSets value.
     */
    public List<Object> conditionSets() {
        return this.innerProperties() == null ? null : this.innerProperties().conditionSets();
    }

    /**
     * Set the conditionSets property: The governance rule conditionSets - see examples.
     *
     * @param conditionSets the conditionSets value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withConditionSets(List<Object> conditionSets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withConditionSets(conditionSets);
        return this;
    }

    /**
     * Get the includeMemberScopes property: Defines whether the rule is management scope rule (master connector as a
     * single scope or management scope).
     *
     * @return the includeMemberScopes value.
     */
    public Boolean includeMemberScopes() {
        return this.innerProperties() == null ? null : this.innerProperties().includeMemberScopes();
    }

    /**
     * Set the includeMemberScopes property: Defines whether the rule is management scope rule (master connector as a
     * single scope or management scope).
     *
     * @param includeMemberScopes the includeMemberScopes value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withIncludeMemberScopes(Boolean includeMemberScopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withIncludeMemberScopes(includeMemberScopes);
        return this;
    }

    /**
     * Get the ownerSource property: The owner source for the governance rule - e.g. Manually by user@contoso.com - see
     * example.
     *
     * @return the ownerSource value.
     */
    public GovernanceRuleOwnerSource ownerSource() {
        return this.innerProperties() == null ? null : this.innerProperties().ownerSource();
    }

    /**
     * Set the ownerSource property: The owner source for the governance rule - e.g. Manually by user@contoso.com - see
     * example.
     *
     * @param ownerSource the ownerSource value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withOwnerSource(GovernanceRuleOwnerSource ownerSource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withOwnerSource(ownerSource);
        return this;
    }

    /**
     * Get the governanceEmailNotification property: The email notifications settings for the governance rule, states
     * whether to disable notifications for mangers and owners.
     *
     * @return the governanceEmailNotification value.
     */
    public GovernanceRuleEmailNotification governanceEmailNotification() {
        return this.innerProperties() == null ? null : this.innerProperties().governanceEmailNotification();
    }

    /**
     * Set the governanceEmailNotification property: The email notifications settings for the governance rule, states
     * whether to disable notifications for mangers and owners.
     *
     * @param governanceEmailNotification the governanceEmailNotification value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withGovernanceEmailNotification(
        GovernanceRuleEmailNotification governanceEmailNotification) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withGovernanceEmailNotification(governanceEmailNotification);
        return this;
    }

    /**
     * Get the metadata property: The governance rule metadata.
     *
     * @return the metadata value.
     */
    public GovernanceRuleMetadata metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: The governance rule metadata.
     *
     * @param metadata the metadata value to set.
     * @return the GovernanceRuleInner object itself.
     */
    public GovernanceRuleInner withMetadata(GovernanceRuleMetadata metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GovernanceRuleProperties();
        }
        this.innerProperties().withMetadata(metadata);
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
