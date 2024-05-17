// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Azure DevOps Project properties.
 */
@Fluent
public final class AzureDevOpsProjectProperties {
    /*
     * Gets or sets resource status message.
     */
    @JsonProperty(value = "provisioningStatusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningStatusMessage;

    /*
     * Gets or sets time when resource was last checked.
     */
    @JsonProperty(value = "provisioningStatusUpdateTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime provisioningStatusUpdateTimeUtc;

    /*
     * The provisioning state of the resource.
     * 
     * Pending - Provisioning pending.
     * Failed - Provisioning failed.
     * Succeeded - Successful provisioning.
     * Canceled - Provisioning canceled.
     * PendingDeletion - Deletion pending.
     * DeletionSuccess - Deletion successful.
     * DeletionFailure - Deletion failure.
     */
    @JsonProperty(value = "provisioningState")
    private DevOpsProvisioningState provisioningState;

    /*
     * Gets or sets parent Azure DevOps Organization name.
     */
    @JsonProperty(value = "parentOrgName")
    private String parentOrgName;

    /*
     * Gets or sets Azure DevOps Project id.
     */
    @JsonProperty(value = "projectId", access = JsonProperty.Access.WRITE_ONLY)
    private String projectId;

    /*
     * Details about resource onboarding status across all connectors.
     * 
     * OnboardedByOtherConnector - this resource has already been onboarded to another connector. This is only applicable to top-level resources.
     * Onboarded - this resource has already been onboarded by the specified connector.
     * NotOnboarded - this resource has not been onboarded to any connector.
     * NotApplicable - the onboarding state is not applicable to the current endpoint.
     */
    @JsonProperty(value = "onboardingState")
    private OnboardingState onboardingState;

    /*
     * Configuration payload for PR Annotations.
     */
    @JsonProperty(value = "actionableRemediation")
    private ActionableRemediation actionableRemediation;

    /**
     * Creates an instance of AzureDevOpsProjectProperties class.
     */
    public AzureDevOpsProjectProperties() {
    }

    /**
     * Get the provisioningStatusMessage property: Gets or sets resource status message.
     * 
     * @return the provisioningStatusMessage value.
     */
    public String provisioningStatusMessage() {
        return this.provisioningStatusMessage;
    }

    /**
     * Get the provisioningStatusUpdateTimeUtc property: Gets or sets time when resource was last checked.
     * 
     * @return the provisioningStatusUpdateTimeUtc value.
     */
    public OffsetDateTime provisioningStatusUpdateTimeUtc() {
        return this.provisioningStatusUpdateTimeUtc;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * Pending - Provisioning pending.
     * Failed - Provisioning failed.
     * Succeeded - Successful provisioning.
     * Canceled - Provisioning canceled.
     * PendingDeletion - Deletion pending.
     * DeletionSuccess - Deletion successful.
     * DeletionFailure - Deletion failure.
     * 
     * @return the provisioningState value.
     */
    public DevOpsProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the resource.
     * 
     * Pending - Provisioning pending.
     * Failed - Provisioning failed.
     * Succeeded - Successful provisioning.
     * Canceled - Provisioning canceled.
     * PendingDeletion - Deletion pending.
     * DeletionSuccess - Deletion successful.
     * DeletionFailure - Deletion failure.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the AzureDevOpsProjectProperties object itself.
     */
    public AzureDevOpsProjectProperties withProvisioningState(DevOpsProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the parentOrgName property: Gets or sets parent Azure DevOps Organization name.
     * 
     * @return the parentOrgName value.
     */
    public String parentOrgName() {
        return this.parentOrgName;
    }

    /**
     * Set the parentOrgName property: Gets or sets parent Azure DevOps Organization name.
     * 
     * @param parentOrgName the parentOrgName value to set.
     * @return the AzureDevOpsProjectProperties object itself.
     */
    public AzureDevOpsProjectProperties withParentOrgName(String parentOrgName) {
        this.parentOrgName = parentOrgName;
        return this;
    }

    /**
     * Get the projectId property: Gets or sets Azure DevOps Project id.
     * 
     * @return the projectId value.
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Get the onboardingState property: Details about resource onboarding status across all connectors.
     * 
     * OnboardedByOtherConnector - this resource has already been onboarded to another connector. This is only
     * applicable to top-level resources.
     * Onboarded - this resource has already been onboarded by the specified connector.
     * NotOnboarded - this resource has not been onboarded to any connector.
     * NotApplicable - the onboarding state is not applicable to the current endpoint.
     * 
     * @return the onboardingState value.
     */
    public OnboardingState onboardingState() {
        return this.onboardingState;
    }

    /**
     * Set the onboardingState property: Details about resource onboarding status across all connectors.
     * 
     * OnboardedByOtherConnector - this resource has already been onboarded to another connector. This is only
     * applicable to top-level resources.
     * Onboarded - this resource has already been onboarded by the specified connector.
     * NotOnboarded - this resource has not been onboarded to any connector.
     * NotApplicable - the onboarding state is not applicable to the current endpoint.
     * 
     * @param onboardingState the onboardingState value to set.
     * @return the AzureDevOpsProjectProperties object itself.
     */
    public AzureDevOpsProjectProperties withOnboardingState(OnboardingState onboardingState) {
        this.onboardingState = onboardingState;
        return this;
    }

    /**
     * Get the actionableRemediation property: Configuration payload for PR Annotations.
     * 
     * @return the actionableRemediation value.
     */
    public ActionableRemediation actionableRemediation() {
        return this.actionableRemediation;
    }

    /**
     * Set the actionableRemediation property: Configuration payload for PR Annotations.
     * 
     * @param actionableRemediation the actionableRemediation value to set.
     * @return the AzureDevOpsProjectProperties object itself.
     */
    public AzureDevOpsProjectProperties withActionableRemediation(ActionableRemediation actionableRemediation) {
        this.actionableRemediation = actionableRemediation;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actionableRemediation() != null) {
            actionableRemediation().validate();
        }
    }
}
