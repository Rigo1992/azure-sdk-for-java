// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A recoverable server resource. */
@Fluent
public final class RecoverableServerResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoverableServerResourceInner.class);

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private RecoverableServerProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private RecoverableServerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the lastAvailableBackupDateTime property: The last available backup date time.
     *
     * @return the lastAvailableBackupDateTime value.
     */
    public String lastAvailableBackupDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastAvailableBackupDateTime();
    }

    /**
     * Get the serviceLevelObjective property: The service level objective.
     *
     * @return the serviceLevelObjective value.
     */
    public String serviceLevelObjective() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceLevelObjective();
    }

    /**
     * Get the edition property: Edition of the performance tier.
     *
     * @return the edition value.
     */
    public String edition() {
        return this.innerProperties() == null ? null : this.innerProperties().edition();
    }

    /**
     * Get the vCore property: vCore associated with the service level objective.
     *
     * @return the vCore value.
     */
    public Integer vCore() {
        return this.innerProperties() == null ? null : this.innerProperties().vCore();
    }

    /**
     * Get the hardwareGeneration property: Hardware generation associated with the service level objective.
     *
     * @return the hardwareGeneration value.
     */
    public String hardwareGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().hardwareGeneration();
    }

    /**
     * Get the version property: The PostgreSQL version.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
