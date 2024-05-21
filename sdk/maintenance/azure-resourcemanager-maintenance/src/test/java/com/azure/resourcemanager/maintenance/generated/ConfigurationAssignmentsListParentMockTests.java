// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ConfigurationAssignmentsListParentMockTests {
    @Test
    public void testListParent() throws Exception {
        String responseStr
            = "{\"value\":[{\"location\":\"tkkgllqwjy\",\"properties\":{\"maintenanceConfigurationId\":\"ayvblmhvkzuhbx\",\"resourceId\":\"yhgsopbyrqufe\",\"filter\":{\"resourceTypes\":[\"wz\"],\"resourceGroups\":[\"hlmctlpdngitvgb\",\"hrixkwmy\",\"jejveg\"],\"osTypes\":[\"pna\",\"xexccbdreaxhcexd\",\"rvqahqkghtpwi\",\"nhyjsv\"],\"locations\":[\"xzb\",\"voowvr\",\"mtg\"],\"tagSettings\":{\"tags\":{\"yhgfipnsx\":[\"ostronz\"],\"pvuzlmv\":[\"cwaekrrjre\",\"fxtsgum\",\"jglikkxwslolb\"],\"noigbrnjwmwk\":[\"lfktgplcrpwjxe\"],\"ou\":[\"bsazejjoqka\",\"fhsxttaugz\",\"nfaazpxdtnkdmkq\",\"jlwuenvrkp\"]},\"filterOperator\":\"All\"}}},\"id\":\"ebqaaysjkixqtnq\",\"name\":\"tezlwff\",\"type\":\"iakp\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MaintenanceManager manager = MaintenanceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ConfigurationAssignment> response = manager.configurationAssignments()
            .listParent("birryuzhl", "kj", "qrvqq", "atjinrvgoupmfiib", "ggjioolvr", "x",
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("tkkgllqwjy", response.iterator().next().location());
        Assertions.assertEquals("ayvblmhvkzuhbx", response.iterator().next().maintenanceConfigurationId());
        Assertions.assertEquals("yhgsopbyrqufe", response.iterator().next().resourceId());
        Assertions.assertEquals("wz", response.iterator().next().filter().resourceTypes().get(0));
        Assertions.assertEquals("hlmctlpdngitvgb", response.iterator().next().filter().resourceGroups().get(0));
        Assertions.assertEquals("pna", response.iterator().next().filter().osTypes().get(0));
        Assertions.assertEquals("xzb", response.iterator().next().filter().locations().get(0));
        Assertions.assertEquals("ostronz",
            response.iterator().next().filter().tagSettings().tags().get("yhgfipnsx").get(0));
        Assertions.assertEquals(TagOperators.ALL, response.iterator().next().filter().tagSettings().filterOperator());
    }
}
