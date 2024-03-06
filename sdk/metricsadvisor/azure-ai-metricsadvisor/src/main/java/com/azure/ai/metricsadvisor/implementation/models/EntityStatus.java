// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * data feed status.
 */
public final class EntityStatus extends ExpandableStringEnum<EntityStatus> {
    /**
     * Static value Active for EntityStatus.
     */
    public static final EntityStatus ACTIVE = fromString("Active");

    /**
     * Static value Paused for EntityStatus.
     */
    public static final EntityStatus PAUSED = fromString("Paused");

    /**
     * Creates a new instance of EntityStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EntityStatus() {
    }

    /**
     * Creates or finds a EntityStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EntityStatus.
     */
    public static EntityStatus fromString(String name) {
        return fromString(name, EntityStatus.class);
    }

    /**
     * Gets known EntityStatus values.
     * 
     * @return known EntityStatus values.
     */
    public static Collection<EntityStatus> values() {
        return values(EntityStatus.class);
    }
}
