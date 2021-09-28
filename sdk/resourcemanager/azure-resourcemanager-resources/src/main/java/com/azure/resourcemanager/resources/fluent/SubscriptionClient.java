// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent;

import com.azure.core.http.HttpPipeline;
import com.azure.core.util.serializer.SerializerAdapter;
import java.time.Duration;

/**
 * The interface for SubscriptionClient class.
 */
public interface SubscriptionClient {
    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the SubscriptionsClient object to access its operations.
     * 
     * @return the SubscriptionsClient object.
     */
    SubscriptionsClient getSubscriptions();

    /**
     * Gets the TenantsClient object to access its operations.
     * 
     * @return the TenantsClient object.
     */
    TenantsClient getTenants();

    /**
     * Gets the ResourceNamesClient object to access its operations.
     * 
     * @return the ResourceNamesClient object.
     */
    ResourceNamesClient getResourceNames();
}
