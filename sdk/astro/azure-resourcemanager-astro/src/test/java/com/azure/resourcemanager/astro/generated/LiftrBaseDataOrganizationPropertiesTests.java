// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.astro.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.astro.models.LiftrBaseDataOrganizationProperties;
import com.azure.resourcemanager.astro.models.LiftrBaseDataPartnerOrganizationProperties;
import com.azure.resourcemanager.astro.models.LiftrBaseMarketplaceDetails;
import com.azure.resourcemanager.astro.models.LiftrBaseOfferDetails;
import com.azure.resourcemanager.astro.models.LiftrBaseSingleSignOnProperties;
import com.azure.resourcemanager.astro.models.LiftrBaseUserDetails;
import com.azure.resourcemanager.astro.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.astro.models.SingleSignOnStates;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LiftrBaseDataOrganizationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiftrBaseDataOrganizationProperties model = BinaryData.fromString(
            "{\"marketplace\":{\"subscriptionId\":\"ytb\",\"subscriptionStatus\":\"PendingFulfillmentStart\",\"offerDetails\":{\"publisherId\":\"fouflmmnkzsmo\",\"offerId\":\"mglougpbkw\",\"planId\":\"mutduqktaps\",\"planName\":\"gcue\",\"termUnit\":\"umkdosvqwhbmd\",\"termId\":\"bjf\"}},\"user\":{\"firstName\":\"dgmb\",\"lastName\":\"bexppb\",\"emailAddress\":\"tq\",\"upn\":\"ol\",\"phoneNumber\":\"fpsalgbqu\"},\"provisioningState\":\"Succeeded\",\"partnerOrganizationProperties\":{\"organizationId\":\"jgzjaoyfhrtx\",\"workspaceId\":\"n\",\"organizationName\":\"rkujy\",\"workspaceName\":\"l\",\"singleSignOnProperties\":{\"singleSignOnState\":\"Disable\",\"enterpriseAppId\":\"qawrlyxwj\",\"singleSignOnUrl\":\"prbnwbxgjvtbv\",\"aadDomains\":[\"szdnr\",\"jq\"],\"provisioningState\":\"Canceled\"}}}")
            .toObject(LiftrBaseDataOrganizationProperties.class);
        Assertions.assertEquals("ytb", model.marketplace().subscriptionId());
        Assertions.assertEquals(MarketplaceSubscriptionStatus.PENDING_FULFILLMENT_START,
            model.marketplace().subscriptionStatus());
        Assertions.assertEquals("fouflmmnkzsmo", model.marketplace().offerDetails().publisherId());
        Assertions.assertEquals("mglougpbkw", model.marketplace().offerDetails().offerId());
        Assertions.assertEquals("mutduqktaps", model.marketplace().offerDetails().planId());
        Assertions.assertEquals("gcue", model.marketplace().offerDetails().planName());
        Assertions.assertEquals("umkdosvqwhbmd", model.marketplace().offerDetails().termUnit());
        Assertions.assertEquals("bjf", model.marketplace().offerDetails().termId());
        Assertions.assertEquals("dgmb", model.user().firstName());
        Assertions.assertEquals("bexppb", model.user().lastName());
        Assertions.assertEquals("tq", model.user().emailAddress());
        Assertions.assertEquals("ol", model.user().upn());
        Assertions.assertEquals("fpsalgbqu", model.user().phoneNumber());
        Assertions.assertEquals("jgzjaoyfhrtx", model.partnerOrganizationProperties().organizationId());
        Assertions.assertEquals("n", model.partnerOrganizationProperties().workspaceId());
        Assertions.assertEquals("rkujy", model.partnerOrganizationProperties().organizationName());
        Assertions.assertEquals("l", model.partnerOrganizationProperties().workspaceName());
        Assertions.assertEquals(SingleSignOnStates.DISABLE,
            model.partnerOrganizationProperties().singleSignOnProperties().singleSignOnState());
        Assertions.assertEquals("qawrlyxwj",
            model.partnerOrganizationProperties().singleSignOnProperties().enterpriseAppId());
        Assertions.assertEquals("prbnwbxgjvtbv",
            model.partnerOrganizationProperties().singleSignOnProperties().singleSignOnUrl());
        Assertions.assertEquals("szdnr",
            model.partnerOrganizationProperties().singleSignOnProperties().aadDomains().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiftrBaseDataOrganizationProperties model = new LiftrBaseDataOrganizationProperties()
            .withMarketplace(new LiftrBaseMarketplaceDetails().withSubscriptionId("ytb")
                .withSubscriptionStatus(MarketplaceSubscriptionStatus.PENDING_FULFILLMENT_START)
                .withOfferDetails(new LiftrBaseOfferDetails().withPublisherId("fouflmmnkzsmo").withOfferId("mglougpbkw")
                    .withPlanId("mutduqktaps").withPlanName("gcue").withTermUnit("umkdosvqwhbmd").withTermId("bjf")))
            .withUser(new LiftrBaseUserDetails().withFirstName("dgmb").withLastName("bexppb").withEmailAddress("tq")
                .withUpn("ol").withPhoneNumber("fpsalgbqu"))
            .withPartnerOrganizationProperties(
                new LiftrBaseDataPartnerOrganizationProperties().withOrganizationId("jgzjaoyfhrtx").withWorkspaceId("n")
                    .withOrganizationName("rkujy").withWorkspaceName("l")
                    .withSingleSignOnProperties(new LiftrBaseSingleSignOnProperties()
                        .withSingleSignOnState(SingleSignOnStates.DISABLE).withEnterpriseAppId("qawrlyxwj")
                        .withSingleSignOnUrl("prbnwbxgjvtbv").withAadDomains(Arrays.asList("szdnr", "jq"))));
        model = BinaryData.fromObject(model).toObject(LiftrBaseDataOrganizationProperties.class);
        Assertions.assertEquals("ytb", model.marketplace().subscriptionId());
        Assertions.assertEquals(MarketplaceSubscriptionStatus.PENDING_FULFILLMENT_START,
            model.marketplace().subscriptionStatus());
        Assertions.assertEquals("fouflmmnkzsmo", model.marketplace().offerDetails().publisherId());
        Assertions.assertEquals("mglougpbkw", model.marketplace().offerDetails().offerId());
        Assertions.assertEquals("mutduqktaps", model.marketplace().offerDetails().planId());
        Assertions.assertEquals("gcue", model.marketplace().offerDetails().planName());
        Assertions.assertEquals("umkdosvqwhbmd", model.marketplace().offerDetails().termUnit());
        Assertions.assertEquals("bjf", model.marketplace().offerDetails().termId());
        Assertions.assertEquals("dgmb", model.user().firstName());
        Assertions.assertEquals("bexppb", model.user().lastName());
        Assertions.assertEquals("tq", model.user().emailAddress());
        Assertions.assertEquals("ol", model.user().upn());
        Assertions.assertEquals("fpsalgbqu", model.user().phoneNumber());
        Assertions.assertEquals("jgzjaoyfhrtx", model.partnerOrganizationProperties().organizationId());
        Assertions.assertEquals("n", model.partnerOrganizationProperties().workspaceId());
        Assertions.assertEquals("rkujy", model.partnerOrganizationProperties().organizationName());
        Assertions.assertEquals("l", model.partnerOrganizationProperties().workspaceName());
        Assertions.assertEquals(SingleSignOnStates.DISABLE,
            model.partnerOrganizationProperties().singleSignOnProperties().singleSignOnState());
        Assertions.assertEquals("qawrlyxwj",
            model.partnerOrganizationProperties().singleSignOnProperties().enterpriseAppId());
        Assertions.assertEquals("prbnwbxgjvtbv",
            model.partnerOrganizationProperties().singleSignOnProperties().singleSignOnUrl());
        Assertions.assertEquals("szdnr",
            model.partnerOrganizationProperties().singleSignOnProperties().aadDomains().get(0));
    }
}
