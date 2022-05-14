// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.synapse.models.ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Managed Identity Sql Control Settings Sql Control Settings for workspace managed identity. */
@Fluent
public final class ManagedIdentitySqlControlSettingsModelInner extends ProxyResource {
    /*
     * Managed Identity Sql Control Settings Sql Control Settings for workspace
     * managed identity
     */
    @JsonProperty(value = "properties")
    private ManagedIdentitySqlControlSettingsModelProperties innerProperties;

    /**
     * Get the innerProperties property: Managed Identity Sql Control Settings Sql Control Settings for workspace
     * managed identity.
     *
     * @return the innerProperties value.
     */
    private ManagedIdentitySqlControlSettingsModelProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the grantSqlControlToManagedIdentity property: Grant sql control to managed identity.
     *
     * @return the grantSqlControlToManagedIdentity value.
     */
    public ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity
        grantSqlControlToManagedIdentity() {
        return this.innerProperties() == null ? null : this.innerProperties().grantSqlControlToManagedIdentity();
    }

    /**
     * Set the grantSqlControlToManagedIdentity property: Grant sql control to managed identity.
     *
     * @param grantSqlControlToManagedIdentity the grantSqlControlToManagedIdentity value to set.
     * @return the ManagedIdentitySqlControlSettingsModelInner object itself.
     */
    public ManagedIdentitySqlControlSettingsModelInner withGrantSqlControlToManagedIdentity(
        ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentity
            grantSqlControlToManagedIdentity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedIdentitySqlControlSettingsModelProperties();
        }
        this.innerProperties().withGrantSqlControlToManagedIdentity(grantSqlControlToManagedIdentity);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
