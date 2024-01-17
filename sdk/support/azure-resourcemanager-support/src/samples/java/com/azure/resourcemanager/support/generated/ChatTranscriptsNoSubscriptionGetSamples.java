// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

/** Samples for ChatTranscriptsNoSubscription Get. */
public final class ChatTranscriptsNoSubscriptionGetSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/preview/2022-09-01-preview/examples/GetchatTranscriptDetailsForSupportTicket.json
     */
    /**
     * Sample code: Get chat transcript details for a subscription support ticket.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void getChatTranscriptDetailsForASubscriptionSupportTicket(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .chatTranscriptsNoSubscriptions()
            .getWithResponse("testticket", "b371192a-b094-4a71-b093-7246029b0a54", com.azure.core.util.Context.NONE);
    }
}
