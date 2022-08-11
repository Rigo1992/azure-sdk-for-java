// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.AutomaticTuningServerMode;
import com.azure.resourcemanager.sql.models.AutomaticTuningServerOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Server-level Automatic Tuning. */
@Fluent
public final class ServerAutomaticTuningInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private AutomaticTuningServerProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private AutomaticTuningServerProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the desiredState property: Automatic tuning desired state.
     *
     * @return the desiredState value.
     */
    public AutomaticTuningServerMode desiredState() {
        return this.innerProperties() == null ? null : this.innerProperties().desiredState();
    }

    /**
     * Set the desiredState property: Automatic tuning desired state.
     *
     * @param desiredState the desiredState value to set.
     * @return the ServerAutomaticTuningInner object itself.
     */
    public ServerAutomaticTuningInner withDesiredState(AutomaticTuningServerMode desiredState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutomaticTuningServerProperties();
        }
        this.innerProperties().withDesiredState(desiredState);
        return this;
    }

    /**
     * Get the actualState property: Automatic tuning actual state.
     *
     * @return the actualState value.
     */
    public AutomaticTuningServerMode actualState() {
        return this.innerProperties() == null ? null : this.innerProperties().actualState();
    }

    /**
     * Get the options property: Automatic tuning options definition.
     *
     * @return the options value.
     */
    public Map<String, AutomaticTuningServerOptions> options() {
        return this.innerProperties() == null ? null : this.innerProperties().options();
    }

    /**
     * Set the options property: Automatic tuning options definition.
     *
     * @param options the options value to set.
     * @return the ServerAutomaticTuningInner object itself.
     */
    public ServerAutomaticTuningInner withOptions(Map<String, AutomaticTuningServerOptions> options) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutomaticTuningServerProperties();
        }
        this.innerProperties().withOptions(options);
        return this;
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
