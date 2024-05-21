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
import com.azure.resourcemanager.security.models.ResourceIdentityType;
import com.azure.resourcemanager.security.models.SecurityOperatorList;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SecurityOperatorsListWithResponseMockTests {
    @Test
    public void testListWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"identity\":{\"principalId\":\"izbaxd\",\"tenantId\":\"zkz\",\"type\":\"SystemAssigned\"},\"id\":\"e\",\"name\":\"wacyyjmlxppdndzk\",\"type\":\"evuiiuiibfkcjytq\"},{\"identity\":{\"principalId\":\"z\",\"tenantId\":\"qfopvnopmotdsfho\",\"type\":\"SystemAssigned\"},\"id\":\"yoazyfbkm\",\"name\":\"ldzmxojzsvmaigb\",\"type\":\"kvhyejth\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SecurityOperatorList response
            = manager.securityOperators().listWithResponse("llanhzc", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.value().get(0).identity().type());
    }
}
