// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Provisioning state of the resource. */
public final class CommunicationServicesProvisioningState
    extends ExpandableStringEnum<CommunicationServicesProvisioningState> {
    /** Static value Unknown for CommunicationServicesProvisioningState. */
    public static final CommunicationServicesProvisioningState UNKNOWN = fromString("Unknown");

    /** Static value Succeeded for CommunicationServicesProvisioningState. */
    public static final CommunicationServicesProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for CommunicationServicesProvisioningState. */
    public static final CommunicationServicesProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for CommunicationServicesProvisioningState. */
    public static final CommunicationServicesProvisioningState CANCELED = fromString("Canceled");

    /** Static value Running for CommunicationServicesProvisioningState. */
    public static final CommunicationServicesProvisioningState RUNNING = fromString("Running");

    /** Static value Creating for CommunicationServicesProvisioningState. */
    public static final CommunicationServicesProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for CommunicationServicesProvisioningState. */
    public static final CommunicationServicesProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for CommunicationServicesProvisioningState. */
    public static final CommunicationServicesProvisioningState DELETING = fromString("Deleting");

    /** Static value Moving for CommunicationServicesProvisioningState. */
    public static final CommunicationServicesProvisioningState MOVING = fromString("Moving");

    /**
     * Creates a new instance of CommunicationServicesProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CommunicationServicesProvisioningState() {
    }

    /**
     * Creates or finds a CommunicationServicesProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CommunicationServicesProvisioningState.
     */
    @JsonCreator
    public static CommunicationServicesProvisioningState fromString(String name) {
        return fromString(name, CommunicationServicesProvisioningState.class);
    }

    /**
     * Gets known CommunicationServicesProvisioningState values.
     *
     * @return known CommunicationServicesProvisioningState values.
     */
    public static Collection<CommunicationServicesProvisioningState> values() {
        return values(CommunicationServicesProvisioningState.class);
    }
}
