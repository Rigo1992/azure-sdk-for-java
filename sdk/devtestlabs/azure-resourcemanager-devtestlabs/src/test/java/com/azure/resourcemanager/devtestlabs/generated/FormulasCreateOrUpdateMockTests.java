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
import com.azure.resourcemanager.devtestlabs.models.Formula;
import com.azure.resourcemanager.devtestlabs.models.FormulaPropertiesFromVm;
import com.azure.resourcemanager.devtestlabs.models.LabVirtualMachineCreationParameter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class FormulasCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"description\":\"rnpnuhzafccnuh\",\"author\":\"gbylbuig\",\"osType\":\"vatvcrkd\",\"creationDate\":\"2021-03-26T19:13:55Z\",\"formulaContent\":{\"name\":\"vhcs\",\"location\":\"zlwxaeaovur\",\"tags\":{}},\"vm\":{\"labVmId\":\"d\"},\"provisioningState\":\"Succeeded\",\"uniqueIdentifier\":\"zmwntopagt\"},\"location\":\"mvmmagoaqylkjz\",\"tags\":{\"pdltkrlg\":\"uazjcgmxitpfinz\"},\"id\":\"mtbdrvcqgu\",\"name\":\"fzhompheq\",\"type\":\"urelyujlfyoump\"}";

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

        Formula response =
            manager
                .formulas()
                .define("coqra")
                .withRegion("awlpjfelqerpp")
                .withExistingLab("nub", "oitpkpztrgdgx")
                .withTags(mapOf("h", "gqnzm", "bbcccgz", "ilialwcjgc"))
                .withDescription("ugyxpqit")
                .withOsType("buhzacaq")
                .withFormulaContent(
                    new LabVirtualMachineCreationParameter()
                        .withName("qcujpd")
                        .withLocation("zakuejk")
                        .withTags(mapOf()))
                .withVm(new FormulaPropertiesFromVm().withLabVmId("ztjofqcvovjufyc"))
                .create();

        Assertions.assertEquals("mvmmagoaqylkjz", response.location());
        Assertions.assertEquals("uazjcgmxitpfinz", response.tags().get("pdltkrlg"));
        Assertions.assertEquals("rnpnuhzafccnuh", response.description());
        Assertions.assertEquals("vatvcrkd", response.osType());
        Assertions.assertEquals("vhcs", response.formulaContent().name());
        Assertions.assertEquals("zlwxaeaovur", response.formulaContent().location());
        Assertions.assertEquals("d", response.vm().labVmId());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
