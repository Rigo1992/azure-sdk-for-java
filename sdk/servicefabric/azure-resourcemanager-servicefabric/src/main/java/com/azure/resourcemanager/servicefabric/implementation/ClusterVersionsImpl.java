// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabric.fluent.ClusterVersionsClient;
import com.azure.resourcemanager.servicefabric.fluent.models.ClusterCodeVersionsListResultInner;
import com.azure.resourcemanager.servicefabric.models.ClusterCodeVersionsListResult;
import com.azure.resourcemanager.servicefabric.models.ClusterVersions;
import com.azure.resourcemanager.servicefabric.models.ClusterVersionsEnvironment;

public final class ClusterVersionsImpl implements ClusterVersions {
    private static final ClientLogger LOGGER = new ClientLogger(ClusterVersionsImpl.class);

    private final ClusterVersionsClient innerClient;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    public ClusterVersionsImpl(
        ClusterVersionsClient innerClient,
        com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ClusterCodeVersionsListResult> getWithResponse(
        String location, String clusterVersion, Context context) {
        Response<ClusterCodeVersionsListResultInner> inner =
            this.serviceClient().getWithResponse(location, clusterVersion, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterCodeVersionsListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterCodeVersionsListResult get(String location, String clusterVersion) {
        ClusterCodeVersionsListResultInner inner = this.serviceClient().get(location, clusterVersion);
        if (inner != null) {
            return new ClusterCodeVersionsListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ClusterCodeVersionsListResult> getByEnvironmentWithResponse(
        String location, ClusterVersionsEnvironment environment, String clusterVersion, Context context) {
        Response<ClusterCodeVersionsListResultInner> inner =
            this.serviceClient().getByEnvironmentWithResponse(location, environment, clusterVersion, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterCodeVersionsListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterCodeVersionsListResult getByEnvironment(
        String location, ClusterVersionsEnvironment environment, String clusterVersion) {
        ClusterCodeVersionsListResultInner inner =
            this.serviceClient().getByEnvironment(location, environment, clusterVersion);
        if (inner != null) {
            return new ClusterCodeVersionsListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ClusterCodeVersionsListResult> listWithResponse(String location, Context context) {
        Response<ClusterCodeVersionsListResultInner> inner = this.serviceClient().listWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterCodeVersionsListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterCodeVersionsListResult list(String location) {
        ClusterCodeVersionsListResultInner inner = this.serviceClient().list(location);
        if (inner != null) {
            return new ClusterCodeVersionsListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ClusterCodeVersionsListResult> listByEnvironmentWithResponse(
        String location, ClusterVersionsEnvironment environment, Context context) {
        Response<ClusterCodeVersionsListResultInner> inner =
            this.serviceClient().listByEnvironmentWithResponse(location, environment, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterCodeVersionsListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterCodeVersionsListResult listByEnvironment(String location, ClusterVersionsEnvironment environment) {
        ClusterCodeVersionsListResultInner inner = this.serviceClient().listByEnvironment(location, environment);
        if (inner != null) {
            return new ClusterCodeVersionsListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ClusterVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }
}
