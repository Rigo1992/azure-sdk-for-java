// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Gets or sets the status. */
public final class PrivateEndpointConnectionStatus extends ExpandableStringEnum<PrivateEndpointConnectionStatus> {
    /** Static value Pending for PrivateEndpointConnectionStatus. */
    public static final PrivateEndpointConnectionStatus PENDING = fromString("Pending");

    /** Static value Approved for PrivateEndpointConnectionStatus. */
    public static final PrivateEndpointConnectionStatus APPROVED = fromString("Approved");

    /** Static value Rejected for PrivateEndpointConnectionStatus. */
    public static final PrivateEndpointConnectionStatus REJECTED = fromString("Rejected");

    /** Static value Disconnected for PrivateEndpointConnectionStatus. */
    public static final PrivateEndpointConnectionStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a PrivateEndpointConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointConnectionStatus.
     */
    @JsonCreator
    public static PrivateEndpointConnectionStatus fromString(String name) {
        return fromString(name, PrivateEndpointConnectionStatus.class);
    }

    /**
     * Gets known PrivateEndpointConnectionStatus values.
     *
     * @return known PrivateEndpointConnectionStatus values.
     */
    public static Collection<PrivateEndpointConnectionStatus> values() {
        return values(PrivateEndpointConnectionStatus.class);
    }
}
