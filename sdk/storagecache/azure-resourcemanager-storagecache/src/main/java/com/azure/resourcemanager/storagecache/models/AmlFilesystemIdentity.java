// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Managed Identity properties. */
@Fluent
public class AmlFilesystemIdentity {
    /*
     * The principal ID for the user-assigned identity of the resource.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant ID associated with the resource.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The type of identity used for the resource.
     */
    @JsonProperty(value = "type")
    private AmlFilesystemIdentityType type;

    /*
     * A dictionary where each key is a user assigned identity resource ID, and each key's value is an empty
     * dictionary.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, UserAssignedIdentitiesValueAutoGenerated> userAssignedIdentities;

    /** Creates an instance of AmlFilesystemIdentity class. */
    public AmlFilesystemIdentity() {
    }

    /**
     * Get the principalId property: The principal ID for the user-assigned identity of the resource.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant ID associated with the resource.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The type of identity used for the resource.
     *
     * @return the type value.
     */
    public AmlFilesystemIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the resource.
     *
     * @param type the type value to set.
     * @return the AmlFilesystemIdentity object itself.
     */
    public AmlFilesystemIdentity withType(AmlFilesystemIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: A dictionary where each key is a user assigned identity resource ID, and
     * each key's value is an empty dictionary.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentitiesValueAutoGenerated> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: A dictionary where each key is a user assigned identity resource ID, and
     * each key's value is an empty dictionary.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the AmlFilesystemIdentity object itself.
     */
    public AmlFilesystemIdentity withUserAssignedIdentities(
        Map<String, UserAssignedIdentitiesValueAutoGenerated> userAssignedIdentities) {
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
