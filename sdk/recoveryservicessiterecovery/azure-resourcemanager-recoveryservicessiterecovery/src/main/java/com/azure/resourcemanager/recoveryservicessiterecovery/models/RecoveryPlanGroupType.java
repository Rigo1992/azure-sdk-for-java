// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The group type. */
public final class RecoveryPlanGroupType extends ExpandableStringEnum<RecoveryPlanGroupType> {
    /** Static value Shutdown for RecoveryPlanGroupType. */
    public static final RecoveryPlanGroupType SHUTDOWN = fromString("Shutdown");

    /** Static value Boot for RecoveryPlanGroupType. */
    public static final RecoveryPlanGroupType BOOT = fromString("Boot");

    /** Static value Failover for RecoveryPlanGroupType. */
    public static final RecoveryPlanGroupType FAILOVER = fromString("Failover");

    /**
     * Creates or finds a RecoveryPlanGroupType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecoveryPlanGroupType.
     */
    @JsonCreator
    public static RecoveryPlanGroupType fromString(String name) {
        return fromString(name, RecoveryPlanGroupType.class);
    }

    /**
     * Gets known RecoveryPlanGroupType values.
     *
     * @return known RecoveryPlanGroupType values.
     */
    public static Collection<RecoveryPlanGroupType> values() {
        return values(RecoveryPlanGroupType.class);
    }
}
