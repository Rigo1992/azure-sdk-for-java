// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Operation result info.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("OperationResultInfo")
@Fluent
public final class OperationResultInfo extends OperationResultInfoBase {
    /*
     * List of jobs created by this operation.
     */
    @JsonProperty(value = "jobList")
    private List<String> jobList;

    /**
     * Creates an instance of OperationResultInfo class.
     */
    public OperationResultInfo() {
    }

    /**
     * Get the jobList property: List of jobs created by this operation.
     * 
     * @return the jobList value.
     */
    public List<String> jobList() {
        return this.jobList;
    }

    /**
     * Set the jobList property: List of jobs created by this operation.
     * 
     * @param jobList the jobList value to set.
     * @return the OperationResultInfo object itself.
     */
    public OperationResultInfo withJobList(List<String> jobList) {
        this.jobList = jobList;
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
    }
}
