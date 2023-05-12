// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.resources.models.DeploymentMode;
import com.azure.resourcemanager.resources.models.DeploymentWhatIfProperties;
import com.azure.resourcemanager.resources.models.ScopedDeploymentWhatIf;
import com.azure.resourcemanager.resources.models.TemplateLink;
import java.io.IOException;

/** Samples for Deployments WhatIfAtManagementGroupScope. */
public final class DeploymentsWhatIfAtManagementGroupScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2022-09-01/examples/PostDeploymentWhatIfOnManagementGroup.json
     */
    /**
     * Sample code: Predict template changes at management group scope.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void predictTemplateChangesAtManagementGroupScope(
        com.azure.resourcemanager.AzureResourceManager azure) throws IOException {
        azure
            .genericResources()
            .manager()
            .serviceClient()
            .getDeployments()
            .whatIfAtManagementGroupScope(
                "myManagementGruop",
                "exampleDeploymentName",
                new ScopedDeploymentWhatIf()
                    .withLocation("eastus")
                    .withProperties(
                        new DeploymentWhatIfProperties()
                            .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                            .withParameters(
                                SerializerFactory
                                    .createDefaultManagementSerializerAdapter()
                                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
                            .withMode(DeploymentMode.INCREMENTAL)),
                com.azure.core.util.Context.NONE);
    }
}
