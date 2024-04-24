// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Action to perform.
 */
public final class HeaderAction extends ExpandableStringEnum<HeaderAction> {
    /**
     * Static value Append for HeaderAction.
     */
    public static final HeaderAction APPEND = fromString("Append");

    /**
     * Static value Overwrite for HeaderAction.
     */
    public static final HeaderAction OVERWRITE = fromString("Overwrite");

    /**
     * Static value Delete for HeaderAction.
     */
    public static final HeaderAction DELETE = fromString("Delete");

    /**
     * Creates a new instance of HeaderAction value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HeaderAction() {
    }

    /**
     * Creates or finds a HeaderAction from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding HeaderAction.
     */
    @JsonCreator
    public static HeaderAction fromString(String name) {
        return fromString(name, HeaderAction.class);
    }

    /**
     * Gets known HeaderAction values.
     * 
     * @return known HeaderAction values.
     */
    public static Collection<HeaderAction> values() {
        return values(HeaderAction.class);
    }
}
