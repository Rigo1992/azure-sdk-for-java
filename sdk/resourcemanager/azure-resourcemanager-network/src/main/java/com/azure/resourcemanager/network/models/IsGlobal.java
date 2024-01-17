// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Flag if global mesh is supported.
 */
public final class IsGlobal extends ExpandableStringEnum<IsGlobal> {
    /**
     * Static value False for IsGlobal.
     */
    public static final IsGlobal FALSE = fromString("False");

    /**
     * Static value True for IsGlobal.
     */
    public static final IsGlobal TRUE = fromString("True");

    /**
     * Creates a new instance of IsGlobal value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IsGlobal() {
    }

    /**
     * Creates or finds a IsGlobal from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IsGlobal.
     */
    @JsonCreator
    public static IsGlobal fromString(String name) {
        return fromString(name, IsGlobal.class);
    }

    /**
     * Gets known IsGlobal values.
     * 
     * @return known IsGlobal values.
     */
    public static Collection<IsGlobal> values() {
        return values(IsGlobal.class);
    }
}
