// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;

/**
 * The ARC autoprovisioning configuration.
 */
@Fluent
public final class DefenderForServersGcpOfferingArcAutoProvisioning extends ArcAutoProvisioningGcp {
    /**
     * Creates an instance of DefenderForServersGcpOfferingArcAutoProvisioning class.
     */
    public DefenderForServersGcpOfferingArcAutoProvisioning() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenderForServersGcpOfferingArcAutoProvisioning withEnabled(Boolean enabled) {
        super.withEnabled(enabled);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenderForServersGcpOfferingArcAutoProvisioning
        withConfiguration(ArcAutoProvisioningConfiguration configuration) {
        super.withConfiguration(configuration);
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
