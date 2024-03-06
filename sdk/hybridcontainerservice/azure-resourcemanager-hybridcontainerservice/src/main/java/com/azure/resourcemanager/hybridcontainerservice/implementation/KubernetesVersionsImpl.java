// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcontainerservice.fluent.KubernetesVersionsClient;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.KubernetesVersionProfileInner;
import com.azure.resourcemanager.hybridcontainerservice.models.KubernetesVersionProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.KubernetesVersions;

public final class KubernetesVersionsImpl implements KubernetesVersions {
    private static final ClientLogger LOGGER = new ClientLogger(KubernetesVersionsImpl.class);

    private final KubernetesVersionsClient innerClient;

    private final com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager;

    public KubernetesVersionsImpl(KubernetesVersionsClient innerClient,
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<KubernetesVersionProfile> list(String customLocationResourceUri) {
        PagedIterable<KubernetesVersionProfileInner> inner = this.serviceClient().list(customLocationResourceUri);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new KubernetesVersionProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<KubernetesVersionProfile> list(String customLocationResourceUri, Context context) {
        PagedIterable<KubernetesVersionProfileInner> inner
            = this.serviceClient().list(customLocationResourceUri, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new KubernetesVersionProfileImpl(inner1, this.manager()));
    }

    private KubernetesVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager() {
        return this.serviceManager;
    }
}
