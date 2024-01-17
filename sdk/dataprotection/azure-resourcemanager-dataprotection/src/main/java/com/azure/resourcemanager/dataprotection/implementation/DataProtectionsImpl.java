// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.DataProtectionsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.FeatureValidationResponseBaseInner;
import com.azure.resourcemanager.dataprotection.models.DataProtections;
import com.azure.resourcemanager.dataprotection.models.FeatureValidationRequestBase;
import com.azure.resourcemanager.dataprotection.models.FeatureValidationResponseBase;

public final class DataProtectionsImpl implements DataProtections {
    private static final ClientLogger LOGGER = new ClientLogger(DataProtectionsImpl.class);

    private final DataProtectionsClient innerClient;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    public DataProtectionsImpl(DataProtectionsClient innerClient,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<FeatureValidationResponseBase> checkFeatureSupportWithResponse(String location,
        FeatureValidationRequestBase parameters, Context context) {
        Response<FeatureValidationResponseBaseInner> inner
            = this.serviceClient().checkFeatureSupportWithResponse(location, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FeatureValidationResponseBaseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FeatureValidationResponseBase checkFeatureSupport(String location, FeatureValidationRequestBase parameters) {
        FeatureValidationResponseBaseInner inner = this.serviceClient().checkFeatureSupport(location, parameters);
        if (inner != null) {
            return new FeatureValidationResponseBaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private DataProtectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
