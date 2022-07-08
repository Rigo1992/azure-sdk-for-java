// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PartnerTopicProvisioningState. */
public final class PartnerTopicProvisioningState extends ExpandableStringEnum<PartnerTopicProvisioningState> {
    /** Static value Creating for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Canceled for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState CANCELED = fromString("Canceled");

    /** Static value Failed for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState FAILED = fromString("Failed");

    /** Static value IdleDueToMirroredChannelResourceDeletion for PartnerTopicProvisioningState. */
    public static final PartnerTopicProvisioningState IDLE_DUE_TO_MIRRORED_CHANNEL_RESOURCE_DELETION =
        fromString("IdleDueToMirroredChannelResourceDeletion");

    /**
     * Creates or finds a PartnerTopicProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartnerTopicProvisioningState.
     */
    @JsonCreator
    public static PartnerTopicProvisioningState fromString(String name) {
        return fromString(name, PartnerTopicProvisioningState.class);
    }

    /**
     * Gets known PartnerTopicProvisioningState values.
     *
     * @return known PartnerTopicProvisioningState values.
     */
    public static Collection<PartnerTopicProvisioningState> values() {
        return values(PartnerTopicProvisioningState.class);
    }
}
