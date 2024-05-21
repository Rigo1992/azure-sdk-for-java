// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
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

public final class ConfigurationAssignmentsGetParentWithResponseMockTests {
    @Test
    public void testGetParentWithResponse() throws Exception {
        String responseStr
            = "{\"location\":\"n\",\"properties\":{\"maintenanceConfigurationId\":\"n\",\"resourceId\":\"ph\",\"filter\":{\"resourceTypes\":[\"odlqiyntor\",\"ihleos\",\"swsrms\",\"yzrpzbchckqqzq\"],\"resourceGroups\":[\"iysui\"],\"osTypes\":[\"nkedyatrwyhqmib\",\"yhwitsmypyynpcdp\",\"mnzgmwznmabi\",\"nsorgjhxbldt\"],\"locations\":[\"rlkdmtncvokotl\",\"xdy\"],\"tagSettings\":{\"tags\":{\"cikhnv\":[\"cogjltdtbn\",\"hadoocrk\"]},\"filterOperator\":\"All\"}}},\"id\":\"gxqquezik\",\"name\":\"wggxkallat\",\"type\":\"elwuipi\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MaintenanceManager manager = MaintenanceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ConfigurationAssignment response = manager.configurationAssignments()
            .getParentWithResponse("aeneqnzarrwl", "uu", "jfqka", "e", "iipfpubj", "bwwift", "hqkvpuvksgplsak",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("n", response.location());
        Assertions.assertEquals("n", response.maintenanceConfigurationId());
        Assertions.assertEquals("ph", response.resourceId());
        Assertions.assertEquals("odlqiyntor", response.filter().resourceTypes().get(0));
        Assertions.assertEquals("iysui", response.filter().resourceGroups().get(0));
        Assertions.assertEquals("nkedyatrwyhqmib", response.filter().osTypes().get(0));
        Assertions.assertEquals("rlkdmtncvokotl", response.filter().locations().get(0));
        Assertions.assertEquals("cogjltdtbn", response.filter().tagSettings().tags().get("cikhnv").get(0));
        Assertions.assertEquals(TagOperators.ALL, response.filter().tagSettings().filterOperator());
    }
}
