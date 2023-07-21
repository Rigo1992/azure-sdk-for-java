// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of action being executed by the job step. */
public final class JobStepActionType extends ExpandableStringEnum<JobStepActionType> {
    /** Static value TSql for JobStepActionType. */
    public static final JobStepActionType TSQL = fromString("TSql");

    /**
     * Creates a new instance of JobStepActionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JobStepActionType() {
    }

    /**
     * Creates or finds a JobStepActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JobStepActionType.
     */
    @JsonCreator
    public static JobStepActionType fromString(String name) {
        return fromString(name, JobStepActionType.class);
    }

    /**
     * Gets known JobStepActionType values.
     *
     * @return known JobStepActionType values.
     */
    public static Collection<JobStepActionType> values() {
        return values(JobStepActionType.class);
    }
}
