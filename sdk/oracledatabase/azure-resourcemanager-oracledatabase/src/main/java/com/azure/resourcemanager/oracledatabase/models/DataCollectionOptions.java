// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataCollectionOptions resource properties.
 */
@Fluent
public final class DataCollectionOptions {
    /*
     * Indicates whether diagnostic collection is enabled for the VM cluster/Cloud VM cluster/VMBM DBCS.
     */
    @JsonProperty(value = "isDiagnosticsEventsEnabled")
    private Boolean isDiagnosticsEventsEnabled;

    /*
     * Indicates whether health monitoring is enabled for the VM cluster / Cloud VM cluster / VMBM DBCS.
     */
    @JsonProperty(value = "isHealthMonitoringEnabled")
    private Boolean isHealthMonitoringEnabled;

    /*
     * Indicates whether incident logs and trace collection are enabled for the VM cluster / Cloud VM cluster / VMBM DBCS.
     */
    @JsonProperty(value = "isIncidentLogsEnabled")
    private Boolean isIncidentLogsEnabled;

    /**
     * Creates an instance of DataCollectionOptions class.
     */
    public DataCollectionOptions() {
    }

    /**
     * Get the isDiagnosticsEventsEnabled property: Indicates whether diagnostic collection is enabled for the VM
     * cluster/Cloud VM cluster/VMBM DBCS.
     * 
     * @return the isDiagnosticsEventsEnabled value.
     */
    public Boolean isDiagnosticsEventsEnabled() {
        return this.isDiagnosticsEventsEnabled;
    }

    /**
     * Set the isDiagnosticsEventsEnabled property: Indicates whether diagnostic collection is enabled for the VM
     * cluster/Cloud VM cluster/VMBM DBCS.
     * 
     * @param isDiagnosticsEventsEnabled the isDiagnosticsEventsEnabled value to set.
     * @return the DataCollectionOptions object itself.
     */
    public DataCollectionOptions withIsDiagnosticsEventsEnabled(Boolean isDiagnosticsEventsEnabled) {
        this.isDiagnosticsEventsEnabled = isDiagnosticsEventsEnabled;
        return this;
    }

    /**
     * Get the isHealthMonitoringEnabled property: Indicates whether health monitoring is enabled for the VM cluster /
     * Cloud VM cluster / VMBM DBCS.
     * 
     * @return the isHealthMonitoringEnabled value.
     */
    public Boolean isHealthMonitoringEnabled() {
        return this.isHealthMonitoringEnabled;
    }

    /**
     * Set the isHealthMonitoringEnabled property: Indicates whether health monitoring is enabled for the VM cluster /
     * Cloud VM cluster / VMBM DBCS.
     * 
     * @param isHealthMonitoringEnabled the isHealthMonitoringEnabled value to set.
     * @return the DataCollectionOptions object itself.
     */
    public DataCollectionOptions withIsHealthMonitoringEnabled(Boolean isHealthMonitoringEnabled) {
        this.isHealthMonitoringEnabled = isHealthMonitoringEnabled;
        return this;
    }

    /**
     * Get the isIncidentLogsEnabled property: Indicates whether incident logs and trace collection are enabled for the
     * VM cluster / Cloud VM cluster / VMBM DBCS.
     * 
     * @return the isIncidentLogsEnabled value.
     */
    public Boolean isIncidentLogsEnabled() {
        return this.isIncidentLogsEnabled;
    }

    /**
     * Set the isIncidentLogsEnabled property: Indicates whether incident logs and trace collection are enabled for the
     * VM cluster / Cloud VM cluster / VMBM DBCS.
     * 
     * @param isIncidentLogsEnabled the isIncidentLogsEnabled value to set.
     * @return the DataCollectionOptions object itself.
     */
    public DataCollectionOptions withIsIncidentLogsEnabled(Boolean isIncidentLogsEnabled) {
        this.isIncidentLogsEnabled = isIncidentLogsEnabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
