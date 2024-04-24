// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.OperationListResultInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Operation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResultInner model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"xkhnzbonlwnto\",\"display\":{\"provider\":\"kdwbwhkszz\",\"resource\":\"rvexztvb\",\"operation\":\"gsfraoyzkoow\",\"description\":\"mnguxawqaldsyu\"},\"isDataAction\":true,\"origin\":\"user\",\"properties\":{\"nkbykutwpfhp\":\"datafobwy\",\"tdlmkkzevd\":\"datagmhrskdsnfdsdoak\"}},{\"name\":\"ewpusdsttwvogvb\",\"display\":{\"provider\":\"dcngqqmoakufgmj\",\"resource\":\"wr\",\"operation\":\"rtwaenuuzko\",\"description\":\"minrfdw\"},\"isDataAction\":true,\"origin\":\"user\",\"properties\":{\"efozbhdms\":\"datau\",\"zqhof\":\"datal\",\"ah\":\"datarmaequ\",\"piyylhalnswhccsp\":\"dataicslfaoq\"}},{\"name\":\"aivwitqscywu\",\"display\":{\"provider\":\"oluhczbwemh\",\"resource\":\"rsbrgzdwm\",\"operation\":\"eypqwdxggicccn\",\"description\":\"huexmk\"},\"isDataAction\":true,\"origin\":\"NotSpecified\",\"properties\":{\"iypbsfgytgusl\":\"datazywemhzrncsdtclu\",\"sx\":\"dataeadcygqukyhejhz\",\"lppvksrpq\":\"datafpel\",\"htwdwrftswibyrcd\":\"dataujzra\"}},{\"name\":\"h\",\"display\":{\"provider\":\"wpracstwitykhev\",\"resource\":\"cedcpnmdy\",\"operation\":\"nwzxltjcv\",\"description\":\"ltiugcxnavv\"},\"isDataAction\":false,\"origin\":\"NotSpecified\",\"properties\":{\"djrkvfgbvfvpd\":\"dataunyowxwl\",\"q\":\"dataodacizs\",\"ibdeibq\":\"datahkr\",\"kghv\":\"datap\"}}],\"nextLink\":\"dzwmkrefajpj\"}")
            .toObject(OperationListResultInner.class);
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("dzwmkrefajpj", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResultInner model = new OperationListResultInner()
            .withValue(Arrays.asList(new Operation().withIsDataAction(true), new Operation().withIsDataAction(true),
                new Operation().withIsDataAction(true), new Operation().withIsDataAction(false)))
            .withNextLink("dzwmkrefajpj");
        model = BinaryData.fromObject(model).toObject(OperationListResultInner.class);
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("dzwmkrefajpj", model.nextLink());
    }
}
