// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** SQL Vulnerability Assessment rule severity. */
public final class RuleSeverity extends ExpandableStringEnum<RuleSeverity> {
    /** Static value High for RuleSeverity. */
    public static final RuleSeverity HIGH = fromString("High");

    /** Static value Medium for RuleSeverity. */
    public static final RuleSeverity MEDIUM = fromString("Medium");

    /** Static value Low for RuleSeverity. */
    public static final RuleSeverity LOW = fromString("Low");

    /** Static value Informational for RuleSeverity. */
    public static final RuleSeverity INFORMATIONAL = fromString("Informational");

    /** Static value Obsolete for RuleSeverity. */
    public static final RuleSeverity OBSOLETE = fromString("Obsolete");

    /**
     * Creates a new instance of RuleSeverity value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RuleSeverity() {
    }

    /**
     * Creates or finds a RuleSeverity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RuleSeverity.
     */
    @JsonCreator
    public static RuleSeverity fromString(String name) {
        return fromString(name, RuleSeverity.class);
    }

    /**
     * Gets known RuleSeverity values.
     *
     * @return known RuleSeverity values.
     */
    public static Collection<RuleSeverity> values() {
        return values(RuleSeverity.class);
    }
}
