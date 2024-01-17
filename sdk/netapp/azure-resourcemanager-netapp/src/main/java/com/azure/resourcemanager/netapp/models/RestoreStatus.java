// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.resourcemanager.netapp.fluent.models.RestoreStatusInner;

/**
 * An immutable client-side representation of RestoreStatus.
 */
public interface RestoreStatus {
    /**
     * Gets the healthy property: Restore health status.
     * 
     * @return the healthy value.
     */
    Boolean healthy();

    /**
     * Gets the relationshipStatus property: Status of the restore SnapMirror relationship.
     * 
     * @return the relationshipStatus value.
     */
    RelationshipStatus relationshipStatus();

    /**
     * Gets the mirrorState property: The status of the restore.
     * 
     * @return the mirrorState value.
     */
    MirrorState mirrorState();

    /**
     * Gets the unhealthyReason property: Reason for the unhealthy restore relationship.
     * 
     * @return the unhealthyReason value.
     */
    String unhealthyReason();

    /**
     * Gets the errorMessage property: Displays error message if the restore is in an error state.
     * 
     * @return the errorMessage value.
     */
    String errorMessage();

    /**
     * Gets the totalTransferBytes property: Displays the total bytes transferred.
     * 
     * @return the totalTransferBytes value.
     */
    Long totalTransferBytes();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.RestoreStatusInner object.
     * 
     * @return the inner object.
     */
    RestoreStatusInner innerModel();
}
