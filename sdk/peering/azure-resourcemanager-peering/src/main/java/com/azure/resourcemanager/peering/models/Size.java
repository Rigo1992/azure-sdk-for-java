// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Size. */
public final class Size extends ExpandableStringEnum<Size> {
    /** Static value Free for Size. */
    public static final Size FREE = fromString("Free");

    /** Static value Metered for Size. */
    public static final Size METERED = fromString("Metered");

    /** Static value Unlimited for Size. */
    public static final Size UNLIMITED = fromString("Unlimited");

    /**
     * Creates or finds a Size from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Size.
     */
    @JsonCreator
    public static Size fromString(String name) {
        return fromString(name, Size.class);
    }

    /** @return known Size values. */
    public static Collection<Size> values() {
        return values(Size.class);
    }
}
