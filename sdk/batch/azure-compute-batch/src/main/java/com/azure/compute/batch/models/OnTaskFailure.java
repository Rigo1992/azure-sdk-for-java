// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OnTaskFailure. */
public final class OnTaskFailure extends ExpandableStringEnum<OnTaskFailure> {

    /** Do nothing. The Job remains active unless terminated or disabled by some other means. */
    @Generated public static final OnTaskFailure NO_ACTION = fromString("noaction");

    /** Terminate the Job. The Job's terminateReason is set to 'AllTasksComplete'. */
    @Generated
    public static final OnTaskFailure PERFORM_EXIT_OPTIONS_JOB_ACTION = fromString("performexitoptionsjobaction");

    /**
     * Creates a new instance of OnTaskFailure value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public OnTaskFailure() {}

    /**
     * Creates or finds a OnTaskFailure from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OnTaskFailure.
     */
    @Generated
    @JsonCreator
    public static OnTaskFailure fromString(String name) {
        return fromString(name, OnTaskFailure.class);
    }

    /**
     * Gets known OnTaskFailure values.
     *
     * @return known OnTaskFailure values.
     */
    @Generated
    public static Collection<OnTaskFailure> values() {
        return values(OnTaskFailure.class);
    }
}
