// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager;
import com.azure.resourcemanager.confidentialledger.models.AadBasedSecurityPrincipal;
import com.azure.resourcemanager.confidentialledger.models.CertBasedSecurityPrincipal;
import com.azure.resourcemanager.confidentialledger.models.ConfidentialLedger;
import com.azure.resourcemanager.confidentialledger.models.LedgerProperties;
import com.azure.resourcemanager.confidentialledger.models.LedgerRoleName;
import com.azure.resourcemanager.confidentialledger.models.LedgerSku;
import com.azure.resourcemanager.confidentialledger.models.LedgerType;
import com.azure.resourcemanager.confidentialledger.models.RunningState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LedgersCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"ledgerName\":\"pnq\",\"ledgerUri\":\"hmgkbrpyy\",\"identityServiceUri\":\"ibnuqqkpik\",\"ledgerInternalNamespace\":\"rgvtqag\",\"runningState\":\"Paused\",\"ledgerType\":\"Private\",\"provisioningState\":\"Succeeded\",\"ledgerSku\":\"Unknown\",\"aadBasedSecurityPrincipals\":[{\"principalId\":\"bfs\",\"tenantId\":\"rbu\",\"ledgerRoleName\":\"Reader\"}],\"certBasedSecurityPrincipals\":[{\"cert\":\"azzmhjrunmpxt\",\"ledgerRoleName\":\"Administrator\"},{\"cert\":\"rbnlankxmyskp\",\"ledgerRoleName\":\"Reader\"}]},\"location\":\"btkcxywnytnrsyn\",\"tags\":{\"dbabp\":\"dybyxczfclhaa\",\"fkts\":\"lwrq\",\"nyyazttbtwwrqpue\":\"hsucoc\"},\"id\":\"ckzywbiexzfeyue\",\"name\":\"xibxujwbhqwalm\",\"type\":\"zyoxaepdkzjan\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ConfidentialLedgerManager manager = ConfidentialLedgerManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ConfidentialLedger response = manager.ledgers()
            .define("yqzrnkcqvyxlw")
            .withRegion("wutttxfvjrbi")
            .withExistingResourceGroup("uzoqft")
            .withTags(mapOf("jky", "xepcyvahfn", "ljyoxgvcltb", "xjvuujqgidokg", "bijhtxfvgxbf", "sncghkjeszz", "ec",
                "mxnehmp"))
            .withProperties(new LedgerProperties().withRunningState(RunningState.PAUSING)
                .withLedgerType(LedgerType.UNKNOWN)
                .withLedgerSku(LedgerSku.STANDARD)
                .withAadBasedSecurityPrincipals(Arrays.asList(
                    new AadBasedSecurityPrincipal().withPrincipalId("fkbey")
                        .withTenantId("wrmjmwvvjektc")
                        .withLedgerRoleName(LedgerRoleName.READER),
                    new AadBasedSecurityPrincipal().withPrincipalId("hwlrsf")
                        .withTenantId("zpwv")
                        .withLedgerRoleName(LedgerRoleName.CONTRIBUTOR)))
                .withCertBasedSecurityPrincipals(Arrays.asList(
                    new CertBasedSecurityPrincipal().withCert("iqylihkaetck").withLedgerRoleName(LedgerRoleName.READER),
                    new CertBasedSecurityPrincipal().withCert("ivfsnk")
                        .withLedgerRoleName(LedgerRoleName.ADMINISTRATOR),
                    new CertBasedSecurityPrincipal().withCert("tqhjfbebrjcx")
                        .withLedgerRoleName(LedgerRoleName.CONTRIBUTOR))))
            .create();

        Assertions.assertEquals("btkcxywnytnrsyn", response.location());
        Assertions.assertEquals("dybyxczfclhaa", response.tags().get("dbabp"));
        Assertions.assertEquals(RunningState.PAUSED, response.properties().runningState());
        Assertions.assertEquals(LedgerType.PRIVATE, response.properties().ledgerType());
        Assertions.assertEquals(LedgerSku.UNKNOWN, response.properties().ledgerSku());
        Assertions.assertEquals("bfs", response.properties().aadBasedSecurityPrincipals().get(0).principalId());
        Assertions.assertEquals("rbu", response.properties().aadBasedSecurityPrincipals().get(0).tenantId());
        Assertions.assertEquals(LedgerRoleName.READER,
            response.properties().aadBasedSecurityPrincipals().get(0).ledgerRoleName());
        Assertions.assertEquals("azzmhjrunmpxt", response.properties().certBasedSecurityPrincipals().get(0).cert());
        Assertions.assertEquals(LedgerRoleName.ADMINISTRATOR,
            response.properties().certBasedSecurityPrincipals().get(0).ledgerRoleName());
    }

    // Use "Map.of" if available
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
