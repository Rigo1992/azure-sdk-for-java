// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.signalr.SignalRManager;
import com.azure.resourcemanager.signalr.models.AclAction;
import com.azure.resourcemanager.signalr.models.FeatureFlags;
import com.azure.resourcemanager.signalr.models.ManagedIdentityType;
import com.azure.resourcemanager.signalr.models.ServiceKind;
import com.azure.resourcemanager.signalr.models.SignalRRequestType;
import com.azure.resourcemanager.signalr.models.SignalRResource;
import com.azure.resourcemanager.signalr.models.SignalRSkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SignalRsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sku\":{\"name\":\"e\",\"tier\":\"Premium\",\"size\":\"w\",\"family\":\"wl\",\"capacity\":953163194},\"properties\":{\"provisioningState\":\"Running\",\"externalIP\":\"psihcla\",\"hostName\":\"va\",\"publicPort\":371223759,\"serverPort\":207185331,\"version\":\"qqwzt\",\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Updating\",\"privateEndpoint\":{},\"groupIds\":[\"waxfewzjkj\",\"xfdeqvhpsyl\",\"ksh\"],\"privateLinkServiceConnectionState\":{}},\"id\":\"f\",\"name\":\"bmxzjrgywwpg\",\"type\":\"xs\"}],\"sharedPrivateLinkResources\":[{\"properties\":{\"groupId\":\"ujgicgaaoe\",\"privateLinkResourceId\":\"ttaqutdew\",\"provisioningState\":\"Moving\",\"requestMessage\":\"wvruunzzj\",\"status\":\"Approved\"},\"id\":\"fkimrtix\",\"name\":\"kffqyinljqepqwh\",\"type\":\"xmonstshi\"}],\"tls\":{\"clientCertEnabled\":false},\"hostNamePrefix\":\"lfcldu\",\"features\":[{\"flag\":\"EnableMessagingLogs\",\"value\":\"rds\",\"properties\":{\"i\":\"cobiegstmninwjiz\",\"tbxqmuluxlxq\":\"nghgshej\"}},{\"flag\":\"EnableMessagingLogs\",\"value\":\"nersb\",\"properties\":{\"brqbsmswzi\":\"crwnamikz\",\"vhczznvfby\":\"gfuhokzrusw\"}},{\"flag\":\"EnableConnectivityLogs\",\"value\":\"sxjwwixz\",\"properties\":{\"haohdjhhflzokxc\":\"wmxqhndvnoamlds\",\"atftgzpnpbsw\":\"xpelnjetagltsx\",\"loccsrmozihm\":\"e\",\"rytfmpcycil\":\"pgawtxxpkyjcxcjx\"}},{\"flag\":\"EnableConnectivityLogs\",\"value\":\"caykggnoxuz\",\"properties\":{\"wkjaos\":\"sxwpndfcpfnznthj\",\"smgbzahgxqdl\":\"xuzvoamktcqi\"}}],\"liveTraceConfiguration\":{\"enabled\":\"ltlaprltzkatbhj\",\"categories\":[{\"name\":\"bsoqeqala\",\"enabled\":\"lagun\"},{\"name\":\"gfebwlnb\",\"enabled\":\"yreeudz\"},{\"name\":\"vbpdqmjxlyyzglgo\",\"enabled\":\"tlmj\"}]},\"resourceLogConfiguration\":{\"categories\":[{\"name\":\"qtobaxkjeyt\",\"enabled\":\"lbfjkwr\"},{\"name\":\"nkqbhsyrq\",\"enabled\":\"jqhden\"},{\"name\":\"ulkpakd\",\"enabled\":\"fmjnnawtqa\"}]},\"cors\":{\"allowedOrigins\":[\"ckpggqoweyird\",\"lisn\",\"wfl\",\"qmp\"]},\"serverless\":{\"connectionTimeoutInSeconds\":1526757762},\"upstream\":{\"templates\":[{\"hubPattern\":\"xpxiwfcngjs\",\"eventPattern\":\"sii\",\"categoryPattern\":\"mkzjvkviir\",\"urlTemplate\":\"gfgrwsdp\",\"auth\":{}},{\"hubPattern\":\"t\",\"eventPattern\":\"zb\",\"categoryPattern\":\"byvi\",\"urlTemplate\":\"tctbrxkjzwrgxffm\",\"auth\":{}}]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"publicNetwork\":{\"allow\":[\"ServerConnection\",\"Trace\"],\"deny\":[\"RESTAPI\",\"Trace\",\"ClientConnection\"]},\"privateEndpoints\":[{\"name\":\"dpizq\",\"allow\":[\"RESTAPI\",\"ServerConnection\",\"Trace\"],\"deny\":[\"Trace\",\"ClientConnection\",\"ClientConnection\",\"ClientConnection\"]}],\"ipRules\":[{\"value\":\"knfsmfcttuxuuyil\",\"action\":\"Deny\"}]},\"publicNetworkAccess\":\"iquvrehm\",\"disableLocalAuth\":true,\"disableAadAuth\":true,\"regionEndpointEnabled\":\"ujztcz\",\"resourceStopped\":\"qjtwhauu\"},\"kind\":\"RawWebSockets\",\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"zdvpiw\":{\"principalId\":\"lxsmrpddouifamow\",\"clientId\":\"iynknlq\"},\"mzyospspshck\":{\"principalId\":\"qszdtmaajquhuxyl\",\"clientId\":\"vmtygj\"}},\"principalId\":\"yjpmspbpssdfppyo\",\"tenantId\":\"ieyujtvc\"},\"location\":\"cnyxrxmunjd\",\"tags\":{\"aglqivbgkcvkh\":\"lnkvxlx\",\"yp\":\"zvuqdflvon\",\"idibgqjxgpn\":\"pubcpzgpxtivhjk\"},\"id\":\"hgovfgp\",\"name\":\"kqmhhaowjr\",\"type\":\"zvuporqzdfuydz\"}";

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

        SignalRManager manager =
            SignalRManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        SignalRResource response =
            manager
                .signalRs()
                .getByResourceGroupWithResponse("qnyophzfyls", "crpfbcunez", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("cnyxrxmunjd", response.location());
        Assertions.assertEquals("lnkvxlx", response.tags().get("aglqivbgkcvkh"));
        Assertions.assertEquals("e", response.sku().name());
        Assertions.assertEquals(SignalRSkuTier.PREMIUM, response.sku().tier());
        Assertions.assertEquals(953163194, response.sku().capacity());
        Assertions.assertEquals(ServiceKind.RAW_WEB_SOCKETS, response.kind());
        Assertions.assertEquals(ManagedIdentityType.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals(false, response.tls().clientCertEnabled());
        Assertions.assertEquals(FeatureFlags.ENABLE_MESSAGING_LOGS, response.features().get(0).flag());
        Assertions.assertEquals("rds", response.features().get(0).value());
        Assertions.assertEquals("cobiegstmninwjiz", response.features().get(0).properties().get("i"));
        Assertions.assertEquals("ltlaprltzkatbhj", response.liveTraceConfiguration().enabled());
        Assertions.assertEquals("bsoqeqala", response.liveTraceConfiguration().categories().get(0).name());
        Assertions.assertEquals("lagun", response.liveTraceConfiguration().categories().get(0).enabled());
        Assertions.assertEquals("qtobaxkjeyt", response.resourceLogConfiguration().categories().get(0).name());
        Assertions.assertEquals("lbfjkwr", response.resourceLogConfiguration().categories().get(0).enabled());
        Assertions.assertEquals("ckpggqoweyird", response.cors().allowedOrigins().get(0));
        Assertions.assertEquals(1526757762, response.serverless().connectionTimeoutInSeconds());
        Assertions.assertEquals("xpxiwfcngjs", response.upstream().templates().get(0).hubPattern());
        Assertions.assertEquals("sii", response.upstream().templates().get(0).eventPattern());
        Assertions.assertEquals("mkzjvkviir", response.upstream().templates().get(0).categoryPattern());
        Assertions.assertEquals("gfgrwsdp", response.upstream().templates().get(0).urlTemplate());
        Assertions.assertEquals(AclAction.DENY, response.networkACLs().defaultAction());
        Assertions
            .assertEquals(SignalRRequestType.SERVER_CONNECTION, response.networkACLs().publicNetwork().allow().get(0));
        Assertions.assertEquals(SignalRRequestType.RESTAPI, response.networkACLs().publicNetwork().deny().get(0));
        Assertions
            .assertEquals(SignalRRequestType.RESTAPI, response.networkACLs().privateEndpoints().get(0).allow().get(0));
        Assertions
            .assertEquals(SignalRRequestType.TRACE, response.networkACLs().privateEndpoints().get(0).deny().get(0));
        Assertions.assertEquals("dpizq", response.networkACLs().privateEndpoints().get(0).name());
        Assertions.assertEquals("knfsmfcttuxuuyil", response.networkACLs().ipRules().get(0).value());
        Assertions.assertEquals(AclAction.DENY, response.networkACLs().ipRules().get(0).action());
        Assertions.assertEquals("iquvrehm", response.publicNetworkAccess());
        Assertions.assertEquals(true, response.disableLocalAuth());
        Assertions.assertEquals(true, response.disableAadAuth());
        Assertions.assertEquals("ujztcz", response.regionEndpointEnabled());
        Assertions.assertEquals("qjtwhauu", response.resourceStopped());
    }
}
