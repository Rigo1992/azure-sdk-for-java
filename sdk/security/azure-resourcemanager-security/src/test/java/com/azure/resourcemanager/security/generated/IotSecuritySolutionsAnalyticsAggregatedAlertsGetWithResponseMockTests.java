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
import com.azure.resourcemanager.security.models.IoTSecurityAggregatedAlert;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IotSecuritySolutionsAnalyticsAggregatedAlertsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"alertType\":\"zcxxvzjoyxjgahx\",\"alertDisplayName\":\"rr\",\"vendorName\":\"tnytkbcerfcvc\",\"reportedSeverity\":\"High\",\"remediationSteps\":\"j\",\"description\":\"mpwyv\",\"count\":7477354041594785527,\"effectedResourceType\":\"c\",\"systemSource\":\"h\",\"actionTaken\":\"bgjgylsacag\",\"logAnalyticsQuery\":\"lrcygotohzwto\",\"topDevicesList\":[{\"deviceId\":\"xitr\",\"alertsCount\":2029518478859334760,\"lastOccurrence\":\"lutjsjzels\"},{\"deviceId\":\"emvupmeak\",\"alertsCount\":3248155331315059525,\"lastOccurrence\":\"cvldeehcbsaipusu\"},{\"deviceId\":\"kegbvbbdledf\",\"alertsCount\":5320218898969932419,\"lastOccurrence\":\"luazzx\"},{\"deviceId\":\"veugpx\",\"alertsCount\":4874882267562736644,\"lastOccurrence\":\"upbscboxraqdczm\"}]},\"tags\":{\"heowsecaf\":\"obekx\",\"i\":\"rzzbs\",\"eesacuicnvqiqsu\":\"rjsbdbm\"},\"id\":\"vmrfaptndrmmn\",\"name\":\"hnkmxrqkek\",\"type\":\"davi\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        IoTSecurityAggregatedAlert response = manager.iotSecuritySolutionsAnalyticsAggregatedAlerts()
            .getWithResponse("imrxirqwi", "zesstuiny", "kmlf", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("obekx", response.tags().get("heowsecaf"));
    }
}
