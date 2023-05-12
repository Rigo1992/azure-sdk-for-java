// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.ApiManagement.GatewayCertificateAuthorityDeleted
 * event.
 */
@Fluent
public final class ApiManagementGatewayCertificateAuthorityDeletedEventData {
    /*
     * The fully qualified ID of the resource that the compliance state change is for, including the resource name and
     * resource type. Uses the format,
     * `/subscriptions/<SubscriptionID>/resourceGroups/<ResourceGroup>/Microsoft.ApiManagement/service/<ServiceName>/gateways/<GatewayName>/certificateAuthorities/<ResourceName>`
     */
    @JsonProperty(value = "resourceUri")
    private String resourceUri;

    /** Creates an instance of ApiManagementGatewayCertificateAuthorityDeletedEventData class. */
    public ApiManagementGatewayCertificateAuthorityDeletedEventData() {}

    /**
     * Get the resourceUri property: The fully qualified ID of the resource that the compliance state change is for,
     * including the resource name and resource type. Uses the format,
     * `/subscriptions/&lt;SubscriptionID&gt;/resourceGroups/&lt;ResourceGroup&gt;/Microsoft.ApiManagement/service/&lt;ServiceName&gt;/gateways/&lt;GatewayName&gt;/certificateAuthorities/&lt;ResourceName&gt;`.
     *
     * @return the resourceUri value.
     */
    public String getResourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: The fully qualified ID of the resource that the compliance state change is for,
     * including the resource name and resource type. Uses the format,
     * `/subscriptions/&lt;SubscriptionID&gt;/resourceGroups/&lt;ResourceGroup&gt;/Microsoft.ApiManagement/service/&lt;ServiceName&gt;/gateways/&lt;GatewayName&gt;/certificateAuthorities/&lt;ResourceName&gt;`.
     *
     * @param resourceUri the resourceUri value to set.
     * @return the ApiManagementGatewayCertificateAuthorityDeletedEventData object itself.
     */
    public ApiManagementGatewayCertificateAuthorityDeletedEventData setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }
}
