// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base class for restore request. Workload-specific restore requests are derived from this class.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = RestoreRequest.class)
@JsonTypeName("RestoreRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureFileShareRestoreRequest", value = AzureFileShareRestoreRequest.class),
    @JsonSubTypes.Type(name = "AzureWorkloadRestoreRequest", value = AzureWorkloadRestoreRequest.class),
    @JsonSubTypes.Type(name = "IaasVMRestoreRequest", value = IaasVMRestoreRequest.class) })
@Immutable
public class RestoreRequest {
    /**
     * Creates an instance of RestoreRequest class.
     */
    public RestoreRequest() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
