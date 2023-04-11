// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The implementation effort required to remediate this assessment. */
public final class ImplementationEffort extends ExpandableStringEnum<ImplementationEffort> {
    /** Static value Low for ImplementationEffort. */
    public static final ImplementationEffort LOW = fromString("Low");

    /** Static value Moderate for ImplementationEffort. */
    public static final ImplementationEffort MODERATE = fromString("Moderate");

    /** Static value High for ImplementationEffort. */
    public static final ImplementationEffort HIGH = fromString("High");

    /**
     * Creates a new instance of ImplementationEffort value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ImplementationEffort() {
    }

    /**
     * Creates or finds a ImplementationEffort from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImplementationEffort.
     */
    @JsonCreator
    public static ImplementationEffort fromString(String name) {
        return fromString(name, ImplementationEffort.class);
    }

    /**
     * Gets known ImplementationEffort values.
     *
     * @return known ImplementationEffort values.
     */
    public static Collection<ImplementationEffort> values() {
        return values(ImplementationEffort.class);
    }
}
