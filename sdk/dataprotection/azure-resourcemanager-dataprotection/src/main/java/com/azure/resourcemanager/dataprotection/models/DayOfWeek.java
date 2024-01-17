// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for DayOfWeek.
 */
public final class DayOfWeek extends ExpandableStringEnum<DayOfWeek> {
    /**
     * Static value Friday for DayOfWeek.
     */
    public static final DayOfWeek FRIDAY = fromString("Friday");

    /**
     * Static value Monday for DayOfWeek.
     */
    public static final DayOfWeek MONDAY = fromString("Monday");

    /**
     * Static value Saturday for DayOfWeek.
     */
    public static final DayOfWeek SATURDAY = fromString("Saturday");

    /**
     * Static value Sunday for DayOfWeek.
     */
    public static final DayOfWeek SUNDAY = fromString("Sunday");

    /**
     * Static value Thursday for DayOfWeek.
     */
    public static final DayOfWeek THURSDAY = fromString("Thursday");

    /**
     * Static value Tuesday for DayOfWeek.
     */
    public static final DayOfWeek TUESDAY = fromString("Tuesday");

    /**
     * Static value Wednesday for DayOfWeek.
     */
    public static final DayOfWeek WEDNESDAY = fromString("Wednesday");

    /**
     * Creates a new instance of DayOfWeek value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DayOfWeek() {
    }

    /**
     * Creates or finds a DayOfWeek from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DayOfWeek.
     */
    @JsonCreator
    public static DayOfWeek fromString(String name) {
        return fromString(name, DayOfWeek.class);
    }

    /**
     * Gets known DayOfWeek values.
     * 
     * @return known DayOfWeek values.
     */
    public static Collection<DayOfWeek> values() {
        return values(DayOfWeek.class);
    }
}
