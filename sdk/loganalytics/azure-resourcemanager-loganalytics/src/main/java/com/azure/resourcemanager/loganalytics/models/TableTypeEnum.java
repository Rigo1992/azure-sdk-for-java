// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TableTypeEnum. */
public final class TableTypeEnum extends ExpandableStringEnum<TableTypeEnum> {
    /** Static value Microsoft for TableTypeEnum. */
    public static final TableTypeEnum MICROSOFT = fromString("Microsoft");

    /** Static value CustomLog for TableTypeEnum. */
    public static final TableTypeEnum CUSTOM_LOG = fromString("CustomLog");

    /** Static value RestoredLogs for TableTypeEnum. */
    public static final TableTypeEnum RESTORED_LOGS = fromString("RestoredLogs");

    /** Static value SearchResults for TableTypeEnum. */
    public static final TableTypeEnum SEARCH_RESULTS = fromString("SearchResults");

    /**
     * Creates or finds a TableTypeEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TableTypeEnum.
     */
    @JsonCreator
    public static TableTypeEnum fromString(String name) {
        return fromString(name, TableTypeEnum.class);
    }

    /**
     * Gets known TableTypeEnum values.
     *
     * @return known TableTypeEnum values.
     */
    public static Collection<TableTypeEnum> values() {
        return values(TableTypeEnum.class);
    }
}
