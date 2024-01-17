// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Network dataplane used in the Kubernetes cluster.
 */
public final class NetworkDataplane extends ExpandableStringEnum<NetworkDataplane> {
    /**
     * Static value azure for NetworkDataplane.
     */
    public static final NetworkDataplane AZURE = fromString("azure");

    /**
     * Static value cilium for NetworkDataplane.
     */
    public static final NetworkDataplane CILIUM = fromString("cilium");

    /**
     * Creates a new instance of NetworkDataplane value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NetworkDataplane() {
    }

    /**
     * Creates or finds a NetworkDataplane from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkDataplane.
     */
    @JsonCreator
    public static NetworkDataplane fromString(String name) {
        return fromString(name, NetworkDataplane.class);
    }

    /**
     * Gets known NetworkDataplane values.
     *
     * @return known NetworkDataplane values.
     */
    public static Collection<NetworkDataplane> values() {
        return values(NetworkDataplane.class);
    }
}
