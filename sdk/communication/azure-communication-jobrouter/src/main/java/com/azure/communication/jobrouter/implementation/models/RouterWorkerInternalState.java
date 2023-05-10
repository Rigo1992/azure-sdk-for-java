// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RouterWorkerInternalState. */
public final class RouterWorkerInternalState extends ExpandableStringEnum<RouterWorkerInternalState> {
    /** Static value active for RouterWorkerInternalState. */
    public static final RouterWorkerInternalState ACTIVE = fromString("active");

    /** Static value draining for RouterWorkerInternalState. */
    public static final RouterWorkerInternalState DRAINING = fromString("draining");

    /** Static value inactive for RouterWorkerInternalState. */
    public static final RouterWorkerInternalState INACTIVE = fromString("inactive");

    /**
     * Creates or finds a RouterWorkerInternalState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouterWorkerInternalState.
     */
    @JsonCreator
    public static RouterWorkerInternalState fromString(String name) {
        return fromString(name, RouterWorkerInternalState.class);
    }

    /**
     * Gets known RouterWorkerInternalState values.
     *
     * @return known RouterWorkerInternalState values.
     */
    public static Collection<RouterWorkerInternalState> values() {
        return values(RouterWorkerInternalState.class);
    }
}
