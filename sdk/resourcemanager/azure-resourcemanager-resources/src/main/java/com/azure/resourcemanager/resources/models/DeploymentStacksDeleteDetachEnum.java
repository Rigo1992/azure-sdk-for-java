// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the action that should be taken on the resource when the deployment stack is deleted. Delete will attempt
 * to delete the resource from Azure. Detach will leave the resource in it's current state.
 */
public final class DeploymentStacksDeleteDetachEnum extends ExpandableStringEnum<DeploymentStacksDeleteDetachEnum> {
    /** Static value delete for DeploymentStacksDeleteDetachEnum. */
    public static final DeploymentStacksDeleteDetachEnum DELETE = fromString("delete");

    /** Static value detach for DeploymentStacksDeleteDetachEnum. */
    public static final DeploymentStacksDeleteDetachEnum DETACH = fromString("detach");

    /**
     * Creates a new instance of DeploymentStacksDeleteDetachEnum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeploymentStacksDeleteDetachEnum() {
    }

    /**
     * Creates or finds a DeploymentStacksDeleteDetachEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentStacksDeleteDetachEnum.
     */
    @JsonCreator
    public static DeploymentStacksDeleteDetachEnum fromString(String name) {
        return fromString(name, DeploymentStacksDeleteDetachEnum.class);
    }

    /**
     * Gets known DeploymentStacksDeleteDetachEnum values.
     *
     * @return known DeploymentStacksDeleteDetachEnum values.
     */
    public static Collection<DeploymentStacksDeleteDetachEnum> values() {
        return values(DeploymentStacksDeleteDetachEnum.class);
    }
}
