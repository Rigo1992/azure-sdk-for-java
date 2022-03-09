// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dnsresolver.fluent.InboundEndpointsClient;
import com.azure.resourcemanager.dnsresolver.fluent.models.InboundEndpointInner;
import com.azure.resourcemanager.dnsresolver.models.InboundEndpoint;
import com.azure.resourcemanager.dnsresolver.models.InboundEndpoints;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class InboundEndpointsImpl implements InboundEndpoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InboundEndpointsImpl.class);

    private final InboundEndpointsClient innerClient;

    private final com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager;

    public InboundEndpointsImpl(
        InboundEndpointsClient innerClient, com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String dnsResolverName, String inboundEndpointName, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, dnsResolverName, inboundEndpointName, ifMatch);
    }

    public void delete(String resourceGroupName, String dnsResolverName, String inboundEndpointName) {
        this.serviceClient().delete(resourceGroupName, dnsResolverName, inboundEndpointName);
    }

    public void delete(
        String resourceGroupName, String dnsResolverName, String inboundEndpointName, String ifMatch, Context context) {
        this.serviceClient().delete(resourceGroupName, dnsResolverName, inboundEndpointName, ifMatch, context);
    }

    public InboundEndpoint get(String resourceGroupName, String dnsResolverName, String inboundEndpointName) {
        InboundEndpointInner inner = this.serviceClient().get(resourceGroupName, dnsResolverName, inboundEndpointName);
        if (inner != null) {
            return new InboundEndpointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<InboundEndpoint> getWithResponse(
        String resourceGroupName, String dnsResolverName, String inboundEndpointName, Context context) {
        Response<InboundEndpointInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, dnsResolverName, inboundEndpointName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new InboundEndpointImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<InboundEndpoint> list(String resourceGroupName, String dnsResolverName) {
        PagedIterable<InboundEndpointInner> inner = this.serviceClient().list(resourceGroupName, dnsResolverName);
        return Utils.mapPage(inner, inner1 -> new InboundEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<InboundEndpoint> list(
        String resourceGroupName, String dnsResolverName, Integer top, Context context) {
        PagedIterable<InboundEndpointInner> inner =
            this.serviceClient().list(resourceGroupName, dnsResolverName, top, context);
        return Utils.mapPage(inner, inner1 -> new InboundEndpointImpl(inner1, this.manager()));
    }

    public InboundEndpoint getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsResolverName = Utils.getValueFromIdByName(id, "dnsResolvers");
        if (dnsResolverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsResolvers'.", id)));
        }
        String inboundEndpointName = Utils.getValueFromIdByName(id, "inboundEndpoints");
        if (inboundEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'inboundEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, dnsResolverName, inboundEndpointName, Context.NONE).getValue();
    }

    public Response<InboundEndpoint> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsResolverName = Utils.getValueFromIdByName(id, "dnsResolvers");
        if (dnsResolverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsResolvers'.", id)));
        }
        String inboundEndpointName = Utils.getValueFromIdByName(id, "inboundEndpoints");
        if (inboundEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'inboundEndpoints'.", id)));
        }
        return this.getWithResponse(resourceGroupName, dnsResolverName, inboundEndpointName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsResolverName = Utils.getValueFromIdByName(id, "dnsResolvers");
        if (dnsResolverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsResolvers'.", id)));
        }
        String inboundEndpointName = Utils.getValueFromIdByName(id, "inboundEndpoints");
        if (inboundEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'inboundEndpoints'.", id)));
        }
        String localIfMatch = null;
        this.delete(resourceGroupName, dnsResolverName, inboundEndpointName, localIfMatch, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsResolverName = Utils.getValueFromIdByName(id, "dnsResolvers");
        if (dnsResolverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dnsResolvers'.", id)));
        }
        String inboundEndpointName = Utils.getValueFromIdByName(id, "inboundEndpoints");
        if (inboundEndpointName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'inboundEndpoints'.", id)));
        }
        this.delete(resourceGroupName, dnsResolverName, inboundEndpointName, ifMatch, context);
    }

    private InboundEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dnsresolver.DnsResolverManager manager() {
        return this.serviceManager;
    }

    public InboundEndpointImpl define(String name) {
        return new InboundEndpointImpl(name, this.manager());
    }
}
