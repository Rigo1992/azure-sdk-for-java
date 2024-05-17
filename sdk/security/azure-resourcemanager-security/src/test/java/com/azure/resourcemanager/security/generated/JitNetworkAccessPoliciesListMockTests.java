// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.JitNetworkAccessPolicy;
import com.azure.resourcemanager.security.models.Protocol;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class JitNetworkAccessPoliciesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"virtualMachines\":[{\"id\":\"locnwmefzvzuzq\",\"ports\":[{\"number\":559638335,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"o\"}],\"publicIpAddress\":\"bzgy\"},{\"id\":\"enfsfyqncowm\",\"ports\":[{\"number\":686308663,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"fbywjiaaosla\"}],\"publicIpAddress\":\"gwaakktbjortz\"},{\"id\":\"kajqhsnsejpli\",\"ports\":[{\"number\":111863802,\"protocol\":\"UDP\",\"maxRequestAccessDuration\":\"ljzbkdwlfjwxgvtk\"}],\"publicIpAddress\":\"tvrpeawzzkv\"},{\"id\":\"ccozvqxsphtra\",\"ports\":[{\"number\":1426227231,\"protocol\":\"TCP\",\"maxRequestAccessDuration\":\"suk\"},{\"number\":498542898,\"protocol\":\"*\",\"maxRequestAccessDuration\":\"ytgcpt\"}],\"publicIpAddress\":\"xp\"}],\"requests\":[{\"virtualMachines\":[{\"id\":\"ckm\",\"ports\":[]},{\"id\":\"mfvrcclclfkf\",\"ports\":[]},{\"id\":\"yjom\",\"ports\":[]}],\"startTimeUtc\":\"2021-05-12T12:02:14Z\",\"requestor\":\"rvpoipj\",\"justification\":\"x\"},{\"virtualMachines\":[{\"id\":\"b\",\"ports\":[]},{\"id\":\"sewfzvv\",\"ports\":[]},{\"id\":\"aysqwh\",\"ports\":[]},{\"id\":\"dcyandblkb\",\"ports\":[]}],\"startTimeUtc\":\"2021-05-03T19:59:43Z\",\"requestor\":\"c\",\"justification\":\"vd\"}],\"provisioningState\":\"oqqct\"},\"kind\":\"xu\",\"location\":\"qpffapjpjmsbzz\",\"id\":\"snyfowyjzuak\",\"name\":\"iubeqk\",\"type\":\"ttlrglhxs\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<JitNetworkAccessPolicy> response
            = manager.jitNetworkAccessPolicies().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xu", response.iterator().next().kind());
        Assertions.assertEquals("locnwmefzvzuzq", response.iterator().next().virtualMachines().get(0).id());
        Assertions.assertEquals(559638335, response.iterator().next().virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals(Protocol.TCP,
            response.iterator().next().virtualMachines().get(0).ports().get(0).protocol());
        Assertions.assertEquals("o",
            response.iterator().next().virtualMachines().get(0).ports().get(0).maxRequestAccessDuration());
        Assertions.assertEquals("bzgy", response.iterator().next().virtualMachines().get(0).publicIpAddress());
        Assertions.assertEquals("ckm", response.iterator().next().requests().get(0).virtualMachines().get(0).id());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-12T12:02:14Z"),
            response.iterator().next().requests().get(0).startTimeUtc());
        Assertions.assertEquals("rvpoipj", response.iterator().next().requests().get(0).requestor());
        Assertions.assertEquals("x", response.iterator().next().requests().get(0).justification());
    }
}
