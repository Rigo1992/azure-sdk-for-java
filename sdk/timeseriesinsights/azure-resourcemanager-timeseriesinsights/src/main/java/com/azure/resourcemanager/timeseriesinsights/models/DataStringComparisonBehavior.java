// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The reference data set key comparison behavior can be set using this property. By default, the value is 'Ordinal' -
 * which means case sensitive key comparison will be performed while joining reference data with events or while adding
 * new reference data. When 'OrdinalIgnoreCase' is set, case insensitive comparison will be used.
 */
public final class DataStringComparisonBehavior extends ExpandableStringEnum<DataStringComparisonBehavior> {
    /** Static value Ordinal for DataStringComparisonBehavior. */
    public static final DataStringComparisonBehavior ORDINAL = fromString("Ordinal");

    /** Static value OrdinalIgnoreCase for DataStringComparisonBehavior. */
    public static final DataStringComparisonBehavior ORDINAL_IGNORE_CASE = fromString("OrdinalIgnoreCase");

    /**
     * Creates a new instance of DataStringComparisonBehavior value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataStringComparisonBehavior() {
    }

    /**
     * Creates or finds a DataStringComparisonBehavior from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataStringComparisonBehavior.
     */
    @JsonCreator
    public static DataStringComparisonBehavior fromString(String name) {
        return fromString(name, DataStringComparisonBehavior.class);
    }

    /**
     * Gets known DataStringComparisonBehavior values.
     *
     * @return known DataStringComparisonBehavior values.
     */
    public static Collection<DataStringComparisonBehavior> values() {
        return values(DataStringComparisonBehavior.class);
    }
}
