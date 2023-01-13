// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The time frame for pulling data for the forecast. If custom, then a specific time period must be provided. */
public final class ForecastTimeframeType extends ExpandableStringEnum<ForecastTimeframeType> {
    /** Static value MonthToDate for ForecastTimeframeType. */
    public static final ForecastTimeframeType MONTH_TO_DATE = fromString("MonthToDate");

    /** Static value BillingMonthToDate for ForecastTimeframeType. */
    public static final ForecastTimeframeType BILLING_MONTH_TO_DATE = fromString("BillingMonthToDate");

    /** Static value TheLastMonth for ForecastTimeframeType. */
    public static final ForecastTimeframeType THE_LAST_MONTH = fromString("TheLastMonth");

    /** Static value TheLastBillingMonth for ForecastTimeframeType. */
    public static final ForecastTimeframeType THE_LAST_BILLING_MONTH = fromString("TheLastBillingMonth");

    /** Static value WeekToDate for ForecastTimeframeType. */
    public static final ForecastTimeframeType WEEK_TO_DATE = fromString("WeekToDate");

    /** Static value Custom for ForecastTimeframeType. */
    public static final ForecastTimeframeType CUSTOM = fromString("Custom");

    /**
     * Creates a new instance of ForecastTimeframeType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ForecastTimeframeType() {
    }

    /**
     * Creates or finds a ForecastTimeframeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ForecastTimeframeType.
     */
    @JsonCreator
    public static ForecastTimeframeType fromString(String name) {
        return fromString(name, ForecastTimeframeType.class);
    }

    /**
     * Gets known ForecastTimeframeType values.
     *
     * @return known ForecastTimeframeType values.
     */
    public static Collection<ForecastTimeframeType> values() {
        return values(ForecastTimeframeType.class);
    }
}
