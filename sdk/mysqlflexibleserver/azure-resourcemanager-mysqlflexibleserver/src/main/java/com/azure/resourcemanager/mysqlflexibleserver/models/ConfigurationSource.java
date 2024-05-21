// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Source of the configuration.
 */
public final class ConfigurationSource extends ExpandableStringEnum<ConfigurationSource> {
    /**
     * Static value system-default for ConfigurationSource.
     */
    public static final ConfigurationSource SYSTEM_DEFAULT = fromString("system-default");

    /**
     * Static value user-override for ConfigurationSource.
     */
    public static final ConfigurationSource USER_OVERRIDE = fromString("user-override");

    /**
     * Creates a new instance of ConfigurationSource value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConfigurationSource() {
    }

    /**
     * Creates or finds a ConfigurationSource from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ConfigurationSource.
     */
    @JsonCreator
    public static ConfigurationSource fromString(String name) {
        return fromString(name, ConfigurationSource.class);
    }

    /**
     * Gets known ConfigurationSource values.
     * 
     * @return known ConfigurationSource values.
     */
    public static Collection<ConfigurationSource> values() {
        return values(ConfigurationSource.class);
    }
}
