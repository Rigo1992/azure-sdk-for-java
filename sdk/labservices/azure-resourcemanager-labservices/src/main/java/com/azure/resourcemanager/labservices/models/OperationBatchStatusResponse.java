// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.resourcemanager.labservices.fluent.models.OperationBatchStatusResponseInner;
import java.util.List;

/** An immutable client-side representation of OperationBatchStatusResponse. */
public interface OperationBatchStatusResponse {
    /**
     * Gets the items property: Gets a collection of items that contain the operation url and status.
     *
     * @return the items value.
     */
    List<OperationBatchStatusResponseItem> items();

    /**
     * Gets the inner com.azure.resourcemanager.labservices.fluent.models.OperationBatchStatusResponseInner object.
     *
     * @return the inner object.
     */
    OperationBatchStatusResponseInner innerModel();
}
