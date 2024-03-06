// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A2A specific policy details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
@Fluent
public final class A2APolicyDetails extends PolicyProviderSpecificDetails {
    /*
     * The recovery point threshold in minutes.
     */
    @JsonProperty(value = "recoveryPointThresholdInMinutes")
    private Integer recoveryPointThresholdInMinutes;

    /*
     * The duration in minutes until which the recovery points need to be stored.
     */
    @JsonProperty(value = "recoveryPointHistory")
    private Integer recoveryPointHistory;

    /*
     * The app consistent snapshot frequency in minutes.
     */
    @JsonProperty(value = "appConsistentFrequencyInMinutes")
    private Integer appConsistentFrequencyInMinutes;

    /*
     * A value indicating whether multi-VM sync has to be enabled.
     */
    @JsonProperty(value = "multiVmSyncStatus")
    private String multiVmSyncStatus;

    /*
     * The crash consistent snapshot frequency in minutes.
     */
    @JsonProperty(value = "crashConsistentFrequencyInMinutes")
    private Integer crashConsistentFrequencyInMinutes;

    /**
     * Creates an instance of A2APolicyDetails class.
     */
    public A2APolicyDetails() {
    }

    /**
     * Get the recoveryPointThresholdInMinutes property: The recovery point threshold in minutes.
     * 
     * @return the recoveryPointThresholdInMinutes value.
     */
    public Integer recoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes;
    }

    /**
     * Set the recoveryPointThresholdInMinutes property: The recovery point threshold in minutes.
     * 
     * @param recoveryPointThresholdInMinutes the recoveryPointThresholdInMinutes value to set.
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withRecoveryPointThresholdInMinutes(Integer recoveryPointThresholdInMinutes) {
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
        return this;
    }

    /**
     * Get the recoveryPointHistory property: The duration in minutes until which the recovery points need to be
     * stored.
     * 
     * @return the recoveryPointHistory value.
     */
    public Integer recoveryPointHistory() {
        return this.recoveryPointHistory;
    }

    /**
     * Set the recoveryPointHistory property: The duration in minutes until which the recovery points need to be
     * stored.
     * 
     * @param recoveryPointHistory the recoveryPointHistory value to set.
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withRecoveryPointHistory(Integer recoveryPointHistory) {
        this.recoveryPointHistory = recoveryPointHistory;
        return this;
    }

    /**
     * Get the appConsistentFrequencyInMinutes property: The app consistent snapshot frequency in minutes.
     * 
     * @return the appConsistentFrequencyInMinutes value.
     */
    public Integer appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the appConsistentFrequencyInMinutes property: The app consistent snapshot frequency in minutes.
     * 
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set.
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the multiVmSyncStatus property: A value indicating whether multi-VM sync has to be enabled.
     * 
     * @return the multiVmSyncStatus value.
     */
    public String multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * Set the multiVmSyncStatus property: A value indicating whether multi-VM sync has to be enabled.
     * 
     * @param multiVmSyncStatus the multiVmSyncStatus value to set.
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withMultiVmSyncStatus(String multiVmSyncStatus) {
        this.multiVmSyncStatus = multiVmSyncStatus;
        return this;
    }

    /**
     * Get the crashConsistentFrequencyInMinutes property: The crash consistent snapshot frequency in minutes.
     * 
     * @return the crashConsistentFrequencyInMinutes value.
     */
    public Integer crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crashConsistentFrequencyInMinutes property: The crash consistent snapshot frequency in minutes.
     * 
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set.
     * @return the A2APolicyDetails object itself.
     */
    public A2APolicyDetails withCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
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
