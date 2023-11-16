// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Provisioning state of the partner namespace. */
public final class PartnerNamespaceProvisioningState extends ExpandableStringEnum<PartnerNamespaceProvisioningState> {
    /** Static value Creating for PartnerNamespaceProvisioningState. */
    public static final PartnerNamespaceProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for PartnerNamespaceProvisioningState. */
    public static final PartnerNamespaceProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for PartnerNamespaceProvisioningState. */
    public static final PartnerNamespaceProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for PartnerNamespaceProvisioningState. */
    public static final PartnerNamespaceProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for PartnerNamespaceProvisioningState. */
    public static final PartnerNamespaceProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for PartnerNamespaceProvisioningState. */
    public static final PartnerNamespaceProvisioningState FAILED = fromString("Failed");

    /**
     * Creates a new instance of PartnerNamespaceProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PartnerNamespaceProvisioningState() {
    }

    /**
     * Creates or finds a PartnerNamespaceProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartnerNamespaceProvisioningState.
     */
    @JsonCreator
    public static PartnerNamespaceProvisioningState fromString(String name) {
        return fromString(name, PartnerNamespaceProvisioningState.class);
    }

    /**
     * Gets known PartnerNamespaceProvisioningState values.
     *
     * @return known PartnerNamespaceProvisioningState values.
     */
    public static Collection<PartnerNamespaceProvisioningState> values() {
        return values(PartnerNamespaceProvisioningState.class);
    }
}
