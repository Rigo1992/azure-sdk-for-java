// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Programmatic code for the status of the assessment. */
public final class SubAssessmentStatusCode extends ExpandableStringEnum<SubAssessmentStatusCode> {
    /** Static value Healthy for SubAssessmentStatusCode. */
    public static final SubAssessmentStatusCode HEALTHY = fromString("Healthy");

    /** Static value Unhealthy for SubAssessmentStatusCode. */
    public static final SubAssessmentStatusCode UNHEALTHY = fromString("Unhealthy");

    /** Static value NotApplicable for SubAssessmentStatusCode. */
    public static final SubAssessmentStatusCode NOT_APPLICABLE = fromString("NotApplicable");

    /**
     * Creates a new instance of SubAssessmentStatusCode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SubAssessmentStatusCode() {
    }

    /**
     * Creates or finds a SubAssessmentStatusCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SubAssessmentStatusCode.
     */
    @JsonCreator
    public static SubAssessmentStatusCode fromString(String name) {
        return fromString(name, SubAssessmentStatusCode.class);
    }

    /**
     * Gets known SubAssessmentStatusCode values.
     *
     * @return known SubAssessmentStatusCode values.
     */
    public static Collection<SubAssessmentStatusCode> values() {
        return values(SubAssessmentStatusCode.class);
    }
}
