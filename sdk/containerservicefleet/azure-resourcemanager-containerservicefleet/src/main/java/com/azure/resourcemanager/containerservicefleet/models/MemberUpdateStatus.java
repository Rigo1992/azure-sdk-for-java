// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The status of a member update operation.
 */
@Immutable
public final class MemberUpdateStatus {
    /*
     * The status of the MemberUpdate operation.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateStatus status;

    /*
     * The name of the FleetMember.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The Azure resource id of the target Kubernetes cluster.
     */
    @JsonProperty(value = "clusterResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterResourceId;

    /*
     * The operation resource id of the latest attempt to perform the operation.
     */
    @JsonProperty(value = "operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /*
     * The status message after processing the member update operation.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Creates an instance of MemberUpdateStatus class.
     */
    public MemberUpdateStatus() {
    }

    /**
     * Get the status property: The status of the MemberUpdate operation.
     * 
     * @return the status value.
     */
    public UpdateStatus status() {
        return this.status;
    }

    /**
     * Get the name property: The name of the FleetMember.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the clusterResourceId property: The Azure resource id of the target Kubernetes cluster.
     * 
     * @return the clusterResourceId value.
     */
    public String clusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * Get the operationId property: The operation resource id of the latest attempt to perform the operation.
     * 
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get the message property: The status message after processing the member update operation.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
    }
}
