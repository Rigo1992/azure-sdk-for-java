// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RequestSchemeMatchConditionParametersMatchValuesItem. */
public final class RequestSchemeMatchConditionParametersMatchValuesItem
    extends ExpandableStringEnum<RequestSchemeMatchConditionParametersMatchValuesItem> {
    /** Static value HTTP for RequestSchemeMatchConditionParametersMatchValuesItem. */
    public static final RequestSchemeMatchConditionParametersMatchValuesItem HTTP = fromString("HTTP");

    /** Static value HTTPS for RequestSchemeMatchConditionParametersMatchValuesItem. */
    public static final RequestSchemeMatchConditionParametersMatchValuesItem HTTPS = fromString("HTTPS");

    /**
     * Creates a new instance of RequestSchemeMatchConditionParametersMatchValuesItem value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RequestSchemeMatchConditionParametersMatchValuesItem() {
    }

    /**
     * Creates or finds a RequestSchemeMatchConditionParametersMatchValuesItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RequestSchemeMatchConditionParametersMatchValuesItem.
     */
    @JsonCreator
    public static RequestSchemeMatchConditionParametersMatchValuesItem fromString(String name) {
        return fromString(name, RequestSchemeMatchConditionParametersMatchValuesItem.class);
    }

    /**
     * Gets known RequestSchemeMatchConditionParametersMatchValuesItem values.
     *
     * @return known RequestSchemeMatchConditionParametersMatchValuesItem values.
     */
    public static Collection<RequestSchemeMatchConditionParametersMatchValuesItem> values() {
        return values(RequestSchemeMatchConditionParametersMatchValuesItem.class);
    }
}
