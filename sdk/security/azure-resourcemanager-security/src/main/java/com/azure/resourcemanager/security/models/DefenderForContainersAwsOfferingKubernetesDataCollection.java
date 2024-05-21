// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The kubernetes data collection connection configuration.
 */
@Fluent
public final class DefenderForContainersAwsOfferingKubernetesDataCollection {
    /*
     * The cloud role ARN in AWS for this feature used for reading data
     */
    @JsonProperty(value = "cloudRoleArn")
    private String cloudRoleArn;

    /**
     * Creates an instance of DefenderForContainersAwsOfferingKubernetesDataCollection class.
     */
    public DefenderForContainersAwsOfferingKubernetesDataCollection() {
    }

    /**
     * Get the cloudRoleArn property: The cloud role ARN in AWS for this feature used for reading data.
     * 
     * @return the cloudRoleArn value.
     */
    public String cloudRoleArn() {
        return this.cloudRoleArn;
    }

    /**
     * Set the cloudRoleArn property: The cloud role ARN in AWS for this feature used for reading data.
     * 
     * @param cloudRoleArn the cloudRoleArn value to set.
     * @return the DefenderForContainersAwsOfferingKubernetesDataCollection object itself.
     */
    public DefenderForContainersAwsOfferingKubernetesDataCollection withCloudRoleArn(String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
