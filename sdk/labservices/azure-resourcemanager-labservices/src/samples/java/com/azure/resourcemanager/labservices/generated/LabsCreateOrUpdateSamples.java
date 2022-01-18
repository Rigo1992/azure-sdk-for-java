// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.resourcemanager.labservices.models.AutoShutdownProfile;
import com.azure.resourcemanager.labservices.models.ConnectionProfile;
import com.azure.resourcemanager.labservices.models.ConnectionType;
import com.azure.resourcemanager.labservices.models.CreateOption;
import com.azure.resourcemanager.labservices.models.Credentials;
import com.azure.resourcemanager.labservices.models.EnableState;
import com.azure.resourcemanager.labservices.models.ImageReference;
import com.azure.resourcemanager.labservices.models.LabNetworkProfile;
import com.azure.resourcemanager.labservices.models.SecurityProfile;
import com.azure.resourcemanager.labservices.models.ShutdownOnIdleMode;
import com.azure.resourcemanager.labservices.models.Sku;
import com.azure.resourcemanager.labservices.models.VirtualMachineAdditionalCapabilities;
import com.azure.resourcemanager.labservices.models.VirtualMachineProfile;
import java.time.Duration;

/** Samples for Labs CreateOrUpdate. */
public final class LabsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/labservices/resource-manager/Microsoft.LabServices/preview/2021-11-15-preview/examples/Labs/putLab.json
     */
    /**
     * Sample code: putLab.
     *
     * @param manager Entry point to LabServicesManager.
     */
    public static void putLab(com.azure.resourcemanager.labservices.LabServicesManager manager) {
        manager
            .labs()
            .define("testlab")
            .withRegion("westus")
            .withExistingResourceGroup("testrg123")
            .withNetworkProfile(
                new LabNetworkProfile()
                    .withSubnetId(
                        "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/default"))
            .withAutoShutdownProfile(
                new AutoShutdownProfile()
                    .withShutdownOnDisconnect(EnableState.ENABLED)
                    .withShutdownWhenNotConnected(EnableState.ENABLED)
                    .withShutdownOnIdle(ShutdownOnIdleMode.USER_ABSENCE)
                    .withDisconnectDelay(Duration.parse("00:05"))
                    .withNoConnectDelay(Duration.parse("01:00"))
                    .withIdleDelay(Duration.parse("01:00")))
            .withConnectionProfile(
                new ConnectionProfile()
                    .withWebSshAccess(ConnectionType.NONE)
                    .withWebRdpAccess(ConnectionType.NONE)
                    .withClientSshAccess(ConnectionType.PUBLIC)
                    .withClientRdpAccess(ConnectionType.PUBLIC))
            .withVirtualMachineProfile(
                new VirtualMachineProfile()
                    .withCreateOption(CreateOption.TEMPLATE_VM)
                    .withImageReference(
                        new ImageReference()
                            .withOffer("WindowsServer")
                            .withPublisher("Microsoft")
                            .withSku("2019-Datacenter")
                            .withVersion("2019.0.20190410"))
                    .withSku(new Sku().withName("Medium"))
                    .withAdditionalCapabilities(
                        new VirtualMachineAdditionalCapabilities().withInstallGpuDrivers(EnableState.DISABLED))
                    .withUsageQuota(Duration.parse("10:00"))
                    .withUseSharedPassword(EnableState.DISABLED)
                    .withAdminUser(new Credentials().withUsername("test-user")))
            .withSecurityProfile(new SecurityProfile().withOpenAccess(EnableState.DISABLED))
            .withLabPlanId(
                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.LabServices/labPlans/testlabplan")
            .withTitle("Test Lab")
            .withDescription("This is a test lab.")
            .create();
    }
}
