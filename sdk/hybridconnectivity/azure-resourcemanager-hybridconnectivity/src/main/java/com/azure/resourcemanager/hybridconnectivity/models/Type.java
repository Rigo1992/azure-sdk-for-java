// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of endpoint. */
public final class Type extends ExpandableStringEnum<Type> {
    /** Static value default for Type. */
    public static final Type DEFAULT = fromString("default");

    /** Static value custom for Type. */
    public static final Type CUSTOM = fromString("custom");

    /**
     * Creates a new instance of Type value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Type() {
    }

    /**
     * Creates or finds a Type from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Type.
     */
    @JsonCreator
    public static Type fromString(String name) {
        return fromString(name, Type.class);
    }

    /**
     * Gets known Type values.
     *
     * @return known Type values.
     */
    public static Collection<Type> values() {
        return values(Type.class);
    }
}
