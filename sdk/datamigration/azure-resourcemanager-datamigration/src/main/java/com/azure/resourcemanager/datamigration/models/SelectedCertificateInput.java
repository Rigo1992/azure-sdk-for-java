// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Info for certificate to be exported for TDE enabled databases. */
@Fluent
public final class SelectedCertificateInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SelectedCertificateInput.class);

    /*
     * Name of certificate to be exported.
     */
    @JsonProperty(value = "certificateName", required = true)
    private String certificateName;

    /*
     * Password to use for encrypting the exported certificate.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * Get the certificateName property: Name of certificate to be exported.
     *
     * @return the certificateName value.
     */
    public String certificateName() {
        return this.certificateName;
    }

    /**
     * Set the certificateName property: Name of certificate to be exported.
     *
     * @param certificateName the certificateName value to set.
     * @return the SelectedCertificateInput object itself.
     */
    public SelectedCertificateInput withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * Get the password property: Password to use for encrypting the exported certificate.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password to use for encrypting the exported certificate.
     *
     * @param password the password value to set.
     * @return the SelectedCertificateInput object itself.
     */
    public SelectedCertificateInput withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property certificateName in model SelectedCertificateInput"));
        }
        if (password() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property password in model SelectedCertificateInput"));
        }
    }
}
