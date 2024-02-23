// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InMageRcm disk input.
 */
@Fluent
public final class InMageRcmDisksDefaultInput {
    /*
     * The log storage account ARM Id.
     */
    @JsonProperty(value = "logStorageAccountId", required = true)
    private String logStorageAccountId;

    /*
     * The disk type.
     */
    @JsonProperty(value = "diskType", required = true)
    private DiskAccountType diskType;

    /*
     * The DiskEncryptionSet ARM Id.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /**
     * Creates an instance of InMageRcmDisksDefaultInput class.
     */
    public InMageRcmDisksDefaultInput() {
    }

    /**
     * Get the logStorageAccountId property: The log storage account ARM Id.
     * 
     * @return the logStorageAccountId value.
     */
    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * Set the logStorageAccountId property: The log storage account ARM Id.
     * 
     * @param logStorageAccountId the logStorageAccountId value to set.
     * @return the InMageRcmDisksDefaultInput object itself.
     */
    public InMageRcmDisksDefaultInput withLogStorageAccountId(String logStorageAccountId) {
        this.logStorageAccountId = logStorageAccountId;
        return this;
    }

    /**
     * Get the diskType property: The disk type.
     * 
     * @return the diskType value.
     */
    public DiskAccountType diskType() {
        return this.diskType;
    }

    /**
     * Set the diskType property: The disk type.
     * 
     * @param diskType the diskType value to set.
     * @return the InMageRcmDisksDefaultInput object itself.
     */
    public InMageRcmDisksDefaultInput withDiskType(DiskAccountType diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * Get the diskEncryptionSetId property: The DiskEncryptionSet ARM Id.
     * 
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set the diskEncryptionSetId property: The DiskEncryptionSet ARM Id.
     * 
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the InMageRcmDisksDefaultInput object itself.
     */
    public InMageRcmDisksDefaultInput withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logStorageAccountId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property logStorageAccountId in model InMageRcmDisksDefaultInput"));
        }
        if (diskType() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property diskType in model InMageRcmDisksDefaultInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InMageRcmDisksDefaultInput.class);
}
