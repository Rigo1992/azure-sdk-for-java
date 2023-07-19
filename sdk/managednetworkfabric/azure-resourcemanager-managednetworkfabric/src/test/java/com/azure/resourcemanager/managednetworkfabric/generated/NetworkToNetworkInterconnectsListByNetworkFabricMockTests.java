// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.IsManagementType;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkToNetworkInterconnect;
import com.azure.resourcemanager.managednetworkfabric.models.NniType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkToNetworkInterconnectsListByNetworkFabricMockTests {
    @Test
    public void testListByNetworkFabric() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"nniType\":\"CE\",\"isManagementType\":\"True\",\"useOptionB\":\"False\",\"layer2Configuration\":{\"mtu\":1077230266,\"interfaces\":[\"dswpvnloopzy\"]},\"optionBLayer3Configuration\":{\"peerASN\":4121931377231335621,\"vlanId\":1850901066,\"fabricASN\":1363288151308393494,\"primaryIpv4Prefix\":\"jlfqzcklvvwv\",\"primaryIpv6Prefix\":\"qtp\",\"secondaryIpv4Prefix\":\"hmlnfvyhdhffn\",\"secondaryIpv6Prefix\":\"mhawbxnlkmazhlew\"},\"npbStaticRouteConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"Disabled\",\"intervalInMilliSeconds\":215443384,\"multiplier\":66450889},\"ipv4Routes\":[{\"prefix\":\"zipyqtm\",\"nextHop\":[\"bctkgmwxz\",\"phzujkqa\",\"bejhxopehel\",\"sykhdapxdiibjj\"]},{\"prefix\":\"uekhh\",\"nextHop\":[\"hxhuhhnrmmfzfkh\"]},{\"prefix\":\"nzjff\",\"nextHop\":[\"htvbskgciedl\",\"vpdtrlsmsr\",\"lfgbu\",\"gchjtpszcawf\"]},{\"prefix\":\"pny\",\"nextHop\":[\"uivrjse\",\"auzrpespebie\",\"zxrusafvflyqau\",\"ohskimn\"]}],\"ipv6Routes\":[{\"prefix\":\"vlqmnwhdhoyvpd\",\"nextHop\":[\"aplpdzriettnm\",\"ufpbfqmlmbyqyek\",\"w\",\"dxz\"]}]},\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"u\",\"importIpv6RoutePolicyId\":\"dogrtfwzecgbx\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"evqjdxiiqwqbvanv\",\"exportIpv6RoutePolicyId\":\"xnaaiitnkruyw\"},\"egressAclId\":\"nksmaebdrxj\",\"ingressAclId\":\"rsea\",\"configurationState\":\"Failed\",\"provisioningState\":\"Accepted\",\"administrativeState\":\"Disabled\"},\"id\":\"rqwfuxntuegy\",\"name\":\"leketk\",\"type\":\"iptqhatfg\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ManagedNetworkFabricManager manager =
            ManagedNetworkFabricManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<NetworkToNetworkInterconnect> response =
            manager
                .networkToNetworkInterconnects()
                .listByNetworkFabric("ltjdrfiwe", "l", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(NniType.CE, response.iterator().next().nniType());
        Assertions.assertEquals(IsManagementType.TRUE, response.iterator().next().isManagementType());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, response.iterator().next().useOptionB());
        Assertions.assertEquals(1077230266, response.iterator().next().layer2Configuration().mtu());
        Assertions.assertEquals("dswpvnloopzy", response.iterator().next().layer2Configuration().interfaces().get(0));
        Assertions
            .assertEquals("jlfqzcklvvwv", response.iterator().next().optionBLayer3Configuration().primaryIpv4Prefix());
        Assertions.assertEquals("qtp", response.iterator().next().optionBLayer3Configuration().primaryIpv6Prefix());
        Assertions
            .assertEquals(
                "hmlnfvyhdhffn", response.iterator().next().optionBLayer3Configuration().secondaryIpv4Prefix());
        Assertions
            .assertEquals(
                "mhawbxnlkmazhlew", response.iterator().next().optionBLayer3Configuration().secondaryIpv6Prefix());
        Assertions
            .assertEquals(4121931377231335621L, response.iterator().next().optionBLayer3Configuration().peerAsn());
        Assertions.assertEquals(1850901066, response.iterator().next().optionBLayer3Configuration().vlanId());
        Assertions
            .assertEquals(
                215443384,
                response.iterator().next().npbStaticRouteConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions
            .assertEquals(
                66450889, response.iterator().next().npbStaticRouteConfiguration().bfdConfiguration().multiplier());
        Assertions
            .assertEquals(
                "zipyqtm", response.iterator().next().npbStaticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions
            .assertEquals(
                "bctkgmwxz",
                response.iterator().next().npbStaticRouteConfiguration().ipv4Routes().get(0).nextHop().get(0));
        Assertions
            .assertEquals(
                "vlqmnwhdhoyvpd",
                response.iterator().next().npbStaticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions
            .assertEquals(
                "aplpdzriettnm",
                response.iterator().next().npbStaticRouteConfiguration().ipv6Routes().get(0).nextHop().get(0));
        Assertions.assertEquals("u", response.iterator().next().importRoutePolicy().importIpv4RoutePolicyId());
        Assertions
            .assertEquals("dogrtfwzecgbx", response.iterator().next().importRoutePolicy().importIpv6RoutePolicyId());
        Assertions
            .assertEquals("evqjdxiiqwqbvanv", response.iterator().next().exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions
            .assertEquals("xnaaiitnkruyw", response.iterator().next().exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("nksmaebdrxj", response.iterator().next().egressAclId());
        Assertions.assertEquals("rsea", response.iterator().next().ingressAclId());
    }
}