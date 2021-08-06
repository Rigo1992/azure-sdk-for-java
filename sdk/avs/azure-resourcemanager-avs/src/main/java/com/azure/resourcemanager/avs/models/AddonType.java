// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AddonType. */
public final class AddonType extends ExpandableStringEnum<AddonType> {
    /** Static value SRM for AddonType. */
    public static final AddonType SRM = fromString("SRM");

    /** Static value VR for AddonType. */
    public static final AddonType VR = fromString("VR");

    /** Static value HCX for AddonType. */
    public static final AddonType HCX = fromString("HCX");

    /**
     * Creates or finds a AddonType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AddonType.
     */
    @JsonCreator
    public static AddonType fromString(String name) {
        return fromString(name, AddonType.class);
    }

    /** @return known AddonType values. */
    public static Collection<AddonType> values() {
        return values(AddonType.class);
    }
}
