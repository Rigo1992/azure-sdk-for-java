// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.frontdoor.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.models.EnforceCertificateNameCheckEnabledState;
import com.azure.resourcemanager.frontdoor.models.FrontDoor;
import com.azure.resourcemanager.frontdoor.models.FrontDoorEnabledState;
import com.azure.resourcemanager.frontdoor.models.FrontDoorHealthProbeMethod;
import com.azure.resourcemanager.frontdoor.models.FrontDoorProtocol;
import com.azure.resourcemanager.frontdoor.models.HealthProbeEnabled;
import com.azure.resourcemanager.frontdoor.models.RoutingRuleEnabledState;
import com.azure.resourcemanager.frontdoor.models.SessionAffinityEnabledState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FrontDoorsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"resourceState\":\"Enabled\",\"provisioningState\":\"iwfcngjsa\",\"cname\":\"iixtmkzj\",\"frontdoorId\":\"viirhgfgrws\",\"rulesEngines\":[{\"properties\":{\"resourceState\":\"Creating\",\"rules\":[{\"name\":\"zb\",\"priority\":1946908693,\"action\":{}},{\"name\":\"byvi\",\"priority\":2111130404,\"action\":{}},{\"name\":\"ctbrxkjzwrgxffm\",\"priority\":1328433873,\"action\":{}}]},\"id\":\"kwfbkgo\",\"name\":\"xwopdbydpizqa\",\"type\":\"lnapxbiygn\"},{\"properties\":{\"resourceState\":\"Migrated\",\"rules\":[{\"name\":\"smfcttuxuuyilfl\",\"priority\":1857095612,\"action\":{}},{\"name\":\"iquvrehm\",\"priority\":340863806,\"action\":{}},{\"name\":\"jhvsujztczyt\",\"priority\":51352608,\"action\":{}},{\"name\":\"t\",\"priority\":190807596,\"action\":{}}]},\"id\":\"auunfprnjletlx\",\"name\":\"mr\",\"type\":\"ddoui\"},{\"properties\":{\"resourceState\":\"Enabling\",\"rules\":[{\"name\":\"z\",\"priority\":400879560,\"action\":{}},{\"name\":\"nknlqwzdvpi\",\"priority\":1488889865,\"action\":{}},{\"name\":\"xqszdtmaajquh\",\"priority\":1582916728,\"action\":{}},{\"name\":\"ylr\",\"priority\":1529964299,\"action\":{}}]},\"id\":\"m\",\"name\":\"ygjbmzyospspsh\",\"type\":\"kfkyjp\"},{\"properties\":{\"resourceState\":\"Disabling\",\"rules\":[{\"name\":\"sdfppyogtie\",\"priority\":896744832,\"action\":{}},{\"name\":\"jtvczkcnyxrxmun\",\"priority\":161894219,\"action\":{}}]},\"id\":\"xvglnkvxlxp\",\"name\":\"glqivbgkcv\",\"type\":\"hpzvuqdflvoniyp\"}],\"extendedProperties\":{\"knidib\":\"bcpzgpxtivh\",\"kqmhhaowjr\":\"qjxgpnrhgovfgp\",\"kfvxcnq\":\"zvuporqzdfuydz\"},\"friendlyName\":\"qpswokmvkhlggdhb\",\"routingRules\":[{\"properties\":{\"resourceState\":\"Deleting\",\"frontendEndpoints\":[{}],\"acceptedProtocols\":[\"Https\",\"Http\",\"Http\"],\"patternsToMatch\":[\"xxhljfpgpic\",\"mnzhrgmqg\"],\"enabledState\":\"Enabled\",\"routeConfiguration\":{\"@odata.type\":\"RouteConfiguration\"},\"rulesEngine\":{},\"webApplicationFirewallPolicyLink\":{}},\"name\":\"bfrmbodthsqqgvri\",\"type\":\"a\",\"id\":\"lacjfrnxo\"},{\"properties\":{\"resourceState\":\"Creating\",\"frontendEndpoints\":[{},{},{},{}],\"acceptedProtocols\":[\"Http\",\"Http\",\"Https\",\"Https\"],\"patternsToMatch\":[\"hqf\",\"izvu\"],\"enabledState\":\"Enabled\",\"routeConfiguration\":{\"@odata.type\":\"RouteConfiguration\"},\"rulesEngine\":{},\"webApplicationFirewallPolicyLink\":{}},\"name\":\"thnwpzte\",\"type\":\"vmribiat\",\"id\":\"plucfotangcfhnyk\"},{\"properties\":{\"resourceState\":\"Deleting\",\"frontendEndpoints\":[{},{},{}],\"acceptedProtocols\":[\"Https\"],\"patternsToMatch\":[\"zqwmvt\",\"njmxmcuqudtcvcl\",\"ynpdkvgfab\",\"iyji\"],\"enabledState\":\"Disabled\",\"routeConfiguration\":{\"@odata.type\":\"RouteConfiguration\"},\"rulesEngine\":{},\"webApplicationFirewallPolicyLink\":{}},\"name\":\"gneik\",\"type\":\"gox\",\"id\":\"iuqhibtozipqwj\"}],\"loadBalancingSettings\":[{\"properties\":{\"resourceState\":\"Creating\",\"sampleSize\":231532907,\"successfulSamplesRequired\":2094415920,\"additionalLatencyMilliseconds\":783540465},\"name\":\"tvqylkmqpzoyhlfb\",\"type\":\"wgcloxoebqinji\",\"id\":\"wjfuj\"}],\"healthProbeSettings\":[{\"properties\":{\"resourceState\":\"Migrating\",\"path\":\"hhpzpofoiyjwpf\",\"protocol\":\"Https\",\"intervalInSeconds\":1008375264,\"healthProbeMethod\":\"GET\",\"enabledState\":\"Enabled\"},\"name\":\"dndviauogp\",\"type\":\"artvti\",\"id\":\"yefchnm\"},{\"properties\":{\"resourceState\":\"Migrated\",\"path\":\"xhk\",\"protocol\":\"Https\",\"intervalInSeconds\":715189012,\"healthProbeMethod\":\"HEAD\",\"enabledState\":\"Disabled\"},\"name\":\"oxffif\",\"type\":\"wrsnewmozqvbu\",\"id\":\"ma\"}],\"backendPools\":[{\"properties\":{\"resourceState\":\"Migrated\",\"backends\":[{}],\"loadBalancingSettings\":{},\"healthProbeSettings\":{}},\"name\":\"zttaboidvmf\",\"type\":\"ppu\",\"id\":\"w\"},{\"properties\":{\"resourceState\":\"Disabling\",\"backends\":[{}],\"loadBalancingSettings\":{},\"healthProbeSettings\":{}},\"name\":\"dherngbtcj\",\"type\":\"hokq\",\"id\":\"bkau\"},{\"properties\":{\"resourceState\":\"Creating\",\"backends\":[{},{}],\"loadBalancingSettings\":{},\"healthProbeSettings\":{}},\"name\":\"pnulaiywzej\",\"type\":\"hs\",\"id\":\"koj\"}],\"frontendEndpoints\":[{\"properties\":{\"resourceState\":\"Enabled\",\"customHttpsProvisioningState\":\"Disabled\",\"customHttpsProvisioningSubstate\":\"DeletingCertificate\",\"customHttpsConfiguration\":{\"certificateSource\":\"FrontDoor\",\"protocolType\":\"ServerNameIndication\",\"minimumTlsVersion\":\"1.0\"},\"hostName\":\"fugsnnfhyetefy\",\"sessionAffinityEnabledState\":\"Enabled\",\"sessionAffinityTtlSeconds\":105159032,\"webApplicationFirewallPolicyLink\":{}},\"name\":\"jgtixr\",\"type\":\"zuyt\",\"id\":\"mlmuowol\"}],\"backendPoolsSettings\":{\"enforceCertificateNameCheck\":\"Disabled\",\"sendRecvTimeoutSeconds\":139700298},\"enabledState\":\"Disabled\"},\"location\":\"ons\",\"tags\":{\"jinnix\":\"wpng\"},\"id\":\"awrtmjfjmyccxlz\",\"name\":\"coxovn\",\"type\":\"khenlus\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        FrontDoorManager manager = FrontDoorManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FrontDoor response = manager.frontDoors()
            .getByResourceGroupWithResponse("qmp", "zruwn", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ons", response.location());
        Assertions.assertEquals("wpng", response.tags().get("jinnix"));
        Assertions.assertEquals("qpswokmvkhlggdhb", response.friendlyName());
        Assertions.assertEquals("lacjfrnxo", response.routingRules().get(0).id());
        Assertions.assertEquals("bfrmbodthsqqgvri", response.routingRules().get(0).name());
        Assertions.assertEquals(FrontDoorProtocol.HTTPS, response.routingRules().get(0).acceptedProtocols().get(0));
        Assertions.assertEquals("xxhljfpgpic", response.routingRules().get(0).patternsToMatch().get(0));
        Assertions.assertEquals(RoutingRuleEnabledState.ENABLED, response.routingRules().get(0).enabledState());
        Assertions.assertEquals("wjfuj", response.loadBalancingSettings().get(0).id());
        Assertions.assertEquals("tvqylkmqpzoyhlfb", response.loadBalancingSettings().get(0).name());
        Assertions.assertEquals(231532907, response.loadBalancingSettings().get(0).sampleSize());
        Assertions.assertEquals(2094415920, response.loadBalancingSettings().get(0).successfulSamplesRequired());
        Assertions.assertEquals(783540465, response.loadBalancingSettings().get(0).additionalLatencyMilliseconds());
        Assertions.assertEquals("yefchnm", response.healthProbeSettings().get(0).id());
        Assertions.assertEquals("dndviauogp", response.healthProbeSettings().get(0).name());
        Assertions.assertEquals("hhpzpofoiyjwpf", response.healthProbeSettings().get(0).path());
        Assertions.assertEquals(FrontDoorProtocol.HTTPS, response.healthProbeSettings().get(0).protocol());
        Assertions.assertEquals(1008375264, response.healthProbeSettings().get(0).intervalInSeconds());
        Assertions.assertEquals(FrontDoorHealthProbeMethod.GET,
            response.healthProbeSettings().get(0).healthProbeMethod());
        Assertions.assertEquals(HealthProbeEnabled.ENABLED, response.healthProbeSettings().get(0).enabledState());
        Assertions.assertEquals("w", response.backendPools().get(0).id());
        Assertions.assertEquals("zttaboidvmf", response.backendPools().get(0).name());
        Assertions.assertEquals("mlmuowol", response.frontendEndpoints().get(0).id());
        Assertions.assertEquals("jgtixr", response.frontendEndpoints().get(0).name());
        Assertions.assertEquals("fugsnnfhyetefy", response.frontendEndpoints().get(0).hostname());
        Assertions.assertEquals(SessionAffinityEnabledState.ENABLED,
            response.frontendEndpoints().get(0).sessionAffinityEnabledState());
        Assertions.assertEquals(105159032, response.frontendEndpoints().get(0).sessionAffinityTtlSeconds());
        Assertions.assertEquals(EnforceCertificateNameCheckEnabledState.DISABLED,
            response.backendPoolsSettings().enforceCertificateNameCheck());
        Assertions.assertEquals(139700298, response.backendPoolsSettings().sendRecvTimeoutSeconds());
        Assertions.assertEquals(FrontDoorEnabledState.DISABLED, response.enabledState());
    }
}
