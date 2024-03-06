// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Enumerates possible Status of the resource.
 */
public final class ResourceStatus extends ExpandableStringEnum<ResourceStatus> {
    /**
     * Static value Creating for ResourceStatus.
     */
    public static final ResourceStatus CREATING = fromString("Creating");

    /**
     * Static value Created for ResourceStatus.
     */
    public static final ResourceStatus CREATED = fromString("Created");

    /**
     * Static value Failed for ResourceStatus.
     */
    public static final ResourceStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of ResourceStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResourceStatus() {
    }

    /**
     * Creates or finds a ResourceStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ResourceStatus.
     */
    @JsonCreator
    public static ResourceStatus fromString(String name) {
        return fromString(name, ResourceStatus.class);
    }

    /**
     * Gets known ResourceStatus values.
     * 
     * @return known ResourceStatus values.
     */
    public static Collection<ResourceStatus> values() {
        return values(ResourceStatus.class);
    }
}
