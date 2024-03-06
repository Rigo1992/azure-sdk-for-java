// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager;
import com.azure.resourcemanager.hardwaresecuritymodules.models.DedicatedHsm;
import com.azure.resourcemanager.hardwaresecuritymodules.models.SkuName;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DedicatedHsmsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"systemData\":{\"createdBy\":\"c\",\"createdByType\":\"Application\",\"createdAt\":\"2021-09-16T17:42:02Z\",\"lastModifiedBy\":\"vpayakkudzpx\",\"lastModifiedByType\":\"ManagedIdentity\",\"lastModifiedAt\":\"2021-07-01T17:47:57Z\"},\"properties\":{\"networkProfile\":{\"subnet\":{\"id\":\"stcyohpfkyrkdbd\"},\"networkInterfaces\":[{\"id\":\"sjkmnwqj\",\"privateIpAddress\":\"baiyhddviaceg\"},{\"id\":\"m\",\"privateIpAddress\":\"fpmvmemfnczd\"},{\"id\":\"vbalxlllc\",\"privateIpAddress\":\"odbzevwrdnhf\"}]},\"managementNetworkProfile\":{\"subnet\":{\"id\":\"sjcswsmystuluqyp\"},\"networkInterfaces\":[{\"id\":\"er\",\"privateIpAddress\":\"pqbmfpjbab\"},{\"id\":\"dfc\",\"privateIpAddress\":\"spuunnoxyhkxgq\"},{\"id\":\"rihpfhoq\",\"privateIpAddress\":\"a\"},{\"id\":\"dao\",\"privateIpAddress\":\"jvlpjxxkzbr\"}]},\"stampId\":\"geivsiykzkdncj\",\"statusMessage\":\"onbzoggculapzwy\",\"provisioningState\":\"Connecting\"},\"sku\":{\"name\":\"payShield10K_LMK2_CPS250\"},\"zones\":[\"epnylbfu\",\"jlyjtlvofq\"],\"location\":\"hvfcibyfmow\",\"tags\":{\"wiivwzjbhyzsx\":\"kjpvdwxf\",\"negvmnvuqe\":\"rkambt\",\"tjb\":\"vldspa\",\"ril\":\"kdmflvestmjlx\"},\"id\":\"zapeewchpx\",\"name\":\"ktwkuziyc\",\"type\":\"levufuztcktyhj\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        HardwareSecurityModulesManager manager = HardwareSecurityModulesManager.configure().withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DedicatedHsm> response
            = manager.dedicatedHsms().list(810708616, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hvfcibyfmow", response.iterator().next().location());
        Assertions.assertEquals("kjpvdwxf", response.iterator().next().tags().get("wiivwzjbhyzsx"));
        Assertions.assertEquals(SkuName.PAY_SHIELD10K_LMK2_CPS250, response.iterator().next().sku().name());
        Assertions.assertEquals("epnylbfu", response.iterator().next().zones().get(0));
        Assertions.assertEquals("stcyohpfkyrkdbd",
            response.iterator().next().properties().networkProfile().subnet().id());
        Assertions.assertEquals("baiyhddviaceg",
            response.iterator().next().properties().networkProfile().networkInterfaces().get(0).privateIpAddress());
        Assertions.assertEquals("sjcswsmystuluqyp",
            response.iterator().next().properties().managementNetworkProfile().subnet().id());
        Assertions.assertEquals("pqbmfpjbab", response.iterator().next().properties().managementNetworkProfile()
            .networkInterfaces().get(0).privateIpAddress());
        Assertions.assertEquals("geivsiykzkdncj", response.iterator().next().properties().stampId());
    }
}
