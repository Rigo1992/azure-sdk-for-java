// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** RELRO flag. */
public final class RelroFlag extends ExpandableStringEnum<RelroFlag> {
    /** Static value True for RelroFlag. */
    public static final RelroFlag TRUE = fromString("True");

    /** Static value False for RelroFlag. */
    public static final RelroFlag FALSE = fromString("False");

    /**
     * Creates a new instance of RelroFlag value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RelroFlag() {
    }

    /**
     * Creates or finds a RelroFlag from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RelroFlag.
     */
    @JsonCreator
    public static RelroFlag fromString(String name) {
        return fromString(name, RelroFlag.class);
    }

    /**
     * Gets known RelroFlag values.
     *
     * @return known RelroFlag values.
     */
    public static Collection<RelroFlag> values() {
        return values(RelroFlag.class);
    }
}