// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Describes the type of the alternative option.
 */
public final class AlternativeType extends ExpandableStringEnum<AlternativeType> {
    /**
     * Static value None for AlternativeType.
     */
    public static final AlternativeType NONE = fromString("None");

    /**
     * Static value Offer for AlternativeType.
     */
    public static final AlternativeType OFFER = fromString("Offer");

    /**
     * Static value Plan for AlternativeType.
     */
    public static final AlternativeType PLAN = fromString("Plan");

    /**
     * Creates a new instance of AlternativeType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AlternativeType() {
    }

    /**
     * Creates or finds a AlternativeType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AlternativeType.
     */
    @JsonCreator
    public static AlternativeType fromString(String name) {
        return fromString(name, AlternativeType.class);
    }

    /**
     * Gets known AlternativeType values.
     * 
     * @return known AlternativeType values.
     */
    public static Collection<AlternativeType> values() {
        return values(AlternativeType.class);
    }
}
