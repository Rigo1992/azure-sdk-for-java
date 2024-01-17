// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of NAT rule for VPN NAT.
 */
public final class VpnNatRuleType extends ExpandableStringEnum<VpnNatRuleType> {
    /**
     * Static value Static for VpnNatRuleType.
     */
    public static final VpnNatRuleType STATIC = fromString("Static");

    /**
     * Static value Dynamic for VpnNatRuleType.
     */
    public static final VpnNatRuleType DYNAMIC = fromString("Dynamic");

    /**
     * Creates a new instance of VpnNatRuleType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VpnNatRuleType() {
    }

    /**
     * Creates or finds a VpnNatRuleType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VpnNatRuleType.
     */
    @JsonCreator
    public static VpnNatRuleType fromString(String name) {
        return fromString(name, VpnNatRuleType.class);
    }

    /**
     * Gets known VpnNatRuleType values.
     * 
     * @return known VpnNatRuleType values.
     */
    public static Collection<VpnNatRuleType> values() {
        return values(VpnNatRuleType.class);
    }
}
