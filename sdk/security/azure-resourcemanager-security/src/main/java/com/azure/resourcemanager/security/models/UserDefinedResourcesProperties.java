// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the IoT Security solution's user defined resources. */
@Fluent
public final class UserDefinedResourcesProperties {
    /*
     * Azure Resource Graph query which represents the security solution's user defined resources. Required to start
     * with "where type != "Microsoft.Devices/IotHubs""
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /*
     * List of Azure subscription ids on which the user defined resources query should be executed.
     */
    @JsonProperty(value = "querySubscriptions", required = true)
    private List<String> querySubscriptions;

    /** Creates an instance of UserDefinedResourcesProperties class. */
    public UserDefinedResourcesProperties() {
    }

    /**
     * Get the query property: Azure Resource Graph query which represents the security solution's user defined
     * resources. Required to start with "where type != "Microsoft.Devices/IotHubs"".
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: Azure Resource Graph query which represents the security solution's user defined
     * resources. Required to start with "where type != "Microsoft.Devices/IotHubs"".
     *
     * @param query the query value to set.
     * @return the UserDefinedResourcesProperties object itself.
     */
    public UserDefinedResourcesProperties withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the querySubscriptions property: List of Azure subscription ids on which the user defined resources query
     * should be executed.
     *
     * @return the querySubscriptions value.
     */
    public List<String> querySubscriptions() {
        return this.querySubscriptions;
    }

    /**
     * Set the querySubscriptions property: List of Azure subscription ids on which the user defined resources query
     * should be executed.
     *
     * @param querySubscriptions the querySubscriptions value to set.
     * @return the UserDefinedResourcesProperties object itself.
     */
    public UserDefinedResourcesProperties withQuerySubscriptions(List<String> querySubscriptions) {
        this.querySubscriptions = querySubscriptions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (query() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property query in model UserDefinedResourcesProperties"));
        }
        if (querySubscriptions() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property querySubscriptions in model UserDefinedResourcesProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserDefinedResourcesProperties.class);
}
