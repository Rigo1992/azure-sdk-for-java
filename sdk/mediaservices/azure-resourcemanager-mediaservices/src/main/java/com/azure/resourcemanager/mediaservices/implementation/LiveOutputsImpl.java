// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.fluent.LiveOutputsClient;
import com.azure.resourcemanager.mediaservices.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveOutputInner;
import com.azure.resourcemanager.mediaservices.models.AsyncOperationResult;
import com.azure.resourcemanager.mediaservices.models.LiveOutput;
import com.azure.resourcemanager.mediaservices.models.LiveOutputs;

public final class LiveOutputsImpl implements LiveOutputs {
    private static final ClientLogger LOGGER = new ClientLogger(LiveOutputsImpl.class);

    private final LiveOutputsClient innerClient;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

    public LiveOutputsImpl(
        LiveOutputsClient innerClient, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LiveOutput> list(String resourceGroupName, String accountName, String liveEventName) {
        PagedIterable<LiveOutputInner> inner = this.serviceClient().list(resourceGroupName, accountName, liveEventName);
        return Utils.mapPage(inner, inner1 -> new LiveOutputImpl(inner1, this.manager()));
    }

    public PagedIterable<LiveOutput> list(
        String resourceGroupName, String accountName, String liveEventName, Context context) {
        PagedIterable<LiveOutputInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, liveEventName, context);
        return Utils.mapPage(inner, inner1 -> new LiveOutputImpl(inner1, this.manager()));
    }

    public Response<LiveOutput> getWithResponse(
        String resourceGroupName, String accountName, String liveEventName, String liveOutputName, Context context) {
        Response<LiveOutputInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, accountName, liveEventName, liveOutputName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LiveOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LiveOutput get(String resourceGroupName, String accountName, String liveEventName, String liveOutputName) {
        LiveOutputInner inner = this.serviceClient().get(resourceGroupName, accountName, liveEventName, liveOutputName);
        if (inner != null) {
            return new LiveOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String liveEventName, String liveOutputName) {
        this.serviceClient().delete(resourceGroupName, accountName, liveEventName, liveOutputName);
    }

    public void delete(
        String resourceGroupName, String accountName, String liveEventName, String liveOutputName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, liveEventName, liveOutputName, context);
    }

    public Response<AsyncOperationResult> asyncOperationWithResponse(
        String resourceGroupName, String accountName, String operationId, Context context) {
        Response<AsyncOperationResultInner> inner =
            this.serviceClient().asyncOperationWithResponse(resourceGroupName, accountName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AsyncOperationResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AsyncOperationResult asyncOperation(String resourceGroupName, String accountName, String operationId) {
        AsyncOperationResultInner inner =
            this.serviceClient().asyncOperation(resourceGroupName, accountName, operationId);
        if (inner != null) {
            return new AsyncOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LiveOutput> operationLocationWithResponse(
        String resourceGroupName,
        String accountName,
        String liveEventName,
        String liveOutputName,
        String operationId,
        Context context) {
        Response<LiveOutputInner> inner =
            this
                .serviceClient()
                .operationLocationWithResponse(
                    resourceGroupName, accountName, liveEventName, liveOutputName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LiveOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LiveOutput operationLocation(
        String resourceGroupName, String accountName, String liveEventName, String liveOutputName, String operationId) {
        LiveOutputInner inner =
            this
                .serviceClient()
                .operationLocation(resourceGroupName, accountName, liveEventName, liveOutputName, operationId);
        if (inner != null) {
            return new LiveOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LiveOutput getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String liveEventName = Utils.getValueFromIdByName(id, "liveEvents");
        if (liveEventName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveEvents'.", id)));
        }
        String liveOutputName = Utils.getValueFromIdByName(id, "liveOutputs");
        if (liveOutputName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveOutputs'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, accountName, liveEventName, liveOutputName, Context.NONE)
            .getValue();
    }

    public Response<LiveOutput> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String liveEventName = Utils.getValueFromIdByName(id, "liveEvents");
        if (liveEventName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveEvents'.", id)));
        }
        String liveOutputName = Utils.getValueFromIdByName(id, "liveOutputs");
        if (liveOutputName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveOutputs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, liveEventName, liveOutputName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String liveEventName = Utils.getValueFromIdByName(id, "liveEvents");
        if (liveEventName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveEvents'.", id)));
        }
        String liveOutputName = Utils.getValueFromIdByName(id, "liveOutputs");
        if (liveOutputName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveOutputs'.", id)));
        }
        this.delete(resourceGroupName, accountName, liveEventName, liveOutputName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "mediaservices");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'mediaservices'.", id)));
        }
        String liveEventName = Utils.getValueFromIdByName(id, "liveEvents");
        if (liveEventName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveEvents'.", id)));
        }
        String liveOutputName = Utils.getValueFromIdByName(id, "liveOutputs");
        if (liveOutputName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'liveOutputs'.", id)));
        }
        this.delete(resourceGroupName, accountName, liveEventName, liveOutputName, context);
    }

    private LiveOutputsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }

    public LiveOutputImpl define(String name) {
        return new LiveOutputImpl(name, this.manager());
    }
}
