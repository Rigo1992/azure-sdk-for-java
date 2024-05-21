// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ARC autoprovisioning configuration for an AWS environment.
 */
@Fluent
public class ArcAutoProvisioningAws extends ArcAutoProvisioning {
    /*
     * The cloud role ARN in AWS for this feature
     */
    @JsonProperty(value = "cloudRoleArn")
    private String cloudRoleArn;

    /**
     * Creates an instance of ArcAutoProvisioningAws class.
     */
    public ArcAutoProvisioningAws() {
    }

    /**
     * Get the cloudRoleArn property: The cloud role ARN in AWS for this feature.
     * 
     * @return the cloudRoleArn value.
     */
    public String cloudRoleArn() {
        return this.cloudRoleArn;
    }

    /**
     * Set the cloudRoleArn property: The cloud role ARN in AWS for this feature.
     * 
     * @param cloudRoleArn the cloudRoleArn value to set.
     * @return the ArcAutoProvisioningAws object itself.
     */
    public ArcAutoProvisioningAws withCloudRoleArn(String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArcAutoProvisioningAws withEnabled(Boolean enabled) {
        super.withEnabled(enabled);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArcAutoProvisioningAws withConfiguration(ArcAutoProvisioningConfiguration configuration) {
        super.withConfiguration(configuration);
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
