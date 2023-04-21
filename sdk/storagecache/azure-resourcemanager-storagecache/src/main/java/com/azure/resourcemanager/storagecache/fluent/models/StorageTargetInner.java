// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storagecache.models.BlobNfsTarget;
import com.azure.resourcemanager.storagecache.models.ClfsTarget;
import com.azure.resourcemanager.storagecache.models.NamespaceJunction;
import com.azure.resourcemanager.storagecache.models.Nfs3Target;
import com.azure.resourcemanager.storagecache.models.OperationalStateType;
import com.azure.resourcemanager.storagecache.models.ProvisioningStateType;
import com.azure.resourcemanager.storagecache.models.StorageTargetResource;
import com.azure.resourcemanager.storagecache.models.StorageTargetType;
import com.azure.resourcemanager.storagecache.models.UnknownTarget;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Type of the Storage Target. */
@Fluent
public final class StorageTargetInner extends StorageTargetResource {
    /*
     * StorageTarget properties
     */
    @JsonProperty(value = "properties")
    private StorageTargetProperties innerProperties;

    /** Creates an instance of StorageTargetInner class. */
    public StorageTargetInner() {
    }

    /**
     * Get the innerProperties property: StorageTarget properties.
     *
     * @return the innerProperties value.
     */
    private StorageTargetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the junctions property: List of cache namespace junctions to target for namespace associations.
     *
     * @return the junctions value.
     */
    public List<NamespaceJunction> junctions() {
        return this.innerProperties() == null ? null : this.innerProperties().junctions();
    }

    /**
     * Set the junctions property: List of cache namespace junctions to target for namespace associations.
     *
     * @param junctions the junctions value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withJunctions(List<NamespaceJunction> junctions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageTargetProperties();
        }
        this.innerProperties().withJunctions(junctions);
        return this;
    }

    /**
     * Get the targetType property: Type of the Storage Target.
     *
     * @return the targetType value.
     */
    public StorageTargetType targetType() {
        return this.innerProperties() == null ? null : this.innerProperties().targetType();
    }

    /**
     * Set the targetType property: Type of the Storage Target.
     *
     * @param targetType the targetType value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withTargetType(StorageTargetType targetType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageTargetProperties();
        }
        this.innerProperties().withTargetType(targetType);
        return this;
    }

    /**
     * Get the provisioningState property: ARM provisioning state, see
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStateType provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the state property: Storage target operational state.
     *
     * @return the state value.
     */
    public OperationalStateType state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Storage target operational state.
     *
     * @param state the state value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withState(OperationalStateType state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageTargetProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the nfs3 property: Properties when targetType is nfs3.
     *
     * @return the nfs3 value.
     */
    public Nfs3Target nfs3() {
        return this.innerProperties() == null ? null : this.innerProperties().nfs3();
    }

    /**
     * Set the nfs3 property: Properties when targetType is nfs3.
     *
     * @param nfs3 the nfs3 value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withNfs3(Nfs3Target nfs3) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageTargetProperties();
        }
        this.innerProperties().withNfs3(nfs3);
        return this;
    }

    /**
     * Get the clfs property: Properties when targetType is clfs.
     *
     * @return the clfs value.
     */
    public ClfsTarget clfs() {
        return this.innerProperties() == null ? null : this.innerProperties().clfs();
    }

    /**
     * Set the clfs property: Properties when targetType is clfs.
     *
     * @param clfs the clfs value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withClfs(ClfsTarget clfs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageTargetProperties();
        }
        this.innerProperties().withClfs(clfs);
        return this;
    }

    /**
     * Get the unknown property: Properties when targetType is unknown.
     *
     * @return the unknown value.
     */
    public UnknownTarget unknown() {
        return this.innerProperties() == null ? null : this.innerProperties().unknown();
    }

    /**
     * Set the unknown property: Properties when targetType is unknown.
     *
     * @param unknown the unknown value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withUnknown(UnknownTarget unknown) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageTargetProperties();
        }
        this.innerProperties().withUnknown(unknown);
        return this;
    }

    /**
     * Get the blobNfs property: Properties when targetType is blobNfs.
     *
     * @return the blobNfs value.
     */
    public BlobNfsTarget blobNfs() {
        return this.innerProperties() == null ? null : this.innerProperties().blobNfs();
    }

    /**
     * Set the blobNfs property: Properties when targetType is blobNfs.
     *
     * @param blobNfs the blobNfs value to set.
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withBlobNfs(BlobNfsTarget blobNfs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageTargetProperties();
        }
        this.innerProperties().withBlobNfs(blobNfs);
        return this;
    }

    /**
     * Get the allocationPercentage property: The percentage of cache space allocated for this storage target.
     *
     * @return the allocationPercentage value.
     */
    public Integer allocationPercentage() {
        return this.innerProperties() == null ? null : this.innerProperties().allocationPercentage();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
