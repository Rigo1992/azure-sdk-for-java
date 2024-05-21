// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager;
import com.azure.resourcemanager.containerservicefleet.models.FleetUpdateStrategy;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FleetUpdateStrategiesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"strategy\":{\"stages\":[{\"name\":\"frao\",\"groups\":[{\"name\":\"oowtlmngu\"},{\"name\":\"aw\"}],\"afterStageWaitInSeconds\":1823569828},{\"name\":\"dsyuuximerqfob\",\"groups\":[{\"name\":\"nkbykutwpfhp\"},{\"name\":\"gmhrskdsnfdsdoak\"},{\"name\":\"tdlmkkzevd\"},{\"name\":\"hewpusdsttwv\"}],\"afterStageWaitInSeconds\":221713689},{\"name\":\"bbejdcngqqm\",\"groups\":[{\"name\":\"ufgmjzrwrdg\"},{\"name\":\"twaenuuzko\"}],\"afterStageWaitInSeconds\":1642651298}]}},\"eTag\":\"nrfdw\",\"id\":\"uhhziuiefozbhdm\",\"name\":\"mlmz\",\"type\":\"hoftr\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerServiceFleetManager manager = ContainerServiceFleetManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FleetUpdateStrategy response = manager.fleetUpdateStrategies()
            .getWithResponse("khazxkhnzbonlwn", "oegokdwbwh", "szzcmrvexztv", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("frao", response.strategy().stages().get(0).name());
        Assertions.assertEquals("oowtlmngu", response.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(1823569828, response.strategy().stages().get(0).afterStageWaitInSeconds());
    }
}
