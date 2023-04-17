// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** State of the application accelerator. */
public final class ApplicationAcceleratorProvisioningState
    extends ExpandableStringEnum<ApplicationAcceleratorProvisioningState> {
    /** Static value Creating for ApplicationAcceleratorProvisioningState. */
    public static final ApplicationAcceleratorProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for ApplicationAcceleratorProvisioningState. */
    public static final ApplicationAcceleratorProvisioningState UPDATING = fromString("Updating");

    /** Static value Succeeded for ApplicationAcceleratorProvisioningState. */
    public static final ApplicationAcceleratorProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ApplicationAcceleratorProvisioningState. */
    public static final ApplicationAcceleratorProvisioningState FAILED = fromString("Failed");

    /** Static value Deleting for ApplicationAcceleratorProvisioningState. */
    public static final ApplicationAcceleratorProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates a new instance of ApplicationAcceleratorProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ApplicationAcceleratorProvisioningState() {
    }

    /**
     * Creates or finds a ApplicationAcceleratorProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationAcceleratorProvisioningState.
     */
    @JsonCreator
    public static ApplicationAcceleratorProvisioningState fromString(String name) {
        return fromString(name, ApplicationAcceleratorProvisioningState.class);
    }

    /**
     * Gets known ApplicationAcceleratorProvisioningState values.
     *
     * @return known ApplicationAcceleratorProvisioningState values.
     */
    public static Collection<ApplicationAcceleratorProvisioningState> values() {
        return values(ApplicationAcceleratorProvisioningState.class);
    }
}
