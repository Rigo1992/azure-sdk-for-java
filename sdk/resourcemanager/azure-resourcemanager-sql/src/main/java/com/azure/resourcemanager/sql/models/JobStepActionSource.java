// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The source of the action to execute. */
public final class JobStepActionSource extends ExpandableStringEnum<JobStepActionSource> {
    /** Static value Inline for JobStepActionSource. */
    public static final JobStepActionSource INLINE = fromString("Inline");

    /**
     * Creates a new instance of JobStepActionSource value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JobStepActionSource() {
    }

    /**
     * Creates or finds a JobStepActionSource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobStepActionSource.
     */
    @JsonCreator
    public static JobStepActionSource fromString(String name) {
        return fromString(name, JobStepActionSource.class);
    }

    /**
     * Gets known JobStepActionSource values.
     *
     * @return known JobStepActionSource values.
     */
    public static Collection<JobStepActionSource> values() {
        return values(JobStepActionSource.class);
    }
}
