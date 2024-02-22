// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for AzureApiCenter class.
 */
public interface AzureApiCenter {
    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

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
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the ServicesClient object to access its operations.
     * 
     * @return the ServicesClient object.
     */
    ServicesClient getServices();

    /**
     * Gets the MetadataSchemasClient object to access its operations.
     * 
     * @return the MetadataSchemasClient object.
     */
    MetadataSchemasClient getMetadataSchemas();

    /**
     * Gets the WorkspacesClient object to access its operations.
     * 
     * @return the WorkspacesClient object.
     */
    WorkspacesClient getWorkspaces();

    /**
     * Gets the ApisClient object to access its operations.
     * 
     * @return the ApisClient object.
     */
    ApisClient getApis();

    /**
     * Gets the DeploymentsClient object to access its operations.
     * 
     * @return the DeploymentsClient object.
     */
    DeploymentsClient getDeployments();

    /**
     * Gets the ApiVersionsClient object to access its operations.
     * 
     * @return the ApiVersionsClient object.
     */
    ApiVersionsClient getApiVersions();

    /**
     * Gets the ApiDefinitionsClient object to access its operations.
     * 
     * @return the ApiDefinitionsClient object.
     */
    ApiDefinitionsClient getApiDefinitions();

    /**
     * Gets the EnvironmentsClient object to access its operations.
     * 
     * @return the EnvironmentsClient object.
     */
    EnvironmentsClient getEnvironments();
}
