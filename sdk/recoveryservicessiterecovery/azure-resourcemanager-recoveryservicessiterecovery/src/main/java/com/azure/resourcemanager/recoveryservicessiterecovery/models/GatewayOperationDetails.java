// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Details of the gateway operation.
 */
@Immutable
public final class GatewayOperationDetails {
    /*
     * A value indicating the state of gateway operation.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * A value indicating the progress percentage of gateway operation.
     */
    @JsonProperty(value = "progressPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer progressPercentage;

    /*
     * A value indicating the time elapsed for the operation in milliseconds.
     */
    @JsonProperty(value = "timeElapsed", access = JsonProperty.Access.WRITE_ONLY)
    private Long timeElapsed;

    /*
     * A value indicating the time remaining for the operation in milliseconds.
     */
    @JsonProperty(value = "timeRemaining", access = JsonProperty.Access.WRITE_ONLY)
    private Long timeRemaining;

    /*
     * A value indicating the upload speed in bytes per second.
     */
    @JsonProperty(value = "uploadSpeed", access = JsonProperty.Access.WRITE_ONLY)
    private Long uploadSpeed;

    /*
     * A value indicating the ESXi host name.
     */
    @JsonProperty(value = "hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * A value indicating the datastore collection.
     */
    @JsonProperty(value = "dataStores", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> dataStores;

    /*
     * A value indicating the VMware read throughput in bytes per second.
     */
    @JsonProperty(value = "vmwareReadThroughput", access = JsonProperty.Access.WRITE_ONLY)
    private Long vmwareReadThroughput;

    /**
     * Creates an instance of GatewayOperationDetails class.
     */
    public GatewayOperationDetails() {
    }

    /**
     * Get the state property: A value indicating the state of gateway operation.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the progressPercentage property: A value indicating the progress percentage of gateway operation.
     * 
     * @return the progressPercentage value.
     */
    public Integer progressPercentage() {
        return this.progressPercentage;
    }

    /**
     * Get the timeElapsed property: A value indicating the time elapsed for the operation in milliseconds.
     * 
     * @return the timeElapsed value.
     */
    public Long timeElapsed() {
        return this.timeElapsed;
    }

    /**
     * Get the timeRemaining property: A value indicating the time remaining for the operation in milliseconds.
     * 
     * @return the timeRemaining value.
     */
    public Long timeRemaining() {
        return this.timeRemaining;
    }

    /**
     * Get the uploadSpeed property: A value indicating the upload speed in bytes per second.
     * 
     * @return the uploadSpeed value.
     */
    public Long uploadSpeed() {
        return this.uploadSpeed;
    }

    /**
     * Get the hostname property: A value indicating the ESXi host name.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the dataStores property: A value indicating the datastore collection.
     * 
     * @return the dataStores value.
     */
    public List<String> dataStores() {
        return this.dataStores;
    }

    /**
     * Get the vmwareReadThroughput property: A value indicating the VMware read throughput in bytes per second.
     * 
     * @return the vmwareReadThroughput value.
     */
    public Long vmwareReadThroughput() {
        return this.vmwareReadThroughput;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
