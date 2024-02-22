// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings to encrypt a service.
 */
@Fluent
public final class Encryption {
    /*
     * The encryption settings for the customer-managed key
     */
    @JsonProperty(value = "customerManagedKeyEncryption")
    private EncryptionCustomerManagedKeyEncryption customerManagedKeyEncryption;

    /**
     * Creates an instance of Encryption class.
     */
    public Encryption() {
    }

    /**
     * Get the customerManagedKeyEncryption property: The encryption settings for the customer-managed key.
     * 
     * @return the customerManagedKeyEncryption value.
     */
    public EncryptionCustomerManagedKeyEncryption customerManagedKeyEncryption() {
        return this.customerManagedKeyEncryption;
    }

    /**
     * Set the customerManagedKeyEncryption property: The encryption settings for the customer-managed key.
     * 
     * @param customerManagedKeyEncryption the customerManagedKeyEncryption value to set.
     * @return the Encryption object itself.
     */
    public Encryption
        withCustomerManagedKeyEncryption(EncryptionCustomerManagedKeyEncryption customerManagedKeyEncryption) {
        this.customerManagedKeyEncryption = customerManagedKeyEncryption;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customerManagedKeyEncryption() != null) {
            customerManagedKeyEncryption().validate();
        }
    }
}
