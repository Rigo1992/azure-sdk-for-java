// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.PlannedFailoverModelInner;

/** An immutable client-side representation of PlannedFailoverModel. */
public interface PlannedFailoverModel {
    /**
     * Gets the properties property: Planned failover model properties.
     *
     * @return the properties value.
     */
    PlannedFailoverModelProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.PlannedFailoverModelInner
     * object.
     *
     * @return the inner object.
     */
    PlannedFailoverModelInner innerModel();
}
