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

/** Azure VM workload-specific protected item representing SAP ASE Database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("AzureVmWorkloadSAPAseDatabase")
@Fluent
public final class AzureVmWorkloadSapAseDatabaseProtectedItem extends AzureVmWorkloadProtectedItem {
    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withParentType(String parentType) {
        super.withParentType(parentType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withProtectionStatus(String protectionStatus) {
        super.withProtectionStatus(protectionStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withProtectionState(ProtectionState protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withLastBackupStatus(LastBackupStatus lastBackupStatus) {
        super.withLastBackupStatus(lastBackupStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withLastBackupTime(OffsetDateTime lastBackupTime) {
        super.withLastBackupTime(lastBackupTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withLastBackupErrorDetail(ErrorDetail lastBackupErrorDetail) {
        super.withLastBackupErrorDetail(lastBackupErrorDetail);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withProtectedItemDataSourceId(String protectedItemDataSourceId) {
        super.withProtectedItemDataSourceId(protectedItemDataSourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withProtectedItemHealthStatus(
        ProtectedItemHealthStatus protectedItemHealthStatus) {
        super.withProtectedItemHealthStatus(protectedItemHealthStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withExtendedInfo(
        AzureVmWorkloadProtectedItemExtendedInfo extendedInfo) {
        super.withExtendedInfo(extendedInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withKpisHealths(
        Map<String, KpiResourceHealthDetails> kpisHealths) {
        super.withKpisHealths(kpisHealths);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withBackupManagementType(
        BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withWorkloadType(DataSourceType workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withContainerName(String containerName) {
        super.withContainerName(containerName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        super.withLastRecoveryPoint(lastRecoveryPoint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withBackupSetName(String backupSetName) {
        super.withBackupSetName(backupSetName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withCreateMode(CreateMode createMode) {
        super.withCreateMode(createMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withDeferredDeleteTimeInUtc(
        OffsetDateTime deferredDeleteTimeInUtc) {
        super.withDeferredDeleteTimeInUtc(deferredDeleteTimeInUtc);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withIsScheduledForDeferredDelete(
        Boolean isScheduledForDeferredDelete) {
        super.withIsScheduledForDeferredDelete(isScheduledForDeferredDelete);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withDeferredDeleteTimeRemaining(
        String deferredDeleteTimeRemaining) {
        super.withDeferredDeleteTimeRemaining(deferredDeleteTimeRemaining);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withIsDeferredDeleteScheduleUpcoming(
        Boolean isDeferredDeleteScheduleUpcoming) {
        super.withIsDeferredDeleteScheduleUpcoming(isDeferredDeleteScheduleUpcoming);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withIsRehydrate(Boolean isRehydrate) {
        super.withIsRehydrate(isRehydrate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withResourceGuardOperationRequests(
        List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withIsArchiveEnabled(Boolean isArchiveEnabled) {
        super.withIsArchiveEnabled(isArchiveEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureVmWorkloadSapAseDatabaseProtectedItem withPolicyName(String policyName) {
        super.withPolicyName(policyName);
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
