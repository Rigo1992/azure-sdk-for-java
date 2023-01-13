// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of canonical property value. */
public final class CanonicalPropertyValueType extends ExpandableStringEnum<CanonicalPropertyValueType> {
    /** Static value Numeric for CanonicalPropertyValueType. */
    public static final CanonicalPropertyValueType NUMERIC = fromString("Numeric");

    /** Static value Categorical for CanonicalPropertyValueType. */
    public static final CanonicalPropertyValueType CATEGORICAL = fromString("Categorical");

    /** Static value DerivedCategorical for CanonicalPropertyValueType. */
    public static final CanonicalPropertyValueType DERIVED_CATEGORICAL = fromString("DerivedCategorical");

    /** Static value DerivedNumeric for CanonicalPropertyValueType. */
    public static final CanonicalPropertyValueType DERIVED_NUMERIC = fromString("DerivedNumeric");

    /**
     * Creates a new instance of CanonicalPropertyValueType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CanonicalPropertyValueType() {
    }

    /**
     * Creates or finds a CanonicalPropertyValueType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CanonicalPropertyValueType.
     */
    @JsonCreator
    public static CanonicalPropertyValueType fromString(String name) {
        return fromString(name, CanonicalPropertyValueType.class);
    }

    /**
     * Gets known CanonicalPropertyValueType values.
     *
     * @return known CanonicalPropertyValueType values.
     */
    public static Collection<CanonicalPropertyValueType> values() {
        return values(CanonicalPropertyValueType.class);
    }
}
