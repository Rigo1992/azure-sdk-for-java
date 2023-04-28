// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.models.AccessModeSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * An Azure Monitor PrivateLinkScope definition.
 */
@Fluent
public final class AzureMonitorPrivateLinkScopeInner extends Resource {
    /*
     * Properties that define a Azure Monitor PrivateLinkScope resource.
     */
    @JsonProperty(value = "properties", required = true)
    private AzureMonitorPrivateLinkScopeProperties innerProperties = new AzureMonitorPrivateLinkScopeProperties();

    /*
     * System data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of AzureMonitorPrivateLinkScopeInner class.
     */
    public AzureMonitorPrivateLinkScopeInner() {
    }

    /**
     * Get the innerProperties property: Properties that define a Azure Monitor PrivateLinkScope resource.
     *
     * @return the innerProperties value.
     */
    private AzureMonitorPrivateLinkScopeProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: System data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMonitorPrivateLinkScopeInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMonitorPrivateLinkScopeInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Current state of this PrivateLinkScope: whether or not is has been
     * provisioned within the resource group it is defined. Users cannot change this value but are able to read from
     * it. Values will include Provisioning ,Succeeded, Canceled and Failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Get the accessModeSettings property: Access mode settings.
     *
     * @return the accessModeSettings value.
     */
    public AccessModeSettings accessModeSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().accessModeSettings();
    }

    /**
     * Set the accessModeSettings property: Access mode settings.
     *
     * @param accessModeSettings the accessModeSettings value to set.
     * @return the AzureMonitorPrivateLinkScopeInner object itself.
     */
    public AzureMonitorPrivateLinkScopeInner withAccessModeSettings(AccessModeSettings accessModeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureMonitorPrivateLinkScopeProperties();
        }
        this.innerProperties().withAccessModeSettings(accessModeSettings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("Missing required property innerProperties in model AzureMonitorPrivateLinkScopeInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureMonitorPrivateLinkScopeInner.class);
}
