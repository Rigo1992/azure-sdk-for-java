// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.DevCenterSku;
import com.azure.resourcemanager.devcenter.models.SkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SkusListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"resourceType\":\"wqrjzfrg\",\"locations\":[\"ohcmbu\",\"cnjrohmbpyryxame\",\"l\"],\"capabilities\":[{\"name\":\"kfkmrocxnehvsmt\",\"value\":\"lfpya\"}],\"name\":\"ucygvo\",\"tier\":\"Basic\",\"size\":\"nssxlgh\",\"family\":\"egjlgvvpa\",\"capacity\":1923565340}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevCenterManager manager = DevCenterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DevCenterSku> response = manager.skus().list(1254644077, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ucygvo", response.iterator().next().name());
        Assertions.assertEquals(SkuTier.BASIC, response.iterator().next().tier());
        Assertions.assertEquals("nssxlgh", response.iterator().next().size());
        Assertions.assertEquals("egjlgvvpa", response.iterator().next().family());
        Assertions.assertEquals(1923565340, response.iterator().next().capacity());
    }
}
