// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeAutoUpdate;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeInternalChannelEncryptionMode;
import com.azure.resourcemanager.synapse.models.LinkedIntegrationRuntime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Self-hosted integration runtime status type properties. */
@Fluent
public final class SelfHostedIntegrationRuntimeStatusTypeProperties {
    /*
     * The time at which the integration runtime was created, in ISO8601
     * format.
     */
    @JsonProperty(value = "createTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createTime;

    /*
     * The task queue id of the integration runtime.
     */
    @JsonProperty(value = "taskQueueId", access = JsonProperty.Access.WRITE_ONLY)
    private String taskQueueId;

    /*
     * The node communication Channel encryption mode
     */
    @JsonProperty(value = "nodeCommunicationChannelEncryptionMode", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeCommunicationChannelEncryptionMode;

    /*
     * It is used to set the encryption mode for node-node communication
     * channel (when more than 2 self-hosted integration runtime nodes exist).
     */
    @JsonProperty(value = "internalChannelEncryption", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeInternalChannelEncryptionMode internalChannelEncryption;

    /*
     * Version of the integration runtime.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * The list of nodes for this integration runtime.
     */
    @JsonProperty(value = "nodes")
    private List<SelfHostedIntegrationRuntimeNodeInner> nodes;

    /*
     * The date at which the integration runtime will be scheduled to update,
     * in ISO8601 format.
     */
    @JsonProperty(value = "scheduledUpdateDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime scheduledUpdateDate;

    /*
     * The time in the date scheduled by service to update the integration
     * runtime, e.g., PT03H is 3 hours
     */
    @JsonProperty(value = "updateDelayOffset", access = JsonProperty.Access.WRITE_ONLY)
    private String updateDelayOffset;

    /*
     * The local time zone offset in hours.
     */
    @JsonProperty(value = "localTimeZoneOffset", access = JsonProperty.Access.WRITE_ONLY)
    private String localTimeZoneOffset;

    /*
     * Object with additional information about integration runtime
     * capabilities.
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> capabilities;

    /*
     * The URLs for the services used in integration runtime backend service.
     */
    @JsonProperty(value = "serviceUrls", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> serviceUrls;

    /*
     * Whether Self-hosted integration runtime auto update has been turned on.
     */
    @JsonProperty(value = "autoUpdate", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeAutoUpdate autoUpdate;

    /*
     * Status of the integration runtime version.
     */
    @JsonProperty(value = "versionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String versionStatus;

    /*
     * The list of linked integration runtimes that are created to share with
     * this integration runtime.
     */
    @JsonProperty(value = "links")
    private List<LinkedIntegrationRuntime> links;

    /*
     * The version that the integration runtime is going to update to.
     */
    @JsonProperty(value = "pushedVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String pushedVersion;

    /*
     * The latest version on download center.
     */
    @JsonProperty(value = "latestVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String latestVersion;

    /*
     * The estimated time when the self-hosted integration runtime will be
     * updated.
     */
    @JsonProperty(value = "autoUpdateETA", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime autoUpdateEta;

    /*
     * The service region of the integration runtime
     */
    @JsonProperty(value = "serviceRegion")
    private String serviceRegion;

    /*
     * The newer versions on download center.
     */
    @JsonProperty(value = "newerVersions")
    private List<String> newerVersions;

    /**
     * Get the createTime property: The time at which the integration runtime was created, in ISO8601 format.
     *
     * @return the createTime value.
     */
    public OffsetDateTime createTime() {
        return this.createTime;
    }

    /**
     * Get the taskQueueId property: The task queue id of the integration runtime.
     *
     * @return the taskQueueId value.
     */
    public String taskQueueId() {
        return this.taskQueueId;
    }

    /**
     * Get the nodeCommunicationChannelEncryptionMode property: The node communication Channel encryption mode.
     *
     * @return the nodeCommunicationChannelEncryptionMode value.
     */
    public String nodeCommunicationChannelEncryptionMode() {
        return this.nodeCommunicationChannelEncryptionMode;
    }

    /**
     * Get the internalChannelEncryption property: It is used to set the encryption mode for node-node communication
     * channel (when more than 2 self-hosted integration runtime nodes exist).
     *
     * @return the internalChannelEncryption value.
     */
    public IntegrationRuntimeInternalChannelEncryptionMode internalChannelEncryption() {
        return this.internalChannelEncryption;
    }

    /**
     * Get the version property: Version of the integration runtime.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the nodes property: The list of nodes for this integration runtime.
     *
     * @return the nodes value.
     */
    public List<SelfHostedIntegrationRuntimeNodeInner> nodes() {
        return this.nodes;
    }

    /**
     * Set the nodes property: The list of nodes for this integration runtime.
     *
     * @param nodes the nodes value to set.
     * @return the SelfHostedIntegrationRuntimeStatusTypeProperties object itself.
     */
    public SelfHostedIntegrationRuntimeStatusTypeProperties withNodes(
        List<SelfHostedIntegrationRuntimeNodeInner> nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * Get the scheduledUpdateDate property: The date at which the integration runtime will be scheduled to update, in
     * ISO8601 format.
     *
     * @return the scheduledUpdateDate value.
     */
    public OffsetDateTime scheduledUpdateDate() {
        return this.scheduledUpdateDate;
    }

    /**
     * Get the updateDelayOffset property: The time in the date scheduled by service to update the integration runtime,
     * e.g., PT03H is 3 hours.
     *
     * @return the updateDelayOffset value.
     */
    public String updateDelayOffset() {
        return this.updateDelayOffset;
    }

    /**
     * Get the localTimeZoneOffset property: The local time zone offset in hours.
     *
     * @return the localTimeZoneOffset value.
     */
    public String localTimeZoneOffset() {
        return this.localTimeZoneOffset;
    }

    /**
     * Get the capabilities property: Object with additional information about integration runtime capabilities.
     *
     * @return the capabilities value.
     */
    public Map<String, String> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the serviceUrls property: The URLs for the services used in integration runtime backend service.
     *
     * @return the serviceUrls value.
     */
    public List<String> serviceUrls() {
        return this.serviceUrls;
    }

    /**
     * Get the autoUpdate property: Whether Self-hosted integration runtime auto update has been turned on.
     *
     * @return the autoUpdate value.
     */
    public IntegrationRuntimeAutoUpdate autoUpdate() {
        return this.autoUpdate;
    }

    /**
     * Get the versionStatus property: Status of the integration runtime version.
     *
     * @return the versionStatus value.
     */
    public String versionStatus() {
        return this.versionStatus;
    }

    /**
     * Get the links property: The list of linked integration runtimes that are created to share with this integration
     * runtime.
     *
     * @return the links value.
     */
    public List<LinkedIntegrationRuntime> links() {
        return this.links;
    }

    /**
     * Set the links property: The list of linked integration runtimes that are created to share with this integration
     * runtime.
     *
     * @param links the links value to set.
     * @return the SelfHostedIntegrationRuntimeStatusTypeProperties object itself.
     */
    public SelfHostedIntegrationRuntimeStatusTypeProperties withLinks(List<LinkedIntegrationRuntime> links) {
        this.links = links;
        return this;
    }

    /**
     * Get the pushedVersion property: The version that the integration runtime is going to update to.
     *
     * @return the pushedVersion value.
     */
    public String pushedVersion() {
        return this.pushedVersion;
    }

    /**
     * Get the latestVersion property: The latest version on download center.
     *
     * @return the latestVersion value.
     */
    public String latestVersion() {
        return this.latestVersion;
    }

    /**
     * Get the autoUpdateEta property: The estimated time when the self-hosted integration runtime will be updated.
     *
     * @return the autoUpdateEta value.
     */
    public OffsetDateTime autoUpdateEta() {
        return this.autoUpdateEta;
    }

    /**
     * Get the serviceRegion property: The service region of the integration runtime.
     *
     * @return the serviceRegion value.
     */
    public String serviceRegion() {
        return this.serviceRegion;
    }

    /**
     * Set the serviceRegion property: The service region of the integration runtime.
     *
     * @param serviceRegion the serviceRegion value to set.
     * @return the SelfHostedIntegrationRuntimeStatusTypeProperties object itself.
     */
    public SelfHostedIntegrationRuntimeStatusTypeProperties withServiceRegion(String serviceRegion) {
        this.serviceRegion = serviceRegion;
        return this;
    }

    /**
     * Get the newerVersions property: The newer versions on download center.
     *
     * @return the newerVersions value.
     */
    public List<String> newerVersions() {
        return this.newerVersions;
    }

    /**
     * Set the newerVersions property: The newer versions on download center.
     *
     * @param newerVersions the newerVersions value to set.
     * @return the SelfHostedIntegrationRuntimeStatusTypeProperties object itself.
     */
    public SelfHostedIntegrationRuntimeStatusTypeProperties withNewerVersions(List<String> newerVersions) {
        this.newerVersions = newerVersions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nodes() != null) {
            nodes().forEach(e -> e.validate());
        }
        if (links() != null) {
            links().forEach(e -> e.validate());
        }
    }
}
