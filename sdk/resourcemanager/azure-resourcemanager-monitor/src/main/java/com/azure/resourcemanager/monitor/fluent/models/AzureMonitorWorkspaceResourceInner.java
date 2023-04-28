// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.monitor.models.AzureMonitorWorkspaceDefaultIngestionSettings;
import com.azure.resourcemanager.monitor.models.AzureMonitorWorkspaceMetrics;
import com.azure.resourcemanager.monitor.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * An Azure Monitor Workspace definition.
 */
@Fluent
public final class AzureMonitorWorkspaceResourceInner extends Resource {
    /*
     * Resource properties
     */
    @JsonProperty(value = "properties")
    private AzureMonitorWorkspaceResourceProperties innerProperties;

    /*
     * Resource entity tag (ETag)
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of AzureMonitorWorkspaceResourceInner class.
     */
    public AzureMonitorWorkspaceResourceInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private AzureMonitorWorkspaceResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: Resource entity tag (ETag).
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
    public AzureMonitorWorkspaceResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMonitorWorkspaceResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the accountId property: The immutable ID of the Azure Monitor workspace. This property is read-only.
     *
     * @return the accountId value.
     */
    public String accountId() {
        return this.innerProperties() == null ? null : this.innerProperties().accountId();
    }

    /**
     * Get the metrics property: Information about metrics for the Azure Monitor workspace.
     *
     * @return the metrics value.
     */
    public AzureMonitorWorkspaceMetrics metrics() {
        return this.innerProperties() == null ? null : this.innerProperties().metrics();
    }

    /**
     * Get the provisioningState property: The provisioning state of the Azure Monitor workspace. Set to Succeeded if
     * everything is healthy.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the defaultIngestionSettings property: The Data Collection Rule and Endpoint used for ingestion by default.
     *
     * @return the defaultIngestionSettings value.
     */
    public AzureMonitorWorkspaceDefaultIngestionSettings defaultIngestionSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultIngestionSettings();
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
