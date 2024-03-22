// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request of a switch billing Operation.
 */
@Fluent
public final class SwitchBillingRequest {
    /*
     * Azure resource Id
     */
    @JsonProperty(value = "azureResourceId")
    private String azureResourceId;

    /*
     * Organization id
     */
    @JsonProperty(value = "organizationId")
    private String organizationId;

    /*
     * Plan details
     */
    @JsonProperty(value = "planData")
    private PlanData planData;

    /*
     * User Email
     */
    @JsonProperty(value = "userEmail", required = true)
    private String userEmail;

    /**
     * Creates an instance of SwitchBillingRequest class.
     */
    public SwitchBillingRequest() {
    }

    /**
     * Get the azureResourceId property: Azure resource Id.
     * 
     * @return the azureResourceId value.
     */
    public String azureResourceId() {
        return this.azureResourceId;
    }

    /**
     * Set the azureResourceId property: Azure resource Id.
     * 
     * @param azureResourceId the azureResourceId value to set.
     * @return the SwitchBillingRequest object itself.
     */
    public SwitchBillingRequest withAzureResourceId(String azureResourceId) {
        this.azureResourceId = azureResourceId;
        return this;
    }

    /**
     * Get the organizationId property: Organization id.
     * 
     * @return the organizationId value.
     */
    public String organizationId() {
        return this.organizationId;
    }

    /**
     * Set the organizationId property: Organization id.
     * 
     * @param organizationId the organizationId value to set.
     * @return the SwitchBillingRequest object itself.
     */
    public SwitchBillingRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Get the planData property: Plan details.
     * 
     * @return the planData value.
     */
    public PlanData planData() {
        return this.planData;
    }

    /**
     * Set the planData property: Plan details.
     * 
     * @param planData the planData value to set.
     * @return the SwitchBillingRequest object itself.
     */
    public SwitchBillingRequest withPlanData(PlanData planData) {
        this.planData = planData;
        return this;
    }

    /**
     * Get the userEmail property: User Email.
     * 
     * @return the userEmail value.
     */
    public String userEmail() {
        return this.userEmail;
    }

    /**
     * Set the userEmail property: User Email.
     * 
     * @param userEmail the userEmail value to set.
     * @return the SwitchBillingRequest object itself.
     */
    public SwitchBillingRequest withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (planData() != null) {
            planData().validate();
        }
        if (userEmail() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property userEmail in model SwitchBillingRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SwitchBillingRequest.class);
}
