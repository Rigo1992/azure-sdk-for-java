// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The results of a run command. */
@Immutable
public final class CommandResultProperties {
    /*
     * provisioning State
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The exit code of the command
     */
    @JsonProperty(value = "exitCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer exitCode;

    /*
     * The time when the command started.
     */
    @JsonProperty(value = "startedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startedAt;

    /*
     * The time when the command finished.
     */
    @JsonProperty(value = "finishedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime finishedAt;

    /*
     * The command output.
     */
    @JsonProperty(value = "logs", access = JsonProperty.Access.WRITE_ONLY)
    private String logs;

    /*
     * An explanation of why provisioningState is set to failed (if so).
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private String reason;

    /**
     * Get the provisioningState property: provisioning State.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the exitCode property: The exit code of the command.
     *
     * @return the exitCode value.
     */
    public Integer exitCode() {
        return this.exitCode;
    }

    /**
     * Get the startedAt property: The time when the command started.
     *
     * @return the startedAt value.
     */
    public OffsetDateTime startedAt() {
        return this.startedAt;
    }

    /**
     * Get the finishedAt property: The time when the command finished.
     *
     * @return the finishedAt value.
     */
    public OffsetDateTime finishedAt() {
        return this.finishedAt;
    }

    /**
     * Get the logs property: The command output.
     *
     * @return the logs value.
     */
    public String logs() {
        return this.logs;
    }

    /**
     * Get the reason property: An explanation of why provisioningState is set to failed (if so).
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
