// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.License;
import com.azure.resourcemanager.hybridcompute.models.LicenseCoreType;
import com.azure.resourcemanager.hybridcompute.models.LicenseEdition;
import com.azure.resourcemanager.hybridcompute.models.LicenseState;
import com.azure.resourcemanager.hybridcompute.models.LicenseTarget;
import com.azure.resourcemanager.hybridcompute.models.LicenseType;
import com.azure.resourcemanager.hybridcompute.models.ProgramYear;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LicensesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Accepted\",\"tenantId\":\"gxdbeesmie\",\"licenseType\":\"ESU\",\"licenseDetails\":{\"state\":\"Activated\",\"target\":\"Windows Server 2012 R2\",\"edition\":\"Datacenter\",\"type\":\"vCore\",\"processors\":343253872,\"assignedLicenses\":891454353,\"immutableId\":\"qfby\",\"volumeLicenseDetails\":[{\"programYear\":\"Year 1\",\"invoiceId\":\"agt\"}]}},\"location\":\"jocqwogfnzjvusf\",\"tags\":{\"kadpysown\":\"mozuxylfsb\",\"isofieypefojyqd\":\"tgkbugrjqctojc\"},\"id\":\"cuplcplcwkhih\",\"name\":\"hlhzdsqtzbsrgno\",\"type\":\"cjhfgmvecactxmw\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<License> response
            = manager.licenses().listByResourceGroup("zqlqhyc", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("jocqwogfnzjvusf", response.iterator().next().location());
        Assertions.assertEquals("mozuxylfsb", response.iterator().next().tags().get("kadpysown"));
        Assertions.assertEquals("gxdbeesmie", response.iterator().next().tenantId());
        Assertions.assertEquals(LicenseType.ESU, response.iterator().next().licenseType());
        Assertions.assertEquals(LicenseState.ACTIVATED, response.iterator().next().licenseDetails().state());
        Assertions.assertEquals(LicenseTarget.WINDOWS_SERVER_2012_R2,
            response.iterator().next().licenseDetails().target());
        Assertions.assertEquals(LicenseEdition.DATACENTER, response.iterator().next().licenseDetails().edition());
        Assertions.assertEquals(LicenseCoreType.V_CORE, response.iterator().next().licenseDetails().type());
        Assertions.assertEquals(343253872, response.iterator().next().licenseDetails().processors());
        Assertions.assertEquals(ProgramYear.YEAR_1,
            response.iterator().next().licenseDetails().volumeLicenseDetails().get(0).programYear());
        Assertions.assertEquals("agt",
            response.iterator().next().licenseDetails().volumeLicenseDetails().get(0).invoiceId());
    }
}
