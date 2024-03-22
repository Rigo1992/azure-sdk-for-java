// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateEndpoint;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateEndpointConnectionListResult;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PrivateLinkServiceConnectionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"groupIds\":[\"n\",\"cqvyxlwhzlsico\",\"oqqnwvlryav\"],\"privateEndpoint\":{\"id\":\"eun\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"gyxzk\",\"actionsRequired\":\"ocukoklyax\"},\"provisioningState\":\"Succeeded\"},\"id\":\"uqszfk\",\"name\":\"eyp\",\"type\":\"wrmjmwvvjektc\"},{\"properties\":{\"groupIds\":[\"hwlrsf\",\"rzpwvlqdqgbiq\",\"lihkaetcktvfc\",\"vf\"],\"privateEndpoint\":{\"id\":\"ymuctqhjfbebrj\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"fuwutttxf\",\"actionsRequired\":\"rbirphxe\"},\"provisioningState\":\"Succeeded\"},\"id\":\"ahfn\",\"name\":\"jky\",\"type\":\"xjvuujqgidokg\"},{\"properties\":{\"groupIds\":[\"oxgvclt\",\"gsncghkjeszz\",\"bijhtxfvgxbf\",\"mxnehmp\"],\"privateEndpoint\":{\"id\":\"xgodebfqkkrbmp\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"iw\",\"actionsRequired\":\"zlfbxzpuzycispnq\"},\"provisioningState\":\"Deleting\"},\"id\":\"gkbrpyyd\",\"name\":\"ibnuqqkpik\",\"type\":\"drgvtqagn\"},{\"properties\":{\"groupIds\":[\"hijggme\",\"fsiarbutr\",\"vpnazzm\"],\"privateEndpoint\":{\"id\":\"unmpxttd\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"nlankxmyskpb\",\"actionsRequired\":\"nbtkcxywnytnr\"},\"provisioningState\":\"Deleting\"},\"id\":\"qidybyx\",\"name\":\"zfcl\",\"type\":\"aaxdbabphlwrq\"}]}")
            .toObject(PrivateEndpointConnectionListResult.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.value().get(0).privateLinkServiceConnectionState().status());
        Assertions.assertEquals("gyxzk", model.value().get(0).privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ocukoklyax",
            model.value().get(0).privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionListResult model
            = new PrivateEndpointConnectionListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateEndpointConnectionInner().withPrivateEndpoint(new PrivateEndpoint())
                                .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                                    .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                                    .withDescription("gyxzk").withActionsRequired("ocukoklyax")),
                            new PrivateEndpointConnectionInner().withPrivateEndpoint(new PrivateEndpoint())
                                .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                                    .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                                    .withDescription("fuwutttxf").withActionsRequired("rbirphxe")),
                            new PrivateEndpointConnectionInner().withPrivateEndpoint(new PrivateEndpoint())
                                .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                                    .withStatus(PrivateEndpointServiceConnectionStatus.REJECTED).withDescription("iw")
                                    .withActionsRequired("zlfbxzpuzycispnq")),
                            new PrivateEndpointConnectionInner().withPrivateEndpoint(new PrivateEndpoint())
                                .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                                    .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                                    .withDescription("nlankxmyskpb").withActionsRequired("nbtkcxywnytnr"))));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResult.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.value().get(0).privateLinkServiceConnectionState().status());
        Assertions.assertEquals("gyxzk", model.value().get(0).privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ocukoklyax",
            model.value().get(0).privateLinkServiceConnectionState().actionsRequired());
    }
}
