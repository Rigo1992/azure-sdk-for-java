// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for HealthcareApisManagementClient class. */
public interface HealthcareApisManagementClient {
    /**
     * Gets The subscription identifier.
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
     * Gets the ServicesClient object to access its operations.
     *
     * @return the ServicesClient object.
     */
    ServicesClient getServices();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the WorkspacesClient object to access its operations.
     *
     * @return the WorkspacesClient object.
     */
    WorkspacesClient getWorkspaces();

    /**
     * Gets the DicomServicesClient object to access its operations.
     *
     * @return the DicomServicesClient object.
     */
    DicomServicesClient getDicomServices();

    /**
     * Gets the IotConnectorsClient object to access its operations.
     *
     * @return the IotConnectorsClient object.
     */
    IotConnectorsClient getIotConnectors();

    /**
     * Gets the FhirDestinationsClient object to access its operations.
     *
     * @return the FhirDestinationsClient object.
     */
    FhirDestinationsClient getFhirDestinations();

    /**
     * Gets the IotConnectorFhirDestinationsClient object to access its operations.
     *
     * @return the IotConnectorFhirDestinationsClient object.
     */
    IotConnectorFhirDestinationsClient getIotConnectorFhirDestinations();

    /**
     * Gets the FhirServicesClient object to access its operations.
     *
     * @return the FhirServicesClient object.
     */
    FhirServicesClient getFhirServices();

    /**
     * Gets the WorkspacePrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the WorkspacePrivateEndpointConnectionsClient object.
     */
    WorkspacePrivateEndpointConnectionsClient getWorkspacePrivateEndpointConnections();

    /**
     * Gets the WorkspacePrivateLinkResourcesClient object to access its operations.
     *
     * @return the WorkspacePrivateLinkResourcesClient object.
     */
    WorkspacePrivateLinkResourcesClient getWorkspacePrivateLinkResources();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the OperationResultsClient object to access its operations.
     *
     * @return the OperationResultsClient object.
     */
    OperationResultsClient getOperationResults();
}
