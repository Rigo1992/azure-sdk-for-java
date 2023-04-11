// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Grain which corresponds to value. */
public final class Grain extends ExpandableStringEnum<Grain> {
    /** Static value Hourly for Grain. */
    public static final Grain HOURLY = fromString("Hourly");

    /** Static value Daily for Grain. */
    public static final Grain DAILY = fromString("Daily");

    /** Static value Monthly for Grain. */
    public static final Grain MONTHLY = fromString("Monthly");

    /**
     * Creates a new instance of Grain value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Grain() {
    }

    /**
     * Creates or finds a Grain from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Grain.
     */
    @JsonCreator
    public static Grain fromString(String name) {
        return fromString(name, Grain.class);
    }

    /**
     * Gets known Grain values.
     *
     * @return known Grain values.
     */
    public static Collection<Grain> values() {
        return values(Grain.class);
    }
}
