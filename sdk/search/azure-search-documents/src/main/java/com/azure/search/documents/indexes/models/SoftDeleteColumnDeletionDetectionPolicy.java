// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines a data deletion detection policy that implements a soft-deletion strategy. It determines whether an item
 * should be deleted based on the value of a designated 'soft delete' column.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "@odata.type",
        visible = true)
@JsonTypeName("#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy")
@Fluent
public final class SoftDeleteColumnDeletionDetectionPolicy extends DataDeletionDetectionPolicy {

    /*
     * Identifies the concrete type of the data deletion detection policy.
     */
    @JsonTypeId
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType = "#Microsoft.Azure.Search.SoftDeleteColumnDeletionDetectionPolicy";

    /*
     * The name of the column to use for soft-deletion detection.
     */
    @JsonProperty(value = "softDeleteColumnName")
    private String softDeleteColumnName;

    /*
     * The marker value that identifies an item as deleted.
     */
    @JsonProperty(value = "softDeleteMarkerValue")
    private String softDeleteMarkerValue;

    /**
     * Get the softDeleteColumnName property: The name of the column to use for soft-deletion detection.
     *
     * @return the softDeleteColumnName value.
     */
    public String getSoftDeleteColumnName() {
        return this.softDeleteColumnName;
    }

    /**
     * Set the softDeleteColumnName property: The name of the column to use for soft-deletion detection.
     *
     * @param softDeleteColumnName the softDeleteColumnName value to set.
     * @return the SoftDeleteColumnDeletionDetectionPolicy object itself.
     */
    public SoftDeleteColumnDeletionDetectionPolicy setSoftDeleteColumnName(String softDeleteColumnName) {
        this.softDeleteColumnName = softDeleteColumnName;
        return this;
    }

    /**
     * Get the softDeleteMarkerValue property: The marker value that identifies an item as deleted.
     *
     * @return the softDeleteMarkerValue value.
     */
    public String getSoftDeleteMarkerValue() {
        return this.softDeleteMarkerValue;
    }

    /**
     * Set the softDeleteMarkerValue property: The marker value that identifies an item as deleted.
     *
     * @param softDeleteMarkerValue the softDeleteMarkerValue value to set.
     * @return the SoftDeleteColumnDeletionDetectionPolicy object itself.
     */
    public SoftDeleteColumnDeletionDetectionPolicy setSoftDeleteMarkerValue(String softDeleteMarkerValue) {
        this.softDeleteMarkerValue = softDeleteMarkerValue;
        return this;
    }
}
