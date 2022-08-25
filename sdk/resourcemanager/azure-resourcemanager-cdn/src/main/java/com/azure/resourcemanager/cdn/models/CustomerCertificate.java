// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Customer Certificate used for https. */
@Fluent
public final class CustomerCertificate extends Certificate {
    /*
     * Resource reference to the Azure Key Vault certificate. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{certificateName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​
     */
    @JsonProperty(value = "secretSource")
    private ResourceReference secretSource;

    /*
     * Certificate version.
     */
    @JsonProperty(value = "secretVersion")
    private String secretVersion;

    /*
     * Certificate issuing authority.
     */
    @JsonProperty(value = "certificateAuthority", access = JsonProperty.Access.WRITE_ONLY)
    private String certificateAuthority;

    /*
     * Whether to use the latest version for the certificate
     */
    @JsonProperty(value = "useLatestVersion")
    private Boolean useLatestVersion;

    /*
     * The list of SANs.
     */
    @JsonProperty(value = "subjectAlternativeNames")
    private List<String> subjectAlternativeNames;

    /*
     * Certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /**
     * Get the secretSource property: Resource reference to the Azure Key Vault certificate. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{certificateName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​.
     *
     * @return the secretSource value.
     */
    public ResourceReference secretSource() {
        return this.secretSource;
    }

    /**
     * Set the secretSource property: Resource reference to the Azure Key Vault certificate. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{certificateName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​.
     *
     * @param secretSource the secretSource value to set.
     * @return the CustomerCertificate object itself.
     */
    public CustomerCertificate withSecretSource(ResourceReference secretSource) {
        this.secretSource = secretSource;
        return this;
    }

    /**
     * Get the secretVersion property: Certificate version.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: Certificate version.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the CustomerCertificate object itself.
     */
    public CustomerCertificate withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Get the certificateAuthority property: Certificate issuing authority.
     *
     * @return the certificateAuthority value.
     */
    public String certificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * Get the useLatestVersion property: Whether to use the latest version for the certificate.
     *
     * @return the useLatestVersion value.
     */
    public Boolean useLatestVersion() {
        return this.useLatestVersion;
    }

    /**
     * Set the useLatestVersion property: Whether to use the latest version for the certificate.
     *
     * @param useLatestVersion the useLatestVersion value to set.
     * @return the CustomerCertificate object itself.
     */
    public CustomerCertificate withUseLatestVersion(Boolean useLatestVersion) {
        this.useLatestVersion = useLatestVersion;
        return this;
    }

    /**
     * Get the subjectAlternativeNames property: The list of SANs.
     *
     * @return the subjectAlternativeNames value.
     */
    public List<String> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    /**
     * Set the subjectAlternativeNames property: The list of SANs.
     *
     * @param subjectAlternativeNames the subjectAlternativeNames value to set.
     * @return the CustomerCertificate object itself.
     */
    public CustomerCertificate withSubjectAlternativeNames(List<String> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /** {@inheritDoc} */
    @Override
    public CustomerCertificate withType(SecretType type) {
        super.withType(type);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (secretSource() != null) {
            secretSource().validate();
        }
    }
}
