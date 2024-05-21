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
import com.azure.resourcemanager.security.models.DiscoveredSecuritySolution;
import com.azure.resourcemanager.security.models.SecurityFamily;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DiscoveredSecuritySolutionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"securityFamily\":\"Va\",\"offer\":\"yzcjefpuba\",\"publisher\":\"djcgldry\",\"sku\":\"lrlkbh\"},\"location\":\"rmxca\",\"id\":\"jbfomfbozpjyxe\",\"name\":\"ppqcwdnn\",\"type\":\"jthp\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DiscoveredSecuritySolution> response
            = manager.discoveredSecuritySolutions().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals(SecurityFamily.VA, response.iterator().next().securityFamily());
        Assertions.assertEquals("yzcjefpuba", response.iterator().next().offer());
        Assertions.assertEquals("djcgldry", response.iterator().next().publisher());
        Assertions.assertEquals("lrlkbh", response.iterator().next().sku());
    }
}
