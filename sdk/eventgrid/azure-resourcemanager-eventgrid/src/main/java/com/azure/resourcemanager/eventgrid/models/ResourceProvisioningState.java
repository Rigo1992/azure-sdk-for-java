// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Provisioning state of the Private Endpoint Connection.
 */
public final class ResourceProvisioningState extends ExpandableStringEnum<ResourceProvisioningState> {
    /**
     * Static value Creating for ResourceProvisioningState.
     */
    public static final ResourceProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for ResourceProvisioningState.
     */
    public static final ResourceProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for ResourceProvisioningState.
     */
    public static final ResourceProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Succeeded for ResourceProvisioningState.
     */
    public static final ResourceProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Canceled for ResourceProvisioningState.
     */
    public static final ResourceProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Failed for ResourceProvisioningState.
     */
    public static final ResourceProvisioningState FAILED = fromString("Failed");

    /**
     * Creates a new instance of ResourceProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ResourceProvisioningState() {
    }

    /**
     * Creates or finds a ResourceProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ResourceProvisioningState.
     */
    @JsonCreator
    public static ResourceProvisioningState fromString(String name) {
        return fromString(name, ResourceProvisioningState.class);
    }

    /**
     * Gets known ResourceProvisioningState values.
     * 
     * @return known ResourceProvisioningState values.
     */
    public static Collection<ResourceProvisioningState> values() {
        return values(ResourceProvisioningState.class);
    }
}
