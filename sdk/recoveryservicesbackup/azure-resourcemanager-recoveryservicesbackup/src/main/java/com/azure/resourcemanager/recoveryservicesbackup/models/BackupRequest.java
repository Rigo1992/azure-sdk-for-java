// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base class for backup request. Workload-specific backup requests are derived from this class.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = BackupRequest.class)
@JsonTypeName("BackupRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureFileShareBackupRequest", value = AzureFileShareBackupRequest.class),
    @JsonSubTypes.Type(name = "AzureWorkloadBackupRequest", value = AzureWorkloadBackupRequest.class),
    @JsonSubTypes.Type(name = "IaasVMBackupRequest", value = IaasVMBackupRequest.class) })
@Immutable
public class BackupRequest {
    /**
     * Creates an instance of BackupRequest class.
     */
    public BackupRequest() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
