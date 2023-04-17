// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.AccountResourceInner;

/** An immutable client-side representation of AccountResource. */
public interface AccountResource {
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
     * Gets the organizationId property: organization id.
     *
     * @return the organizationId value.
     */
    String organizationId();

    /**
     * Gets the accountId property: account id.
     *
     * @return the accountId value.
     */
    String accountId();

    /**
     * Gets the accountName property: account name.
     *
     * @return the accountName value.
     */
    String accountName();

    /**
     * Gets the region property: region.
     *
     * @return the region value.
     */
    String region();

    /**
     * Gets the inner com.azure.resourcemanager.newrelicobservability.fluent.models.AccountResourceInner object.
     *
     * @return the inner object.
     */
    AccountResourceInner innerModel();
}
