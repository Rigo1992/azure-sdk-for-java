// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PermissionProviderScope. */
public final class PermissionProviderScope extends ExpandableStringEnum<PermissionProviderScope> {
    /** Static value ResourceGroup for PermissionProviderScope. */
    public static final PermissionProviderScope RESOURCE_GROUP = fromString("ResourceGroup");

    /** Static value Subscription for PermissionProviderScope. */
    public static final PermissionProviderScope SUBSCRIPTION = fromString("Subscription");

    /** Static value Workspace for PermissionProviderScope. */
    public static final PermissionProviderScope WORKSPACE = fromString("Workspace");

    /**
     * Creates or finds a PermissionProviderScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PermissionProviderScope.
     */
    @JsonCreator
    public static PermissionProviderScope fromString(String name) {
        return fromString(name, PermissionProviderScope.class);
    }

    /**
     * Gets known PermissionProviderScope values.
     *
     * @return known PermissionProviderScope values.
     */
    public static Collection<PermissionProviderScope> values() {
        return values(PermissionProviderScope.class);
    }
}
