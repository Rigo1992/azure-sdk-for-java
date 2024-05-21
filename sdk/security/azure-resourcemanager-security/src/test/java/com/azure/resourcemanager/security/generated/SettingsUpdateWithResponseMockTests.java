// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.fluent.models.SettingInner;
import com.azure.resourcemanager.security.models.Setting;
import com.azure.resourcemanager.security.models.SettingNameAutoGenerated;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SettingsUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        String responseStr = "{\"kind\":\"Setting\",\"id\":\"hsizfuewlf\",\"name\":\"fiikqcdnzsfiu\",\"type\":\"gne\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Setting response = manager.settings()
            .updateWithResponse(SettingNameAutoGenerated.SENTINEL, new SettingInner(), com.azure.core.util.Context.NONE)
            .getValue();

    }
}
