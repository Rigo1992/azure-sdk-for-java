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
import com.azure.resourcemanager.security.models.AdditionalWorkspaceDataType;
import com.azure.resourcemanager.security.models.AdditionalWorkspaceType;
import com.azure.resourcemanager.security.models.DataSource;
import com.azure.resourcemanager.security.models.ExportData;
import com.azure.resourcemanager.security.models.IoTSecuritySolutionModel;
import com.azure.resourcemanager.security.models.RecommendationConfigStatus;
import com.azure.resourcemanager.security.models.RecommendationType;
import com.azure.resourcemanager.security.models.SecuritySolutionStatus;
import com.azure.resourcemanager.security.models.UnmaskedIpLoggingStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IotSecuritySolutionsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"location\":\"xlphngrxle\",\"properties\":{\"workspace\":\"eorocrqicgymtgb\",\"displayName\":\"pfyrvhtvijvwmr\",\"status\":\"Enabled\",\"export\":[\"RawEvents\",\"RawEvents\",\"RawEvents\",\"RawEvents\"],\"disabledDataSources\":[\"TwinData\",\"TwinData\",\"TwinData\"],\"iotHubs\":[\"uuutq\"],\"userDefinedResources\":{\"query\":\"btqyzycgcmbkygv\",\"querySubscriptions\":[\"dqosxzmdzly\",\"qfufkekzfkicxhs\",\"vmnkgghvsryjok\",\"lwvbjsarxs\"]},\"autoDiscoveredResources\":[\"pabwbpzgfgqpudhg\",\"gieabbf\",\"x\"],\"recommendationsConfiguration\":[{\"recommendationType\":\"IoT_InstallAgent\",\"name\":\"zukgsnuhwyxj\",\"status\":\"Disabled\"},{\"recommendationType\":\"IoT_IPFilter_DenyAll\",\"name\":\"xcebnbeo\",\"status\":\"Enabled\"},{\"recommendationType\":\"IoT_IPFilter_PermissiveRule\",\"name\":\"qqerwqxpj\",\"status\":\"Disabled\"}],\"unmaskedIpLoggingStatus\":\"Enabled\",\"additionalWorkspaces\":[{\"workspace\":\"httuobrx\",\"type\":\"Sentinel\",\"dataTypes\":[\"Alerts\",\"Alerts\",\"Alerts\",\"RawEvents\"]}]},\"tags\":{\"wtfma\":\"e\",\"mhlvyqn\":\"vbmnhtwofx\"},\"id\":\"lbqrmlqk\",\"name\":\"ekhjgq\",\"type\":\"rugwesps\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<IoTSecuritySolutionModel> response = manager.iotSecuritySolutions()
            .listByResourceGroup("plksdksutacucti", "avishbvjhxvpmqqu", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("xlphngrxle", response.iterator().next().location());
        Assertions.assertEquals("e", response.iterator().next().tags().get("wtfma"));
        Assertions.assertEquals("eorocrqicgymtgb", response.iterator().next().workspace());
        Assertions.assertEquals("pfyrvhtvijvwmr", response.iterator().next().displayName());
        Assertions.assertEquals(SecuritySolutionStatus.ENABLED, response.iterator().next().status());
        Assertions.assertEquals(ExportData.RAW_EVENTS, response.iterator().next().export().get(0));
        Assertions.assertEquals(DataSource.TWIN_DATA, response.iterator().next().disabledDataSources().get(0));
        Assertions.assertEquals("uuutq", response.iterator().next().iotHubs().get(0));
        Assertions.assertEquals("btqyzycgcmbkygv", response.iterator().next().userDefinedResources().query());
        Assertions.assertEquals("dqosxzmdzly",
            response.iterator().next().userDefinedResources().querySubscriptions().get(0));
        Assertions.assertEquals(RecommendationType.IO_T_INSTALL_AGENT,
            response.iterator().next().recommendationsConfiguration().get(0).recommendationType());
        Assertions.assertEquals(RecommendationConfigStatus.DISABLED,
            response.iterator().next().recommendationsConfiguration().get(0).status());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.ENABLED, response.iterator().next().unmaskedIpLoggingStatus());
        Assertions.assertEquals("httuobrx", response.iterator().next().additionalWorkspaces().get(0).workspace());
        Assertions.assertEquals(AdditionalWorkspaceType.SENTINEL,
            response.iterator().next().additionalWorkspaces().get(0).type());
        Assertions.assertEquals(AdditionalWorkspaceDataType.ALERTS,
            response.iterator().next().additionalWorkspaces().get(0).dataTypes().get(0));
    }
}
