// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** AzureWorkload SAP Hana-specific restore. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = AzureWorkloadSapHanaRestoreRequest.class)
@JsonTypeName("AzureWorkloadSAPHanaRestoreRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "AzureWorkloadSAPHanaPointInTimeRestoreRequest",
        value = AzureWorkloadSapHanaPointInTimeRestoreRequest.class),
    @JsonSubTypes.Type(
        name = "AzureWorkloadSAPHanaRestoreWithRehydrateRequest",
        value = AzureWorkloadSapHanaRestoreWithRehydrateRequest.class)
})
@Fluent
public class AzureWorkloadSapHanaRestoreRequest extends AzureWorkloadRestoreRequest {
    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequest withRecoveryType(RecoveryType recoveryType) {
        super.withRecoveryType(recoveryType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequest withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequest withPropertyBag(Map<String, String> propertyBag) {
        super.withPropertyBag(propertyBag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequest withTargetInfo(TargetRestoreInfo targetInfo) {
        super.withTargetInfo(targetInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequest withRecoveryMode(RecoveryMode recoveryMode) {
        super.withRecoveryMode(recoveryMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureWorkloadSapHanaRestoreRequest withTargetVirtualMachineId(String targetVirtualMachineId) {
        super.withTargetVirtualMachineId(targetVirtualMachineId);
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
