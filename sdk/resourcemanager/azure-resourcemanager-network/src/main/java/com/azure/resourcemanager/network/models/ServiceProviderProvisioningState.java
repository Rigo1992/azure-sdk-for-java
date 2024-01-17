// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The ServiceProviderProvisioningState state of the resource.
 */
public final class ServiceProviderProvisioningState extends ExpandableStringEnum<ServiceProviderProvisioningState> {
    /**
     * Static value NotProvisioned for ServiceProviderProvisioningState.
     */
    public static final ServiceProviderProvisioningState NOT_PROVISIONED = fromString("NotProvisioned");

    /**
     * Static value Provisioning for ServiceProviderProvisioningState.
     */
    public static final ServiceProviderProvisioningState PROVISIONING = fromString("Provisioning");

    /**
     * Static value Provisioned for ServiceProviderProvisioningState.
     */
    public static final ServiceProviderProvisioningState PROVISIONED = fromString("Provisioned");

    /**
     * Static value Deprovisioning for ServiceProviderProvisioningState.
     */
    public static final ServiceProviderProvisioningState DEPROVISIONING = fromString("Deprovisioning");

    /**
     * Creates a new instance of ServiceProviderProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServiceProviderProvisioningState() {
    }

    /**
     * Creates or finds a ServiceProviderProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ServiceProviderProvisioningState.
     */
    @JsonCreator
    public static ServiceProviderProvisioningState fromString(String name) {
        return fromString(name, ServiceProviderProvisioningState.class);
    }

    /**
     * Gets known ServiceProviderProvisioningState values.
     * 
     * @return known ServiceProviderProvisioningState values.
     */
    public static Collection<ServiceProviderProvisioningState> values() {
        return values(ServiceProviderProvisioningState.class);
    }
}
