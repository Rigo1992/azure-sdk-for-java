// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.batch.BatchManager;
import com.azure.resourcemanager.batch.models.ComputeNodeFillType;
import com.azure.resourcemanager.batch.models.DynamicVNetAssignmentScope;
import com.azure.resourcemanager.batch.models.InterNodeCommunicationState;
import com.azure.resourcemanager.batch.models.NodeCommunicationMode;
import com.azure.resourcemanager.batch.models.Pool;
import com.azure.resourcemanager.batch.models.PoolIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PoolsListByBatchAccountMockTests {
    @Test
    public void testListByBatchAccount() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"displayName\":\"czu\",\"lastModified\":\"2021-07-25T15:19:26Z\",\"creationTime\":\"2021-11-16T08:33:21Z\",\"provisioningState\":\"Succeeded\",\"provisioningStateTransitionTime\":\"2021-11-26T11:35:34Z\",\"allocationState\":\"Stopping\",\"allocationStateTransitionTime\":\"2021-07-23T13:28:16Z\",\"vmSize\":\"sx\",\"deploymentConfiguration\":{},\"currentDedicatedNodes\":1481595996,\"currentLowPriorityNodes\":1534377343,\"scaleSettings\":{},\"autoScaleRun\":{\"evaluationTime\":\"2021-09-03T19:15:23Z\",\"results\":\"cfzq\"},\"interNodeCommunication\":\"Enabled\",\"networkConfiguration\":{\"subnetId\":\"czheyd\",\"dynamicVnetAssignmentScope\":\"job\"},\"taskSlotsPerNode\":298651884,\"taskSchedulingPolicy\":{\"nodeFillType\":\"Pack\"},\"userAccounts\":[],\"metadata\":[],\"startTask\":{\"commandLine\":\"xu\",\"resourceFiles\":[],\"environmentSettings\":[],\"maxTaskRetryCount\":1041302406,\"waitForSuccess\":false},\"certificates\":[],\"applicationPackages\":[],\"applicationLicenses\":[\"ywrckp\"],\"resizeOperationStatus\":{\"targetDedicatedNodes\":2090411231,\"targetLowPriorityNodes\":1678517219,\"resizeTimeout\":\"PT17H37M51S\",\"nodeDeallocationOption\":\"Terminate\",\"startTime\":\"2021-05-05T06:19:09Z\",\"errors\":[]},\"mountConfiguration\":[],\"targetNodeCommunicationMode\":\"Simplified\",\"currentNodeCommunicationMode\":\"Classic\"},\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"etag\":\"stgktst\",\"id\":\"dxeclzedqbcvh\",\"name\":\"lhpl\",\"type\":\"dqkdlwwqfbu\"}]}";

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

        BatchManager manager =
            BatchManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Pool> response =
            manager.pools().listByBatchAccount("xcv", "srhnjivo", 1976490, "tnovqfzgemjdftul", "ltducea", Context.NONE);

        Assertions.assertEquals(PoolIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("czu", response.iterator().next().displayName());
        Assertions.assertEquals("sx", response.iterator().next().vmSize());
        Assertions
            .assertEquals(InterNodeCommunicationState.ENABLED, response.iterator().next().interNodeCommunication());
        Assertions.assertEquals("czheyd", response.iterator().next().networkConfiguration().subnetId());
        Assertions
            .assertEquals(
                DynamicVNetAssignmentScope.JOB,
                response.iterator().next().networkConfiguration().dynamicVnetAssignmentScope());
        Assertions.assertEquals(298651884, response.iterator().next().taskSlotsPerNode());
        Assertions
            .assertEquals(ComputeNodeFillType.PACK, response.iterator().next().taskSchedulingPolicy().nodeFillType());
        Assertions.assertEquals("xu", response.iterator().next().startTask().commandLine());
        Assertions.assertEquals(1041302406, response.iterator().next().startTask().maxTaskRetryCount());
        Assertions.assertEquals(false, response.iterator().next().startTask().waitForSuccess());
        Assertions.assertEquals("ywrckp", response.iterator().next().applicationLicenses().get(0));
        Assertions
            .assertEquals(NodeCommunicationMode.SIMPLIFIED, response.iterator().next().targetNodeCommunicationMode());
    }
}
