// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MetricAggregationType. */
public final class MetricAggregationType extends ExpandableStringEnum<MetricAggregationType> {
    /** Static value NotSpecified for MetricAggregationType. */
    public static final MetricAggregationType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value None for MetricAggregationType. */
    public static final MetricAggregationType NONE = fromString("None");

    /** Static value Average for MetricAggregationType. */
    public static final MetricAggregationType AVERAGE = fromString("Average");

    /** Static value Minimum for MetricAggregationType. */
    public static final MetricAggregationType MINIMUM = fromString("Minimum");

    /** Static value Maximum for MetricAggregationType. */
    public static final MetricAggregationType MAXIMUM = fromString("Maximum");

    /** Static value Total for MetricAggregationType. */
    public static final MetricAggregationType TOTAL = fromString("Total");

    /** Static value Count for MetricAggregationType. */
    public static final MetricAggregationType COUNT = fromString("Count");

    /**
     * Creates or finds a MetricAggregationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MetricAggregationType.
     */
    @JsonCreator
    public static MetricAggregationType fromString(String name) {
        return fromString(name, MetricAggregationType.class);
    }

    /**
     * Gets known MetricAggregationType values.
     *
     * @return known MetricAggregationType values.
     */
    public static Collection<MetricAggregationType> values() {
        return values(MetricAggregationType.class);
    }
}
