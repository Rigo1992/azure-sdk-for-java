// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.security.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of an API collection.
 */
@Immutable
public final class ApiCollectionProperties {
    /*
     * Gets the provisioning state of the API collection.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The display name of the API collection.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The resource Id of the resource from where this API collection was discovered.
     */
    @JsonProperty(value = "discoveredVia", access = JsonProperty.Access.WRITE_ONLY)
    private String discoveredVia;

    /*
     * The base URI for this API collection. All endpoints of this API collection extend this base URI.
     */
    @JsonProperty(value = "baseUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String baseUrl;

    /*
     * The number of API endpoints discovered in this API collection.
     */
    @JsonProperty(value = "numberOfApiEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfApiEndpoints;

    /*
     * The number of API endpoints in this API collection that have not received any API traffic in the last 30 days.
     */
    @JsonProperty(value = "numberOfInactiveApiEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfInactiveApiEndpoints;

    /*
     * The number of API endpoints in this API collection that are unauthenticated.
     */
    @JsonProperty(value = "numberOfUnauthenticatedApiEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfUnauthenticatedApiEndpoints;

    /*
     * The number of API endpoints in this API collection for which API traffic from the internet was observed.
     */
    @JsonProperty(value = "numberOfExternalApiEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfExternalApiEndpoints;

    /*
     * The number of API endpoints in this API collection which are exposing sensitive data in their requests and/or responses.
     */
    @JsonProperty(value = "numberOfApiEndpointsWithSensitiveDataExposed", access = JsonProperty.Access.WRITE_ONLY)
    private Long numberOfApiEndpointsWithSensitiveDataExposed;

    /*
     * The highest priority sensitivity label from Microsoft Purview in this API collection.
     */
    @JsonProperty(value = "sensitivityLabel", access = JsonProperty.Access.WRITE_ONLY)
    private String sensitivityLabel;

    /**
     * Creates an instance of ApiCollectionProperties class.
     */
    public ApiCollectionProperties() {
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the API collection.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the displayName property: The display name of the API collection.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the discoveredVia property: The resource Id of the resource from where this API collection was discovered.
     * 
     * @return the discoveredVia value.
     */
    public String discoveredVia() {
        return this.discoveredVia;
    }

    /**
     * Get the baseUrl property: The base URI for this API collection. All endpoints of this API collection extend this
     * base URI.
     * 
     * @return the baseUrl value.
     */
    public String baseUrl() {
        return this.baseUrl;
    }

    /**
     * Get the numberOfApiEndpoints property: The number of API endpoints discovered in this API collection.
     * 
     * @return the numberOfApiEndpoints value.
     */
    public Long numberOfApiEndpoints() {
        return this.numberOfApiEndpoints;
    }

    /**
     * Get the numberOfInactiveApiEndpoints property: The number of API endpoints in this API collection that have not
     * received any API traffic in the last 30 days.
     * 
     * @return the numberOfInactiveApiEndpoints value.
     */
    public Long numberOfInactiveApiEndpoints() {
        return this.numberOfInactiveApiEndpoints;
    }

    /**
     * Get the numberOfUnauthenticatedApiEndpoints property: The number of API endpoints in this API collection that are
     * unauthenticated.
     * 
     * @return the numberOfUnauthenticatedApiEndpoints value.
     */
    public Long numberOfUnauthenticatedApiEndpoints() {
        return this.numberOfUnauthenticatedApiEndpoints;
    }

    /**
     * Get the numberOfExternalApiEndpoints property: The number of API endpoints in this API collection for which API
     * traffic from the internet was observed.
     * 
     * @return the numberOfExternalApiEndpoints value.
     */
    public Long numberOfExternalApiEndpoints() {
        return this.numberOfExternalApiEndpoints;
    }

    /**
     * Get the numberOfApiEndpointsWithSensitiveDataExposed property: The number of API endpoints in this API collection
     * which are exposing sensitive data in their requests and/or responses.
     * 
     * @return the numberOfApiEndpointsWithSensitiveDataExposed value.
     */
    public Long numberOfApiEndpointsWithSensitiveDataExposed() {
        return this.numberOfApiEndpointsWithSensitiveDataExposed;
    }

    /**
     * Get the sensitivityLabel property: The highest priority sensitivity label from Microsoft Purview in this API
     * collection.
     * 
     * @return the sensitivityLabel value.
     */
    public String sensitivityLabel() {
        return this.sensitivityLabel;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
