// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Preferred contact method. */
public final class PreferredContactMethod extends ExpandableStringEnum<PreferredContactMethod> {
    /** Static value email for PreferredContactMethod. */
    public static final PreferredContactMethod EMAIL = fromString("email");

    /** Static value phone for PreferredContactMethod. */
    public static final PreferredContactMethod PHONE = fromString("phone");

    /**
     * Creates a new instance of PreferredContactMethod value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PreferredContactMethod() {
    }

    /**
     * Creates or finds a PreferredContactMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PreferredContactMethod.
     */
    @JsonCreator
    public static PreferredContactMethod fromString(String name) {
        return fromString(name, PreferredContactMethod.class);
    }

    /**
     * Gets known PreferredContactMethod values.
     *
     * @return known PreferredContactMethod values.
     */
    public static Collection<PreferredContactMethod> values() {
        return values(PreferredContactMethod.class);
    }
}
