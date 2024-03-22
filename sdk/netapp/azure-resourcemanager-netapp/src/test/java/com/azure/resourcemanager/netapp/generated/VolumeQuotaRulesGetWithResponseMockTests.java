// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.Type;
import com.azure.resourcemanager.netapp.models.VolumeQuotaRule;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VolumeQuotaRulesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Creating\",\"quotaSizeInKiBs\":3265340554220962405,\"quotaType\":\"DefaultUserQuota\",\"quotaTarget\":\"ajqglcf\"},\"location\":\"l\",\"tags\":{\"zrdpsovwxznptgoe\":\"yxynq\",\"vntjlrigjk\":\"ybbabpfhvfsl\",\"xwaabzmifrygznmm\":\"kyrioovzid\"},\"id\":\"xrizkzobgop\",\"name\":\"lhslnelxieixyn\",\"type\":\"lxecwcrojphslh\"}";

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

        NetAppFilesManager manager = NetAppFilesManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        VolumeQuotaRule response = manager.volumeQuotaRules().getWithResponse("ids", "ault", "ijjumfq",
            "azlnqnmcjngzqdqx", "bjwgnyfus", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("l", response.location());
        Assertions.assertEquals("yxynq", response.tags().get("zrdpsovwxznptgoe"));
        Assertions.assertEquals(3265340554220962405L, response.quotaSizeInKiBs());
        Assertions.assertEquals(Type.DEFAULT_USER_QUOTA, response.quotaType());
        Assertions.assertEquals("ajqglcf", response.quotaTarget());
    }
}
