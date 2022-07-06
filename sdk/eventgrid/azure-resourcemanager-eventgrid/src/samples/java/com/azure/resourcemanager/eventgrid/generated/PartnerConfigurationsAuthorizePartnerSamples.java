// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.models.Partner;
import java.time.OffsetDateTime;
import java.util.UUID;

/** Samples for PartnerConfigurations AuthorizePartner. */
public final class PartnerConfigurationsAuthorizePartnerSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/stable/2022-06-15/examples/PartnerConfigurations_AuthorizePartner.json
     */
    /**
     * Sample code: PartnerConfigurations_AuthorizePartner.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerConfigurationsAuthorizePartner(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager
            .partnerConfigurations()
            .authorizePartnerWithResponse(
                "examplerg",
                new Partner()
                    .withPartnerRegistrationImmutableId(UUID.fromString("941892bc-f5d0-4d1c-8fb5-477570fc2b71"))
                    .withPartnerName("Contoso.Finance")
                    .withAuthorizationExpirationTimeInUtc(OffsetDateTime.parse("2022-01-28T01:20:55.142Z")),
                Context.NONE);
    }
}
