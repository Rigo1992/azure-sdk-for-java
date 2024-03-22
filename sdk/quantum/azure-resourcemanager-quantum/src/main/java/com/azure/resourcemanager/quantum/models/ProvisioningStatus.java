// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Provisioning status field.
 */
public final class ProvisioningStatus extends ExpandableStringEnum<ProvisioningStatus> {
    /**
     * Static value Succeeded for ProvisioningStatus.
     */
    public static final ProvisioningStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Static value ProviderLaunching for ProvisioningStatus.
     */
    public static final ProvisioningStatus PROVIDER_LAUNCHING = fromString("ProviderLaunching");

    /**
     * Static value ProviderUpdating for ProvisioningStatus.
     */
    public static final ProvisioningStatus PROVIDER_UPDATING = fromString("ProviderUpdating");

    /**
     * Static value ProviderDeleting for ProvisioningStatus.
     */
    public static final ProvisioningStatus PROVIDER_DELETING = fromString("ProviderDeleting");

    /**
     * Static value ProviderProvisioning for ProvisioningStatus.
     */
    public static final ProvisioningStatus PROVIDER_PROVISIONING = fromString("ProviderProvisioning");

    /**
     * Static value Failed for ProvisioningStatus.
     */
    public static final ProvisioningStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of ProvisioningStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningStatus() {
    }

    /**
     * Creates or finds a ProvisioningStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisioningStatus.
     */
    @JsonCreator
    public static ProvisioningStatus fromString(String name) {
        return fromString(name, ProvisioningStatus.class);
    }

    /**
     * Gets known ProvisioningStatus values.
     * 
     * @return known ProvisioningStatus values.
     */
    public static Collection<ProvisioningStatus> values() {
        return values(ProvisioningStatus.class);
    }
}
