// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.resourcemanager.hardwaresecuritymodules.fluent.models.DedicatedHsmOperationInner;

/** An immutable client-side representation of DedicatedHsmOperation. */
public interface DedicatedHsmOperation {
    /**
     * Gets the name property: The name of the Dedicated HSM Resource Provider Operation.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: Gets or sets a value indicating whether it is a data plane action.
     *
     * @return the isDataAction value.
     */
    String isDataAction();

    /**
     * Gets the display property: The display string.
     *
     * @return the display value.
     */
    DedicatedHsmOperationDisplay display();

    /**
     * Gets the inner com.azure.resourcemanager.hardwaresecuritymodules.fluent.models.DedicatedHsmOperationInner object.
     *
     * @return the inner object.
     */
    DedicatedHsmOperationInner innerModel();
}
