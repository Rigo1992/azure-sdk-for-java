// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties pertaining to the BlobNfsTarget.
 */
@Fluent
public final class BlobNfsTarget {
    /*
     * Resource ID of the storage container.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Identifies the StorageCache usage model to be used for this storage target.
     */
    @JsonProperty(value = "usageModel")
    private String usageModel;

    /*
     * Amount of time (in seconds) the cache waits before it checks the back-end storage for file updates.
     */
    @JsonProperty(value = "verificationTimer")
    private Integer verificationTimer;

    /*
     * Amount of time (in seconds) the cache waits after the last file change before it copies the changed file to
     * back-end storage.
     */
    @JsonProperty(value = "writeBackTimer")
    private Integer writeBackTimer;

    /**
     * Creates an instance of BlobNfsTarget class.
     */
    public BlobNfsTarget() {
    }

    /**
     * Get the target property: Resource ID of the storage container.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: Resource ID of the storage container.
     * 
     * @param target the target value to set.
     * @return the BlobNfsTarget object itself.
     */
    public BlobNfsTarget withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the usageModel property: Identifies the StorageCache usage model to be used for this storage target.
     * 
     * @return the usageModel value.
     */
    public String usageModel() {
        return this.usageModel;
    }

    /**
     * Set the usageModel property: Identifies the StorageCache usage model to be used for this storage target.
     * 
     * @param usageModel the usageModel value to set.
     * @return the BlobNfsTarget object itself.
     */
    public BlobNfsTarget withUsageModel(String usageModel) {
        this.usageModel = usageModel;
        return this;
    }

    /**
     * Get the verificationTimer property: Amount of time (in seconds) the cache waits before it checks the back-end
     * storage for file updates.
     * 
     * @return the verificationTimer value.
     */
    public Integer verificationTimer() {
        return this.verificationTimer;
    }

    /**
     * Set the verificationTimer property: Amount of time (in seconds) the cache waits before it checks the back-end
     * storage for file updates.
     * 
     * @param verificationTimer the verificationTimer value to set.
     * @return the BlobNfsTarget object itself.
     */
    public BlobNfsTarget withVerificationTimer(Integer verificationTimer) {
        this.verificationTimer = verificationTimer;
        return this;
    }

    /**
     * Get the writeBackTimer property: Amount of time (in seconds) the cache waits after the last file change before
     * it copies the changed file to back-end storage.
     * 
     * @return the writeBackTimer value.
     */
    public Integer writeBackTimer() {
        return this.writeBackTimer;
    }

    /**
     * Set the writeBackTimer property: Amount of time (in seconds) the cache waits after the last file change before
     * it copies the changed file to back-end storage.
     * 
     * @param writeBackTimer the writeBackTimer value to set.
     * @return the BlobNfsTarget object itself.
     */
    public BlobNfsTarget withWriteBackTimer(Integer writeBackTimer) {
        this.writeBackTimer = writeBackTimer;
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
