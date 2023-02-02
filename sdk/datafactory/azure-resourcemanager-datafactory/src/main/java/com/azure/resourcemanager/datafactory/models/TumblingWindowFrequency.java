// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enumerates possible frequency option for the tumbling window trigger. */
public final class TumblingWindowFrequency extends ExpandableStringEnum<TumblingWindowFrequency> {
    /** Static value Minute for TumblingWindowFrequency. */
    public static final TumblingWindowFrequency MINUTE = fromString("Minute");

    /** Static value Hour for TumblingWindowFrequency. */
    public static final TumblingWindowFrequency HOUR = fromString("Hour");

    /** Static value Month for TumblingWindowFrequency. */
    public static final TumblingWindowFrequency MONTH = fromString("Month");

    /**
     * Creates a new instance of TumblingWindowFrequency value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TumblingWindowFrequency() {
    }

    /**
     * Creates or finds a TumblingWindowFrequency from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TumblingWindowFrequency.
     */
    @JsonCreator
    public static TumblingWindowFrequency fromString(String name) {
        return fromString(name, TumblingWindowFrequency.class);
    }

    /**
     * Gets known TumblingWindowFrequency values.
     *
     * @return known TumblingWindowFrequency values.
     */
    public static Collection<TumblingWindowFrequency> values() {
        return values(TumblingWindowFrequency.class);
    }
}
