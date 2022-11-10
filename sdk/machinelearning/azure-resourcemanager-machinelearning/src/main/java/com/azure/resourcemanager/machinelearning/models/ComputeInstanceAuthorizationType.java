// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Compute Instance Authorization type.
 *
 * <p>The Compute Instance Authorization type. Available values are personal (default).
 */
public final class ComputeInstanceAuthorizationType extends ExpandableStringEnum<ComputeInstanceAuthorizationType> {
    /** Static value personal for ComputeInstanceAuthorizationType. */
    public static final ComputeInstanceAuthorizationType PERSONAL = fromString("personal");

    /**
     * Creates or finds a ComputeInstanceAuthorizationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ComputeInstanceAuthorizationType.
     */
    @JsonCreator
    public static ComputeInstanceAuthorizationType fromString(String name) {
        return fromString(name, ComputeInstanceAuthorizationType.class);
    }

    /**
     * Gets known ComputeInstanceAuthorizationType values.
     *
     * @return known ComputeInstanceAuthorizationType values.
     */
    public static Collection<ComputeInstanceAuthorizationType> values() {
        return values(ComputeInstanceAuthorizationType.class);
    }
}
