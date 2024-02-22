// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The throughput status.
 */
public final class RcmComponentStatus extends ExpandableStringEnum<RcmComponentStatus> {
    /**
     * Static value Healthy for RcmComponentStatus.
     */
    public static final RcmComponentStatus HEALTHY = fromString("Healthy");

    /**
     * Static value Warning for RcmComponentStatus.
     */
    public static final RcmComponentStatus WARNING = fromString("Warning");

    /**
     * Static value Critical for RcmComponentStatus.
     */
    public static final RcmComponentStatus CRITICAL = fromString("Critical");

    /**
     * Static value Unknown for RcmComponentStatus.
     */
    public static final RcmComponentStatus UNKNOWN = fromString("Unknown");

    /**
     * Creates a new instance of RcmComponentStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RcmComponentStatus() {
    }

    /**
     * Creates or finds a RcmComponentStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RcmComponentStatus.
     */
    @JsonCreator
    public static RcmComponentStatus fromString(String name) {
        return fromString(name, RcmComponentStatus.class);
    }

    /**
     * Gets known RcmComponentStatus values.
     * 
     * @return known RcmComponentStatus values.
     */
    public static Collection<RcmComponentStatus> values() {
        return values(RcmComponentStatus.class);
    }
}
