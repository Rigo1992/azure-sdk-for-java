// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Enforcement status.
 */
public final class EnforcementState extends ExpandableStringEnum<EnforcementState> {
    /**
     * Static value Enabled for EnforcementState.
     */
    public static final EnforcementState ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for EnforcementState.
     */
    public static final EnforcementState DISABLED = fromString("Disabled");

    /**
     * Static value NotAvailable for EnforcementState.
     */
    public static final EnforcementState NOT_AVAILABLE = fromString("NotAvailable");

    /**
     * Creates a new instance of EnforcementState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EnforcementState() {
    }

    /**
     * Creates or finds a EnforcementState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EnforcementState.
     */
    @JsonCreator
    public static EnforcementState fromString(String name) {
        return fromString(name, EnforcementState.class);
    }

    /**
     * Gets known EnforcementState values.
     * 
     * @return known EnforcementState values.
     */
    public static Collection<EnforcementState> values() {
        return values(EnforcementState.class);
    }
}
