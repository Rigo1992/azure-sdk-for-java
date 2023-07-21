// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.sql.models.BlobAuditingPolicyState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** A server DevOps auditing settings. */
@Fluent
public final class ServerDevOpsAuditingSettingsInner extends ProxyResource {
    /*
     * SystemData of ServerDevOpsAuditSettingsResource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ServerDevOpsAuditSettingsProperties innerProperties;

    /** Creates an instance of ServerDevOpsAuditingSettingsInner class. */
    public ServerDevOpsAuditingSettingsInner() {
    }

    /**
     * Get the systemData property: SystemData of ServerDevOpsAuditSettingsResource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ServerDevOpsAuditSettingsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the isAzureMonitorTargetEnabled property: Specifies whether DevOps audit events are sent to Azure Monitor. In
     * order to send the events to Azure Monitor, specify 'State' as 'Enabled' and 'IsAzureMonitorTargetEnabled' as
     * true.
     *
     * <p>When using REST API to configure DevOps audit, Diagnostic Settings with 'DevOpsOperationsAudit' diagnostic
     * logs category on the master database should be also created.
     *
     * <p>Diagnostic Settings URI format: PUT
     * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     *
     * <p>For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207) or
     * [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     *
     * @return the isAzureMonitorTargetEnabled value.
     */
    public Boolean isAzureMonitorTargetEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isAzureMonitorTargetEnabled();
    }

    /**
     * Set the isAzureMonitorTargetEnabled property: Specifies whether DevOps audit events are sent to Azure Monitor. In
     * order to send the events to Azure Monitor, specify 'State' as 'Enabled' and 'IsAzureMonitorTargetEnabled' as
     * true.
     *
     * <p>When using REST API to configure DevOps audit, Diagnostic Settings with 'DevOpsOperationsAudit' diagnostic
     * logs category on the master database should be also created.
     *
     * <p>Diagnostic Settings URI format: PUT
     * https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     *
     * <p>For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207) or
     * [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043).
     *
     * @param isAzureMonitorTargetEnabled the isAzureMonitorTargetEnabled value to set.
     * @return the ServerDevOpsAuditingSettingsInner object itself.
     */
    public ServerDevOpsAuditingSettingsInner withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerDevOpsAuditSettingsProperties();
        }
        this.innerProperties().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    /**
     * Get the isManagedIdentityInUse property: Specifies whether Managed Identity is used to access blob storage.
     *
     * @return the isManagedIdentityInUse value.
     */
    public Boolean isManagedIdentityInUse() {
        return this.innerProperties() == null ? null : this.innerProperties().isManagedIdentityInUse();
    }

    /**
     * Set the isManagedIdentityInUse property: Specifies whether Managed Identity is used to access blob storage.
     *
     * @param isManagedIdentityInUse the isManagedIdentityInUse value to set.
     * @return the ServerDevOpsAuditingSettingsInner object itself.
     */
    public ServerDevOpsAuditingSettingsInner withIsManagedIdentityInUse(Boolean isManagedIdentityInUse) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerDevOpsAuditSettingsProperties();
        }
        this.innerProperties().withIsManagedIdentityInUse(isManagedIdentityInUse);
        return this;
    }

    /**
     * Get the state property: Specifies the state of the audit. If state is Enabled, storageEndpoint or
     * isAzureMonitorTargetEnabled are required.
     *
     * @return the state value.
     */
    public BlobAuditingPolicyState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Specifies the state of the audit. If state is Enabled, storageEndpoint or
     * isAzureMonitorTargetEnabled are required.
     *
     * @param state the state value to set.
     * @return the ServerDevOpsAuditingSettingsInner object itself.
     */
    public ServerDevOpsAuditingSettingsInner withState(BlobAuditingPolicyState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerDevOpsAuditSettingsProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is
     * required.
     *
     * @return the storageEndpoint value.
     */
    public String storageEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().storageEndpoint();
    }

    /**
     * Set the storageEndpoint property: Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is
     * required.
     *
     * @param storageEndpoint the storageEndpoint value to set.
     * @return the ServerDevOpsAuditingSettingsInner object itself.
     */
    public ServerDevOpsAuditingSettingsInner withStorageEndpoint(String storageEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerDevOpsAuditSettingsProperties();
        }
        this.innerProperties().withStorageEndpoint(storageEndpoint);
        return this;
    }

    /**
     * Get the storageAccountAccessKey property: Specifies the identifier key of the auditing storage account. If state
     * is Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey will use SQL server
     * system-assigned managed identity to access the storage. Prerequisites for using managed identity authentication:
     * 1. Assign SQL Server a system-assigned managed identity in Azure Active Directory (AAD). 2. Grant SQL Server
     * identity access to the storage account by adding 'Storage Blob Data Contributor' RBAC role to the server
     * identity. For more information, see [Auditing to storage using Managed Identity
     * authentication](https://go.microsoft.com/fwlink/?linkid=2114355).
     *
     * @return the storageAccountAccessKey value.
     */
    public String storageAccountAccessKey() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountAccessKey();
    }

    /**
     * Set the storageAccountAccessKey property: Specifies the identifier key of the auditing storage account. If state
     * is Enabled and storageEndpoint is specified, not specifying the storageAccountAccessKey will use SQL server
     * system-assigned managed identity to access the storage. Prerequisites for using managed identity authentication:
     * 1. Assign SQL Server a system-assigned managed identity in Azure Active Directory (AAD). 2. Grant SQL Server
     * identity access to the storage account by adding 'Storage Blob Data Contributor' RBAC role to the server
     * identity. For more information, see [Auditing to storage using Managed Identity
     * authentication](https://go.microsoft.com/fwlink/?linkid=2114355).
     *
     * @param storageAccountAccessKey the storageAccountAccessKey value to set.
     * @return the ServerDevOpsAuditingSettingsInner object itself.
     */
    public ServerDevOpsAuditingSettingsInner withStorageAccountAccessKey(String storageAccountAccessKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerDevOpsAuditSettingsProperties();
        }
        this.innerProperties().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    /**
     * Get the storageAccountSubscriptionId property: Specifies the blob storage subscription Id.
     *
     * @return the storageAccountSubscriptionId value.
     */
    public UUID storageAccountSubscriptionId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountSubscriptionId();
    }

    /**
     * Set the storageAccountSubscriptionId property: Specifies the blob storage subscription Id.
     *
     * @param storageAccountSubscriptionId the storageAccountSubscriptionId value to set.
     * @return the ServerDevOpsAuditingSettingsInner object itself.
     */
    public ServerDevOpsAuditingSettingsInner withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerDevOpsAuditSettingsProperties();
        }
        this.innerProperties().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
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
