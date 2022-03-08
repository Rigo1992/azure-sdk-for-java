// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SSH configuration for Linux-based VMs running on Azure. */
@Fluent
public final class ContainerServiceSshConfiguration {
    /*
     * The list of SSH public keys used to authenticate with Linux-based VMs. A
     * maximum of 1 key may be specified.
     */
    @JsonProperty(value = "publicKeys", required = true)
    private List<ContainerServiceSshPublicKey> publicKeys;

    /**
     * Get the publicKeys property: The list of SSH public keys used to authenticate with Linux-based VMs. A maximum of
     * 1 key may be specified.
     *
     * @return the publicKeys value.
     */
    public List<ContainerServiceSshPublicKey> publicKeys() {
        return this.publicKeys;
    }

    /**
     * Set the publicKeys property: The list of SSH public keys used to authenticate with Linux-based VMs. A maximum of
     * 1 key may be specified.
     *
     * @param publicKeys the publicKeys value to set.
     * @return the ContainerServiceSshConfiguration object itself.
     */
    public ContainerServiceSshConfiguration withPublicKeys(List<ContainerServiceSshPublicKey> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicKeys() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property publicKeys in model ContainerServiceSshConfiguration"));
        } else {
            publicKeys().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContainerServiceSshConfiguration.class);
}
