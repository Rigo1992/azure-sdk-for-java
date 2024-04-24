// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The provisioning state of the last accepted operation.
 */
public final class FleetProvisioningState extends ExpandableStringEnum<FleetProvisioningState> {
    /**
     * Static value Succeeded for FleetProvisioningState.
     */
    public static final FleetProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for FleetProvisioningState.
     */
    public static final FleetProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for FleetProvisioningState.
     */
    public static final FleetProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Creating for FleetProvisioningState.
     */
    public static final FleetProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for FleetProvisioningState.
     */
    public static final FleetProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for FleetProvisioningState.
     */
    public static final FleetProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates a new instance of FleetProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FleetProvisioningState() {
    }

    /**
     * Creates or finds a FleetProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FleetProvisioningState.
     */
    @JsonCreator
    public static FleetProvisioningState fromString(String name) {
        return fromString(name, FleetProvisioningState.class);
    }

    /**
     * Gets known FleetProvisioningState values.
     * 
     * @return known FleetProvisioningState values.
     */
    public static Collection<FleetProvisioningState> values() {
        return values(FleetProvisioningState.class);
    }
}
