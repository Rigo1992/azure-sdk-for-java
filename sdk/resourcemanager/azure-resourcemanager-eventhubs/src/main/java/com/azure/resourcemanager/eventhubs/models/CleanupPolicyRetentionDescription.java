// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Enumerates the possible values for cleanup policy.
 */
public final class CleanupPolicyRetentionDescription extends ExpandableStringEnum<CleanupPolicyRetentionDescription> {
    /**
     * Static value Delete for CleanupPolicyRetentionDescription.
     */
    public static final CleanupPolicyRetentionDescription DELETE = fromString("Delete");

    /**
     * Static value Compaction for CleanupPolicyRetentionDescription.
     */
    public static final CleanupPolicyRetentionDescription COMPACTION = fromString("Compaction");

    /**
     * Creates a new instance of CleanupPolicyRetentionDescription value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CleanupPolicyRetentionDescription() {
    }

    /**
     * Creates or finds a CleanupPolicyRetentionDescription from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CleanupPolicyRetentionDescription.
     */
    @JsonCreator
    public static CleanupPolicyRetentionDescription fromString(String name) {
        return fromString(name, CleanupPolicyRetentionDescription.class);
    }

    /**
     * Gets known CleanupPolicyRetentionDescription values.
     * 
     * @return known CleanupPolicyRetentionDescription values.
     */
    public static Collection<CleanupPolicyRetentionDescription> values() {
        return values(CleanupPolicyRetentionDescription.class);
    }
}
