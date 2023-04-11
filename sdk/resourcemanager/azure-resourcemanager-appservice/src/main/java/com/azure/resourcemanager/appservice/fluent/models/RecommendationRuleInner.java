// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.Channels;
import com.azure.resourcemanager.appservice.models.NotificationLevel;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** Represents a recommendation rule that the recommendation engine can perform. */
@Fluent
public final class RecommendationRuleInner extends ProxyOnlyResource {
    /*
     * RecommendationRule resource specific properties
     */
    @JsonProperty(value = "properties")
    private RecommendationRuleProperties innerProperties;

    /** Creates an instance of RecommendationRuleInner class. */
    public RecommendationRuleInner() {
    }

    /**
     * Get the innerProperties property: RecommendationRule resource specific properties.
     *
     * @return the innerProperties value.
     */
    private RecommendationRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public RecommendationRuleInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the recommendationName property: Unique name of the rule.
     *
     * @return the recommendationName value.
     */
    public String recommendationName() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationName();
    }

    /**
     * Set the recommendationName property: Unique name of the rule.
     *
     * @param recommendationName the recommendationName value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withRecommendationName(String recommendationName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withRecommendationName(recommendationName);
        return this;
    }

    /**
     * Get the displayName property: UI friendly name of the rule.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: UI friendly name of the rule.
     *
     * @param displayName the displayName value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the message property: Localized name of the rule (Good for UI).
     *
     * @return the message value.
     */
    public String message() {
        return this.innerProperties() == null ? null : this.innerProperties().message();
    }

    /**
     * Set the message property: Localized name of the rule (Good for UI).
     *
     * @param message the message value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withMessage(String message) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withMessage(message);
        return this;
    }

    /**
     * Get the recommendationId property: Recommendation ID of an associated recommendation object tied to the rule, if
     * exists. If such an object doesn't exist, it is set to null.
     *
     * @return the recommendationId value.
     */
    public UUID recommendationId() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationId();
    }

    /**
     * Set the recommendationId property: Recommendation ID of an associated recommendation object tied to the rule, if
     * exists. If such an object doesn't exist, it is set to null.
     *
     * @param recommendationId the recommendationId value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withRecommendationId(UUID recommendationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withRecommendationId(recommendationId);
        return this;
    }

    /**
     * Get the description property: Localized detailed description of the rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Localized detailed description of the rule.
     *
     * @param description the description value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the actionName property: Name of action that is recommended by this rule in string.
     *
     * @return the actionName value.
     */
    public String actionName() {
        return this.innerProperties() == null ? null : this.innerProperties().actionName();
    }

    /**
     * Set the actionName property: Name of action that is recommended by this rule in string.
     *
     * @param actionName the actionName value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withActionName(String actionName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withActionName(actionName);
        return this;
    }

    /**
     * Get the level property: Level of impact indicating how critical this rule is.
     *
     * @return the level value.
     */
    public NotificationLevel level() {
        return this.innerProperties() == null ? null : this.innerProperties().level();
    }

    /**
     * Set the level property: Level of impact indicating how critical this rule is.
     *
     * @param level the level value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withLevel(NotificationLevel level) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withLevel(level);
        return this;
    }

    /**
     * Get the channels property: List of available channels that this rule applies.
     *
     * @return the channels value.
     */
    public Channels channels() {
        return this.innerProperties() == null ? null : this.innerProperties().channels();
    }

    /**
     * Set the channels property: List of available channels that this rule applies.
     *
     * @param channels the channels value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withChannels(Channels channels) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withChannels(channels);
        return this;
    }

    /**
     * Get the categoryTags property: The list of category tags that this recommendation rule belongs to.
     *
     * @return the categoryTags value.
     */
    public List<String> categoryTags() {
        return this.innerProperties() == null ? null : this.innerProperties().categoryTags();
    }

    /**
     * Get the isDynamic property: True if this is associated with a dynamically added rule.
     *
     * @return the isDynamic value.
     */
    public Boolean isDynamic() {
        return this.innerProperties() == null ? null : this.innerProperties().isDynamic();
    }

    /**
     * Set the isDynamic property: True if this is associated with a dynamically added rule.
     *
     * @param isDynamic the isDynamic value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withIsDynamic(Boolean isDynamic) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withIsDynamic(isDynamic);
        return this;
    }

    /**
     * Get the extensionName property: Extension name of the portal if exists. Applicable to dynamic rule only.
     *
     * @return the extensionName value.
     */
    public String extensionName() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionName();
    }

    /**
     * Set the extensionName property: Extension name of the portal if exists. Applicable to dynamic rule only.
     *
     * @param extensionName the extensionName value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withExtensionName(String extensionName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withExtensionName(extensionName);
        return this;
    }

    /**
     * Get the bladeName property: Deep link to a blade on the portal. Applicable to dynamic rule only.
     *
     * @return the bladeName value.
     */
    public String bladeName() {
        return this.innerProperties() == null ? null : this.innerProperties().bladeName();
    }

    /**
     * Set the bladeName property: Deep link to a blade on the portal. Applicable to dynamic rule only.
     *
     * @param bladeName the bladeName value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withBladeName(String bladeName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withBladeName(bladeName);
        return this;
    }

    /**
     * Get the forwardLink property: Forward link to an external document associated with the rule. Applicable to
     * dynamic rule only.
     *
     * @return the forwardLink value.
     */
    public String forwardLink() {
        return this.innerProperties() == null ? null : this.innerProperties().forwardLink();
    }

    /**
     * Set the forwardLink property: Forward link to an external document associated with the rule. Applicable to
     * dynamic rule only.
     *
     * @param forwardLink the forwardLink value to set.
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withForwardLink(String forwardLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecommendationRuleProperties();
        }
        this.innerProperties().withForwardLink(forwardLink);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
