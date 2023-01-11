// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Aggregation type. Relevant and required only for rules of the kind LogAlert. */
public final class TimeAggregation extends ExpandableStringEnum<TimeAggregation> {
    /** Static value Count for TimeAggregation. */
    public static final TimeAggregation COUNT = fromString("Count");

    /** Static value Average for TimeAggregation. */
    public static final TimeAggregation AVERAGE = fromString("Average");

    /** Static value Minimum for TimeAggregation. */
    public static final TimeAggregation MINIMUM = fromString("Minimum");

    /** Static value Maximum for TimeAggregation. */
    public static final TimeAggregation MAXIMUM = fromString("Maximum");

    /** Static value Total for TimeAggregation. */
    public static final TimeAggregation TOTAL = fromString("Total");

    /**
     * Creates or finds a TimeAggregation from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TimeAggregation.
     */
    @JsonCreator
    public static TimeAggregation fromString(String name) {
        return fromString(name, TimeAggregation.class);
    }

    /**
     * Gets known TimeAggregation values.
     *
     * @return known TimeAggregation values.
     */
    public static Collection<TimeAggregation> values() {
        return values(TimeAggregation.class);
    }
}
