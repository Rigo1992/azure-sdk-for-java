// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Preferences related to the Encryption. */
@Fluent
public final class EncryptionPreferences {
    /*
     * Defines secondary layer of software-based encryption enablement.
     */
    @JsonProperty(value = "doubleEncryption")
    private DoubleEncryption doubleEncryption;

    /** Creates an instance of EncryptionPreferences class. */
    public EncryptionPreferences() {
    }

    /**
     * Get the doubleEncryption property: Defines secondary layer of software-based encryption enablement.
     *
     * @return the doubleEncryption value.
     */
    public DoubleEncryption doubleEncryption() {
        return this.doubleEncryption;
    }

    /**
     * Set the doubleEncryption property: Defines secondary layer of software-based encryption enablement.
     *
     * @param doubleEncryption the doubleEncryption value to set.
     * @return the EncryptionPreferences object itself.
     */
    public EncryptionPreferences withDoubleEncryption(DoubleEncryption doubleEncryption) {
        this.doubleEncryption = doubleEncryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
