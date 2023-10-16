// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enum to indicate default priorityLevel of requests. */
public final class DefaultPriorityLevel extends ExpandableStringEnum<DefaultPriorityLevel> {
    /** Static value High for DefaultPriorityLevel. */
    public static final DefaultPriorityLevel HIGH = fromString("High");

    /** Static value Low for DefaultPriorityLevel. */
    public static final DefaultPriorityLevel LOW = fromString("Low");

    /**
     * Creates a new instance of DefaultPriorityLevel value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DefaultPriorityLevel() {
    }

    /**
     * Creates or finds a DefaultPriorityLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DefaultPriorityLevel.
     */
    @JsonCreator
    public static DefaultPriorityLevel fromString(String name) {
        return fromString(name, DefaultPriorityLevel.class);
    }

    /**
     * Gets known DefaultPriorityLevel values.
     *
     * @return known DefaultPriorityLevel values.
     */
    public static Collection<DefaultPriorityLevel> values() {
        return values(DefaultPriorityLevel.class);
    }
}
