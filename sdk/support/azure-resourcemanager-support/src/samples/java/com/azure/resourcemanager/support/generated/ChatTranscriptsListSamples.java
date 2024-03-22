// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

/**
 * Samples for ChatTranscripts List.
 */
public final class ChatTranscriptsListSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/preview/2023-06-01-preview/examples/
     * ListChatTranscriptsForSubscriptionSupportTicket.json
     */
    /**
     * Sample code: List chat transcripts for a subscription support ticket.
     * 
     * @param manager Entry point to SupportManager.
     */
    public static void
        listChatTranscriptsForASubscriptionSupportTicket(com.azure.resourcemanager.support.SupportManager manager) {
        manager.chatTranscripts().list("testticket", com.azure.core.util.Context.NONE);
    }
}
