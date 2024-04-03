// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Voice kind type.
 */
public final class VoiceKindInternal extends ExpandableStringEnum<VoiceKindInternal> {
    /**
     * Static value male for VoiceKindInternal.
     */
    public static final VoiceKindInternal MALE = fromString("male");

    /**
     * Static value female for VoiceKindInternal.
     */
    public static final VoiceKindInternal FEMALE = fromString("female");

    /**
     * Creates a new instance of VoiceKindInternal value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VoiceKindInternal() {
    }

    /**
     * Creates or finds a VoiceKindInternal from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VoiceKindInternal.
     */
    @JsonCreator
    public static VoiceKindInternal fromString(String name) {
        return fromString(name, VoiceKindInternal.class);
    }

    /**
     * Gets known VoiceKindInternal values.
     * 
     * @return known VoiceKindInternal values.
     */
    public static Collection<VoiceKindInternal> values() {
        return values(VoiceKindInternal.class);
    }
}
