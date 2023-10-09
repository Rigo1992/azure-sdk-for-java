// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ContainerRegistryManagementClient class. */
public interface ContainerRegistryManagementClient {
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
     * Gets the ArchivesClient object to access its operations.
     *
     * @return the ArchivesClient object.
     */
    ArchivesClient getArchives();

    /**
     * Gets the ArchiveVersionsClient object to access its operations.
     *
     * @return the ArchiveVersionsClient object.
     */
    ArchiveVersionsClient getArchiveVersions();

    /**
     * Gets the CacheRulesClient object to access its operations.
     *
     * @return the CacheRulesClient object.
     */
    CacheRulesClient getCacheRules();

    /**
     * Gets the ConnectedRegistriesClient object to access its operations.
     *
     * @return the ConnectedRegistriesClient object.
     */
    ConnectedRegistriesClient getConnectedRegistries();

    /**
     * Gets the CredentialSetsClient object to access its operations.
     *
     * @return the CredentialSetsClient object.
     */
    CredentialSetsClient getCredentialSets();

    /**
     * Gets the ExportPipelinesClient object to access its operations.
     *
     * @return the ExportPipelinesClient object.
     */
    ExportPipelinesClient getExportPipelines();

    /**
     * Gets the RegistriesClient object to access its operations.
     *
     * @return the RegistriesClient object.
     */
    RegistriesClient getRegistries();

    /**
     * Gets the ImportPipelinesClient object to access its operations.
     *
     * @return the ImportPipelinesClient object.
     */
    ImportPipelinesClient getImportPipelines();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PipelineRunsClient object to access its operations.
     *
     * @return the PipelineRunsClient object.
     */
    PipelineRunsClient getPipelineRuns();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the ReplicationsClient object to access its operations.
     *
     * @return the ReplicationsClient object.
     */
    ReplicationsClient getReplications();

    /**
     * Gets the ScopeMapsClient object to access its operations.
     *
     * @return the ScopeMapsClient object.
     */
    ScopeMapsClient getScopeMaps();

    /**
     * Gets the TokensClient object to access its operations.
     *
     * @return the TokensClient object.
     */
    TokensClient getTokens();

    /**
     * Gets the WebhooksClient object to access its operations.
     *
     * @return the WebhooksClient object.
     */
    WebhooksClient getWebhooks();

    /**
     * Gets the AgentPoolsClient object to access its operations.
     *
     * @return the AgentPoolsClient object.
     */
    AgentPoolsClient getAgentPools();

    /**
     * Gets the RunsClient object to access its operations.
     *
     * @return the RunsClient object.
     */
    RunsClient getRuns();

    /**
     * Gets the TaskRunsClient object to access its operations.
     *
     * @return the TaskRunsClient object.
     */
    TaskRunsClient getTaskRuns();

    /**
     * Gets the TasksClient object to access its operations.
     *
     * @return the TasksClient object.
     */
    TasksClient getTasks();
}
