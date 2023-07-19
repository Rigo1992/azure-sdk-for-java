// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionCapability;
import com.azure.resourcemanager.mobilenetwork.models.PreemptionVulnerability;
import com.azure.resourcemanager.mobilenetwork.models.SdfDirection;
import com.azure.resourcemanager.mobilenetwork.models.Service;
import com.azure.resourcemanager.mobilenetwork.models.TrafficControlPermission;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ServicesListByMobileNetworkMockTests {
    @Test
    public void testListByMobileNetwork() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"servicePrecedence\":2134240124,\"serviceQosPolicy\":{\"5qi\":855506019,\"allocationAndRetentionPriorityLevel\":641502467,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"maximumBitRate\":{\"uplink\":\"iqfyuttdi\",\"downlink\":\"gbpvnwswmtxkyct\"}},\"pccRules\":[{\"ruleName\":\"gzwx\",\"rulePrecedence\":237893727,\"ruleQosPolicy\":{\"guaranteedBitRate\":{\"uplink\":\"cvogygzyvne\",\"downlink\":\"zaifghtmoqqtlff\"},\"5qi\":1354517943,\"allocationAndRetentionPriorityLevel\":1466697332,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"maximumBitRate\":{\"uplink\":\"avfqnvhnqoewdogi\",\"downlink\":\"etesypvidbztjhqt\"}},\"trafficControl\":\"Blocked\",\"serviceDataFlowTemplates\":[{\"templateName\":\"nynkbwet\",\"direction\":\"Uplink\",\"protocol\":[],\"remoteIpList\":[]},{\"templateName\":\"uhpsprkzyaupia\",\"direction\":\"Downlink\",\"protocol\":[],\"remoteIpList\":[]}]},{\"ruleName\":\"xnafbw\",\"rulePrecedence\":274756384,\"ruleQosPolicy\":{\"guaranteedBitRate\":{\"uplink\":\"htuov\",\"downlink\":\"aonurjtumg\"},\"5qi\":784380912,\"allocationAndRetentionPriorityLevel\":410392818,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"Preemptable\",\"maximumBitRate\":{\"uplink\":\"lclblyjxltbsju\",\"downlink\":\"c\"}},\"trafficControl\":\"Enabled\",\"serviceDataFlowTemplates\":[{\"templateName\":\"igctmgxuupbezq\",\"direction\":\"Uplink\",\"protocol\":[],\"remoteIpList\":[]}]},{\"ruleName\":\"ydrtc\",\"rulePrecedence\":831620696,\"ruleQosPolicy\":{\"guaranteedBitRate\":{\"uplink\":\"qkkyihztgeqmg\",\"downlink\":\"zgwldoychillcec\"},\"5qi\":635676325,\"allocationAndRetentionPriorityLevel\":1936925472,\"preemptionCapability\":\"NotPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"maximumBitRate\":{\"uplink\":\"uhicqllizstacsjv\",\"downlink\":\"rweft\"}},\"trafficControl\":\"Blocked\",\"serviceDataFlowTemplates\":[{\"templateName\":\"jp\",\"direction\":\"Bidirectional\",\"protocol\":[],\"remoteIpList\":[]},{\"templateName\":\"sse\",\"direction\":\"Bidirectional\",\"protocol\":[],\"remoteIpList\":[]},{\"templateName\":\"epwamcxtcz\",\"direction\":\"Downlink\",\"protocol\":[],\"remoteIpList\":[]},{\"templateName\":\"peuknijd\",\"direction\":\"Uplink\",\"protocol\":[],\"remoteIpList\":[]}]},{\"ruleName\":\"yespydjfbocyv\",\"rulePrecedence\":1551101543,\"ruleQosPolicy\":{\"guaranteedBitRate\":{\"uplink\":\"rtywi\",\"downlink\":\"dmhlakuflgbhgau\"},\"5qi\":1078455957,\"allocationAndRetentionPriorityLevel\":1587980465,\"preemptionCapability\":\"MayPreempt\",\"preemptionVulnerability\":\"NotPreemptable\",\"maximumBitRate\":{\"uplink\":\"rs\",\"downlink\":\"yjq\"}},\"trafficControl\":\"Blocked\",\"serviceDataFlowTemplates\":[{\"templateName\":\"nozoeoq\",\"direction\":\"Uplink\",\"protocol\":[],\"remoteIpList\":[]},{\"templateName\":\"jhvefgwbmqjchnt\",\"direction\":\"Bidirectional\",\"protocol\":[],\"remoteIpList\":[]},{\"templateName\":\"faymxbulpz\",\"direction\":\"Downlink\",\"protocol\":[],\"remoteIpList\":[]}]}]},\"location\":\"b\",\"tags\":{\"hxsgxj\":\"yojwyvfkmbtsu\",\"wsdrnpxqwodif\":\"mmzrrscub\",\"jogjonmc\":\"jxcjrmmuabwib\"},\"id\":\"e\",\"name\":\"oyzbamwineofvf\",\"type\":\"akpoldtvevbo\"}]}";

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

        MobileNetworkManager manager =
            MobileNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Service> response =
            manager.services().listByMobileNetwork("fgbrtt", "iac", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("b", response.iterator().next().location());
        Assertions.assertEquals("yojwyvfkmbtsu", response.iterator().next().tags().get("hxsgxj"));
        Assertions.assertEquals(2134240124, response.iterator().next().servicePrecedence());
        Assertions.assertEquals(855506019, response.iterator().next().serviceQosPolicy().fiveQi());
        Assertions
            .assertEquals(
                641502467, response.iterator().next().serviceQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions
            .assertEquals(
                PreemptionCapability.NOT_PREEMPT, response.iterator().next().serviceQosPolicy().preemptionCapability());
        Assertions
            .assertEquals(
                PreemptionVulnerability.PREEMPTABLE,
                response.iterator().next().serviceQosPolicy().preemptionVulnerability());
        Assertions.assertEquals("iqfyuttdi", response.iterator().next().serviceQosPolicy().maximumBitRate().uplink());
        Assertions
            .assertEquals("gbpvnwswmtxkyct", response.iterator().next().serviceQosPolicy().maximumBitRate().downlink());
        Assertions.assertEquals("gzwx", response.iterator().next().pccRules().get(0).ruleName());
        Assertions.assertEquals(237893727, response.iterator().next().pccRules().get(0).rulePrecedence());
        Assertions.assertEquals(1354517943, response.iterator().next().pccRules().get(0).ruleQosPolicy().fiveQi());
        Assertions
            .assertEquals(
                1466697332,
                response.iterator().next().pccRules().get(0).ruleQosPolicy().allocationAndRetentionPriorityLevel());
        Assertions
            .assertEquals(
                PreemptionCapability.MAY_PREEMPT,
                response.iterator().next().pccRules().get(0).ruleQosPolicy().preemptionCapability());
        Assertions
            .assertEquals(
                PreemptionVulnerability.NOT_PREEMPTABLE,
                response.iterator().next().pccRules().get(0).ruleQosPolicy().preemptionVulnerability());
        Assertions
            .assertEquals(
                "avfqnvhnqoewdogi",
                response.iterator().next().pccRules().get(0).ruleQosPolicy().maximumBitRate().uplink());
        Assertions
            .assertEquals(
                "etesypvidbztjhqt",
                response.iterator().next().pccRules().get(0).ruleQosPolicy().maximumBitRate().downlink());
        Assertions
            .assertEquals(
                "cvogygzyvne",
                response.iterator().next().pccRules().get(0).ruleQosPolicy().guaranteedBitRate().uplink());
        Assertions
            .assertEquals(
                "zaifghtmoqqtlff",
                response.iterator().next().pccRules().get(0).ruleQosPolicy().guaranteedBitRate().downlink());
        Assertions
            .assertEquals(
                TrafficControlPermission.BLOCKED, response.iterator().next().pccRules().get(0).trafficControl());
        Assertions
            .assertEquals(
                "nynkbwet",
                response.iterator().next().pccRules().get(0).serviceDataFlowTemplates().get(0).templateName());
        Assertions
            .assertEquals(
                SdfDirection.UPLINK,
                response.iterator().next().pccRules().get(0).serviceDataFlowTemplates().get(0).direction());
    }
}
