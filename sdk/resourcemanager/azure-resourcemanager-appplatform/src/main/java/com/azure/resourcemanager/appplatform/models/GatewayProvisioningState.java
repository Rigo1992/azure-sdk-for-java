// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * State of the Spring Cloud Gateway.
 */
public final class GatewayProvisioningState extends ExpandableStringEnum<GatewayProvisioningState> {
    /**
     * Static value Creating for GatewayProvisioningState.
     */
    public static final GatewayProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for GatewayProvisioningState.
     */
    public static final GatewayProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Succeeded for GatewayProvisioningState.
     */
    public static final GatewayProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for GatewayProvisioningState.
     */
    public static final GatewayProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Deleting for GatewayProvisioningState.
     */
    public static final GatewayProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates a new instance of GatewayProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GatewayProvisioningState() {
    }

    /**
     * Creates or finds a GatewayProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding GatewayProvisioningState.
     */
    @JsonCreator
    public static GatewayProvisioningState fromString(String name) {
        return fromString(name, GatewayProvisioningState.class);
    }

    /**
     * Gets known GatewayProvisioningState values.
     * 
     * @return known GatewayProvisioningState values.
     */
    public static Collection<GatewayProvisioningState> values() {
        return values(GatewayProvisioningState.class);
    }
}
