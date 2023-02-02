// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Reporting cycle type. */
public final class ReportingCycleType extends ExpandableStringEnum<ReportingCycleType> {
    /** Static value CalendarMonth for ReportingCycleType. */
    public static final ReportingCycleType CALENDAR_MONTH = fromString("CalendarMonth");

    /** Static value Custom for ReportingCycleType. */
    public static final ReportingCycleType CUSTOM = fromString("Custom");

    /**
     * Creates a new instance of ReportingCycleType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReportingCycleType() {
    }

    /**
     * Creates or finds a ReportingCycleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReportingCycleType.
     */
    @JsonCreator
    public static ReportingCycleType fromString(String name) {
        return fromString(name, ReportingCycleType.class);
    }

    /**
     * Gets known ReportingCycleType values.
     *
     * @return known ReportingCycleType values.
     */
    public static Collection<ReportingCycleType> values() {
        return values(ReportingCycleType.class);
    }
}
