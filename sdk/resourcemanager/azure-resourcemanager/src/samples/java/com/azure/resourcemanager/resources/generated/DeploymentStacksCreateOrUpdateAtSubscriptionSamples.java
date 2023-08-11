// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.resources.fluent.models.DeploymentStackInner;
import com.azure.resourcemanager.resources.models.DenySettings;
import com.azure.resourcemanager.resources.models.DenySettingsMode;
import com.azure.resourcemanager.resources.models.DeploymentStackPropertiesActionOnUnmanage;
import com.azure.resourcemanager.resources.models.DeploymentStacksDeleteDetachEnum;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for DeploymentStacks CreateOrUpdateAtSubscription. */
public final class DeploymentStacksCreateOrUpdateAtSubscriptionSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/preview/2022-08-01-preview/examples/DeploymentStackSubscriptionCreate.json
     */
    /**
     * Sample code: DeploymentStacksCreateOrUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deploymentStacksCreateOrUpdate(com.azure.resourcemanager.AzureResourceManager azure)
        throws IOException {
        azure
            .genericResources()
            .manager()
            .deploymentStackClient()
            .getDeploymentStacks()
            .createOrUpdateAtSubscription(
                "simpleDeploymentStack",
                new DeploymentStackInner()
                    .withLocation("eastus")
                    .withTags(mapOf("tagkey", "fakeTokenPlaceholder"))
                    .withParameters(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize(
                                "{\"parameter1\":{\"value\":\"a string\"}}", Object.class, SerializerEncoding.JSON))
                    .withActionOnUnmanage(
                        new DeploymentStackPropertiesActionOnUnmanage()
                            .withResources(DeploymentStacksDeleteDetachEnum.DELETE)
                            .withResourceGroups(DeploymentStacksDeleteDetachEnum.DELETE)
                            .withManagementGroups(DeploymentStacksDeleteDetachEnum.DETACH))
                    .withDenySettings(
                        new DenySettings()
                            .withMode(DenySettingsMode.DENY_DELETE)
                            .withExcludedPrincipals(Arrays.asList("principal"))
                            .withExcludedActions(Arrays.asList("action"))
                            .withApplyToChildScopes(false)),
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
