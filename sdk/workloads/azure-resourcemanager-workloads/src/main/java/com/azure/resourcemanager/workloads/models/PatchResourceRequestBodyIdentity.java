// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import java.util.Map;

/** The PatchResourceRequestBodyIdentity model. */
@Fluent
public class PatchResourceRequestBodyIdentity extends UserAssignedServiceIdentity {
    /** {@inheritDoc} */
    @Override
    public PatchResourceRequestBodyIdentity withType(ManagedServiceIdentityType type) {
        super.withType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PatchResourceRequestBodyIdentity withUserAssignedIdentities(
        Map<String, UserAssignedIdentity> userAssignedIdentities) {
        super.withUserAssignedIdentities(userAssignedIdentities);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
