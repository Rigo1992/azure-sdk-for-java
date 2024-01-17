// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The IP version to use for cluster networking and IP assignment.
 */
public final class IpFamily extends ExpandableStringEnum<IpFamily> {
    /**
     * Static value IPv4 for IpFamily.
     */
    public static final IpFamily IPV4 = fromString("IPv4");

    /**
     * Static value IPv6 for IpFamily.
     */
    public static final IpFamily IPV6 = fromString("IPv6");

    /**
     * Creates a new instance of IpFamily value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IpFamily() {
    }

    /**
     * Creates or finds a IpFamily from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IpFamily.
     */
    @JsonCreator
    public static IpFamily fromString(String name) {
        return fromString(name, IpFamily.class);
    }

    /**
     * Gets known IpFamily values.
     *
     * @return known IpFamily values.
     */
    public static Collection<IpFamily> values() {
        return values(IpFamily.class);
    }
}
