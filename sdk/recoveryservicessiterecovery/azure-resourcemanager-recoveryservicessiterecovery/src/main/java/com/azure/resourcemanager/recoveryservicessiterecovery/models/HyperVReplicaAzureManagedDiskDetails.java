// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hyper-V Managed disk details.
 */
@Fluent
public final class HyperVReplicaAzureManagedDiskDetails {
    /*
     * The disk Id.
     */
    @JsonProperty(value = "diskId")
    private String diskId;

    /*
     * Seed managed disk Id.
     */
    @JsonProperty(value = "seedManagedDiskId")
    private String seedManagedDiskId;

    /*
     * The replica disk type.
     */
    @JsonProperty(value = "replicaDiskType")
    private String replicaDiskType;

    /*
     * The disk encryption set ARM Id.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /**
     * Creates an instance of HyperVReplicaAzureManagedDiskDetails class.
     */
    public HyperVReplicaAzureManagedDiskDetails() {
    }

    /**
     * Get the diskId property: The disk Id.
     * 
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: The disk Id.
     * 
     * @param diskId the diskId value to set.
     * @return the HyperVReplicaAzureManagedDiskDetails object itself.
     */
    public HyperVReplicaAzureManagedDiskDetails withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the seedManagedDiskId property: Seed managed disk Id.
     * 
     * @return the seedManagedDiskId value.
     */
    public String seedManagedDiskId() {
        return this.seedManagedDiskId;
    }

    /**
     * Set the seedManagedDiskId property: Seed managed disk Id.
     * 
     * @param seedManagedDiskId the seedManagedDiskId value to set.
     * @return the HyperVReplicaAzureManagedDiskDetails object itself.
     */
    public HyperVReplicaAzureManagedDiskDetails withSeedManagedDiskId(String seedManagedDiskId) {
        this.seedManagedDiskId = seedManagedDiskId;
        return this;
    }

    /**
     * Get the replicaDiskType property: The replica disk type.
     * 
     * @return the replicaDiskType value.
     */
    public String replicaDiskType() {
        return this.replicaDiskType;
    }

    /**
     * Set the replicaDiskType property: The replica disk type.
     * 
     * @param replicaDiskType the replicaDiskType value to set.
     * @return the HyperVReplicaAzureManagedDiskDetails object itself.
     */
    public HyperVReplicaAzureManagedDiskDetails withReplicaDiskType(String replicaDiskType) {
        this.replicaDiskType = replicaDiskType;
        return this;
    }

    /**
     * Get the diskEncryptionSetId property: The disk encryption set ARM Id.
     * 
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set the diskEncryptionSetId property: The disk encryption set ARM Id.
     * 
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the HyperVReplicaAzureManagedDiskDetails object itself.
     */
    public HyperVReplicaAzureManagedDiskDetails withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
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
