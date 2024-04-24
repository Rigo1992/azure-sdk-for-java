// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for LogMetric.
 */
public final class LogMetric extends ExpandableStringEnum<LogMetric> {
    /**
     * Static value clientRequestCount for LogMetric.
     */
    public static final LogMetric CLIENT_REQUEST_COUNT = fromString("clientRequestCount");

    /**
     * Static value clientRequestTraffic for LogMetric.
     */
    public static final LogMetric CLIENT_REQUEST_TRAFFIC = fromString("clientRequestTraffic");

    /**
     * Static value clientRequestBandwidth for LogMetric.
     */
    public static final LogMetric CLIENT_REQUEST_BANDWIDTH = fromString("clientRequestBandwidth");

    /**
     * Static value originRequestTraffic for LogMetric.
     */
    public static final LogMetric ORIGIN_REQUEST_TRAFFIC = fromString("originRequestTraffic");

    /**
     * Static value originRequestBandwidth for LogMetric.
     */
    public static final LogMetric ORIGIN_REQUEST_BANDWIDTH = fromString("originRequestBandwidth");

    /**
     * Static value totalLatency for LogMetric.
     */
    public static final LogMetric TOTAL_LATENCY = fromString("totalLatency");

    /**
     * Creates a new instance of LogMetric value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LogMetric() {
    }

    /**
     * Creates or finds a LogMetric from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LogMetric.
     */
    @JsonCreator
    public static LogMetric fromString(String name) {
        return fromString(name, LogMetric.class);
    }

    /**
     * Gets known LogMetric values.
     * 
     * @return known LogMetric values.
     */
    public static Collection<LogMetric> values() {
        return values(LogMetric.class);
    }
}
