// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of the extended location.
 */
public final class ExtendedLocationType extends ExpandableStringEnum<ExtendedLocationType> {
    /**
     * Static value EdgeZone for ExtendedLocationType.
     */
    public static final ExtendedLocationType EDGE_ZONE = fromString("EdgeZone");

    /**
     * Creates a new instance of ExtendedLocationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ExtendedLocationType() {
    }

    /**
     * Creates or finds a ExtendedLocationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ExtendedLocationType.
     */
    @JsonCreator
    public static ExtendedLocationType fromString(String name) {
        return fromString(name, ExtendedLocationType.class);
    }

    /**
     * Gets known ExtendedLocationType values.
     * 
     * @return known ExtendedLocationType values.
     */
    public static Collection<ExtendedLocationType> values() {
        return values(ExtendedLocationType.class);
    }
}
