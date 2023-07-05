// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The indication of whether this network will or will not perform IP address management and allocate IP addresses when
 * attached.
 */
public final class L3NetworkConfigurationIpamEnabled extends ExpandableStringEnum<L3NetworkConfigurationIpamEnabled> {
    /** Static value True for L3NetworkConfigurationIpamEnabled. */
    public static final L3NetworkConfigurationIpamEnabled TRUE = fromString("True");

    /** Static value False for L3NetworkConfigurationIpamEnabled. */
    public static final L3NetworkConfigurationIpamEnabled FALSE = fromString("False");

    /**
     * Creates a new instance of L3NetworkConfigurationIpamEnabled value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public L3NetworkConfigurationIpamEnabled() {
    }

    /**
     * Creates or finds a L3NetworkConfigurationIpamEnabled from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding L3NetworkConfigurationIpamEnabled.
     */
    @JsonCreator
    public static L3NetworkConfigurationIpamEnabled fromString(String name) {
        return fromString(name, L3NetworkConfigurationIpamEnabled.class);
    }

    /**
     * Gets known L3NetworkConfigurationIpamEnabled values.
     *
     * @return known L3NetworkConfigurationIpamEnabled values.
     */
    public static Collection<L3NetworkConfigurationIpamEnabled> values() {
        return values(L3NetworkConfigurationIpamEnabled.class);
    }
}