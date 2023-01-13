// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Describes if it is in detection mode or prevention mode at policy level. */
public final class PolicyMode extends ExpandableStringEnum<PolicyMode> {
    /** Static value Prevention for PolicyMode. */
    public static final PolicyMode PREVENTION = fromString("Prevention");

    /** Static value Detection for PolicyMode. */
    public static final PolicyMode DETECTION = fromString("Detection");

    /**
     * Creates a new instance of PolicyMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PolicyMode() {
    }

    /**
     * Creates or finds a PolicyMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PolicyMode.
     */
    @JsonCreator
    public static PolicyMode fromString(String name) {
        return fromString(name, PolicyMode.class);
    }

    /**
     * Gets known PolicyMode values.
     *
     * @return known PolicyMode values.
     */
    public static Collection<PolicyMode> values() {
        return values(PolicyMode.class);
    }
}
