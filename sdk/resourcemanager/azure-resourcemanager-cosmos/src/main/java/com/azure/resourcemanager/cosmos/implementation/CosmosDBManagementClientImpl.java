// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.cosmos.fluent.CassandraClustersClient;
import com.azure.resourcemanager.cosmos.fluent.CassandraDataCentersClient;
import com.azure.resourcemanager.cosmos.fluent.CassandraResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.CollectionPartitionRegionsClient;
import com.azure.resourcemanager.cosmos.fluent.CollectionPartitionsClient;
import com.azure.resourcemanager.cosmos.fluent.CollectionRegionsClient;
import com.azure.resourcemanager.cosmos.fluent.CollectionsClient;
import com.azure.resourcemanager.cosmos.fluent.CosmosDBManagementClient;
import com.azure.resourcemanager.cosmos.fluent.DataTransferJobsClient;
import com.azure.resourcemanager.cosmos.fluent.DatabaseAccountRegionsClient;
import com.azure.resourcemanager.cosmos.fluent.DatabaseAccountsClient;
import com.azure.resourcemanager.cosmos.fluent.DatabasesClient;
import com.azure.resourcemanager.cosmos.fluent.GraphResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.GremlinResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.LocationsClient;
import com.azure.resourcemanager.cosmos.fluent.MongoClustersClient;
import com.azure.resourcemanager.cosmos.fluent.MongoDBResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.NotebookWorkspacesClient;
import com.azure.resourcemanager.cosmos.fluent.OperationsClient;
import com.azure.resourcemanager.cosmos.fluent.PartitionKeyRangeIdRegionsClient;
import com.azure.resourcemanager.cosmos.fluent.PartitionKeyRangeIdsClient;
import com.azure.resourcemanager.cosmos.fluent.PercentileSourceTargetsClient;
import com.azure.resourcemanager.cosmos.fluent.PercentileTargetsClient;
import com.azure.resourcemanager.cosmos.fluent.PercentilesClient;
import com.azure.resourcemanager.cosmos.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.cosmos.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableDatabaseAccountsClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableGremlinDatabasesClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableGremlinGraphsClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableGremlinResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableMongodbCollectionsClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableMongodbDatabasesClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableMongodbResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableSqlContainersClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableSqlDatabasesClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableSqlResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableTableResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.RestorableTablesClient;
import com.azure.resourcemanager.cosmos.fluent.ServicesClient;
import com.azure.resourcemanager.cosmos.fluent.SqlResourcesClient;
import com.azure.resourcemanager.cosmos.fluent.TableResourcesClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the CosmosDBManagementClientImpl type. */
@ServiceClient(builder = CosmosDBManagementClientBuilder.class)
public final class CosmosDBManagementClientImpl extends AzureServiceClient implements CosmosDBManagementClient {
    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The DatabaseAccountsClient object to access its operations. */
    private final DatabaseAccountsClient databaseAccounts;

    /**
     * Gets the DatabaseAccountsClient object to access its operations.
     *
     * @return the DatabaseAccountsClient object.
     */
    public DatabaseAccountsClient getDatabaseAccounts() {
        return this.databaseAccounts;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The DatabasesClient object to access its operations. */
    private final DatabasesClient databases;

    /**
     * Gets the DatabasesClient object to access its operations.
     *
     * @return the DatabasesClient object.
     */
    public DatabasesClient getDatabases() {
        return this.databases;
    }

    /** The CollectionsClient object to access its operations. */
    private final CollectionsClient collections;

    /**
     * Gets the CollectionsClient object to access its operations.
     *
     * @return the CollectionsClient object.
     */
    public CollectionsClient getCollections() {
        return this.collections;
    }

    /** The CollectionRegionsClient object to access its operations. */
    private final CollectionRegionsClient collectionRegions;

    /**
     * Gets the CollectionRegionsClient object to access its operations.
     *
     * @return the CollectionRegionsClient object.
     */
    public CollectionRegionsClient getCollectionRegions() {
        return this.collectionRegions;
    }

    /** The DatabaseAccountRegionsClient object to access its operations. */
    private final DatabaseAccountRegionsClient databaseAccountRegions;

    /**
     * Gets the DatabaseAccountRegionsClient object to access its operations.
     *
     * @return the DatabaseAccountRegionsClient object.
     */
    public DatabaseAccountRegionsClient getDatabaseAccountRegions() {
        return this.databaseAccountRegions;
    }

    /** The PercentileSourceTargetsClient object to access its operations. */
    private final PercentileSourceTargetsClient percentileSourceTargets;

    /**
     * Gets the PercentileSourceTargetsClient object to access its operations.
     *
     * @return the PercentileSourceTargetsClient object.
     */
    public PercentileSourceTargetsClient getPercentileSourceTargets() {
        return this.percentileSourceTargets;
    }

    /** The PercentileTargetsClient object to access its operations. */
    private final PercentileTargetsClient percentileTargets;

    /**
     * Gets the PercentileTargetsClient object to access its operations.
     *
     * @return the PercentileTargetsClient object.
     */
    public PercentileTargetsClient getPercentileTargets() {
        return this.percentileTargets;
    }

    /** The PercentilesClient object to access its operations. */
    private final PercentilesClient percentiles;

    /**
     * Gets the PercentilesClient object to access its operations.
     *
     * @return the PercentilesClient object.
     */
    public PercentilesClient getPercentiles() {
        return this.percentiles;
    }

    /** The CollectionPartitionRegionsClient object to access its operations. */
    private final CollectionPartitionRegionsClient collectionPartitionRegions;

    /**
     * Gets the CollectionPartitionRegionsClient object to access its operations.
     *
     * @return the CollectionPartitionRegionsClient object.
     */
    public CollectionPartitionRegionsClient getCollectionPartitionRegions() {
        return this.collectionPartitionRegions;
    }

    /** The CollectionPartitionsClient object to access its operations. */
    private final CollectionPartitionsClient collectionPartitions;

    /**
     * Gets the CollectionPartitionsClient object to access its operations.
     *
     * @return the CollectionPartitionsClient object.
     */
    public CollectionPartitionsClient getCollectionPartitions() {
        return this.collectionPartitions;
    }

    /** The PartitionKeyRangeIdsClient object to access its operations. */
    private final PartitionKeyRangeIdsClient partitionKeyRangeIds;

    /**
     * Gets the PartitionKeyRangeIdsClient object to access its operations.
     *
     * @return the PartitionKeyRangeIdsClient object.
     */
    public PartitionKeyRangeIdsClient getPartitionKeyRangeIds() {
        return this.partitionKeyRangeIds;
    }

    /** The PartitionKeyRangeIdRegionsClient object to access its operations. */
    private final PartitionKeyRangeIdRegionsClient partitionKeyRangeIdRegions;

    /**
     * Gets the PartitionKeyRangeIdRegionsClient object to access its operations.
     *
     * @return the PartitionKeyRangeIdRegionsClient object.
     */
    public PartitionKeyRangeIdRegionsClient getPartitionKeyRangeIdRegions() {
        return this.partitionKeyRangeIdRegions;
    }

    /** The GraphResourcesClient object to access its operations. */
    private final GraphResourcesClient graphResources;

    /**
     * Gets the GraphResourcesClient object to access its operations.
     *
     * @return the GraphResourcesClient object.
     */
    public GraphResourcesClient getGraphResources() {
        return this.graphResources;
    }

    /** The SqlResourcesClient object to access its operations. */
    private final SqlResourcesClient sqlResources;

    /**
     * Gets the SqlResourcesClient object to access its operations.
     *
     * @return the SqlResourcesClient object.
     */
    public SqlResourcesClient getSqlResources() {
        return this.sqlResources;
    }

    /** The MongoDBResourcesClient object to access its operations. */
    private final MongoDBResourcesClient mongoDBResources;

    /**
     * Gets the MongoDBResourcesClient object to access its operations.
     *
     * @return the MongoDBResourcesClient object.
     */
    public MongoDBResourcesClient getMongoDBResources() {
        return this.mongoDBResources;
    }

    /** The TableResourcesClient object to access its operations. */
    private final TableResourcesClient tableResources;

    /**
     * Gets the TableResourcesClient object to access its operations.
     *
     * @return the TableResourcesClient object.
     */
    public TableResourcesClient getTableResources() {
        return this.tableResources;
    }

    /** The CassandraResourcesClient object to access its operations. */
    private final CassandraResourcesClient cassandraResources;

    /**
     * Gets the CassandraResourcesClient object to access its operations.
     *
     * @return the CassandraResourcesClient object.
     */
    public CassandraResourcesClient getCassandraResources() {
        return this.cassandraResources;
    }

    /** The GremlinResourcesClient object to access its operations. */
    private final GremlinResourcesClient gremlinResources;

    /**
     * Gets the GremlinResourcesClient object to access its operations.
     *
     * @return the GremlinResourcesClient object.
     */
    public GremlinResourcesClient getGremlinResources() {
        return this.gremlinResources;
    }

    /** The LocationsClient object to access its operations. */
    private final LocationsClient locations;

    /**
     * Gets the LocationsClient object to access its operations.
     *
     * @return the LocationsClient object.
     */
    public LocationsClient getLocations() {
        return this.locations;
    }

    /** The DataTransferJobsClient object to access its operations. */
    private final DataTransferJobsClient dataTransferJobs;

    /**
     * Gets the DataTransferJobsClient object to access its operations.
     *
     * @return the DataTransferJobsClient object.
     */
    public DataTransferJobsClient getDataTransferJobs() {
        return this.dataTransferJobs;
    }

    /** The CassandraClustersClient object to access its operations. */
    private final CassandraClustersClient cassandraClusters;

    /**
     * Gets the CassandraClustersClient object to access its operations.
     *
     * @return the CassandraClustersClient object.
     */
    public CassandraClustersClient getCassandraClusters() {
        return this.cassandraClusters;
    }

    /** The CassandraDataCentersClient object to access its operations. */
    private final CassandraDataCentersClient cassandraDataCenters;

    /**
     * Gets the CassandraDataCentersClient object to access its operations.
     *
     * @return the CassandraDataCentersClient object.
     */
    public CassandraDataCentersClient getCassandraDataCenters() {
        return this.cassandraDataCenters;
    }

    /** The MongoClustersClient object to access its operations. */
    private final MongoClustersClient mongoClusters;

    /**
     * Gets the MongoClustersClient object to access its operations.
     *
     * @return the MongoClustersClient object.
     */
    public MongoClustersClient getMongoClusters() {
        return this.mongoClusters;
    }

    /** The NotebookWorkspacesClient object to access its operations. */
    private final NotebookWorkspacesClient notebookWorkspaces;

    /**
     * Gets the NotebookWorkspacesClient object to access its operations.
     *
     * @return the NotebookWorkspacesClient object.
     */
    public NotebookWorkspacesClient getNotebookWorkspaces() {
        return this.notebookWorkspaces;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The RestorableDatabaseAccountsClient object to access its operations. */
    private final RestorableDatabaseAccountsClient restorableDatabaseAccounts;

    /**
     * Gets the RestorableDatabaseAccountsClient object to access its operations.
     *
     * @return the RestorableDatabaseAccountsClient object.
     */
    public RestorableDatabaseAccountsClient getRestorableDatabaseAccounts() {
        return this.restorableDatabaseAccounts;
    }

    /** The RestorableSqlDatabasesClient object to access its operations. */
    private final RestorableSqlDatabasesClient restorableSqlDatabases;

    /**
     * Gets the RestorableSqlDatabasesClient object to access its operations.
     *
     * @return the RestorableSqlDatabasesClient object.
     */
    public RestorableSqlDatabasesClient getRestorableSqlDatabases() {
        return this.restorableSqlDatabases;
    }

    /** The RestorableSqlContainersClient object to access its operations. */
    private final RestorableSqlContainersClient restorableSqlContainers;

    /**
     * Gets the RestorableSqlContainersClient object to access its operations.
     *
     * @return the RestorableSqlContainersClient object.
     */
    public RestorableSqlContainersClient getRestorableSqlContainers() {
        return this.restorableSqlContainers;
    }

    /** The RestorableSqlResourcesClient object to access its operations. */
    private final RestorableSqlResourcesClient restorableSqlResources;

    /**
     * Gets the RestorableSqlResourcesClient object to access its operations.
     *
     * @return the RestorableSqlResourcesClient object.
     */
    public RestorableSqlResourcesClient getRestorableSqlResources() {
        return this.restorableSqlResources;
    }

    /** The RestorableMongodbDatabasesClient object to access its operations. */
    private final RestorableMongodbDatabasesClient restorableMongodbDatabases;

    /**
     * Gets the RestorableMongodbDatabasesClient object to access its operations.
     *
     * @return the RestorableMongodbDatabasesClient object.
     */
    public RestorableMongodbDatabasesClient getRestorableMongodbDatabases() {
        return this.restorableMongodbDatabases;
    }

    /** The RestorableMongodbCollectionsClient object to access its operations. */
    private final RestorableMongodbCollectionsClient restorableMongodbCollections;

    /**
     * Gets the RestorableMongodbCollectionsClient object to access its operations.
     *
     * @return the RestorableMongodbCollectionsClient object.
     */
    public RestorableMongodbCollectionsClient getRestorableMongodbCollections() {
        return this.restorableMongodbCollections;
    }

    /** The RestorableMongodbResourcesClient object to access its operations. */
    private final RestorableMongodbResourcesClient restorableMongodbResources;

    /**
     * Gets the RestorableMongodbResourcesClient object to access its operations.
     *
     * @return the RestorableMongodbResourcesClient object.
     */
    public RestorableMongodbResourcesClient getRestorableMongodbResources() {
        return this.restorableMongodbResources;
    }

    /** The RestorableGremlinDatabasesClient object to access its operations. */
    private final RestorableGremlinDatabasesClient restorableGremlinDatabases;

    /**
     * Gets the RestorableGremlinDatabasesClient object to access its operations.
     *
     * @return the RestorableGremlinDatabasesClient object.
     */
    public RestorableGremlinDatabasesClient getRestorableGremlinDatabases() {
        return this.restorableGremlinDatabases;
    }

    /** The RestorableGremlinGraphsClient object to access its operations. */
    private final RestorableGremlinGraphsClient restorableGremlinGraphs;

    /**
     * Gets the RestorableGremlinGraphsClient object to access its operations.
     *
     * @return the RestorableGremlinGraphsClient object.
     */
    public RestorableGremlinGraphsClient getRestorableGremlinGraphs() {
        return this.restorableGremlinGraphs;
    }

    /** The RestorableGremlinResourcesClient object to access its operations. */
    private final RestorableGremlinResourcesClient restorableGremlinResources;

    /**
     * Gets the RestorableGremlinResourcesClient object to access its operations.
     *
     * @return the RestorableGremlinResourcesClient object.
     */
    public RestorableGremlinResourcesClient getRestorableGremlinResources() {
        return this.restorableGremlinResources;
    }

    /** The RestorableTablesClient object to access its operations. */
    private final RestorableTablesClient restorableTables;

    /**
     * Gets the RestorableTablesClient object to access its operations.
     *
     * @return the RestorableTablesClient object.
     */
    public RestorableTablesClient getRestorableTables() {
        return this.restorableTables;
    }

    /** The RestorableTableResourcesClient object to access its operations. */
    private final RestorableTableResourcesClient restorableTableResources;

    /**
     * Gets the RestorableTableResourcesClient object to access its operations.
     *
     * @return the RestorableTableResourcesClient object.
     */
    public RestorableTableResourcesClient getRestorableTableResources() {
        return this.restorableTableResources;
    }

    /** The ServicesClient object to access its operations. */
    private final ServicesClient services;

    /**
     * Gets the ServicesClient object to access its operations.
     *
     * @return the ServicesClient object.
     */
    public ServicesClient getServices() {
        return this.services;
    }

    /**
     * Initializes an instance of CosmosDBManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    CosmosDBManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2023-03-15-preview";
        this.databaseAccounts = new DatabaseAccountsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.databases = new DatabasesClientImpl(this);
        this.collections = new CollectionsClientImpl(this);
        this.collectionRegions = new CollectionRegionsClientImpl(this);
        this.databaseAccountRegions = new DatabaseAccountRegionsClientImpl(this);
        this.percentileSourceTargets = new PercentileSourceTargetsClientImpl(this);
        this.percentileTargets = new PercentileTargetsClientImpl(this);
        this.percentiles = new PercentilesClientImpl(this);
        this.collectionPartitionRegions = new CollectionPartitionRegionsClientImpl(this);
        this.collectionPartitions = new CollectionPartitionsClientImpl(this);
        this.partitionKeyRangeIds = new PartitionKeyRangeIdsClientImpl(this);
        this.partitionKeyRangeIdRegions = new PartitionKeyRangeIdRegionsClientImpl(this);
        this.graphResources = new GraphResourcesClientImpl(this);
        this.sqlResources = new SqlResourcesClientImpl(this);
        this.mongoDBResources = new MongoDBResourcesClientImpl(this);
        this.tableResources = new TableResourcesClientImpl(this);
        this.cassandraResources = new CassandraResourcesClientImpl(this);
        this.gremlinResources = new GremlinResourcesClientImpl(this);
        this.locations = new LocationsClientImpl(this);
        this.dataTransferJobs = new DataTransferJobsClientImpl(this);
        this.cassandraClusters = new CassandraClustersClientImpl(this);
        this.cassandraDataCenters = new CassandraDataCentersClientImpl(this);
        this.mongoClusters = new MongoClustersClientImpl(this);
        this.notebookWorkspaces = new NotebookWorkspacesClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.restorableDatabaseAccounts = new RestorableDatabaseAccountsClientImpl(this);
        this.restorableSqlDatabases = new RestorableSqlDatabasesClientImpl(this);
        this.restorableSqlContainers = new RestorableSqlContainersClientImpl(this);
        this.restorableSqlResources = new RestorableSqlResourcesClientImpl(this);
        this.restorableMongodbDatabases = new RestorableMongodbDatabasesClientImpl(this);
        this.restorableMongodbCollections = new RestorableMongodbCollectionsClientImpl(this);
        this.restorableMongodbResources = new RestorableMongodbResourcesClientImpl(this);
        this.restorableGremlinDatabases = new RestorableGremlinDatabasesClientImpl(this);
        this.restorableGremlinGraphs = new RestorableGremlinGraphsClientImpl(this);
        this.restorableGremlinResources = new RestorableGremlinResourcesClientImpl(this);
        this.restorableTables = new RestorableTablesClientImpl(this);
        this.restorableTableResources = new RestorableTableResourcesClientImpl(this);
        this.services = new ServicesClientImpl(this);
    }
}
