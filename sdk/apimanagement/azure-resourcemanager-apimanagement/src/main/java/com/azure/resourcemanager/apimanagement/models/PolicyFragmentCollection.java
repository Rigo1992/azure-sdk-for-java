// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.PolicyFragmentCollectionInner;
import java.util.List;

/** An immutable client-side representation of PolicyFragmentCollection. */
public interface PolicyFragmentCollection {
    /**
     * Gets the value property: Policy fragment contract value.
     *
     * @return the value value.
     */
    List<PolicyFragmentContract> value();

    /**
     * Gets the count property: Total record count number.
     *
     * @return the count value.
     */
    Long count();

    /**
     * Gets the nextLink property: Next page link if any.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.PolicyFragmentCollectionInner object.
     *
     * @return the inner object.
     */
    PolicyFragmentCollectionInner innerModel();
}
