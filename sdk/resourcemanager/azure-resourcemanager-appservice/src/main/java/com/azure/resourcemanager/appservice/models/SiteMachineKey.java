// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MachineKey of an app. */
@Fluent
public final class SiteMachineKey {
    /*
     * MachineKey validation.
     */
    @JsonProperty(value = "validation")
    private String validation;

    /*
     * Validation key.
     */
    @JsonProperty(value = "validationKey")
    private String validationKey;

    /*
     * Algorithm used for decryption.
     */
    @JsonProperty(value = "decryption")
    private String decryption;

    /*
     * Decryption key.
     */
    @JsonProperty(value = "decryptionKey")
    private String decryptionKey;

    /** Creates an instance of SiteMachineKey class. */
    public SiteMachineKey() {
    }

    /**
     * Get the validation property: MachineKey validation.
     *
     * @return the validation value.
     */
    public String validation() {
        return this.validation;
    }

    /**
     * Set the validation property: MachineKey validation.
     *
     * @param validation the validation value to set.
     * @return the SiteMachineKey object itself.
     */
    public SiteMachineKey withValidation(String validation) {
        this.validation = validation;
        return this;
    }

    /**
     * Get the validationKey property: Validation key.
     *
     * @return the validationKey value.
     */
    public String validationKey() {
        return this.validationKey;
    }

    /**
     * Set the validationKey property: Validation key.
     *
     * @param validationKey the validationKey value to set.
     * @return the SiteMachineKey object itself.
     */
    public SiteMachineKey withValidationKey(String validationKey) {
        this.validationKey = validationKey;
        return this;
    }

    /**
     * Get the decryption property: Algorithm used for decryption.
     *
     * @return the decryption value.
     */
    public String decryption() {
        return this.decryption;
    }

    /**
     * Set the decryption property: Algorithm used for decryption.
     *
     * @param decryption the decryption value to set.
     * @return the SiteMachineKey object itself.
     */
    public SiteMachineKey withDecryption(String decryption) {
        this.decryption = decryption;
        return this;
    }

    /**
     * Get the decryptionKey property: Decryption key.
     *
     * @return the decryptionKey value.
     */
    public String decryptionKey() {
        return this.decryptionKey;
    }

    /**
     * Set the decryptionKey property: Decryption key.
     *
     * @param decryptionKey the decryptionKey value to set.
     * @return the SiteMachineKey object itself.
     */
    public SiteMachineKey withDecryptionKey(String decryptionKey) {
        this.decryptionKey = decryptionKey;
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
