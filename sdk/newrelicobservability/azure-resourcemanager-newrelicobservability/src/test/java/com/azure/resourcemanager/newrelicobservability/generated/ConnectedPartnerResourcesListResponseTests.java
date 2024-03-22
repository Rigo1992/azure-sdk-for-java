// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.ConnectedPartnerResourcesListFormatInner;
import com.azure.resourcemanager.newrelicobservability.models.ConnectedPartnerResourceProperties;
import com.azure.resourcemanager.newrelicobservability.models.ConnectedPartnerResourcesListResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConnectedPartnerResourcesListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectedPartnerResourcesListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"accountName\":\"ggd\",\"accountId\":\"ixhbkuofqweykhm\",\"azureResourceId\":\"evfyexfwhybcib\",\"location\":\"vdcsitynn\"}},{\"properties\":{\"accountName\":\"dectehfiqsc\",\"accountId\":\"ypvhezrkg\",\"azureResourceId\":\"c\",\"location\":\"efovgmk\"}},{\"properties\":{\"accountName\":\"eyyvxyqjpkcat\",\"accountId\":\"ngj\",\"azureResourceId\":\"cczsq\",\"location\":\"hvmdajvnysounq\"}}],\"nextLink\":\"a\"}")
            .toObject(ConnectedPartnerResourcesListResponse.class);
        Assertions.assertEquals("ggd", model.value().get(0).properties().accountName());
        Assertions.assertEquals("ixhbkuofqweykhm", model.value().get(0).properties().accountId());
        Assertions.assertEquals("evfyexfwhybcib", model.value().get(0).properties().azureResourceId());
        Assertions.assertEquals("vdcsitynn", model.value().get(0).properties().location());
        Assertions.assertEquals("a", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectedPartnerResourcesListResponse model = new ConnectedPartnerResourcesListResponse()
            .withValue(Arrays.asList(
                new ConnectedPartnerResourcesListFormatInner().withProperties(
                    new ConnectedPartnerResourceProperties().withAccountName("ggd").withAccountId("ixhbkuofqweykhm")
                        .withAzureResourceId("evfyexfwhybcib").withLocation("vdcsitynn")),
                new ConnectedPartnerResourcesListFormatInner()
                    .withProperties(new ConnectedPartnerResourceProperties().withAccountName("dectehfiqsc")
                        .withAccountId("ypvhezrkg").withAzureResourceId("c").withLocation("efovgmk")),
                new ConnectedPartnerResourcesListFormatInner()
                    .withProperties(new ConnectedPartnerResourceProperties().withAccountName("eyyvxyqjpkcat")
                        .withAccountId("ngj").withAzureResourceId("cczsq").withLocation("hvmdajvnysounq"))))
            .withNextLink("a");
        model = BinaryData.fromObject(model).toObject(ConnectedPartnerResourcesListResponse.class);
        Assertions.assertEquals("ggd", model.value().get(0).properties().accountName());
        Assertions.assertEquals("ixhbkuofqweykhm", model.value().get(0).properties().accountId());
        Assertions.assertEquals("evfyexfwhybcib", model.value().get(0).properties().azureResourceId());
        Assertions.assertEquals("vdcsitynn", model.value().get(0).properties().location());
        Assertions.assertEquals("a", model.nextLink());
    }
}
