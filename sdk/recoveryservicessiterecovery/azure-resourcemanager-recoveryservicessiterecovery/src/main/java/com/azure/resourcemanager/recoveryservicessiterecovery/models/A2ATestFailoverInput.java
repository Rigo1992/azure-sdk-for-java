// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A2A provider specific input for test failover.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
@Fluent
public final class A2ATestFailoverInput extends TestFailoverProviderSpecificInput {
    /*
     * The recovery point id to be passed to test failover to a particular recovery point. In case of latest recovery
     * point, null should be passed.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /*
     * A value indicating whether to use recovery cloud service for TFO or not.
     */
    @JsonProperty(value = "cloudServiceCreationOption")
    private String cloudServiceCreationOption;

    /**
     * Creates an instance of A2ATestFailoverInput class.
     */
    public A2ATestFailoverInput() {
    }

    /**
     * Get the recoveryPointId property: The recovery point id to be passed to test failover to a particular recovery
     * point. In case of latest recovery point, null should be passed.
     * 
     * @return the recoveryPointId value.
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recoveryPointId property: The recovery point id to be passed to test failover to a particular recovery
     * point. In case of latest recovery point, null should be passed.
     * 
     * @param recoveryPointId the recoveryPointId value to set.
     * @return the A2ATestFailoverInput object itself.
     */
    public A2ATestFailoverInput withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Get the cloudServiceCreationOption property: A value indicating whether to use recovery cloud service for TFO or
     * not.
     * 
     * @return the cloudServiceCreationOption value.
     */
    public String cloudServiceCreationOption() {
        return this.cloudServiceCreationOption;
    }

    /**
     * Set the cloudServiceCreationOption property: A value indicating whether to use recovery cloud service for TFO or
     * not.
     * 
     * @param cloudServiceCreationOption the cloudServiceCreationOption value to set.
     * @return the A2ATestFailoverInput object itself.
     */
    public A2ATestFailoverInput withCloudServiceCreationOption(String cloudServiceCreationOption) {
        this.cloudServiceCreationOption = cloudServiceCreationOption;
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
