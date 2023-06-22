// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.ConfigurationsClient;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ServerConfigurationInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.Configuration;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.Configurations;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerConfiguration;

public final class ConfigurationsImpl implements Configurations {
    private static final ClientLogger LOGGER = new ClientLogger(ConfigurationsImpl.class);

    private final ConfigurationsClient innerClient;

    private final com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager;

    public ConfigurationsImpl(
        ConfigurationsClient innerClient,
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ServerConfiguration> listByServer(
        String resourceGroupName, String clusterName, String serverName) {
        PagedIterable<ServerConfigurationInner> inner =
            this.serviceClient().listByServer(resourceGroupName, clusterName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerConfiguration> listByServer(
        String resourceGroupName, String clusterName, String serverName, Context context) {
        PagedIterable<ServerConfigurationInner> inner =
            this.serviceClient().listByServer(resourceGroupName, clusterName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<Configuration> listByCluster(String resourceGroupName, String clusterName) {
        PagedIterable<ConfigurationInner> inner = this.serviceClient().listByCluster(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new ConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<Configuration> listByCluster(String resourceGroupName, String clusterName, Context context) {
        PagedIterable<ConfigurationInner> inner =
            this.serviceClient().listByCluster(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new ConfigurationImpl(inner1, this.manager()));
    }

    public Response<Configuration> getWithResponse(
        String resourceGroupName, String clusterName, String configurationName, Context context) {
        Response<ConfigurationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, clusterName, configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Configuration get(String resourceGroupName, String clusterName, String configurationName) {
        ConfigurationInner inner = this.serviceClient().get(resourceGroupName, clusterName, configurationName);
        if (inner != null) {
            return new ConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerConfiguration> getCoordinatorWithResponse(
        String resourceGroupName, String clusterName, String configurationName, Context context) {
        Response<ServerConfigurationInner> inner =
            this.serviceClient().getCoordinatorWithResponse(resourceGroupName, clusterName, configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServerConfiguration getCoordinator(String resourceGroupName, String clusterName, String configurationName) {
        ServerConfigurationInner inner =
            this.serviceClient().getCoordinator(resourceGroupName, clusterName, configurationName);
        if (inner != null) {
            return new ServerConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServerConfiguration updateOnCoordinator(
        String resourceGroupName, String clusterName, String configurationName, ServerConfigurationInner parameters) {
        ServerConfigurationInner inner =
            this.serviceClient().updateOnCoordinator(resourceGroupName, clusterName, configurationName, parameters);
        if (inner != null) {
            return new ServerConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServerConfiguration updateOnCoordinator(
        String resourceGroupName,
        String clusterName,
        String configurationName,
        ServerConfigurationInner parameters,
        Context context) {
        ServerConfigurationInner inner =
            this
                .serviceClient()
                .updateOnCoordinator(resourceGroupName, clusterName, configurationName, parameters, context);
        if (inner != null) {
            return new ServerConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerConfiguration> getNodeWithResponse(
        String resourceGroupName, String clusterName, String configurationName, Context context) {
        Response<ServerConfigurationInner> inner =
            this.serviceClient().getNodeWithResponse(resourceGroupName, clusterName, configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServerConfiguration getNode(String resourceGroupName, String clusterName, String configurationName) {
        ServerConfigurationInner inner =
            this.serviceClient().getNode(resourceGroupName, clusterName, configurationName);
        if (inner != null) {
            return new ServerConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServerConfiguration updateOnNode(
        String resourceGroupName, String clusterName, String configurationName, ServerConfigurationInner parameters) {
        ServerConfigurationInner inner =
            this.serviceClient().updateOnNode(resourceGroupName, clusterName, configurationName, parameters);
        if (inner != null) {
            return new ServerConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServerConfiguration updateOnNode(
        String resourceGroupName,
        String clusterName,
        String configurationName,
        ServerConfigurationInner parameters,
        Context context) {
        ServerConfigurationInner inner =
            this.serviceClient().updateOnNode(resourceGroupName, clusterName, configurationName, parameters, context);
        if (inner != null) {
            return new ServerConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager() {
        return this.serviceManager;
    }
}
