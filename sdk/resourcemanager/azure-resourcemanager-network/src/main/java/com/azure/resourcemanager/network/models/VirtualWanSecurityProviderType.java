// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The virtual wan security provider type.
 */
public final class VirtualWanSecurityProviderType extends ExpandableStringEnum<VirtualWanSecurityProviderType> {
    /**
     * Static value External for VirtualWanSecurityProviderType.
     */
    public static final VirtualWanSecurityProviderType EXTERNAL = fromString("External");

    /**
     * Static value Native for VirtualWanSecurityProviderType.
     */
    public static final VirtualWanSecurityProviderType NATIVE = fromString("Native");

    /**
     * Creates a new instance of VirtualWanSecurityProviderType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualWanSecurityProviderType() {
    }

    /**
     * Creates or finds a VirtualWanSecurityProviderType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VirtualWanSecurityProviderType.
     */
    @JsonCreator
    public static VirtualWanSecurityProviderType fromString(String name) {
        return fromString(name, VirtualWanSecurityProviderType.class);
    }

    /**
     * Gets known VirtualWanSecurityProviderType values.
     * 
     * @return known VirtualWanSecurityProviderType values.
     */
    public static Collection<VirtualWanSecurityProviderType> values() {
        return values(VirtualWanSecurityProviderType.class);
    }
}
