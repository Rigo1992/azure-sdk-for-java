// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.OperationInner;
import java.util.Map;

/**
 * An immutable client-side representation of Operation.
 */
public interface Operation {
    /**
     * Gets the name property: The name of the operation being performed on this particular object.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: The localized display information for this particular operation or action.
     * 
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the origin property: The intended executor of the operation.
     * 
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the properties property: Additional descriptions for the operation.
     * 
     * @return the properties value.
     */
    Map<String, Object> properties();

    /**
     * Gets the inner com.azure.resourcemanager.mysqlflexibleserver.fluent.models.OperationInner object.
     * 
     * @return the inner object.
     */
    OperationInner innerModel();
}
