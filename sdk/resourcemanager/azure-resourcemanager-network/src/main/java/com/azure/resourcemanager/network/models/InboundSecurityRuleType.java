// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/**
 * Rule Type. This should be either AutoExpire or Permanent. Auto Expire Rule only creates NSG rules. Permanent Rule
 * creates NSG rule and SLB LB Rule.
 */
public final class InboundSecurityRuleType extends ExpandableStringEnum<InboundSecurityRuleType> {
    /**
     * Static value AutoExpire for InboundSecurityRuleType.
     */
    public static final InboundSecurityRuleType AUTO_EXPIRE = fromString("AutoExpire");

    /**
     * Static value Permanent for InboundSecurityRuleType.
     */
    public static final InboundSecurityRuleType PERMANENT = fromString("Permanent");

    /**
     * Creates a new instance of InboundSecurityRuleType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InboundSecurityRuleType() {
    }

    /**
     * Creates or finds a InboundSecurityRuleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InboundSecurityRuleType.
     */
    @JsonCreator
    public static InboundSecurityRuleType fromString(String name) {
        return fromString(name, InboundSecurityRuleType.class);
    }

    /**
     * Gets known InboundSecurityRuleType values.
     *
     * @return known InboundSecurityRuleType values.
     */
    public static Collection<InboundSecurityRuleType> values() {
        return values(InboundSecurityRuleType.class);
    }
}
