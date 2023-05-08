// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The managed identity for the disk encryption set. It should be given permission on the key vault before it can be
 * used to encrypt disks.
 */
@Fluent
public final class EncryptionSetIdentity {
    /*
     * The type of Managed Identity used by the DiskEncryptionSet. Only SystemAssigned is supported for new creations.
     * Disk Encryption Sets can be updated with Identity type None during migration of subscription to a new Azure
     * Active Directory tenant; it will cause the encrypted resources to lose access to the keys.
     */
    @JsonProperty(value = "type")
    private DiskEncryptionSetIdentityType type;

    /*
     * The object id of the Managed Identity Resource. This will be sent to the RP from ARM via the
     * x-ms-identity-principal-id header in the PUT request if the resource has a systemAssigned(implicit) identity
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant id of the Managed Identity Resource. This will be sent to the RP from ARM via the
     * x-ms-client-tenant-id header in the PUT request if the resource has a systemAssigned(implicit) identity
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The list of user identities associated with the disk encryption set. The user identity dictionary key references
     * will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, VirtualMachineIdentityUserAssignedIdentities> userAssignedIdentities;

    /** Creates an instance of EncryptionSetIdentity class. */
    public EncryptionSetIdentity() {
    }

    /**
     * Get the type property: The type of Managed Identity used by the DiskEncryptionSet. Only SystemAssigned is
     * supported for new creations. Disk Encryption Sets can be updated with Identity type None during migration of
     * subscription to a new Azure Active Directory tenant; it will cause the encrypted resources to lose access to the
     * keys.
     *
     * @return the type value.
     */
    public DiskEncryptionSetIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of Managed Identity used by the DiskEncryptionSet. Only SystemAssigned is
     * supported for new creations. Disk Encryption Sets can be updated with Identity type None during migration of
     * subscription to a new Azure Active Directory tenant; it will cause the encrypted resources to lose access to the
     * keys.
     *
     * @param type the type value to set.
     * @return the EncryptionSetIdentity object itself.
     */
    public EncryptionSetIdentity withType(DiskEncryptionSetIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: The object id of the Managed Identity Resource. This will be sent to the RP from
     * ARM via the x-ms-identity-principal-id header in the PUT request if the resource has a systemAssigned(implicit)
     * identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant id of the Managed Identity Resource. This will be sent to the RP from ARM
     * via the x-ms-client-tenant-id header in the PUT request if the resource has a systemAssigned(implicit) identity.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the userAssignedIdentities property: The list of user identities associated with the disk encryption set. The
     * user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, VirtualMachineIdentityUserAssignedIdentities> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The list of user identities associated with the disk encryption set. The
     * user identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the EncryptionSetIdentity object itself.
     */
    public EncryptionSetIdentity withUserAssignedIdentities(
        Map<String, VirtualMachineIdentityUserAssignedIdentities> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
