// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The encryption settings for a configuration store. */
@Fluent
public final class EncryptionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionProperties.class);

    /*
     * Key vault properties.
     */
    @JsonProperty(value = "keyVaultProperties")
    private KeyVaultProperties keyVaultProperties;

    /**
     * Get the keyVaultProperties property: Key vault properties.
     *
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: Key vault properties.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
    }
}
