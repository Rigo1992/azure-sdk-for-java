// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Test coverage for the endpoint. */
public final class CoverageLevel extends ExpandableStringEnum<CoverageLevel> {
    /** Static value Default for CoverageLevel. */
    public static final CoverageLevel DEFAULT = fromString("Default");

    /** Static value Low for CoverageLevel. */
    public static final CoverageLevel LOW = fromString("Low");

    /** Static value BelowAverage for CoverageLevel. */
    public static final CoverageLevel BELOW_AVERAGE = fromString("BelowAverage");

    /** Static value Average for CoverageLevel. */
    public static final CoverageLevel AVERAGE = fromString("Average");

    /** Static value AboveAverage for CoverageLevel. */
    public static final CoverageLevel ABOVE_AVERAGE = fromString("AboveAverage");

    /** Static value Full for CoverageLevel. */
    public static final CoverageLevel FULL = fromString("Full");

    /**
     * Creates a new instance of CoverageLevel value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CoverageLevel() {
    }

    /**
     * Creates or finds a CoverageLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CoverageLevel.
     */
    @JsonCreator
    public static CoverageLevel fromString(String name) {
        return fromString(name, CoverageLevel.class);
    }

    /**
     * Gets known CoverageLevel values.
     *
     * @return known CoverageLevel values.
     */
    public static Collection<CoverageLevel> values() {
        return values(CoverageLevel.class);
    }
}
