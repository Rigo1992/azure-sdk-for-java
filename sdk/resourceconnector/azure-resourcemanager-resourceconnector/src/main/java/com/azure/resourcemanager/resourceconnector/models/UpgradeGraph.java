// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.models;

import com.azure.resourcemanager.resourceconnector.fluent.models.UpgradeGraphInner;

/** An immutable client-side representation of UpgradeGraph. */
public interface UpgradeGraph {
    /**
     * Gets the id property: The appliance resource path.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The release train name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the properties property: The properties of supported version.
     *
     * @return the properties value.
     */
    UpgradeGraphProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.resourceconnector.fluent.models.UpgradeGraphInner object.
     *
     * @return the inner object.
     */
    UpgradeGraphInner innerModel();
}
