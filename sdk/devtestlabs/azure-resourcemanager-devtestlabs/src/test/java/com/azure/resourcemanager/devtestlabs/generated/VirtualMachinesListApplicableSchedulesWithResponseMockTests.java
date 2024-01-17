// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.ApplicableSchedule;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VirtualMachinesListApplicableSchedulesWithResponseMockTests {
    @Test
    public void testListApplicableSchedulesWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"labVmsShutdown\":{\"properties\":{\"status\":\"Disabled\",\"taskType\":\"lpnerxrzutylcur\",\"weeklyRecurrence\":{\"weekdays\":[\"nbxqaeht\"],\"time\":\"jmbnvynf\"},\"dailyRecurrence\":{\"time\":\"eactedcglskakdd\"},\"hourlyRecurrence\":{\"minute\":1624949953},\"timeZoneId\":\"llrqmtlpbyxro\",\"notificationSettings\":{\"status\":\"Enabled\",\"timeInMinutes\":1760009428,\"webhookUrl\":\"ffmnoiics\",\"emailRecipient\":\"yhbrjjta\",\"notificationLocale\":\"rdsjrho\"},\"createdDate\":\"2021-12-05T02:21:08Z\",\"targetResourceId\":\"gusxxhdod\",\"provisioningState\":\"wyblv\",\"uniqueIdentifier\":\"d\"},\"location\":\"vsbyidaelqp\",\"tags\":{\"ggdusxu\":\"mkwjfbotl\",\"uxcjkcoqwczsyiq\":\"sui\"},\"id\":\"izfwihvaangqt\",\"name\":\"hjrfdmfdvbbaex\",\"type\":\"jfwtgdfkkaui\"},\"labVmsStartup\":{\"properties\":{\"status\":\"Enabled\",\"taskType\":\"fmczfedyueps\",\"weeklyRecurrence\":{\"weekdays\":[\"ida\",\"jvyweo\",\"fkumcfjxoky\",\"lsyasv\"],\"time\":\"k\"},\"dailyRecurrence\":{\"time\":\"gjjekrkn\"},\"hourlyRecurrence\":{\"minute\":1460897475},\"timeZoneId\":\"jqy\",\"notificationSettings\":{\"status\":\"Disabled\",\"timeInMinutes\":370912095,\"webhookUrl\":\"dtu\",\"emailRecipient\":\"r\",\"notificationLocale\":\"dklotcsubmzo\"},\"createdDate\":\"2021-01-14T01:24:35Z\",\"targetResourceId\":\"obc\",\"provisioningState\":\"xfpwhd\",\"uniqueIdentifier\":\"lbkl\"},\"location\":\"lmnnk\",\"tags\":{\"saqjmkgx\":\"yqshwyqxridtt\",\"uuylztpz\":\"wqu\",\"fvezefk\":\"izevjyk\",\"zcntogffjwajnrtw\":\"kqtwqlepjjzkcasf\"},\"id\":\"vaqkifmxawost\",\"name\":\"zkn\",\"type\":\"rkmjqncfvdscnhe\"}},\"location\":\"vwfnqqwypvn\",\"tags\":{\"od\":\"b\",\"muymvec\":\"ggrssgwjfkain\",\"nkzzohnrddclz\":\"ztscbgmusaictds\"},\"id\":\"qozreh\",\"name\":\"bzq\",\"type\":\"xbnjrqvzyuexoz\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DevTestLabsManager manager =
            DevTestLabsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ApplicableSchedule response =
            manager
                .virtualMachines()
                .listApplicableSchedulesWithResponse(
                    "yidoxznvg", "dtmuuvd", "wsxmrszb", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("vwfnqqwypvn", response.location());
        Assertions.assertEquals("b", response.tags().get("od"));
        Assertions.assertEquals("vsbyidaelqp", response.labVmsShutdown().location());
        Assertions.assertEquals("mkwjfbotl", response.labVmsShutdown().tags().get("ggdusxu"));
        Assertions.assertEquals(EnableStatus.DISABLED, response.labVmsShutdown().status());
        Assertions.assertEquals("lpnerxrzutylcur", response.labVmsShutdown().taskType());
        Assertions.assertEquals("nbxqaeht", response.labVmsShutdown().weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("jmbnvynf", response.labVmsShutdown().weeklyRecurrence().time());
        Assertions.assertEquals("eactedcglskakdd", response.labVmsShutdown().dailyRecurrence().time());
        Assertions.assertEquals(1624949953, response.labVmsShutdown().hourlyRecurrence().minute());
        Assertions.assertEquals("llrqmtlpbyxro", response.labVmsShutdown().timeZoneId());
        Assertions.assertEquals(EnableStatus.ENABLED, response.labVmsShutdown().notificationSettings().status());
        Assertions.assertEquals(1760009428, response.labVmsShutdown().notificationSettings().timeInMinutes());
        Assertions.assertEquals("ffmnoiics", response.labVmsShutdown().notificationSettings().webhookUrl());
        Assertions.assertEquals("yhbrjjta", response.labVmsShutdown().notificationSettings().emailRecipient());
        Assertions.assertEquals("rdsjrho", response.labVmsShutdown().notificationSettings().notificationLocale());
        Assertions.assertEquals("gusxxhdod", response.labVmsShutdown().targetResourceId());
        Assertions.assertEquals("lmnnk", response.labVmsStartup().location());
        Assertions.assertEquals("yqshwyqxridtt", response.labVmsStartup().tags().get("saqjmkgx"));
        Assertions.assertEquals(EnableStatus.ENABLED, response.labVmsStartup().status());
        Assertions.assertEquals("fmczfedyueps", response.labVmsStartup().taskType());
        Assertions.assertEquals("ida", response.labVmsStartup().weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("k", response.labVmsStartup().weeklyRecurrence().time());
        Assertions.assertEquals("gjjekrkn", response.labVmsStartup().dailyRecurrence().time());
        Assertions.assertEquals(1460897475, response.labVmsStartup().hourlyRecurrence().minute());
        Assertions.assertEquals("jqy", response.labVmsStartup().timeZoneId());
        Assertions.assertEquals(EnableStatus.DISABLED, response.labVmsStartup().notificationSettings().status());
        Assertions.assertEquals(370912095, response.labVmsStartup().notificationSettings().timeInMinutes());
        Assertions.assertEquals("dtu", response.labVmsStartup().notificationSettings().webhookUrl());
        Assertions.assertEquals("r", response.labVmsStartup().notificationSettings().emailRecipient());
        Assertions.assertEquals("dklotcsubmzo", response.labVmsStartup().notificationSettings().notificationLocale());
        Assertions.assertEquals("obc", response.labVmsStartup().targetResourceId());
    }
}
