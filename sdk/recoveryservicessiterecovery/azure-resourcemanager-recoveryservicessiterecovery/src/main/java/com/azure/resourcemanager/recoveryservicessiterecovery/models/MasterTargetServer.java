// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Details of a Master Target Server. */
@Fluent
public final class MasterTargetServer {
    /*
     * The server Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The IP address of the server.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * The server name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The OS type of the server.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /*
     * The version of the scout component on the server.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /*
     * The last heartbeat received from the server.
     */
    @JsonProperty(value = "lastHeartbeat")
    private OffsetDateTime lastHeartbeat;

    /*
     * Version status.
     */
    @JsonProperty(value = "versionStatus")
    private String versionStatus;

    /*
     * The retention volumes of Master target Server.
     */
    @JsonProperty(value = "retentionVolumes")
    private List<RetentionVolume> retentionVolumes;

    /*
     * The list of data stores in the fabric.
     */
    @JsonProperty(value = "dataStores")
    private List<DataStore> dataStores;

    /*
     * Validation errors.
     */
    @JsonProperty(value = "validationErrors")
    private List<HealthError> validationErrors;

    /*
     * Health errors.
     */
    @JsonProperty(value = "healthErrors")
    private List<HealthError> healthErrors;

    /*
     * Disk count of the master target.
     */
    @JsonProperty(value = "diskCount")
    private Integer diskCount;

    /*
     * OS Version of the master target.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /*
     * Agent expiry date.
     */
    @JsonProperty(value = "agentExpiryDate")
    private OffsetDateTime agentExpiryDate;

    /*
     * MARS agent version.
     */
    @JsonProperty(value = "marsAgentVersion")
    private String marsAgentVersion;

    /*
     * MARS agent expiry date.
     */
    @JsonProperty(value = "marsAgentExpiryDate")
    private OffsetDateTime marsAgentExpiryDate;

    /*
     * Agent version details.
     */
    @JsonProperty(value = "agentVersionDetails")
    private VersionDetails agentVersionDetails;

    /*
     * Mars agent version details.
     */
    @JsonProperty(value = "marsAgentVersionDetails")
    private VersionDetails marsAgentVersionDetails;

    /** Creates an instance of MasterTargetServer class. */
    public MasterTargetServer() {
    }

    /**
     * Get the id property: The server Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The server Id.
     *
     * @param id the id value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the ipAddress property: The IP address of the server.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The IP address of the server.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the name property: The server name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The server name.
     *
     * @param name the name value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the osType property: The OS type of the server.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The OS type of the server.
     *
     * @param osType the osType value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the agentVersion property: The version of the scout component on the server.
     *
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the agentVersion property: The version of the scout component on the server.
     *
     * @param agentVersion the agentVersion value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get the lastHeartbeat property: The last heartbeat received from the server.
     *
     * @return the lastHeartbeat value.
     */
    public OffsetDateTime lastHeartbeat() {
        return this.lastHeartbeat;
    }

    /**
     * Set the lastHeartbeat property: The last heartbeat received from the server.
     *
     * @param lastHeartbeat the lastHeartbeat value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withLastHeartbeat(OffsetDateTime lastHeartbeat) {
        this.lastHeartbeat = lastHeartbeat;
        return this;
    }

    /**
     * Get the versionStatus property: Version status.
     *
     * @return the versionStatus value.
     */
    public String versionStatus() {
        return this.versionStatus;
    }

    /**
     * Set the versionStatus property: Version status.
     *
     * @param versionStatus the versionStatus value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }

    /**
     * Get the retentionVolumes property: The retention volumes of Master target Server.
     *
     * @return the retentionVolumes value.
     */
    public List<RetentionVolume> retentionVolumes() {
        return this.retentionVolumes;
    }

    /**
     * Set the retentionVolumes property: The retention volumes of Master target Server.
     *
     * @param retentionVolumes the retentionVolumes value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withRetentionVolumes(List<RetentionVolume> retentionVolumes) {
        this.retentionVolumes = retentionVolumes;
        return this;
    }

    /**
     * Get the dataStores property: The list of data stores in the fabric.
     *
     * @return the dataStores value.
     */
    public List<DataStore> dataStores() {
        return this.dataStores;
    }

    /**
     * Set the dataStores property: The list of data stores in the fabric.
     *
     * @param dataStores the dataStores value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withDataStores(List<DataStore> dataStores) {
        this.dataStores = dataStores;
        return this;
    }

    /**
     * Get the validationErrors property: Validation errors.
     *
     * @return the validationErrors value.
     */
    public List<HealthError> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set the validationErrors property: Validation errors.
     *
     * @param validationErrors the validationErrors value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withValidationErrors(List<HealthError> validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

    /**
     * Get the healthErrors property: Health errors.
     *
     * @return the healthErrors value.
     */
    public List<HealthError> healthErrors() {
        return this.healthErrors;
    }

    /**
     * Set the healthErrors property: Health errors.
     *
     * @param healthErrors the healthErrors value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withHealthErrors(List<HealthError> healthErrors) {
        this.healthErrors = healthErrors;
        return this;
    }

    /**
     * Get the diskCount property: Disk count of the master target.
     *
     * @return the diskCount value.
     */
    public Integer diskCount() {
        return this.diskCount;
    }

    /**
     * Set the diskCount property: Disk count of the master target.
     *
     * @param diskCount the diskCount value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withDiskCount(Integer diskCount) {
        this.diskCount = diskCount;
        return this;
    }

    /**
     * Get the osVersion property: OS Version of the master target.
     *
     * @return the osVersion value.
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the osVersion property: OS Version of the master target.
     *
     * @param osVersion the osVersion value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get the agentExpiryDate property: Agent expiry date.
     *
     * @return the agentExpiryDate value.
     */
    public OffsetDateTime agentExpiryDate() {
        return this.agentExpiryDate;
    }

    /**
     * Set the agentExpiryDate property: Agent expiry date.
     *
     * @param agentExpiryDate the agentExpiryDate value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withAgentExpiryDate(OffsetDateTime agentExpiryDate) {
        this.agentExpiryDate = agentExpiryDate;
        return this;
    }

    /**
     * Get the marsAgentVersion property: MARS agent version.
     *
     * @return the marsAgentVersion value.
     */
    public String marsAgentVersion() {
        return this.marsAgentVersion;
    }

    /**
     * Set the marsAgentVersion property: MARS agent version.
     *
     * @param marsAgentVersion the marsAgentVersion value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withMarsAgentVersion(String marsAgentVersion) {
        this.marsAgentVersion = marsAgentVersion;
        return this;
    }

    /**
     * Get the marsAgentExpiryDate property: MARS agent expiry date.
     *
     * @return the marsAgentExpiryDate value.
     */
    public OffsetDateTime marsAgentExpiryDate() {
        return this.marsAgentExpiryDate;
    }

    /**
     * Set the marsAgentExpiryDate property: MARS agent expiry date.
     *
     * @param marsAgentExpiryDate the marsAgentExpiryDate value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withMarsAgentExpiryDate(OffsetDateTime marsAgentExpiryDate) {
        this.marsAgentExpiryDate = marsAgentExpiryDate;
        return this;
    }

    /**
     * Get the agentVersionDetails property: Agent version details.
     *
     * @return the agentVersionDetails value.
     */
    public VersionDetails agentVersionDetails() {
        return this.agentVersionDetails;
    }

    /**
     * Set the agentVersionDetails property: Agent version details.
     *
     * @param agentVersionDetails the agentVersionDetails value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withAgentVersionDetails(VersionDetails agentVersionDetails) {
        this.agentVersionDetails = agentVersionDetails;
        return this;
    }

    /**
     * Get the marsAgentVersionDetails property: Mars agent version details.
     *
     * @return the marsAgentVersionDetails value.
     */
    public VersionDetails marsAgentVersionDetails() {
        return this.marsAgentVersionDetails;
    }

    /**
     * Set the marsAgentVersionDetails property: Mars agent version details.
     *
     * @param marsAgentVersionDetails the marsAgentVersionDetails value to set.
     * @return the MasterTargetServer object itself.
     */
    public MasterTargetServer withMarsAgentVersionDetails(VersionDetails marsAgentVersionDetails) {
        this.marsAgentVersionDetails = marsAgentVersionDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (retentionVolumes() != null) {
            retentionVolumes().forEach(e -> e.validate());
        }
        if (dataStores() != null) {
            dataStores().forEach(e -> e.validate());
        }
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
        if (healthErrors() != null) {
            healthErrors().forEach(e -> e.validate());
        }
        if (agentVersionDetails() != null) {
            agentVersionDetails().validate();
        }
        if (marsAgentVersionDetails() != null) {
            marsAgentVersionDetails().validate();
        }
    }
}
