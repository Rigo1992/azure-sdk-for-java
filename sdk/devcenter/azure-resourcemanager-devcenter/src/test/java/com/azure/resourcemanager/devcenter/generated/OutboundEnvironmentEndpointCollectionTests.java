// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.OutboundEnvironmentEndpointCollection;
import org.junit.jupiter.api.Assertions;

public final class OutboundEnvironmentEndpointCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OutboundEnvironmentEndpointCollection model = BinaryData.fromString(
            "{\"value\":[{\"category\":\"zdjtxvzflbqv\",\"endpoints\":[{\"domainName\":\"lgafcqusrdve\",\"description\":\"wsdtutnwl\",\"endpointDetails\":[{},{},{},{}]},{\"domainName\":\"vuzhyr\",\"description\":\"wipmvekdxuk\",\"endpointDetails\":[{}]},{\"domainName\":\"jjxundxgke\",\"description\":\"zhhzjhfjmhvvmu\",\"endpointDetails\":[{},{}]},{\"domainName\":\"uneqsxvmhf\",\"description\":\"zjyi\",\"endpointDetails\":[{}]}]},{\"category\":\"bhu\",\"endpoints\":[{\"domainName\":\"hyuemslyn\",\"description\":\"yrpfoobrlttymsj\",\"endpointDetails\":[{},{},{}]},{\"domainName\":\"dnfwqzdzg\",\"description\":\"la\",\"endpointDetails\":[{},{},{},{}]},{\"domainName\":\"hqlyvijo\",\"description\":\"iv\",\"endpointDetails\":[{},{},{}]},{\"domainName\":\"zunbixx\",\"description\":\"ikvcpwp\",\"endpointDetails\":[{},{},{},{}]}]},{\"category\":\"civtsoxfrkenxp\",\"endpoints\":[{\"domainName\":\"frpmpdnqqskaw\",\"description\":\"qvmmbn\",\"endpointDetails\":[{}]},{\"domainName\":\"tqlkz\",\"description\":\"gnitgvkxlzyq\",\"endpointDetails\":[{},{}]},{\"domainName\":\"gcealzxwh\",\"description\":\"nsymoyqhlwigd\",\"endpointDetails\":[{},{},{}]},{\"domainName\":\"bxgomfaj\",\"description\":\"asqvd\",\"endpointDetails\":[{}]}]}],\"nextLink\":\"guxak\"}")
            .toObject(OutboundEnvironmentEndpointCollection.class);
        Assertions.assertEquals("guxak", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OutboundEnvironmentEndpointCollection model = new OutboundEnvironmentEndpointCollection().withNextLink("guxak");
        model = BinaryData.fromObject(model).toObject(OutboundEnvironmentEndpointCollection.class);
        Assertions.assertEquals("guxak", model.nextLink());
    }
}
