// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Azure VM workload-specific protected item representing SAP HANA DBInstance.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("AzureVmWorkloadSAPHanaDBInstance")
@Fluent
public final class AzureVmWorkloadSapHanaDBInstanceProtectedItem extends AzureVmWorkloadProtectedItem {
    /**
     * Creates an instance of AzureVmWorkloadSapHanaDBInstanceProtectedItem class.
     */
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withParentType(String parentType) {
        super.withParentType(parentType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withProtectionState(ProtectionState protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withLastBackupStatus(LastBackupStatus lastBackupStatus) {
        super.withLastBackupStatus(lastBackupStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withLastBackupTime(OffsetDateTime lastBackupTime) {
        super.withLastBackupTime(lastBackupTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withLastBackupErrorDetail(ErrorDetail lastBackupErrorDetail) {
        super.withLastBackupErrorDetail(lastBackupErrorDetail);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem
        withProtectedItemDataSourceId(String protectedItemDataSourceId) {
        super.withProtectedItemDataSourceId(protectedItemDataSourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem
        withProtectedItemHealthStatus(ProtectedItemHealthStatus protectedItemHealthStatus) {
        super.withProtectedItemHealthStatus(protectedItemHealthStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem
        withExtendedInfo(AzureVmWorkloadProtectedItemExtendedInfo extendedInfo) {
        super.withExtendedInfo(extendedInfo);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem
        withKpisHealths(Map<String, KpiResourceHealthDetails> kpisHealths) {
        super.withKpisHealths(kpisHealths);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withNodesList(List<DistributedNodesInfo> nodesList) {
        super.withNodesList(nodesList);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withContainerName(String containerName) {
        super.withContainerName(containerName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        super.withLastRecoveryPoint(lastRecoveryPoint);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withBackupSetName(String backupSetName) {
        super.withBackupSetName(backupSetName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withCreateMode(CreateMode createMode) {
        super.withCreateMode(createMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem
        withDeferredDeleteTimeInUtc(OffsetDateTime deferredDeleteTimeInUtc) {
        super.withDeferredDeleteTimeInUtc(deferredDeleteTimeInUtc);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem
        withIsScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
        super.withIsScheduledForDeferredDelete(isScheduledForDeferredDelete);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem
        withDeferredDeleteTimeRemaining(String deferredDeleteTimeRemaining) {
        super.withDeferredDeleteTimeRemaining(deferredDeleteTimeRemaining);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem
        withIsDeferredDeleteScheduleUpcoming(Boolean isDeferredDeleteScheduleUpcoming) {
        super.withIsDeferredDeleteScheduleUpcoming(isDeferredDeleteScheduleUpcoming);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withIsRehydrate(Boolean isRehydrate) {
        super.withIsRehydrate(isRehydrate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem
        withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withIsArchiveEnabled(Boolean isArchiveEnabled) {
        super.withIsArchiveEnabled(isArchiveEnabled);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem withPolicyName(String policyName) {
        super.withPolicyName(policyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSapHanaDBInstanceProtectedItem
        withSoftDeleteRetentionPeriod(Integer softDeleteRetentionPeriod) {
        super.withSoftDeleteRetentionPeriod(softDeleteRetentionPeriod);
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
