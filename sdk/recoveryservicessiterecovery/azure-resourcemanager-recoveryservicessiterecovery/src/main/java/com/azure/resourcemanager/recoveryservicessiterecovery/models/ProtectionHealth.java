// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The health. */
public final class ProtectionHealth extends ExpandableStringEnum<ProtectionHealth> {
    /** Static value None for ProtectionHealth. */
    public static final ProtectionHealth NONE = fromString("None");

    /** Static value Normal for ProtectionHealth. */
    public static final ProtectionHealth NORMAL = fromString("Normal");

    /** Static value Warning for ProtectionHealth. */
    public static final ProtectionHealth WARNING = fromString("Warning");

    /** Static value Critical for ProtectionHealth. */
    public static final ProtectionHealth CRITICAL = fromString("Critical");

    /**
     * Creates or finds a ProtectionHealth from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProtectionHealth.
     */
    @JsonCreator
    public static ProtectionHealth fromString(String name) {
        return fromString(name, ProtectionHealth.class);
    }

    /**
     * Gets known ProtectionHealth values.
     *
     * @return known ProtectionHealth values.
     */
    public static Collection<ProtectionHealth> values() {
        return values(ProtectionHealth.class);
    }
}
