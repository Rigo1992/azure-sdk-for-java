// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Power state of the Service. */
public final class PowerState extends ExpandableStringEnum<PowerState> {
    /** Static value Running for PowerState. */
    public static final PowerState RUNNING = fromString("Running");

    /** Static value Stopped for PowerState. */
    public static final PowerState STOPPED = fromString("Stopped");

    /**
     * Creates a new instance of PowerState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PowerState() {
    }

    /**
     * Creates or finds a PowerState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PowerState.
     */
    @JsonCreator
    public static PowerState fromString(String name) {
        return fromString(name, PowerState.class);
    }

    /**
     * Gets known PowerState values.
     *
     * @return known PowerState values.
     */
    public static Collection<PowerState> values() {
        return values(PowerState.class);
    }
}
