// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** InMageRcm disk level sync details. */
@Immutable
public final class InMageRcmSyncDetails {
    /*
     * The progress health.
     */
    @JsonProperty(value = "progressHealth", access = JsonProperty.Access.WRITE_ONLY)
    private DiskReplicationProgressHealth progressHealth;

    /*
     * The transferred bytes from source VM to azure for the disk.
     */
    @JsonProperty(value = "transferredBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long transferredBytes;

    /*
     * The bytes transferred in last 15 minutes from source VM to azure.
     */
    @JsonProperty(value = "last15MinutesTransferredBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long last15MinutesTransferredBytes;

    /*
     * The time of the last data transfer from source VM to azure.
     */
    @JsonProperty(value = "lastDataTransferTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private String lastDataTransferTimeUtc;

    /*
     * The total processed bytes. This includes bytes that are transferred from source VM to azure and matched bytes.
     */
    @JsonProperty(value = "processedBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long processedBytes;

    /*
     * The start time.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private String startTime;

    /*
     * The last refresh time.
     */
    @JsonProperty(value = "lastRefreshTime", access = JsonProperty.Access.WRITE_ONLY)
    private String lastRefreshTime;

    /*
     * Progress in percentage. Progress percentage is calculated based on processed bytes.
     */
    @JsonProperty(value = "progressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer progressPercentage;

    /** Creates an instance of InMageRcmSyncDetails class. */
    public InMageRcmSyncDetails() {
    }

    /**
     * Get the progressHealth property: The progress health.
     *
     * @return the progressHealth value.
     */
    public DiskReplicationProgressHealth progressHealth() {
        return this.progressHealth;
    }

    /**
     * Get the transferredBytes property: The transferred bytes from source VM to azure for the disk.
     *
     * @return the transferredBytes value.
     */
    public Long transferredBytes() {
        return this.transferredBytes;
    }

    /**
     * Get the last15MinutesTransferredBytes property: The bytes transferred in last 15 minutes from source VM to azure.
     *
     * @return the last15MinutesTransferredBytes value.
     */
    public Long last15MinutesTransferredBytes() {
        return this.last15MinutesTransferredBytes;
    }

    /**
     * Get the lastDataTransferTimeUtc property: The time of the last data transfer from source VM to azure.
     *
     * @return the lastDataTransferTimeUtc value.
     */
    public String lastDataTransferTimeUtc() {
        return this.lastDataTransferTimeUtc;
    }

    /**
     * Get the processedBytes property: The total processed bytes. This includes bytes that are transferred from source
     * VM to azure and matched bytes.
     *
     * @return the processedBytes value.
     */
    public Long processedBytes() {
        return this.processedBytes;
    }

    /**
     * Get the startTime property: The start time.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Get the lastRefreshTime property: The last refresh time.
     *
     * @return the lastRefreshTime value.
     */
    public String lastRefreshTime() {
        return this.lastRefreshTime;
    }

    /**
     * Get the progressPercentage property: Progress in percentage. Progress percentage is calculated based on processed
     * bytes.
     *
     * @return the progressPercentage value.
     */
    public Integer progressPercentage() {
        return this.progressPercentage;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
