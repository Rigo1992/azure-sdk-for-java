// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Create network mappings input. */
@Fluent
public final class CreateNetworkMappingInput {
    /*
     * Input properties for creating network mapping.
     */
    @JsonProperty(value = "properties", required = true)
    private CreateNetworkMappingInputProperties properties;

    /** Creates an instance of CreateNetworkMappingInput class. */
    public CreateNetworkMappingInput() {
    }

    /**
     * Get the properties property: Input properties for creating network mapping.
     *
     * @return the properties value.
     */
    public CreateNetworkMappingInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Input properties for creating network mapping.
     *
     * @param properties the properties value to set.
     * @return the CreateNetworkMappingInput object itself.
     */
    public CreateNetworkMappingInput withProperties(CreateNetworkMappingInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model CreateNetworkMappingInput"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CreateNetworkMappingInput.class);
}
