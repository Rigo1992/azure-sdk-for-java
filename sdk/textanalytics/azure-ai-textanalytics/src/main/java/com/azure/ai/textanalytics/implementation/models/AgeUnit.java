// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The Age Unit of measurement. */
public final class AgeUnit extends ExpandableStringEnum<AgeUnit> {
    /** Static value Unspecified for AgeUnit. */
    public static final AgeUnit UNSPECIFIED = fromString("Unspecified");

    /** Static value Year for AgeUnit. */
    public static final AgeUnit YEAR = fromString("Year");

    /** Static value Month for AgeUnit. */
    public static final AgeUnit MONTH = fromString("Month");

    /** Static value Week for AgeUnit. */
    public static final AgeUnit WEEK = fromString("Week");

    /** Static value Day for AgeUnit. */
    public static final AgeUnit DAY = fromString("Day");

    /**
     * Creates or finds a AgeUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AgeUnit.
     */
    @JsonCreator
    public static AgeUnit fromString(String name) {
        return fromString(name, AgeUnit.class);
    }

    /**
     * Gets known AgeUnit values.
     *
     * @return known AgeUnit values.
     */
    public static Collection<AgeUnit> values() {
        return values(AgeUnit.class);
    }
}
