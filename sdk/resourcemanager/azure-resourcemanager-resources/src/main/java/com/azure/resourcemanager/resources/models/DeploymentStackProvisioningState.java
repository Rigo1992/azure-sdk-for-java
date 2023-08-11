// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** State of the deployment stack. */
public final class DeploymentStackProvisioningState extends ExpandableStringEnum<DeploymentStackProvisioningState> {
    /** Static value Creating for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState CREATING = fromString("Creating");

    /** Static value Validating for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState VALIDATING = fromString("Validating");

    /** Static value Waiting for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState WAITING = fromString("Waiting");

    /** Static value Deploying for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState DEPLOYING = fromString("Deploying");

    /** Static value Canceling for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState CANCELING = fromString("Canceling");

    /** Static value Locking for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState LOCKING = fromString("Locking");

    /** Static value DeletingResources for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState DELETING_RESOURCES = fromString("DeletingResources");

    /** Static value Succeeded for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState CANCELED = fromString("Canceled");

    /** Static value Deleting for DeploymentStackProvisioningState. */
    public static final DeploymentStackProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates a new instance of DeploymentStackProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeploymentStackProvisioningState() {
    }

    /**
     * Creates or finds a DeploymentStackProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeploymentStackProvisioningState.
     */
    @JsonCreator
    public static DeploymentStackProvisioningState fromString(String name) {
        return fromString(name, DeploymentStackProvisioningState.class);
    }

    /**
     * Gets known DeploymentStackProvisioningState values.
     *
     * @return known DeploymentStackProvisioningState values.
     */
    public static Collection<DeploymentStackProvisioningState> values() {
        return values(DeploymentStackProvisioningState.class);
    }
}
