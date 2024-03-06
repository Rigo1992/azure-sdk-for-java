// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * the criteria time aggregation types.
 */
public final class AggregationTypeEnum extends ExpandableStringEnum<AggregationTypeEnum> {
    /**
     * Static value Average for AggregationTypeEnum.
     */
    public static final AggregationTypeEnum AVERAGE = fromString("Average");

    /**
     * Static value Count for AggregationTypeEnum.
     */
    public static final AggregationTypeEnum COUNT = fromString("Count");

    /**
     * Static value Minimum for AggregationTypeEnum.
     */
    public static final AggregationTypeEnum MINIMUM = fromString("Minimum");

    /**
     * Static value Maximum for AggregationTypeEnum.
     */
    public static final AggregationTypeEnum MAXIMUM = fromString("Maximum");

    /**
     * Static value Total for AggregationTypeEnum.
     */
    public static final AggregationTypeEnum TOTAL = fromString("Total");

    /**
     * Creates a new instance of AggregationTypeEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AggregationTypeEnum() {
    }

    /**
     * Creates or finds a AggregationTypeEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AggregationTypeEnum.
     */
    @JsonCreator
    public static AggregationTypeEnum fromString(String name) {
        return fromString(name, AggregationTypeEnum.class);
    }

    /**
     * Gets known AggregationTypeEnum values.
     * 
     * @return known AggregationTypeEnum values.
     */
    public static Collection<AggregationTypeEnum> values() {
        return values(AggregationTypeEnum.class);
    }
}
