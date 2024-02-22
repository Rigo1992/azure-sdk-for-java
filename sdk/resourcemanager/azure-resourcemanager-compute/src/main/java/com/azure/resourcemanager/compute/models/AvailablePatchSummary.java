// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Describes the properties of an virtual machine instance view for available patch summary.
 */
@Immutable
public final class AvailablePatchSummary {
    /*
     * The overall success or failure status of the operation. It remains "InProgress" until the operation completes.
     * At that point it will become "Unknown", "Failed", "Succeeded", or "CompletedWithWarnings."
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private PatchOperationStatus status;

    /*
     * The activity ID of the operation that produced this result. It is used to correlate across CRP and extension
     * logs.
     */
    @JsonProperty(value = "assessmentActivityId", access = JsonProperty.Access.WRITE_ONLY)
    private String assessmentActivityId;

    /*
     * The overall reboot status of the VM. It will be true when partially installed patches require a reboot to
     * complete installation but the reboot has not yet occurred.
     */
    @JsonProperty(value = "rebootPending", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean rebootPending;

    /*
     * The number of critical or security patches that have been detected as available and not yet installed.
     */
    @JsonProperty(value = "criticalAndSecurityPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer criticalAndSecurityPatchCount;

    /*
     * The number of all available patches excluding critical and security.
     */
    @JsonProperty(value = "otherPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer otherPatchCount;

    /*
     * The UTC timestamp when the operation began.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The UTC timestamp when the operation began.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * The errors that were encountered during execution of the operation. The details array contains the list of them.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError error;

    /**
     * Creates an instance of AvailablePatchSummary class.
     */
    public AvailablePatchSummary() {
    }

    /**
     * Get the status property: The overall success or failure status of the operation. It remains "InProgress" until
     * the operation completes. At that point it will become "Unknown", "Failed", "Succeeded", or
     * "CompletedWithWarnings.".
     * 
     * @return the status value.
     */
    public PatchOperationStatus status() {
        return this.status;
    }

    /**
     * Get the assessmentActivityId property: The activity ID of the operation that produced this result. It is used to
     * correlate across CRP and extension logs.
     * 
     * @return the assessmentActivityId value.
     */
    public String assessmentActivityId() {
        return this.assessmentActivityId;
    }

    /**
     * Get the rebootPending property: The overall reboot status of the VM. It will be true when partially installed
     * patches require a reboot to complete installation but the reboot has not yet occurred.
     * 
     * @return the rebootPending value.
     */
    public Boolean rebootPending() {
        return this.rebootPending;
    }

    /**
     * Get the criticalAndSecurityPatchCount property: The number of critical or security patches that have been
     * detected as available and not yet installed.
     * 
     * @return the criticalAndSecurityPatchCount value.
     */
    public Integer criticalAndSecurityPatchCount() {
        return this.criticalAndSecurityPatchCount;
    }

    /**
     * Get the otherPatchCount property: The number of all available patches excluding critical and security.
     * 
     * @return the otherPatchCount value.
     */
    public Integer otherPatchCount() {
        return this.otherPatchCount;
    }

    /**
     * Get the startTime property: The UTC timestamp when the operation began.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the lastModifiedTime property: The UTC timestamp when the operation began.
     * 
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the error property: The errors that were encountered during execution of the operation. The details array
     * contains the list of them.
     * 
     * @return the error value.
     */
    public ApiError error() {
        return this.error;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
    }
}
