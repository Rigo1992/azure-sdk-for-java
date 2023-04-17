// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.resourcemanager.appplatform.fluent.models.DevToolPortalResourceInner;
import com.azure.resourcemanager.appplatform.models.DevToolPortalFeatureDetail;
import com.azure.resourcemanager.appplatform.models.DevToolPortalFeatureSettings;
import com.azure.resourcemanager.appplatform.models.DevToolPortalFeatureState;
import com.azure.resourcemanager.appplatform.models.DevToolPortalProperties;
import com.azure.resourcemanager.appplatform.models.DevToolPortalSsoProperties;
import java.util.Arrays;

/** Samples for DevToolPortals CreateOrUpdate. */
public final class DevToolPortalsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2023-03-01-preview/examples/DevToolPortals_CreateOrUpdate.json
     */
    /**
     * Sample code: DevToolPortals_CreateOrUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void devToolPortalsCreateOrUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getDevToolPortals()
            .createOrUpdate(
                "myResourceGroup",
                "myservice",
                "default",
                new DevToolPortalResourceInner()
                    .withProperties(
                        new DevToolPortalProperties()
                            .withPublicProperty(true)
                            .withSsoProperties(
                                new DevToolPortalSsoProperties()
                                    .withScopes(Arrays.asList("openid"))
                                    .withClientId("00000000-0000-0000-0000-000000000000")
                                    .withClientSecret("fakeTokenPlaceholder")
                                    .withMetadataUrl(
                                        "https://login.microsoft.com/00000000-0000-0000-0000-000000000000/v2.0/.well-known/openid-configuration"))
                            .withFeatures(
                                new DevToolPortalFeatureSettings()
                                    .withApplicationAccelerator(
                                        new DevToolPortalFeatureDetail().withState(DevToolPortalFeatureState.ENABLED))
                                    .withApplicationLiveView(
                                        new DevToolPortalFeatureDetail()
                                            .withState(DevToolPortalFeatureState.ENABLED)))),
                com.azure.core.util.Context.NONE);
    }
}
