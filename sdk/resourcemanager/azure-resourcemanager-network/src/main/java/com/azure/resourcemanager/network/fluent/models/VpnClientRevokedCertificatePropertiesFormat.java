// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the revoked VPN client certificate of virtual network gateway.
 */
@Fluent
public final class VpnClientRevokedCertificatePropertiesFormat {
    /*
     * The revoked VPN client certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * The provisioning state of the VPN client revoked certificate resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of VpnClientRevokedCertificatePropertiesFormat class.
     */
    public VpnClientRevokedCertificatePropertiesFormat() {
    }

    /**
     * Get the thumbprint property: The revoked VPN client certificate thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The revoked VPN client certificate thumbprint.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the VpnClientRevokedCertificatePropertiesFormat object itself.
     */
    public VpnClientRevokedCertificatePropertiesFormat withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN client revoked certificate resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
