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
import com.azure.resourcemanager.security.models.DeviceSecurityGroup;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DeviceSecurityGroupsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"thresholdRules\":[{\"ruleType\":\"ThresholdCustomAlertRule\",\"minThreshold\":872903915,\"maxThreshold\":642448617,\"displayName\":\"h\",\"description\":\"cyuzlybqscibv\",\"isEnabled\":false},{\"ruleType\":\"ThresholdCustomAlertRule\",\"minThreshold\":837498555,\"maxThreshold\":80726149,\"displayName\":\"kcafnwqhawv\",\"description\":\"viulbyl\",\"isEnabled\":false}],\"timeWindowRules\":[{\"ruleType\":\"TimeWindowCustomAlertRule\",\"timeWindowSize\":\"PT13H41M31S\",\"minThreshold\":24448407,\"maxThreshold\":1364223481,\"displayName\":\"pbgu\",\"description\":\"hmxpucknsastl\",\"isEnabled\":false},{\"ruleType\":\"TimeWindowCustomAlertRule\",\"timeWindowSize\":\"PT47H56M26S\",\"minThreshold\":1531298340,\"maxThreshold\":930966984,\"displayName\":\"icttr\",\"description\":\"vvjmxokxx\",\"isEnabled\":true}],\"allowlistRules\":[{\"ruleType\":\"AllowlistCustomAlertRule\",\"allowlistValues\":[\"jrzvlc\",\"vqxdemklphx\",\"wwlojkbgnf\"],\"valueType\":\"IpCidr\",\"displayName\":\"vfsunhaevla\",\"description\":\"czywywuahwc\",\"isEnabled\":true},{\"ruleType\":\"AllowlistCustomAlertRule\",\"allowlistValues\":[\"wcnnaax\",\"jfdaj\",\"fgi\",\"omggew\"],\"valueType\":\"IpCidr\",\"displayName\":\"exfyznvussuqkslw\",\"description\":\"xayzqbyeyw\",\"isEnabled\":false},{\"ruleType\":\"AllowlistCustomAlertRule\",\"allowlistValues\":[\"hnrt\",\"ikffydztk\",\"rfbg\",\"nzfwvz\"],\"valueType\":\"IpCidr\",\"displayName\":\"jmyqxuhgka\",\"description\":\"yprij\",\"isEnabled\":false}],\"denylistRules\":[{\"ruleType\":\"DenylistCustomAlertRule\",\"denylistValues\":[\"xbsowrrlcck\",\"yfp\",\"ms\"],\"valueType\":\"IpCidr\",\"displayName\":\"mqomxoalknuy\",\"description\":\"vibzicy\",\"isEnabled\":false},{\"ruleType\":\"DenylistCustomAlertRule\",\"denylistValues\":[\"hcaptkhjx\",\"rkbn\",\"fcck\",\"z\"],\"valueType\":\"IpCidr\",\"displayName\":\"gvlxyx\",\"description\":\"ctigp\",\"isEnabled\":true},{\"ruleType\":\"DenylistCustomAlertRule\",\"denylistValues\":[\"wic\",\"lktgkdp\",\"tqjytdc\",\"efuhb\"],\"valueType\":\"String\",\"displayName\":\"jsbg\",\"description\":\"amoaxcaytnpk\",\"isEnabled\":true},{\"ruleType\":\"DenylistCustomAlertRule\",\"denylistValues\":[\"bltcwsexheeocnq\",\"ubvepvlryszfhdx\"],\"valueType\":\"String\",\"displayName\":\"ohzbzhhavzfuxnvk\",\"description\":\"lcofuvtfu\",\"isEnabled\":true}]},\"id\":\"ouisakl\",\"name\":\"jfddxqfussub\",\"type\":\"sspmjvailfauyv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DeviceSecurityGroup response = manager.deviceSecurityGroups()
            .getWithResponse("pfzxkczbdypbbim", "jbozv", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(false, response.thresholdRules().get(0).isEnabled());
        Assertions.assertEquals(872903915, response.thresholdRules().get(0).minThreshold());
        Assertions.assertEquals(642448617, response.thresholdRules().get(0).maxThreshold());
        Assertions.assertEquals(false, response.timeWindowRules().get(0).isEnabled());
        Assertions.assertEquals(24448407, response.timeWindowRules().get(0).minThreshold());
        Assertions.assertEquals(1364223481, response.timeWindowRules().get(0).maxThreshold());
        Assertions.assertEquals(Duration.parse("PT13H41M31S"), response.timeWindowRules().get(0).timeWindowSize());
        Assertions.assertEquals(true, response.allowlistRules().get(0).isEnabled());
        Assertions.assertEquals("jrzvlc", response.allowlistRules().get(0).allowlistValues().get(0));
        Assertions.assertEquals(false, response.denylistRules().get(0).isEnabled());
        Assertions.assertEquals("xbsowrrlcck", response.denylistRules().get(0).denylistValues().get(0));
    }
}
