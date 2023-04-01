// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The identity of the Batch pool, if configured. */
@Fluent
public final class BatchPoolIdentity {
    /*
     * The list of user identities associated with the Batch pool. The user identity
     * dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "type", required = true)
    private PoolIdentityType type;

    /*
     * The user identity dictionary key references will be ARM resource ids in the
     * form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private List<UserAssignedIdentity> userAssignedIdentities;

    /**
     * Creates an instance of BatchPoolIdentity class.
     *
     * @param type the type value to set.
     */
    @JsonCreator
    public BatchPoolIdentity(@JsonProperty(value = "type", required = true) PoolIdentityType type) {
        this.type = type;
    }

    /**
     * Get the type property: The list of user identities associated with the Batch pool. The user identity dictionary
     * key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the type value.
     */
    public PoolIdentityType getType() {
        return this.type;
    }

    /**
     * Get the userAssignedIdentities property: The user identity dictionary key references will be ARM resource ids in
     * the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value.
     */
    public List<UserAssignedIdentity> getUserAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The user identity dictionary key references will be ARM resource ids in
     * the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the BatchPoolIdentity object itself.
     */
    public BatchPoolIdentity setUserAssignedIdentities(List<UserAssignedIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }
}
