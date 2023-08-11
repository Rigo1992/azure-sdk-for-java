// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UnmanageActionResourceGroupMode. */
public final class UnmanageActionResourceGroupMode extends ExpandableStringEnum<UnmanageActionResourceGroupMode> {
    /** Static value delete for UnmanageActionResourceGroupMode. */
    public static final UnmanageActionResourceGroupMode DELETE = fromString("delete");

    /** Static value detach for UnmanageActionResourceGroupMode. */
    public static final UnmanageActionResourceGroupMode DETACH = fromString("detach");

    /**
     * Creates a new instance of UnmanageActionResourceGroupMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UnmanageActionResourceGroupMode() {
    }

    /**
     * Creates or finds a UnmanageActionResourceGroupMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UnmanageActionResourceGroupMode.
     */
    @JsonCreator
    public static UnmanageActionResourceGroupMode fromString(String name) {
        return fromString(name, UnmanageActionResourceGroupMode.class);
    }

    /**
     * Gets known UnmanageActionResourceGroupMode values.
     *
     * @return known UnmanageActionResourceGroupMode values.
     */
    public static Collection<UnmanageActionResourceGroupMode> values() {
        return values(UnmanageActionResourceGroupMode.class);
    }
}
