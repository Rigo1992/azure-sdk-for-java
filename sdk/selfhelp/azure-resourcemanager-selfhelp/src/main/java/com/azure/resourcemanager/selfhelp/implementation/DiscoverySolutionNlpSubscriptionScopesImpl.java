// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.selfhelp.fluent.DiscoverySolutionNlpSubscriptionScopesClient;
import com.azure.resourcemanager.selfhelp.fluent.models.DiscoveryNlpResponseInner;
import com.azure.resourcemanager.selfhelp.models.DiscoveryNlpRequest;
import com.azure.resourcemanager.selfhelp.models.DiscoveryNlpResponse;
import com.azure.resourcemanager.selfhelp.models.DiscoverySolutionNlpSubscriptionScopes;

public final class DiscoverySolutionNlpSubscriptionScopesImpl implements DiscoverySolutionNlpSubscriptionScopes {
    private static final ClientLogger LOGGER = new ClientLogger(DiscoverySolutionNlpSubscriptionScopesImpl.class);

    private final DiscoverySolutionNlpSubscriptionScopesClient innerClient;

    private final com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager;

    public DiscoverySolutionNlpSubscriptionScopesImpl(DiscoverySolutionNlpSubscriptionScopesClient innerClient,
        com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DiscoveryNlpResponse> postWithResponse(String subscriptionId,
        DiscoveryNlpRequest discoverSolutionRequest, Context context) {
        Response<DiscoveryNlpResponseInner> inner
            = this.serviceClient().postWithResponse(subscriptionId, discoverSolutionRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DiscoveryNlpResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiscoveryNlpResponse post(String subscriptionId) {
        DiscoveryNlpResponseInner inner = this.serviceClient().post(subscriptionId);
        if (inner != null) {
            return new DiscoveryNlpResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private DiscoverySolutionNlpSubscriptionScopesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.selfhelp.SelfHelpManager manager() {
        return this.serviceManager;
    }
}
