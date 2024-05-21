// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.models.BlobNfsTarget;
import com.azure.resourcemanager.storagecache.models.ClfsTarget;
import com.azure.resourcemanager.storagecache.models.NamespaceJunction;
import com.azure.resourcemanager.storagecache.models.Nfs3Target;
import com.azure.resourcemanager.storagecache.models.OperationalStateType;
import com.azure.resourcemanager.storagecache.models.ProvisioningStateType;
import com.azure.resourcemanager.storagecache.models.StorageTargetType;
import com.azure.resourcemanager.storagecache.models.UnknownTarget;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the Storage Target.
 */
@Fluent
public final class StorageTargetProperties {
    /*
     * List of cache namespace junctions to target for namespace associations.
     */
    @JsonProperty(value = "junctions")
    private List<NamespaceJunction> junctions;

    /*
     * Type of the Storage Target.
     */
    @JsonProperty(value = "targetType", required = true)
    private StorageTargetType targetType;

    /*
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStateType provisioningState;

    /*
     * Storage target operational state.
     */
    @JsonProperty(value = "state")
    private OperationalStateType state;

    /*
     * Properties when targetType is nfs3.
     */
    @JsonProperty(value = "nfs3")
    private Nfs3Target nfs3;

    /*
     * Properties when targetType is clfs.
     */
    @JsonProperty(value = "clfs")
    private ClfsTarget clfs;

    /*
     * Properties when targetType is unknown.
     */
    @JsonProperty(value = "unknown")
    private UnknownTarget unknown;

    /*
     * Properties when targetType is blobNfs.
     */
    @JsonProperty(value = "blobNfs")
    private BlobNfsTarget blobNfs;

    /*
     * The percentage of cache space allocated for this storage target
     */
    @JsonProperty(value = "allocationPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private Integer allocationPercentage;

    /**
     * Creates an instance of StorageTargetProperties class.
     */
    public StorageTargetProperties() {
    }

    /**
     * Get the junctions property: List of cache namespace junctions to target for namespace associations.
     * 
     * @return the junctions value.
     */
    public List<NamespaceJunction> junctions() {
        return this.junctions;
    }

    /**
     * Set the junctions property: List of cache namespace junctions to target for namespace associations.
     * 
     * @param junctions the junctions value to set.
     * @return the StorageTargetProperties object itself.
     */
    public StorageTargetProperties withJunctions(List<NamespaceJunction> junctions) {
        this.junctions = junctions;
        return this;
    }

    /**
     * Get the targetType property: Type of the Storage Target.
     * 
     * @return the targetType value.
     */
    public StorageTargetType targetType() {
        return this.targetType;
    }

    /**
     * Set the targetType property: Type of the Storage Target.
     * 
     * @param targetType the targetType value to set.
     * @return the StorageTargetProperties object itself.
     */
    public StorageTargetProperties withTargetType(StorageTargetType targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get the provisioningState property: ARM provisioning state, see
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningStateType provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the state property: Storage target operational state.
     * 
     * @return the state value.
     */
    public OperationalStateType state() {
        return this.state;
    }

    /**
     * Set the state property: Storage target operational state.
     * 
     * @param state the state value to set.
     * @return the StorageTargetProperties object itself.
     */
    public StorageTargetProperties withState(OperationalStateType state) {
        this.state = state;
        return this;
    }

    /**
     * Get the nfs3 property: Properties when targetType is nfs3.
     * 
     * @return the nfs3 value.
     */
    public Nfs3Target nfs3() {
        return this.nfs3;
    }

    /**
     * Set the nfs3 property: Properties when targetType is nfs3.
     * 
     * @param nfs3 the nfs3 value to set.
     * @return the StorageTargetProperties object itself.
     */
    public StorageTargetProperties withNfs3(Nfs3Target nfs3) {
        this.nfs3 = nfs3;
        return this;
    }

    /**
     * Get the clfs property: Properties when targetType is clfs.
     * 
     * @return the clfs value.
     */
    public ClfsTarget clfs() {
        return this.clfs;
    }

    /**
     * Set the clfs property: Properties when targetType is clfs.
     * 
     * @param clfs the clfs value to set.
     * @return the StorageTargetProperties object itself.
     */
    public StorageTargetProperties withClfs(ClfsTarget clfs) {
        this.clfs = clfs;
        return this;
    }

    /**
     * Get the unknown property: Properties when targetType is unknown.
     * 
     * @return the unknown value.
     */
    public UnknownTarget unknown() {
        return this.unknown;
    }

    /**
     * Set the unknown property: Properties when targetType is unknown.
     * 
     * @param unknown the unknown value to set.
     * @return the StorageTargetProperties object itself.
     */
    public StorageTargetProperties withUnknown(UnknownTarget unknown) {
        this.unknown = unknown;
        return this;
    }

    /**
     * Get the blobNfs property: Properties when targetType is blobNfs.
     * 
     * @return the blobNfs value.
     */
    public BlobNfsTarget blobNfs() {
        return this.blobNfs;
    }

    /**
     * Set the blobNfs property: Properties when targetType is blobNfs.
     * 
     * @param blobNfs the blobNfs value to set.
     * @return the StorageTargetProperties object itself.
     */
    public StorageTargetProperties withBlobNfs(BlobNfsTarget blobNfs) {
        this.blobNfs = blobNfs;
        return this;
    }

    /**
     * Get the allocationPercentage property: The percentage of cache space allocated for this storage target.
     * 
     * @return the allocationPercentage value.
     */
    public Integer allocationPercentage() {
        return this.allocationPercentage;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (junctions() != null) {
            junctions().forEach(e -> e.validate());
        }
        if (targetType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetType in model StorageTargetProperties"));
        }
        if (nfs3() != null) {
            nfs3().validate();
        }
        if (clfs() != null) {
            clfs().validate();
        }
        if (unknown() != null) {
            unknown().validate();
        }
        if (blobNfs() != null) {
            blobNfs().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageTargetProperties.class);
}
