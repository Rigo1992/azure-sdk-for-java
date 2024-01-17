// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
 */
public final class AdvancedFilterOperatorType extends ExpandableStringEnum<AdvancedFilterOperatorType> {
    /**
     * Static value NumberIn for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType NUMBER_IN = fromString("NumberIn");

    /**
     * Static value NumberNotIn for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType NUMBER_NOT_IN = fromString("NumberNotIn");

    /**
     * Static value NumberLessThan for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType NUMBER_LESS_THAN = fromString("NumberLessThan");

    /**
     * Static value NumberGreaterThan for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType NUMBER_GREATER_THAN = fromString("NumberGreaterThan");

    /**
     * Static value NumberLessThanOrEquals for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType NUMBER_LESS_THAN_OR_EQUALS = fromString("NumberLessThanOrEquals");

    /**
     * Static value NumberGreaterThanOrEquals for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType NUMBER_GREATER_THAN_OR_EQUALS
        = fromString("NumberGreaterThanOrEquals");

    /**
     * Static value BoolEquals for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType BOOL_EQUALS = fromString("BoolEquals");

    /**
     * Static value StringIn for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType STRING_IN = fromString("StringIn");

    /**
     * Static value StringNotIn for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType STRING_NOT_IN = fromString("StringNotIn");

    /**
     * Static value StringBeginsWith for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType STRING_BEGINS_WITH = fromString("StringBeginsWith");

    /**
     * Static value StringEndsWith for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType STRING_ENDS_WITH = fromString("StringEndsWith");

    /**
     * Static value StringContains for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType STRING_CONTAINS = fromString("StringContains");

    /**
     * Static value NumberInRange for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType NUMBER_IN_RANGE = fromString("NumberInRange");

    /**
     * Static value NumberNotInRange for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType NUMBER_NOT_IN_RANGE = fromString("NumberNotInRange");

    /**
     * Static value StringNotBeginsWith for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType STRING_NOT_BEGINS_WITH = fromString("StringNotBeginsWith");

    /**
     * Static value StringNotEndsWith for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType STRING_NOT_ENDS_WITH = fromString("StringNotEndsWith");

    /**
     * Static value StringNotContains for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType STRING_NOT_CONTAINS = fromString("StringNotContains");

    /**
     * Static value IsNullOrUndefined for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType IS_NULL_OR_UNDEFINED = fromString("IsNullOrUndefined");

    /**
     * Static value IsNotNull for AdvancedFilterOperatorType.
     */
    public static final AdvancedFilterOperatorType IS_NOT_NULL = fromString("IsNotNull");

    /**
     * Creates a new instance of AdvancedFilterOperatorType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AdvancedFilterOperatorType() {
    }

    /**
     * Creates or finds a AdvancedFilterOperatorType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AdvancedFilterOperatorType.
     */
    @JsonCreator
    public static AdvancedFilterOperatorType fromString(String name) {
        return fromString(name, AdvancedFilterOperatorType.class);
    }

    /**
     * Gets known AdvancedFilterOperatorType values.
     * 
     * @return known AdvancedFilterOperatorType values.
     */
    public static Collection<AdvancedFilterOperatorType> values() {
        return values(AdvancedFilterOperatorType.class);
    }
}
