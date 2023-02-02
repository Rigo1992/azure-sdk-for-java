// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.VirtualNetworkInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.VirtualNetworkListResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworkListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkListResponse model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"wvogvbbejdc\",\"value\":[{\"assignable\":false,\"id\":\"oakufgm\",\"location\":\"rwr\",\"name\":\"rtwaenuuzko\",\"properties\":{\"privateCloudId\":\"inrfdwoyu\"},\"type\":\"ziuiefozbhdm\"},{\"assignable\":false,\"id\":\"mzqhoftrmaequi\",\"location\":\"xicslfao\",\"name\":\"piyylhalnswhccsp\",\"properties\":{\"privateCloudId\":\"ivwitqscywugg\"},\"type\":\"luhczbw\"}]}")
                .toObject(VirtualNetworkListResponse.class);
        Assertions.assertEquals("wvogvbbejdc", model.nextLink());
        Assertions.assertEquals("oakufgm", model.value().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkListResponse model =
            new VirtualNetworkListResponse()
                .withNextLink("wvogvbbejdc")
                .withValue(
                    Arrays
                        .asList(
                            new VirtualNetworkInner().withId("oakufgm"),
                            new VirtualNetworkInner().withId("mzqhoftrmaequi")));
        model = BinaryData.fromObject(model).toObject(VirtualNetworkListResponse.class);
        Assertions.assertEquals("wvogvbbejdc", model.nextLink());
        Assertions.assertEquals("oakufgm", model.value().get(0).id());
    }
}
