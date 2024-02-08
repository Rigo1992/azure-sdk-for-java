// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.UnlockDeleteResponseInner;

/**
 * An immutable client-side representation of UnlockDeleteResponse.
 */
public interface UnlockDeleteResponse {
    /**
     * Gets the unlockDeleteExpiryTime property: This is the time when unlock delete privileges will get expired.
     * 
     * @return the unlockDeleteExpiryTime value.
     */
    String unlockDeleteExpiryTime();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicesbackup.fluent.models.UnlockDeleteResponseInner object.
     * 
     * @return the inner object.
     */
    UnlockDeleteResponseInner innerModel();
}
