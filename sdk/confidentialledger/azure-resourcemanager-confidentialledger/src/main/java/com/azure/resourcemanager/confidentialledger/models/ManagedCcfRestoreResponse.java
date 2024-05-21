// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.resourcemanager.confidentialledger.fluent.models.ManagedCcfRestoreResponseInner;

/**
 * An immutable client-side representation of ManagedCcfRestoreResponse.
 */
public interface ManagedCcfRestoreResponse {
    /**
     * Gets the message property: Response body stating if the managed CCF resource is being restored.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.confidentialledger.fluent.models.ManagedCcfRestoreResponseInner object.
     * 
     * @return the inner object.
     */
    ManagedCcfRestoreResponseInner innerModel();
}
