// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.resourcemanager.support.fluent.models.LookUpResourceIdResponseInner;

/**
 * An immutable client-side representation of LookUpResourceIdResponse.
 */
public interface LookUpResourceIdResponse {
    /**
     * Gets the resourceId property: The resource Id of support resource type.
     * 
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the inner com.azure.resourcemanager.support.fluent.models.LookUpResourceIdResponseInner object.
     * 
     * @return the inner object.
     */
    LookUpResourceIdResponseInner innerModel();
}
