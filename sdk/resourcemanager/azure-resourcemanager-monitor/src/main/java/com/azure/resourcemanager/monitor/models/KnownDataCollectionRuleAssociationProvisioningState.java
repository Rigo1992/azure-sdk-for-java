// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The resource provisioning state.
 */
public final class KnownDataCollectionRuleAssociationProvisioningState extends ExpandableStringEnum<KnownDataCollectionRuleAssociationProvisioningState> {
    /**
     * Static value Creating for KnownDataCollectionRuleAssociationProvisioningState.
     */
    public static final KnownDataCollectionRuleAssociationProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for KnownDataCollectionRuleAssociationProvisioningState.
     */
    public static final KnownDataCollectionRuleAssociationProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for KnownDataCollectionRuleAssociationProvisioningState.
     */
    public static final KnownDataCollectionRuleAssociationProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Succeeded for KnownDataCollectionRuleAssociationProvisioningState.
     */
    public static final KnownDataCollectionRuleAssociationProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for KnownDataCollectionRuleAssociationProvisioningState.
     */
    public static final KnownDataCollectionRuleAssociationProvisioningState FAILED = fromString("Failed");

    /**
     * Creates a new instance of KnownDataCollectionRuleAssociationProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KnownDataCollectionRuleAssociationProvisioningState() {
    }

    /**
     * Creates or finds a KnownDataCollectionRuleAssociationProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KnownDataCollectionRuleAssociationProvisioningState.
     */
    @JsonCreator
    public static KnownDataCollectionRuleAssociationProvisioningState fromString(String name) {
        return fromString(name, KnownDataCollectionRuleAssociationProvisioningState.class);
    }

    /**
     * Gets known KnownDataCollectionRuleAssociationProvisioningState values.
     * 
     * @return known KnownDataCollectionRuleAssociationProvisioningState values.
     */
    public static Collection<KnownDataCollectionRuleAssociationProvisioningState> values() {
        return values(KnownDataCollectionRuleAssociationProvisioningState.class);
    }
}
