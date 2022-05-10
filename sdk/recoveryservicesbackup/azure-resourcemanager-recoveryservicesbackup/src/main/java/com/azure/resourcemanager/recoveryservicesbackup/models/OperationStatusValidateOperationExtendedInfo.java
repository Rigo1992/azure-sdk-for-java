// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Operation status extended info for ValidateOperation action. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("OperationStatusValidateOperationExtendedInfo")
@Fluent
public final class OperationStatusValidateOperationExtendedInfo extends OperationStatusExtendedInfo {
    /*
     * Gets the validation operation response
     */
    @JsonProperty(value = "validateOperationResponse")
    private ValidateOperationResponse validateOperationResponse;

    /**
     * Get the validateOperationResponse property: Gets the validation operation response.
     *
     * @return the validateOperationResponse value.
     */
    public ValidateOperationResponse validateOperationResponse() {
        return this.validateOperationResponse;
    }

    /**
     * Set the validateOperationResponse property: Gets the validation operation response.
     *
     * @param validateOperationResponse the validateOperationResponse value to set.
     * @return the OperationStatusValidateOperationExtendedInfo object itself.
     */
    public OperationStatusValidateOperationExtendedInfo withValidateOperationResponse(
        ValidateOperationResponse validateOperationResponse) {
        this.validateOperationResponse = validateOperationResponse;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (validateOperationResponse() != null) {
            validateOperationResponse().validate();
        }
    }
}
