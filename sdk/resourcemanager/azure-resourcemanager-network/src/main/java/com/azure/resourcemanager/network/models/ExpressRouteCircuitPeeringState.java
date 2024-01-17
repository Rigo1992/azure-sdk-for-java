// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The state of peering.
 */
public final class ExpressRouteCircuitPeeringState extends ExpandableStringEnum<ExpressRouteCircuitPeeringState> {
    /**
     * Static value Disabled for ExpressRouteCircuitPeeringState.
     */
    public static final ExpressRouteCircuitPeeringState DISABLED = fromString("Disabled");

    /**
     * Static value Enabled for ExpressRouteCircuitPeeringState.
     */
    public static final ExpressRouteCircuitPeeringState ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of ExpressRouteCircuitPeeringState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExpressRouteCircuitPeeringState() {
    }

    /**
     * Creates or finds a ExpressRouteCircuitPeeringState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExpressRouteCircuitPeeringState.
     */
    @JsonCreator
    public static ExpressRouteCircuitPeeringState fromString(String name) {
        return fromString(name, ExpressRouteCircuitPeeringState.class);
    }

    /**
     * Gets known ExpressRouteCircuitPeeringState values.
     * 
     * @return known ExpressRouteCircuitPeeringState values.
     */
    public static Collection<ExpressRouteCircuitPeeringState> values() {
        return values(ExpressRouteCircuitPeeringState.class);
    }
}
