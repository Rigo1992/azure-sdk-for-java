// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.monitor.models.LogSettings;
import com.azure.resourcemanager.monitor.models.MetricSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The diagnostic setting resource.
 */
@Fluent
public final class DiagnosticSettingsResourceInner extends ProxyResource {
    /*
     * Properties of a Diagnostic Settings Resource.
     */
    @JsonProperty(value = "properties")
    private DiagnosticSettings innerProperties;

    /*
     * The system metadata related to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of DiagnosticSettingsResourceInner class.
     */
    public DiagnosticSettingsResourceInner() {
    }

    /**
     * Get the innerProperties property: Properties of a Diagnostic Settings Resource.
     *
     * @return the innerProperties value.
     */
    private DiagnosticSettings innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata related to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the storageAccountId property: The resource ID of the storage account to which you would like to send
     * Diagnostic Logs.
     *
     * @return the storageAccountId value.
     */
    public String storageAccountId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountId();
    }

    /**
     * Set the storageAccountId property: The resource ID of the storage account to which you would like to send
     * Diagnostic Logs.
     *
     * @param storageAccountId the storageAccountId value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withStorageAccountId(String storageAccountId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticSettings();
        }
        this.innerProperties().withStorageAccountId(storageAccountId);
        return this;
    }

    /**
     * Get the serviceBusRuleId property: The service bus rule Id of the diagnostic setting. This is here to maintain
     * backwards compatibility.
     *
     * @return the serviceBusRuleId value.
     */
    public String serviceBusRuleId() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceBusRuleId();
    }

    /**
     * Set the serviceBusRuleId property: The service bus rule Id of the diagnostic setting. This is here to maintain
     * backwards compatibility.
     *
     * @param serviceBusRuleId the serviceBusRuleId value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withServiceBusRuleId(String serviceBusRuleId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticSettings();
        }
        this.innerProperties().withServiceBusRuleId(serviceBusRuleId);
        return this;
    }

    /**
     * Get the eventHubAuthorizationRuleId property: The resource Id for the event hub authorization rule.
     *
     * @return the eventHubAuthorizationRuleId value.
     */
    public String eventHubAuthorizationRuleId() {
        return this.innerProperties() == null ? null : this.innerProperties().eventHubAuthorizationRuleId();
    }

    /**
     * Set the eventHubAuthorizationRuleId property: The resource Id for the event hub authorization rule.
     *
     * @param eventHubAuthorizationRuleId the eventHubAuthorizationRuleId value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withEventHubAuthorizationRuleId(String eventHubAuthorizationRuleId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticSettings();
        }
        this.innerProperties().withEventHubAuthorizationRuleId(eventHubAuthorizationRuleId);
        return this;
    }

    /**
     * Get the eventHubName property: The name of the event hub. If none is specified, the default event hub will be
     * selected.
     *
     * @return the eventHubName value.
     */
    public String eventHubName() {
        return this.innerProperties() == null ? null : this.innerProperties().eventHubName();
    }

    /**
     * Set the eventHubName property: The name of the event hub. If none is specified, the default event hub will be
     * selected.
     *
     * @param eventHubName the eventHubName value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withEventHubName(String eventHubName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticSettings();
        }
        this.innerProperties().withEventHubName(eventHubName);
        return this;
    }

    /**
     * Get the metrics property: The list of metric settings.
     *
     * @return the metrics value.
     */
    public List<MetricSettings> metrics() {
        return this.innerProperties() == null ? null : this.innerProperties().metrics();
    }

    /**
     * Set the metrics property: The list of metric settings.
     *
     * @param metrics the metrics value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withMetrics(List<MetricSettings> metrics) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticSettings();
        }
        this.innerProperties().withMetrics(metrics);
        return this;
    }

    /**
     * Get the logs property: The list of logs settings.
     *
     * @return the logs value.
     */
    public List<LogSettings> logs() {
        return this.innerProperties() == null ? null : this.innerProperties().logs();
    }

    /**
     * Set the logs property: The list of logs settings.
     *
     * @param logs the logs value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withLogs(List<LogSettings> logs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticSettings();
        }
        this.innerProperties().withLogs(logs);
        return this;
    }

    /**
     * Get the workspaceId property: The full ARM resource ID of the Log Analytics workspace to which you would like to
     * send Diagnostic Logs. Example:
     * /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.innerProperties() == null ? null : this.innerProperties().workspaceId();
    }

    /**
     * Set the workspaceId property: The full ARM resource ID of the Log Analytics workspace to which you would like to
     * send Diagnostic Logs. Example:
     * /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withWorkspaceId(String workspaceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticSettings();
        }
        this.innerProperties().withWorkspaceId(workspaceId);
        return this;
    }

    /**
     * Get the marketplacePartnerId property: The full ARM resource ID of the Marketplace resource to which you would
     * like to send Diagnostic Logs.
     *
     * @return the marketplacePartnerId value.
     */
    public String marketplacePartnerId() {
        return this.innerProperties() == null ? null : this.innerProperties().marketplacePartnerId();
    }

    /**
     * Set the marketplacePartnerId property: The full ARM resource ID of the Marketplace resource to which you would
     * like to send Diagnostic Logs.
     *
     * @param marketplacePartnerId the marketplacePartnerId value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withMarketplacePartnerId(String marketplacePartnerId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticSettings();
        }
        this.innerProperties().withMarketplacePartnerId(marketplacePartnerId);
        return this;
    }

    /**
     * Get the logAnalyticsDestinationType property: A string indicating whether the export to Log Analytics should use
     * the default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows:
     * &lt;normalized service identity&gt;_&lt;normalized category name&gt;. Possible values are: Dedicated and null
     * (null is default.).
     *
     * @return the logAnalyticsDestinationType value.
     */
    public String logAnalyticsDestinationType() {
        return this.innerProperties() == null ? null : this.innerProperties().logAnalyticsDestinationType();
    }

    /**
     * Set the logAnalyticsDestinationType property: A string indicating whether the export to Log Analytics should use
     * the default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows:
     * &lt;normalized service identity&gt;_&lt;normalized category name&gt;. Possible values are: Dedicated and null
     * (null is default.).
     *
     * @param logAnalyticsDestinationType the logAnalyticsDestinationType value to set.
     * @return the DiagnosticSettingsResourceInner object itself.
     */
    public DiagnosticSettingsResourceInner withLogAnalyticsDestinationType(String logAnalyticsDestinationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticSettings();
        }
        this.innerProperties().withLogAnalyticsDestinationType(logAnalyticsDestinationType);
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
