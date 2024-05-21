// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.resourcemanager.nginx.models.AutoUpgradeProfile;
import com.azure.resourcemanager.nginx.models.NginxDeploymentProperties;
import com.azure.resourcemanager.nginx.models.NginxDeploymentScalingProperties;
import com.azure.resourcemanager.nginx.models.NginxDeploymentUserProfile;
import com.azure.resourcemanager.nginx.models.NginxFrontendIpConfiguration;
import com.azure.resourcemanager.nginx.models.NginxNetworkInterfaceConfiguration;
import com.azure.resourcemanager.nginx.models.NginxNetworkProfile;
import com.azure.resourcemanager.nginx.models.NginxPrivateIpAddress;
import com.azure.resourcemanager.nginx.models.NginxPrivateIpAllocationMethod;
import com.azure.resourcemanager.nginx.models.NginxPublicIpAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments CreateOrUpdate.
 */
public final class DeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/nginx/resource-manager/NGINX.NGINXPLUS/preview/2024-01-01-preview/examples/Deployments_Create.json
     */
    /**
     * Sample code: Deployments_Create.
     * 
     * @param manager Entry point to NginxManager.
     */
    public static void deploymentsCreate(com.azure.resourcemanager.nginx.NginxManager manager) {
        manager.deployments()
            .define("myDeployment")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("Environment", "Dev"))
            .withProperties(new NginxDeploymentProperties().withManagedResourceGroup("myManagedResourceGroup")
                .withNetworkProfile(new NginxNetworkProfile()
                    .withFrontEndIpConfiguration(new NginxFrontendIpConfiguration()
                        .withPublicIpAddresses(Arrays.asList(new NginxPublicIpAddress().withId(
                            "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Network/publicIPAddresses/myPublicIPAddress")))
                        .withPrivateIpAddresses(Arrays.asList(new NginxPrivateIpAddress()
                            .withPrivateIpAddress("1.1.1.1")
                            .withPrivateIpAllocationMethod(NginxPrivateIpAllocationMethod.STATIC)
                            .withSubnetId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/myVnet/subnets/mySubnet"))))
                    .withNetworkInterfaceConfiguration(new NginxNetworkInterfaceConfiguration().withSubnetId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/myVnet/subnets/mySubnet")))
                .withScalingProperties(new NginxDeploymentScalingProperties().withCapacity(10))
                .withAutoUpgradeProfile(new AutoUpgradeProfile().withUpgradeChannel("stable"))
                .withUserProfile(new NginxDeploymentUserProfile().withPreferredEmail("example@example.email")))
            .create();
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
