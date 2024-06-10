// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Status result of the activity when the state is set to Inactive. This is an optional property and if not provided
 * when the activity is inactive, the status will be Succeeded by default.
 */
public final class ActivityOnInactiveMarkAs extends ExpandableStringEnum<ActivityOnInactiveMarkAs> {
    /** Static value Succeeded for ActivityOnInactiveMarkAs. */
    public static final ActivityOnInactiveMarkAs SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ActivityOnInactiveMarkAs. */
    public static final ActivityOnInactiveMarkAs FAILED = fromString("Failed");

    /** Static value Skipped for ActivityOnInactiveMarkAs. */
    public static final ActivityOnInactiveMarkAs SKIPPED = fromString("Skipped");

    /**
     * Creates a new instance of ActivityOnInactiveMarkAs value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ActivityOnInactiveMarkAs() {}

    /**
     * Creates or finds a ActivityOnInactiveMarkAs from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ActivityOnInactiveMarkAs.
     */
    @JsonCreator
    public static ActivityOnInactiveMarkAs fromString(String name) {
        return fromString(name, ActivityOnInactiveMarkAs.class);
    }

    /**
     * Gets known ActivityOnInactiveMarkAs values.
     *
     * @return known ActivityOnInactiveMarkAs values.
     */
    public static Collection<ActivityOnInactiveMarkAs> values() {
        return values(ActivityOnInactiveMarkAs.class);
    }
}
