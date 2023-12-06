// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of the CDC attribute mapping. Note: 'Advanced' mapping type is also saved as 'Derived'.
 */
public final class MappingType extends ExpandableStringEnum<MappingType> {
    /**
     * Static value Direct for MappingType.
     */
    public static final MappingType DIRECT = fromString("Direct");

    /**
     * Static value Derived for MappingType.
     */
    public static final MappingType DERIVED = fromString("Derived");

    /**
     * Static value Aggregate for MappingType.
     */
    public static final MappingType AGGREGATE = fromString("Aggregate");

    /**
     * Creates a new instance of MappingType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MappingType() {
    }

    /**
     * Creates or finds a MappingType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MappingType.
     */
    @JsonCreator
    public static MappingType fromString(String name) {
        return fromString(name, MappingType.class);
    }

    /**
     * Gets known MappingType values.
     * 
     * @return known MappingType values.
     */
    public static Collection<MappingType> values() {
        return values(MappingType.class);
    }
}
