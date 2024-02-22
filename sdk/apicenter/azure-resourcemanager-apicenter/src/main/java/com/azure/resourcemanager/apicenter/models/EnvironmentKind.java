// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The kind of environment.
 */
public final class EnvironmentKind extends ExpandableStringEnum<EnvironmentKind> {
    /**
     * Static value development for EnvironmentKind.
     */
    public static final EnvironmentKind DEVELOPMENT = fromString("development");

    /**
     * Static value testing for EnvironmentKind.
     */
    public static final EnvironmentKind TESTING = fromString("testing");

    /**
     * Static value staging for EnvironmentKind.
     */
    public static final EnvironmentKind STAGING = fromString("staging");

    /**
     * Static value production for EnvironmentKind.
     */
    public static final EnvironmentKind PRODUCTION = fromString("production");

    /**
     * Creates a new instance of EnvironmentKind value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EnvironmentKind() {
    }

    /**
     * Creates or finds a EnvironmentKind from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EnvironmentKind.
     */
    @JsonCreator
    public static EnvironmentKind fromString(String name) {
        return fromString(name, EnvironmentKind.class);
    }

    /**
     * Gets known EnvironmentKind values.
     * 
     * @return known EnvironmentKind values.
     */
    public static Collection<EnvironmentKind> values() {
        return values(EnvironmentKind.class);
    }
}
