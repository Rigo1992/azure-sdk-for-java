// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Sub-protection policy which includes schedule and retention.
 */
@Fluent
public final class SubProtectionPolicy {
    /*
     * Type of backup policy type
     */
    @JsonProperty(value = "policyType")
    private PolicyType policyType;

    /*
     * Backup schedule specified as part of backup policy.
     */
    @JsonProperty(value = "schedulePolicy")
    private SchedulePolicy schedulePolicy;

    /*
     * Retention policy with the details on backup copy retention ranges.
     */
    @JsonProperty(value = "retentionPolicy")
    private RetentionPolicy retentionPolicy;

    /*
     * Tiering policy to automatically move RPs to another tier.
     * Key is Target Tier, defined in RecoveryPointTierType enum.
     * Tiering policy specifies the criteria to move RP to the target tier.
     */
    @JsonProperty(value = "tieringPolicy")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, TieringPolicy> tieringPolicy;

    /*
     * Snapshot Backup related fields for WorkloadType SaPHanaSystem
     */
    @JsonProperty(value = "snapshotBackupAdditionalDetails")
    private SnapshotBackupAdditionalDetails snapshotBackupAdditionalDetails;

    /**
     * Creates an instance of SubProtectionPolicy class.
     */
    public SubProtectionPolicy() {
    }

    /**
     * Get the policyType property: Type of backup policy type.
     * 
     * @return the policyType value.
     */
    public PolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set the policyType property: Type of backup policy type.
     * 
     * @param policyType the policyType value to set.
     * @return the SubProtectionPolicy object itself.
     */
    public SubProtectionPolicy withPolicyType(PolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get the schedulePolicy property: Backup schedule specified as part of backup policy.
     * 
     * @return the schedulePolicy value.
     */
    public SchedulePolicy schedulePolicy() {
        return this.schedulePolicy;
    }

    /**
     * Set the schedulePolicy property: Backup schedule specified as part of backup policy.
     * 
     * @param schedulePolicy the schedulePolicy value to set.
     * @return the SubProtectionPolicy object itself.
     */
    public SubProtectionPolicy withSchedulePolicy(SchedulePolicy schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
        return this;
    }

    /**
     * Get the retentionPolicy property: Retention policy with the details on backup copy retention ranges.
     * 
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: Retention policy with the details on backup copy retention ranges.
     * 
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the SubProtectionPolicy object itself.
     */
    public SubProtectionPolicy withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get the tieringPolicy property: Tiering policy to automatically move RPs to another tier.
     * Key is Target Tier, defined in RecoveryPointTierType enum.
     * Tiering policy specifies the criteria to move RP to the target tier.
     * 
     * @return the tieringPolicy value.
     */
    public Map<String, TieringPolicy> tieringPolicy() {
        return this.tieringPolicy;
    }

    /**
     * Set the tieringPolicy property: Tiering policy to automatically move RPs to another tier.
     * Key is Target Tier, defined in RecoveryPointTierType enum.
     * Tiering policy specifies the criteria to move RP to the target tier.
     * 
     * @param tieringPolicy the tieringPolicy value to set.
     * @return the SubProtectionPolicy object itself.
     */
    public SubProtectionPolicy withTieringPolicy(Map<String, TieringPolicy> tieringPolicy) {
        this.tieringPolicy = tieringPolicy;
        return this;
    }

    /**
     * Get the snapshotBackupAdditionalDetails property: Snapshot Backup related fields for WorkloadType SaPHanaSystem.
     * 
     * @return the snapshotBackupAdditionalDetails value.
     */
    public SnapshotBackupAdditionalDetails snapshotBackupAdditionalDetails() {
        return this.snapshotBackupAdditionalDetails;
    }

    /**
     * Set the snapshotBackupAdditionalDetails property: Snapshot Backup related fields for WorkloadType SaPHanaSystem.
     * 
     * @param snapshotBackupAdditionalDetails the snapshotBackupAdditionalDetails value to set.
     * @return the SubProtectionPolicy object itself.
     */
    public SubProtectionPolicy
        withSnapshotBackupAdditionalDetails(SnapshotBackupAdditionalDetails snapshotBackupAdditionalDetails) {
        this.snapshotBackupAdditionalDetails = snapshotBackupAdditionalDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schedulePolicy() != null) {
            schedulePolicy().validate();
        }
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
        if (tieringPolicy() != null) {
            tieringPolicy().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
        if (snapshotBackupAdditionalDetails() != null) {
            snapshotBackupAdditionalDetails().validate();
        }
    }
}
