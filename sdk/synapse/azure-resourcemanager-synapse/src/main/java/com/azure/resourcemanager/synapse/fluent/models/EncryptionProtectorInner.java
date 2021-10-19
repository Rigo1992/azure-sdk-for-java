// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.ServerKeyType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The server encryption protector. */
@Fluent
public final class EncryptionProtectorInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionProtectorInner.class);

    /*
     * Kind of encryption protector. This is metadata used for the Azure portal
     * experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private EncryptionProtectorProperties innerProperties;

    /**
     * Get the kind property: Kind of encryption protector. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private EncryptionProtectorProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the subregion property: Subregion of the encryption protector.
     *
     * @return the subregion value.
     */
    public String subregion() {
        return this.innerProperties() == null ? null : this.innerProperties().subregion();
    }

    /**
     * Get the serverKeyName property: The name of the server key.
     *
     * @return the serverKeyName value.
     */
    public String serverKeyName() {
        return this.innerProperties() == null ? null : this.innerProperties().serverKeyName();
    }

    /**
     * Set the serverKeyName property: The name of the server key.
     *
     * @param serverKeyName the serverKeyName value to set.
     * @return the EncryptionProtectorInner object itself.
     */
    public EncryptionProtectorInner withServerKeyName(String serverKeyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EncryptionProtectorProperties();
        }
        this.innerProperties().withServerKeyName(serverKeyName);
        return this;
    }

    /**
     * Get the serverKeyType property: The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @return the serverKeyType value.
     */
    public ServerKeyType serverKeyType() {
        return this.innerProperties() == null ? null : this.innerProperties().serverKeyType();
    }

    /**
     * Set the serverKeyType property: The encryption protector type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @param serverKeyType the serverKeyType value to set.
     * @return the EncryptionProtectorInner object itself.
     */
    public EncryptionProtectorInner withServerKeyType(ServerKeyType serverKeyType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EncryptionProtectorProperties();
        }
        this.innerProperties().withServerKeyType(serverKeyType);
        return this;
    }

    /**
     * Get the uri property: The URI of the server key.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.innerProperties() == null ? null : this.innerProperties().uri();
    }

    /**
     * Get the thumbprint property: Thumbprint of the server key.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
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
