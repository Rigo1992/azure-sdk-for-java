// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mysqlflexibleserver.MySqlManager;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtection;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtectionName;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtectionState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AdvancedThreatProtectionSettingsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"creationTime\":\"2021-07-23T04:24:07Z\",\"state\":\"Disabled\",\"provisioningState\":\"Canceled\"},\"id\":\"k\",\"name\":\"reljeamur\",\"type\":\"zmlovuanash\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MySqlManager manager = MySqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AdvancedThreatProtection response = manager.advancedThreatProtectionSettings()
            .getWithResponse("lrpiqywnc", "jtszcof", AdvancedThreatProtectionName.DEFAULT,
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(AdvancedThreatProtectionState.DISABLED, response.state());
    }
}
