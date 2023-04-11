// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.generated;

import com.azure.resourcemanager.providerhub.models.MessageScope;
import com.azure.resourcemanager.providerhub.models.NotificationEndpoint;
import com.azure.resourcemanager.providerhub.models.NotificationMode;
import com.azure.resourcemanager.providerhub.models.NotificationRegistrationProperties;
import java.util.Arrays;

/** Samples for NotificationRegistrations CreateOrUpdate. */
public final class NotificationRegistrationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/providerhub/resource-manager/Microsoft.ProviderHub/stable/2020-11-20/examples/NotificationRegistrations_CreateOrUpdate.json
     */
    /**
     * Sample code: NotificationRegistrations_CreateOrUpdate.
     *
     * @param manager Entry point to ProviderHubManager.
     */
    public static void notificationRegistrationsCreateOrUpdate(
        com.azure.resourcemanager.providerhub.ProviderHubManager manager) {
        manager
            .notificationRegistrations()
            .define("fooNotificationRegistration")
            .withExistingProviderRegistration("Microsoft.Contoso")
            .withProperties(
                new NotificationRegistrationProperties()
                    .withNotificationMode(NotificationMode.EVENT_HUB)
                    .withMessageScope(MessageScope.REGISTERED_SUBSCRIPTIONS)
                    .withIncludedEvents(Arrays.asList("*/write", "Microsoft.Contoso/employees/delete"))
                    .withNotificationEndpoints(
                        Arrays
                            .asList(
                                new NotificationEndpoint()
                                    .withNotificationDestination(
                                        "/subscriptions/ac6bcfb5-3dc1-491f-95a6-646b89bf3e88/resourceGroups/mgmtexp-eastus/providers/Microsoft.EventHub/namespaces/unitedstates-mgmtexpint/eventhubs/armlinkednotifications")
                                    .withLocations(Arrays.asList("", "East US")),
                                new NotificationEndpoint()
                                    .withNotificationDestination(
                                        "/subscriptions/ac6bcfb5-3dc1-491f-95a6-646b89bf3e88/resourceGroups/mgmtexp-northeurope/providers/Microsoft.EventHub/namespaces/europe-mgmtexpint/eventhubs/armlinkednotifications")
                                    .withLocations(Arrays.asList("North Europe")))))
            .create();
    }
}
