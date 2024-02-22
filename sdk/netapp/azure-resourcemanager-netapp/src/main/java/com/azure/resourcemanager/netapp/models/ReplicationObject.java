// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Replication properties.
 */
@Fluent
public final class ReplicationObject {
    /*
     * Id
     */
    @JsonProperty(value = "replicationId", access = JsonProperty.Access.WRITE_ONLY)
    private String replicationId;

    /*
     * Indicates whether the local volume is the source or destination for the Volume Replication
     */
    @JsonProperty(value = "endpointType")
    private EndpointType endpointType;

    /*
     * Schedule
     */
    @JsonProperty(value = "replicationSchedule")
    private ReplicationSchedule replicationSchedule;

    /*
     * The resource ID of the remote volume. Required for cross region and cross zone replication
     */
    @JsonProperty(value = "remoteVolumeResourceId", required = true)
    private String remoteVolumeResourceId;

    /*
     * The full path to a volume that is to be migrated into ANF. Required for Migration volumes
     */
    @JsonProperty(value = "remotePath")
    private RemotePath remotePath;

    /*
     * The remote region for the other end of the Volume Replication.
     */
    @JsonProperty(value = "remoteVolumeRegion")
    private String remoteVolumeRegion;

    /**
     * Creates an instance of ReplicationObject class.
     */
    public ReplicationObject() {
    }

    /**
     * Get the replicationId property: Id.
     * 
     * @return the replicationId value.
     */
    public String replicationId() {
        return this.replicationId;
    }

    /**
     * Get the endpointType property: Indicates whether the local volume is the source or destination for the Volume
     * Replication.
     * 
     * @return the endpointType value.
     */
    public EndpointType endpointType() {
        return this.endpointType;
    }

    /**
     * Set the endpointType property: Indicates whether the local volume is the source or destination for the Volume
     * Replication.
     * 
     * @param endpointType the endpointType value to set.
     * @return the ReplicationObject object itself.
     */
    public ReplicationObject withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * Get the replicationSchedule property: Schedule.
     * 
     * @return the replicationSchedule value.
     */
    public ReplicationSchedule replicationSchedule() {
        return this.replicationSchedule;
    }

    /**
     * Set the replicationSchedule property: Schedule.
     * 
     * @param replicationSchedule the replicationSchedule value to set.
     * @return the ReplicationObject object itself.
     */
    public ReplicationObject withReplicationSchedule(ReplicationSchedule replicationSchedule) {
        this.replicationSchedule = replicationSchedule;
        return this;
    }

    /**
     * Get the remoteVolumeResourceId property: The resource ID of the remote volume. Required for cross region and
     * cross zone replication.
     * 
     * @return the remoteVolumeResourceId value.
     */
    public String remoteVolumeResourceId() {
        return this.remoteVolumeResourceId;
    }

    /**
     * Set the remoteVolumeResourceId property: The resource ID of the remote volume. Required for cross region and
     * cross zone replication.
     * 
     * @param remoteVolumeResourceId the remoteVolumeResourceId value to set.
     * @return the ReplicationObject object itself.
     */
    public ReplicationObject withRemoteVolumeResourceId(String remoteVolumeResourceId) {
        this.remoteVolumeResourceId = remoteVolumeResourceId;
        return this;
    }

    /**
     * Get the remotePath property: The full path to a volume that is to be migrated into ANF. Required for Migration
     * volumes.
     * 
     * @return the remotePath value.
     */
    public RemotePath remotePath() {
        return this.remotePath;
    }

    /**
     * Set the remotePath property: The full path to a volume that is to be migrated into ANF. Required for Migration
     * volumes.
     * 
     * @param remotePath the remotePath value to set.
     * @return the ReplicationObject object itself.
     */
    public ReplicationObject withRemotePath(RemotePath remotePath) {
        this.remotePath = remotePath;
        return this;
    }

    /**
     * Get the remoteVolumeRegion property: The remote region for the other end of the Volume Replication.
     * 
     * @return the remoteVolumeRegion value.
     */
    public String remoteVolumeRegion() {
        return this.remoteVolumeRegion;
    }

    /**
     * Set the remoteVolumeRegion property: The remote region for the other end of the Volume Replication.
     * 
     * @param remoteVolumeRegion the remoteVolumeRegion value to set.
     * @return the ReplicationObject object itself.
     */
    public ReplicationObject withRemoteVolumeRegion(String remoteVolumeRegion) {
        this.remoteVolumeRegion = remoteVolumeRegion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (remoteVolumeResourceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property remoteVolumeResourceId in model ReplicationObject"));
        }
        if (remotePath() != null) {
            remotePath().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ReplicationObject.class);
}
