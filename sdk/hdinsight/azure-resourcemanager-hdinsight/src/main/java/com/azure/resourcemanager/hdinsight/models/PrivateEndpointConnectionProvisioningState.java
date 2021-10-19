// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PrivateEndpointConnectionProvisioningState. */
public final class PrivateEndpointConnectionProvisioningState
    extends ExpandableStringEnum<PrivateEndpointConnectionProvisioningState> {
    /** Static value InProgress for PrivateEndpointConnectionProvisioningState. */
    public static final PrivateEndpointConnectionProvisioningState IN_PROGRESS = fromString("InProgress");

    /** Static value Updating for PrivateEndpointConnectionProvisioningState. */
    public static final PrivateEndpointConnectionProvisioningState UPDATING = fromString("Updating");

    /** Static value Failed for PrivateEndpointConnectionProvisioningState. */
    public static final PrivateEndpointConnectionProvisioningState FAILED = fromString("Failed");

    /** Static value Succeeded for PrivateEndpointConnectionProvisioningState. */
    public static final PrivateEndpointConnectionProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for PrivateEndpointConnectionProvisioningState. */
    public static final PrivateEndpointConnectionProvisioningState CANCELED = fromString("Canceled");

    /** Static value Deleting for PrivateEndpointConnectionProvisioningState. */
    public static final PrivateEndpointConnectionProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a PrivateEndpointConnectionProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateEndpointConnectionProvisioningState.
     */
    @JsonCreator
    public static PrivateEndpointConnectionProvisioningState fromString(String name) {
        return fromString(name, PrivateEndpointConnectionProvisioningState.class);
    }

    /** @return known PrivateEndpointConnectionProvisioningState values. */
    public static Collection<PrivateEndpointConnectionProvisioningState> values() {
        return values(PrivateEndpointConnectionProvisioningState.class);
    }
}
