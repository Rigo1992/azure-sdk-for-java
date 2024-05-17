// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GCP Defenders CSPM Permissions Management OIDC (Open ID connect) connection configurations.
 */
@Fluent
public final class DefenderCspmGcpOfferingCiemDiscovery {
    /*
     * The GCP workload identity provider id for Permissions Management offering
     */
    @JsonProperty(value = "workloadIdentityProviderId")
    private String workloadIdentityProviderId;

    /*
     * The service account email address in GCP for Permissions Management offering
     */
    @JsonProperty(value = "serviceAccountEmailAddress")
    private String serviceAccountEmailAddress;

    /*
     * the azure active directory app name used of authenticating against GCP workload identity federation
     */
    @JsonProperty(value = "azureActiveDirectoryAppName")
    private String azureActiveDirectoryAppName;

    /**
     * Creates an instance of DefenderCspmGcpOfferingCiemDiscovery class.
     */
    public DefenderCspmGcpOfferingCiemDiscovery() {
    }

    /**
     * Get the workloadIdentityProviderId property: The GCP workload identity provider id for Permissions Management
     * offering.
     * 
     * @return the workloadIdentityProviderId value.
     */
    public String workloadIdentityProviderId() {
        return this.workloadIdentityProviderId;
    }

    /**
     * Set the workloadIdentityProviderId property: The GCP workload identity provider id for Permissions Management
     * offering.
     * 
     * @param workloadIdentityProviderId the workloadIdentityProviderId value to set.
     * @return the DefenderCspmGcpOfferingCiemDiscovery object itself.
     */
    public DefenderCspmGcpOfferingCiemDiscovery withWorkloadIdentityProviderId(String workloadIdentityProviderId) {
        this.workloadIdentityProviderId = workloadIdentityProviderId;
        return this;
    }

    /**
     * Get the serviceAccountEmailAddress property: The service account email address in GCP for Permissions Management
     * offering.
     * 
     * @return the serviceAccountEmailAddress value.
     */
    public String serviceAccountEmailAddress() {
        return this.serviceAccountEmailAddress;
    }

    /**
     * Set the serviceAccountEmailAddress property: The service account email address in GCP for Permissions Management
     * offering.
     * 
     * @param serviceAccountEmailAddress the serviceAccountEmailAddress value to set.
     * @return the DefenderCspmGcpOfferingCiemDiscovery object itself.
     */
    public DefenderCspmGcpOfferingCiemDiscovery withServiceAccountEmailAddress(String serviceAccountEmailAddress) {
        this.serviceAccountEmailAddress = serviceAccountEmailAddress;
        return this;
    }

    /**
     * Get the azureActiveDirectoryAppName property: the azure active directory app name used of authenticating against
     * GCP workload identity federation.
     * 
     * @return the azureActiveDirectoryAppName value.
     */
    public String azureActiveDirectoryAppName() {
        return this.azureActiveDirectoryAppName;
    }

    /**
     * Set the azureActiveDirectoryAppName property: the azure active directory app name used of authenticating against
     * GCP workload identity federation.
     * 
     * @param azureActiveDirectoryAppName the azureActiveDirectoryAppName value to set.
     * @return the DefenderCspmGcpOfferingCiemDiscovery object itself.
     */
    public DefenderCspmGcpOfferingCiemDiscovery withAzureActiveDirectoryAppName(String azureActiveDirectoryAppName) {
        this.azureActiveDirectoryAppName = azureActiveDirectoryAppName;
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
