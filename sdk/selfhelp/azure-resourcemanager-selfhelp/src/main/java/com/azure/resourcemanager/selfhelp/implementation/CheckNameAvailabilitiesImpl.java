// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.selfhelp.fluent.CheckNameAvailabilitiesClient;
import com.azure.resourcemanager.selfhelp.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.selfhelp.models.CheckNameAvailabilities;
import com.azure.resourcemanager.selfhelp.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.selfhelp.models.CheckNameAvailabilityResponse;

public final class CheckNameAvailabilitiesImpl implements CheckNameAvailabilities {
    private static final ClientLogger LOGGER = new ClientLogger(CheckNameAvailabilitiesImpl.class);

    private final CheckNameAvailabilitiesClient innerClient;

    private final com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager;

    public CheckNameAvailabilitiesImpl(CheckNameAvailabilitiesClient innerClient,
        com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CheckNameAvailabilityResponse> postWithResponse(String scope,
        CheckNameAvailabilityRequest checkNameAvailabilityRequest, Context context) {
        Response<CheckNameAvailabilityResponseInner> inner
            = this.serviceClient().postWithResponse(scope, checkNameAvailabilityRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CheckNameAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityResponse post(String scope) {
        CheckNameAvailabilityResponseInner inner = this.serviceClient().post(scope);
        if (inner != null) {
            return new CheckNameAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private CheckNameAvailabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.selfhelp.SelfHelpManager manager() {
        return this.serviceManager;
    }
}
