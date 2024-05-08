// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.OperationStatusExtendedResultInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of OperationStatusExtendedResult.
 */
public interface OperationStatusExtendedResult {
    /**
     * Gets the id property: Fully qualified ID for the async operation.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the resourceId property: Fully qualified ID of the resource against which the original async operation was
     * started.
     * 
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the name property: Name of the async operation.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the status property: Operation status.
     * 
     * @return the status value.
     */
    String status();

    /**
     * Gets the percentComplete property: Percent of the operation that is complete.
     * 
     * @return the percentComplete value.
     */
    Float percentComplete();

    /**
     * Gets the startTime property: The start time of the operation.
     * 
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: The end time of the operation.
     * 
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the operations property: The operations list.
     * 
     * @return the operations value.
     */
    List<OperationStatusResult> operations();

    /**
     * Gets the error property: If present, details of the operation error.
     * 
     * @return the error value.
     */
    ManagementError error();

    /**
     * Gets the properties property: The extended properties of Operation Results.
     * 
     * @return the properties value.
     */
    Map<String, Object> properties();

    /**
     * Gets the inner com.azure.resourcemanager.mysqlflexibleserver.fluent.models.OperationStatusExtendedResultInner
     * object.
     * 
     * @return the inner object.
     */
    OperationStatusExtendedResultInner innerModel();
}
