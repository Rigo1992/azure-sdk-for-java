// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.redisenterprise.fluent.models.DatabaseInner;
import com.azure.resourcemanager.redisenterprise.models.AccessKeys;
import com.azure.resourcemanager.redisenterprise.models.ClusteringPolicy;
import com.azure.resourcemanager.redisenterprise.models.Database;
import com.azure.resourcemanager.redisenterprise.models.DatabasePropertiesGeoReplication;
import com.azure.resourcemanager.redisenterprise.models.DatabaseUpdate;
import com.azure.resourcemanager.redisenterprise.models.EvictionPolicy;
import com.azure.resourcemanager.redisenterprise.models.ExportClusterParameters;
import com.azure.resourcemanager.redisenterprise.models.FlushParameters;
import com.azure.resourcemanager.redisenterprise.models.ForceUnlinkParameters;
import com.azure.resourcemanager.redisenterprise.models.ImportClusterParameters;
import com.azure.resourcemanager.redisenterprise.models.Module;
import com.azure.resourcemanager.redisenterprise.models.Persistence;
import com.azure.resourcemanager.redisenterprise.models.Protocol;
import com.azure.resourcemanager.redisenterprise.models.ProvisioningState;
import com.azure.resourcemanager.redisenterprise.models.RegenerateKeyParameters;
import com.azure.resourcemanager.redisenterprise.models.ResourceState;
import java.util.Collections;
import java.util.List;

public final class DatabaseImpl implements Database, Database.Definition, Database.Update {
    private DatabaseInner innerObject;

    private final com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Protocol clientProtocol() {
        return this.innerModel().clientProtocol();
    }

    public Integer port() {
        return this.innerModel().port();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ResourceState resourceState() {
        return this.innerModel().resourceState();
    }

    public ClusteringPolicy clusteringPolicy() {
        return this.innerModel().clusteringPolicy();
    }

    public EvictionPolicy evictionPolicy() {
        return this.innerModel().evictionPolicy();
    }

    public Persistence persistence() {
        return this.innerModel().persistence();
    }

    public List<Module> modules() {
        List<Module> inner = this.innerModel().modules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DatabasePropertiesGeoReplication geoReplication() {
        return this.innerModel().geoReplication();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DatabaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String databaseName;

    private DatabaseUpdate updateParameters;

    public DatabaseImpl withExistingRedisEnterprise(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    public Database create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .create(resourceGroupName, clusterName, databaseName, this.innerModel(), Context.NONE);
        return this;
    }

    public Database create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .create(resourceGroupName, clusterName, databaseName, this.innerModel(), context);
        return this;
    }

    DatabaseImpl(String name, com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager) {
        this.innerObject = new DatabaseInner();
        this.serviceManager = serviceManager;
        this.databaseName = name;
    }

    public DatabaseImpl update() {
        this.updateParameters = new DatabaseUpdate();
        return this;
    }

    public Database apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .update(resourceGroupName, clusterName, databaseName, updateParameters, Context.NONE);
        return this;
    }

    public Database apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .update(resourceGroupName, clusterName, databaseName, updateParameters, context);
        return this;
    }

    DatabaseImpl(
        DatabaseInner innerObject, com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "redisEnterprise");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
    }

    public Database refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .getWithResponse(resourceGroupName, clusterName, databaseName, Context.NONE)
                .getValue();
        return this;
    }

    public Database refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabases()
                .getWithResponse(resourceGroupName, clusterName, databaseName, context)
                .getValue();
        return this;
    }

    public Response<AccessKeys> listKeysWithResponse(Context context) {
        return serviceManager.databases().listKeysWithResponse(resourceGroupName, clusterName, databaseName, context);
    }

    public AccessKeys listKeys() {
        return serviceManager.databases().listKeys(resourceGroupName, clusterName, databaseName);
    }

    public AccessKeys regenerateKey(RegenerateKeyParameters parameters) {
        return serviceManager.databases().regenerateKey(resourceGroupName, clusterName, databaseName, parameters);
    }

    public AccessKeys regenerateKey(RegenerateKeyParameters parameters, Context context) {
        return serviceManager
            .databases()
            .regenerateKey(resourceGroupName, clusterName, databaseName, parameters, context);
    }

    public void importMethod(ImportClusterParameters parameters) {
        serviceManager.databases().importMethod(resourceGroupName, clusterName, databaseName, parameters);
    }

    public void importMethod(ImportClusterParameters parameters, Context context) {
        serviceManager.databases().importMethod(resourceGroupName, clusterName, databaseName, parameters, context);
    }

    public void export(ExportClusterParameters parameters) {
        serviceManager.databases().export(resourceGroupName, clusterName, databaseName, parameters);
    }

    public void export(ExportClusterParameters parameters, Context context) {
        serviceManager.databases().export(resourceGroupName, clusterName, databaseName, parameters, context);
    }

    public void forceUnlink(ForceUnlinkParameters parameters) {
        serviceManager.databases().forceUnlink(resourceGroupName, clusterName, databaseName, parameters);
    }

    public void forceUnlink(ForceUnlinkParameters parameters, Context context) {
        serviceManager.databases().forceUnlink(resourceGroupName, clusterName, databaseName, parameters, context);
    }

    public void flush(FlushParameters parameters) {
        serviceManager.databases().flush(resourceGroupName, clusterName, databaseName, parameters);
    }

    public void flush(FlushParameters parameters, Context context) {
        serviceManager.databases().flush(resourceGroupName, clusterName, databaseName, parameters, context);
    }

    public DatabaseImpl withClientProtocol(Protocol clientProtocol) {
        if (isInCreateMode()) {
            this.innerModel().withClientProtocol(clientProtocol);
            return this;
        } else {
            this.updateParameters.withClientProtocol(clientProtocol);
            return this;
        }
    }

    public DatabaseImpl withPort(Integer port) {
        this.innerModel().withPort(port);
        return this;
    }

    public DatabaseImpl withClusteringPolicy(ClusteringPolicy clusteringPolicy) {
        this.innerModel().withClusteringPolicy(clusteringPolicy);
        return this;
    }

    public DatabaseImpl withEvictionPolicy(EvictionPolicy evictionPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withEvictionPolicy(evictionPolicy);
            return this;
        } else {
            this.updateParameters.withEvictionPolicy(evictionPolicy);
            return this;
        }
    }

    public DatabaseImpl withPersistence(Persistence persistence) {
        if (isInCreateMode()) {
            this.innerModel().withPersistence(persistence);
            return this;
        } else {
            this.updateParameters.withPersistence(persistence);
            return this;
        }
    }

    public DatabaseImpl withModules(List<Module> modules) {
        this.innerModel().withModules(modules);
        return this;
    }

    public DatabaseImpl withGeoReplication(DatabasePropertiesGeoReplication geoReplication) {
        this.innerModel().withGeoReplication(geoReplication);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
