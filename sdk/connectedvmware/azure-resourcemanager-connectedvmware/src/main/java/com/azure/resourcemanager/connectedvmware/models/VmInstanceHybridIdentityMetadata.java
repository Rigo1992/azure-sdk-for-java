// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.connectedvmware.fluent.models.VmInstanceHybridIdentityMetadataInner;

/** An immutable client-side representation of VmInstanceHybridIdentityMetadata. */
public interface VmInstanceHybridIdentityMetadata {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the resourceUid property: The unique identifier for the resource.
     *
     * @return the resourceUid value.
     */
    String resourceUid();

    /**
     * Gets the publicKey property: Gets or sets the Public Key.
     *
     * @return the publicKey value.
     */
    String publicKey();

    /**
     * Gets the provisioningState property: Gets the provisioning state.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.connectedvmware.fluent.models.VmInstanceHybridIdentityMetadataInner
     * object.
     *
     * @return the inner object.
     */
    VmInstanceHybridIdentityMetadataInner innerModel();
}
