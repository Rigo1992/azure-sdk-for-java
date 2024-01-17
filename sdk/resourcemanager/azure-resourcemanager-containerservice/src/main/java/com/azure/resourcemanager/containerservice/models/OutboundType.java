// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The outbound (egress) routing method.
 *
 * This can only be set at cluster creation time and cannot be changed later. For more information see [egress outbound
 * type](https://docs.microsoft.com/azure/aks/egress-outboundtype).
 */
public final class OutboundType extends ExpandableStringEnum<OutboundType> {
    /**
     * Static value loadBalancer for OutboundType.
     */
    public static final OutboundType LOAD_BALANCER = fromString("loadBalancer");

    /**
     * Static value userDefinedRouting for OutboundType.
     */
    public static final OutboundType USER_DEFINED_ROUTING = fromString("userDefinedRouting");

    /**
     * Static value managedNATGateway for OutboundType.
     */
    public static final OutboundType MANAGED_NATGATEWAY = fromString("managedNATGateway");

    /**
     * Static value userAssignedNATGateway for OutboundType.
     */
    public static final OutboundType USER_ASSIGNED_NATGATEWAY = fromString("userAssignedNATGateway");

    /**
     * Creates a new instance of OutboundType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OutboundType() {
    }

    /**
     * Creates or finds a OutboundType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OutboundType.
     */
    @JsonCreator
    public static OutboundType fromString(String name) {
        return fromString(name, OutboundType.class);
    }

    /**
     * Gets known OutboundType values.
     *
     * @return known OutboundType values.
     */
    public static Collection<OutboundType> values() {
        return values(OutboundType.class);
    }
}
