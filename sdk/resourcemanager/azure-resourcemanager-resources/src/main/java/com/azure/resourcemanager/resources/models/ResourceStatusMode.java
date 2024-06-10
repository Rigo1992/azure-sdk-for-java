// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Current management state of the resource in the deployment stack.
 */
public final class ResourceStatusMode extends ExpandableStringEnum<ResourceStatusMode> {
    /**
     * Static value managed for ResourceStatusMode.
     */
    public static final ResourceStatusMode MANAGED = fromString("managed");

    /**
     * Static value removeDenyFailed for ResourceStatusMode.
     */
    public static final ResourceStatusMode REMOVE_DENY_FAILED = fromString("removeDenyFailed");

    /**
     * Static value deleteFailed for ResourceStatusMode.
     */
    public static final ResourceStatusMode DELETE_FAILED = fromString("deleteFailed");

    /**
     * Creates a new instance of ResourceStatusMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResourceStatusMode() {
    }

    /**
     * Creates or finds a ResourceStatusMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ResourceStatusMode.
     */
    @JsonCreator
    public static ResourceStatusMode fromString(String name) {
        return fromString(name, ResourceStatusMode.class);
    }

    /**
     * Gets known ResourceStatusMode values.
     * 
     * @return known ResourceStatusMode values.
     */
    public static Collection<ResourceStatusMode> values() {
        return values(ResourceStatusMode.class);
    }
}
