// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import java.util.Collection;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * State of the resource.
 */
public final class State extends ExpandableStringEnum<State> {
    /**
     * The state of the resource is 'Unknown'.
     */
    public static final State UNKNOWN_STATE = fromString("Unknown");

    /**
     * The state of the resource is 'Succeeded'.
     */
    public static final State SUCCEEDED_STATE = fromString("Succeeded");

    /**
     * The state of the resource is 'Creating'.
     */
    public static final State CREATING_STATE = fromString("Creating");

    /**
     * The state of the resource is 'Deleting'.
     */
    public static final State DELETING_STATE = fromString("Deleting");

    /**
     * The state of the resource is 'Moving'.
     */
    public static final State MOVING_STATE = fromString("Moving");

    /**
     * The state of the resource is 'Failed'.
     */
    public static final State FAILED_STATE = fromString("Failed");

    /**
     * Creates a new instance of State value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public State() {
    }

    /**
     * Creates or finds a State from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding State.
     */
    @JsonCreator
    public static State fromString(String name) {
        return fromString(name, State.class);
    }

    /**
     * Gets known State values.
     * 
     * @return known State values.
     */
    public static Collection<State> values() {
        return values(State.class);
    }
}
