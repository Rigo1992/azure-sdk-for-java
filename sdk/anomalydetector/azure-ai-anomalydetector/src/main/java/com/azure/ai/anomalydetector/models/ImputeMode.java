// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ImputeMode. */
public final class ImputeMode extends ExpandableStringEnum<ImputeMode> {
    /** Static value auto for ImputeMode. */
    public static final ImputeMode AUTO = fromString("auto");

    /** Static value previous for ImputeMode. */
    public static final ImputeMode PREVIOUS = fromString("previous");

    /** Static value linear for ImputeMode. */
    public static final ImputeMode LINEAR = fromString("linear");

    /** Static value fixed for ImputeMode. */
    public static final ImputeMode FIXED = fromString("fixed");

    /** Static value zero for ImputeMode. */
    public static final ImputeMode ZERO = fromString("zero");

    /** Static value notFill for ImputeMode. */
    public static final ImputeMode NOT_FILL = fromString("notFill");

    /**
     * Creates a new instance of ImputeMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ImputeMode() {}

    /**
     * Creates or finds a ImputeMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImputeMode.
     */
    @JsonCreator
    public static ImputeMode fromString(String name) {
        return fromString(name, ImputeMode.class);
    }

    /**
     * Gets known ImputeMode values.
     *
     * @return known ImputeMode values.
     */
    public static Collection<ImputeMode> values() {
        return values(ImputeMode.class);
    }
}
