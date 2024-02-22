// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.models.ApiError;
import com.azure.resourcemanager.compute.models.DiskEncryptionSetType;
import com.azure.resourcemanager.compute.models.EncryptionSetIdentity;
import com.azure.resourcemanager.compute.models.KeyForDiskEncryptionSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * disk encryption set resource.
 */
@Fluent
public final class DiskEncryptionSetInner extends Resource {
    /*
     * The managed identity for the disk encryption set. It should be given permission on the key vault before it can
     * be used to encrypt disks.
     */
    @JsonProperty(value = "identity")
    private EncryptionSetIdentity identity;

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private EncryptionSetProperties innerProperties;

    /**
     * Creates an instance of DiskEncryptionSetInner class.
     */
    public DiskEncryptionSetInner() {
    }

    /**
     * Get the identity property: The managed identity for the disk encryption set. It should be given permission on
     * the key vault before it can be used to encrypt disks.
     * 
     * @return the identity value.
     */
    public EncryptionSetIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identity for the disk encryption set. It should be given permission on
     * the key vault before it can be used to encrypt disks.
     * 
     * @param identity the identity value to set.
     * @return the DiskEncryptionSetInner object itself.
     */
    public DiskEncryptionSetInner withIdentity(EncryptionSetIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private EncryptionSetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiskEncryptionSetInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiskEncryptionSetInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the encryptionType property: The type of key used to encrypt the data of the disk.
     * 
     * @return the encryptionType value.
     */
    public DiskEncryptionSetType encryptionType() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionType();
    }

    /**
     * Set the encryptionType property: The type of key used to encrypt the data of the disk.
     * 
     * @param encryptionType the encryptionType value to set.
     * @return the DiskEncryptionSetInner object itself.
     */
    public DiskEncryptionSetInner withEncryptionType(DiskEncryptionSetType encryptionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EncryptionSetProperties();
        }
        this.innerProperties().withEncryptionType(encryptionType);
        return this;
    }

    /**
     * Get the activeKey property: The key vault key which is currently used by this disk encryption set.
     * 
     * @return the activeKey value.
     */
    public KeyForDiskEncryptionSet activeKey() {
        return this.innerProperties() == null ? null : this.innerProperties().activeKey();
    }

    /**
     * Set the activeKey property: The key vault key which is currently used by this disk encryption set.
     * 
     * @param activeKey the activeKey value to set.
     * @return the DiskEncryptionSetInner object itself.
     */
    public DiskEncryptionSetInner withActiveKey(KeyForDiskEncryptionSet activeKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EncryptionSetProperties();
        }
        this.innerProperties().withActiveKey(activeKey);
        return this;
    }

    /**
     * Get the previousKeys property: A readonly collection of key vault keys previously used by this disk encryption
     * set while a key rotation is in progress. It will be empty if there is no ongoing key rotation.
     * 
     * @return the previousKeys value.
     */
    public List<KeyForDiskEncryptionSet> previousKeys() {
        return this.innerProperties() == null ? null : this.innerProperties().previousKeys();
    }

    /**
     * Get the provisioningState property: The disk encryption set provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the rotationToLatestKeyVersionEnabled property: Set this flag to true to enable auto-updating of this disk
     * encryption set to the latest key version.
     * 
     * @return the rotationToLatestKeyVersionEnabled value.
     */
    public Boolean rotationToLatestKeyVersionEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().rotationToLatestKeyVersionEnabled();
    }

    /**
     * Set the rotationToLatestKeyVersionEnabled property: Set this flag to true to enable auto-updating of this disk
     * encryption set to the latest key version.
     * 
     * @param rotationToLatestKeyVersionEnabled the rotationToLatestKeyVersionEnabled value to set.
     * @return the DiskEncryptionSetInner object itself.
     */
    public DiskEncryptionSetInner withRotationToLatestKeyVersionEnabled(Boolean rotationToLatestKeyVersionEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EncryptionSetProperties();
        }
        this.innerProperties().withRotationToLatestKeyVersionEnabled(rotationToLatestKeyVersionEnabled);
        return this;
    }

    /**
     * Get the lastKeyRotationTimestamp property: The time when the active key of this disk encryption set was updated.
     * 
     * @return the lastKeyRotationTimestamp value.
     */
    public OffsetDateTime lastKeyRotationTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().lastKeyRotationTimestamp();
    }

    /**
     * Get the autoKeyRotationError property: The error that was encountered during auto-key rotation. If an error is
     * present, then auto-key rotation will not be attempted until the error on this disk encryption set is fixed.
     * 
     * @return the autoKeyRotationError value.
     */
    public ApiError autoKeyRotationError() {
        return this.innerProperties() == null ? null : this.innerProperties().autoKeyRotationError();
    }

    /**
     * Get the federatedClientId property: Multi-tenant application client id to access key vault in a different
     * tenant. Setting the value to 'None' will clear the property.
     * 
     * @return the federatedClientId value.
     */
    public String federatedClientId() {
        return this.innerProperties() == null ? null : this.innerProperties().federatedClientId();
    }

    /**
     * Set the federatedClientId property: Multi-tenant application client id to access key vault in a different
     * tenant. Setting the value to 'None' will clear the property.
     * 
     * @param federatedClientId the federatedClientId value to set.
     * @return the DiskEncryptionSetInner object itself.
     */
    public DiskEncryptionSetInner withFederatedClientId(String federatedClientId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EncryptionSetProperties();
        }
        this.innerProperties().withFederatedClientId(federatedClientId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
