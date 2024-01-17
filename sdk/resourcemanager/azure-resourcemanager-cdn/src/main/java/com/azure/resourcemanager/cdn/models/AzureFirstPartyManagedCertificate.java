// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;

/** Azure FirstParty Managed Certificate provided by other first party resource providers to enable HTTPS. */
@Fluent
public final class AzureFirstPartyManagedCertificate extends Certificate {
    /** Creates an instance of AzureFirstPartyManagedCertificate class. */
    public AzureFirstPartyManagedCertificate() {
    }

    /** {@inheritDoc} */
    @Override
    public AzureFirstPartyManagedCertificate withType(SecretType type) {
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
    }
}
