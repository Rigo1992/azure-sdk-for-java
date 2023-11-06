// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Get Operation response object. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("documentModelCompose")
@Immutable
public final class DocumentModelComposeOperationDetails extends OperationDetails {
    /*
     * Operation result upon success.
     */
    @Generated
    @JsonProperty(value = "result")
    private DocumentModelDetails result;

    /**
     * Creates an instance of DocumentModelComposeOperationDetails class.
     *
     * @param status the status value to set.
     * @param createdDateTime the createdDateTime value to set.
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @param resourceLocation the resourceLocation value to set.
     */
    @Generated
    @JsonCreator
    private DocumentModelComposeOperationDetails(
            @JsonProperty(value = "status") OperationStatus status,
            @JsonProperty(value = "createdDateTime") OffsetDateTime createdDateTime,
            @JsonProperty(value = "lastUpdatedDateTime") OffsetDateTime lastUpdatedDateTime,
            @JsonProperty(value = "resourceLocation") String resourceLocation) {
        super(status, createdDateTime, lastUpdatedDateTime, resourceLocation);
    }

    /**
     * Get the result property: Operation result upon success.
     *
     * @return the result value.
     */
    @Generated
    public DocumentModelDetails getResult() {
        return this.result;
    }
}
